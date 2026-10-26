// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ResizeDiskRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">Ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the cloud disk. You can call the <a href="https://help.aliyun.com/document_detail/25514.html">DescribeDisks</a> operation to query the ID of the cloud disk.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d-bp67acfmxazb4p****</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>The new capacity of the cloud disk. Unit: GiB. Valid values:</p>
     * <ul>
     * <li><p>System cloud disk:</p>
     * <ul>
     * <li>Basic cloud disk: 20 to 500.</li>
     * <li>ESSD:<ul>
     * <li>PL0: 1 to 2048.</li>
     * <li>PL1: 20 to 2048.</li>
     * <li>PL2: 461 to 2048.</li>
     * <li>PL3: 1261 to 2048.</li>
     * </ul>
     * </li>
     * <li>ESSD AutoPL disk: 1 to 2048.</li>
     * <li>Other cloud disk types: 20 to 2048.</li>
     * </ul>
     * </li>
     * <li><p>Data cloud disk:</p>
     * <ul>
     * <li><p>Ultra cloud disk (cloud_efficiency): 20 to 32768.</p>
     * </li>
     * <li><p>Standard SSD (cloud_ssd): 20 to 32768.</p>
     * </li>
     * <li><p>ESSD (cloud_essd): The valid values vary based on the <code>PerformanceLevel</code> parameter. You can call the <a href="https://help.aliyun.com/document_detail/25514.html">DescribeDisks</a> operation to query the cloud disk information and check the valid values based on the <code>PerformanceLevel</code> parameter in the response.</p>
     * <ul>
     * <li>PL0: 1 to 65536.</li>
     * <li>PL1: 20 to 65536.</li>
     * <li>PL2: 461 to 65536.</li>
     * <li>PL3: 1261 to 65536.</li>
     * </ul>
     * </li>
     * <li><p>Basic cloud disk (cloud): 5 to 2000.</p>
     * </li>
     * <li><p>ESSD AutoPL disk (cloud_auto): 1 to 65536.
     * &lt;props=&quot;china&quot;&gt;</p>
     * </li>
     * <li><p>ESSD Entry disk (cloud_essd_entry): 10 to 32768.</p>
     * </li>
     * <li><p>Standard elastic ephemeral disk (elastic_ephemeral_disk_standard): 64 to 8192.</p>
     * </li>
     * <li><p>Premium elastic ephemeral disk (elastic_ephemeral_disk_premium): 64 to 8192.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The new capacity must be greater than the original capacity. Otherwise, an error is returned when you call this operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1900</p>
     */
    @NameInMap("NewSize")
    public Integer newSize;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The method used to resize the cloud disk. Valid values:</p>
     * <ul>
     * <li><p>offline: offline resizing. This is the default value. After the cloud disk is resized, you must <a href="https://help.aliyun.com/document_detail/25440.html">restart the instance</a> in the console or call the <a href="https://help.aliyun.com/document_detail/25502.html">RebootInstance</a> operation for the resize to take effect.</p>
     * </li>
     * <li><p>online: online resizing. The cloud disk is resized without the need to restart the instance. This value supports ultra cloud disks, standard SSDs, ESSDs, and elastic ephemeral disks.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>offline</p>
     */
    @NameInMap("Type")
    public String type;

    public static ResizeDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        ResizeDiskRequest self = new ResizeDiskRequest();
        return TeaModel.build(map, self);
    }

    public ResizeDiskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ResizeDiskRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public ResizeDiskRequest setNewSize(Integer newSize) {
        this.newSize = newSize;
        return this;
    }
    public Integer getNewSize() {
        return this.newSize;
    }

    public ResizeDiskRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ResizeDiskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ResizeDiskRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ResizeDiskRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ResizeDiskRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ResizeDiskRequest extends TeaModel {
    /**
     * <p>The ID of the order.</p>
     * <blockquote>
     * <p>This parameter is returned only when you resize subscription disks.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the disk. You can call the <a href="https://help.aliyun.com/document_detail/25514.html">DescribeDisks</a> operation to query available disk IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d-bp67acfmxazb4p****</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>The new disk capacity. Unit: GiB. Valid values:</p>
     * <ul>
     * <li><p>System disk:</p>
     * <ul>
     * <li><p>Basic disk (cloud): 20 to 500.</p>
     * </li>
     * <li><p>ESSD (cloud_essd): The valid values vary based on the performance level of the ESSD.</p>
     * <ul>
     * <li>Valid values when SystemDisk.PerformanceLevel is set to PL0: 1 to 2048.</li>
     * <li>Valid values when SystemDisk.PerformanceLevel is set to PL1: 20 to 2048.</li>
     * <li>Valid values when SystemDisk.PerformanceLevel is set to PL2: 461 to 2048.</li>
     * <li>Valid values when SystemDisk.PerformanceLevel is set to PL3: 1261 to 2048.</li>
     * </ul>
     * </li>
     * <li><p>ESSD AutoPL disk: 1 to 2048.</p>
     * </li>
     * <li><p>Other disk categories: 20 to 2048.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Data disk:</p>
     * <ul>
     * <li><p>Ultra disk (cloud_efficiency): 20 to 32768.</p>
     * </li>
     * <li><p>Standard SSD (cloud_ssd): 20 to 32768.</p>
     * </li>
     * <li><p>ESSD (cloud_essd): The valid values vary based on the performance level of the ESSD.`` To query the performance level of an ESSD, call the <a href="https://help.aliyun.com/document_detail/25514.html">DescribeDisks</a> operation to query disk information and check the <code>PerformanceLevel</code> value in the response.</p>
     * <ul>
     * <li>PL0 ESSD: 1 to 65536.</li>
     * <li>PL1 ESSD: 20 to 65536.</li>
     * <li>PL2 ESSD: 461 to 65536.</li>
     * <li>PL3 ESSD: 1261 to 65536.</li>
     * </ul>
     * </li>
     * <li><p>Basic disk (cloud): 5 to 2000.</p>
     * </li>
     * <li><p>ESSD AutoPL disk (cloud_auto): 1 to 65536.</p>
     * </li>
     * <li><p>Standard elastic ephemeral disk (elastic_ephemeral_disk_standard): 64 to 8192.</p>
     * </li>
     * <li><p>Premium elastic ephemeral disk (elastic_ephemeral_disk_premium): 64 to 8192.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p> The new disk capacity must be larger than the original disk capacity. Otherwise, an error is reported.</p>
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
     * <p>The method that you want to use to resize the disk. Valid values:</p>
     * <ul>
     * <li>offline (default): resizes the disk offline. After resizing a disk offline, you must <a href="https://help.aliyun.com/document_detail/25440.html">restart the instance</a> in the console or call an API operation <a href="https://help.aliyun.com/document_detail/25502.html">RebootInstance</a> make the operation take effect.</li>
     * <li>online: resizes the disk online without the need to restart the instance. You can resize ultra disks, standard SSDs, ESSDs, and elastic ephemeral disks online.</li>
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

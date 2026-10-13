// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class UpgradeFileSystemRequest extends TeaModel {
    /**
     * <p>The storage capacity of the file system after the scale-up.</p>
     * <p>The new capacity must be greater than the current capacity of the file system. Unit: GiB.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Capacity")
    public Long capacity;

    /**
     * <p>The client token that is used to ensure the idempotency of the request. Generate a unique value from your client to ensure that the value is unique among different requests.</p>
     * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotency</a>.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId may differ for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run for this request.</p>
     * <p>A dry run checks parameter validity and resource availability without actually creating an instance or incurring charges.</p>
     * <p>Valid values:  </p>
     * <ul>
     * <li>true: Sends a dry run request without creating an instance. The check items include required parameters, request format, business limits, and NAS inventory. If the check fails, the corresponding error is returned. If the check passes, HTTP status code 200 is returned, but FileSystemId is empty.  </li>
     * <li>false (default): Sends a normal request. After the check passes, the instance is created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The file system ID.</p>
     * <ul>
     * <li>Extreme NAS: The ID must start with <code>extreme-</code>, for example, extreme-0015\<em>\</em>\<em>\</em>.</li>
     * <li>CPFS: The ID must start with <code>cpfs-</code>, for example, cpfs-125487\<em>\</em>\<em>\</em>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>extreme-0015****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    public static UpgradeFileSystemRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeFileSystemRequest self = new UpgradeFileSystemRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeFileSystemRequest setCapacity(Long capacity) {
        this.capacity = capacity;
        return this;
    }
    public Long getCapacity() {
        return this.capacity;
    }

    public UpgradeFileSystemRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpgradeFileSystemRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpgradeFileSystemRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

}

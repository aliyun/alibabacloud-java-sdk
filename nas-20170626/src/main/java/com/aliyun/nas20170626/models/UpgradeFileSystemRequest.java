// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class UpgradeFileSystemRequest extends TeaModel {
    /**
     * <p>The desired capacity of the file system.</p>
     * <br>
     * <p>The desired capacity of the file system must be greater than the original capacity of the file system. Unit: GiB.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Capacity")
    public Long capacity;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * <br>
     * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How do I ensure the idempotence?](https://help.aliyun.com/document_detail/25693.html)</p>
     * <br>
     * <p>> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run.</p>
     * <br>
     * <p>During the dry run, the system checks whether the request parameters are valid and whether the requested resources are available. During the dry run, no file system is created and no fee is incurred.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true: performs a dry run. The system checks the required parameters, request syntax, limits, and available NAS resources. If the request fails the dry run, an error message is returned. If the request passes the dry run, the HTTP status code 200 is returned. No value is returned for the FileSystemId parameter.</p>
     * <p>*   false (default): performs a dry run and sends the request. If the request passes the dry run, a file system is created.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the file system.</p>
     * <br>
     * <p>*   The IDs of Extreme NAS file systems must start with `extreme-`, for example, extreme-0015\\*\\*\\*\\*.</p>
     * <p>*   The IDs of CPFS file systems must start with `cpfs-`, for example, cpfs-125487\\*\\*\\*\\*.</p>
     * <br>
     * <p>> CPFS file systems are available only on the China site (aliyun.com).</p>
     * <br>
     * <p>This parameter is required.</p>
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

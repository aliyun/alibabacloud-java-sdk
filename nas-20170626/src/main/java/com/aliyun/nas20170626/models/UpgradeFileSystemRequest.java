// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class UpgradeFileSystemRequest extends TeaModel {
    @NameInMap("FileSystemId")
    public String fileSystemId;

    @NameInMap("Capacity")
    public Long capacity;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("ClientToken")
    public String clientToken;

    public static UpgradeFileSystemRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeFileSystemRequest self = new UpgradeFileSystemRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeFileSystemRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public UpgradeFileSystemRequest setCapacity(Long capacity) {
        this.capacity = capacity;
        return this;
    }
    public Long getCapacity() {
        return this.capacity;
    }

    public UpgradeFileSystemRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpgradeFileSystemRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}

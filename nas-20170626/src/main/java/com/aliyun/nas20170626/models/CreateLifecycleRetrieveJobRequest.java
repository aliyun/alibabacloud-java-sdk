// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateLifecycleRetrieveJobRequest extends TeaModel {
    /**
     * <p>The ID of the file system.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The directories or files that you want to retrieve. You can specify a maximum of 10 paths.</p>
     */
    @NameInMap("Paths")
    public java.util.List<String> paths;

    @NameInMap("StorageType")
    public String storageType;

    public static CreateLifecycleRetrieveJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLifecycleRetrieveJobRequest self = new CreateLifecycleRetrieveJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateLifecycleRetrieveJobRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateLifecycleRetrieveJobRequest setPaths(java.util.List<String> paths) {
        this.paths = paths;
        return this;
    }
    public java.util.List<String> getPaths() {
        return this.paths;
    }

    public CreateLifecycleRetrieveJobRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

}

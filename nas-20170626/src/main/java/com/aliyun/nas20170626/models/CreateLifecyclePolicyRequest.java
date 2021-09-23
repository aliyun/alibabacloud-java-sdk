// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateLifecyclePolicyRequest extends TeaModel {
    @NameInMap("FileSystemId")
    public String fileSystemId;

    @NameInMap("LifecyclePolicyName")
    public String lifecyclePolicyName;

    @NameInMap("Path")
    public String path;

    @NameInMap("LifecycleRuleName")
    public String lifecycleRuleName;

    @NameInMap("StorageType")
    public String storageType;

    @NameInMap("Paths")
    public java.util.List<String> paths;

    public static CreateLifecyclePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLifecyclePolicyRequest self = new CreateLifecyclePolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateLifecyclePolicyRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateLifecyclePolicyRequest setLifecyclePolicyName(String lifecyclePolicyName) {
        this.lifecyclePolicyName = lifecyclePolicyName;
        return this;
    }
    public String getLifecyclePolicyName() {
        return this.lifecyclePolicyName;
    }

    public CreateLifecyclePolicyRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public CreateLifecyclePolicyRequest setLifecycleRuleName(String lifecycleRuleName) {
        this.lifecycleRuleName = lifecycleRuleName;
        return this;
    }
    public String getLifecycleRuleName() {
        return this.lifecycleRuleName;
    }

    public CreateLifecyclePolicyRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public CreateLifecyclePolicyRequest setPaths(java.util.List<String> paths) {
        this.paths = paths;
        return this;
    }
    public java.util.List<String> getPaths() {
        return this.paths;
    }

}

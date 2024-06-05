// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyLifecyclePolicyRequest extends TeaModel {
    /**
     * <p>The ID of the file system.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The name of the lifecycle policy.</p>
     * <br>
     * <p>The name must be 3 to 64 characters in length and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LifecyclePolicyName")
    public String lifecyclePolicyName;

    /**
     * <p>The management rule that is associated with the lifecycle policy.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   DEFAULT_ATIME_14: Files that are not accessed in the last 14 days are dumped to the IA storage medium.</p>
     * <p>*   DEFAULT_ATIME_30: Files that are not accessed in the last 30 days are dumped to the IA storage medium.</p>
     * <p>*   DEFAULT_ATIME_60: Files that are not accessed in the last 60 days are dumped to the IA storage medium.</p>
     * <p>*   DEFAULT_ATIME_90: Files that are not accessed in the last 90 days are dumped to the IA storage medium.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LifecycleRuleName")
    public String lifecycleRuleName;

    /**
     * <p>The absolute path of a directory with which the lifecycle policy is associated.</p>
     * <br>
     * <p>The path must start with a forward slash (/) and must be a path that exists in the mount target.</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The storage type of the data that is dumped to the IA storage medium.</p>
     * <br>
     * <p>Default value: InfrequentAccess (IA).</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    public static ModifyLifecyclePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLifecyclePolicyRequest self = new ModifyLifecyclePolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLifecyclePolicyRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public ModifyLifecyclePolicyRequest setLifecyclePolicyName(String lifecyclePolicyName) {
        this.lifecyclePolicyName = lifecyclePolicyName;
        return this;
    }
    public String getLifecyclePolicyName() {
        return this.lifecyclePolicyName;
    }

    public ModifyLifecyclePolicyRequest setLifecycleRuleName(String lifecycleRuleName) {
        this.lifecycleRuleName = lifecycleRuleName;
        return this;
    }
    public String getLifecycleRuleName() {
        return this.lifecycleRuleName;
    }

    public ModifyLifecyclePolicyRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public ModifyLifecyclePolicyRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

}

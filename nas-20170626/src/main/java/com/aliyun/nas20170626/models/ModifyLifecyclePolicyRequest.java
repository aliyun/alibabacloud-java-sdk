// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyLifecyclePolicyRequest extends TeaModel {
    /**
     * <p>The file system ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>31a8e4****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The ID of the lifecycle policy.</p>
     * 
     * <strong>example:</strong>
     * <p>lc-xxx</p>
     */
    @NameInMap("LifecyclePolicyId")
    public String lifecyclePolicyId;

    /**
     * <p>The Policy Name of the lifecycle management policy.</p>
     * <p>The name must be 3 to 64 characters in length, must start with an uppercase letter or lowercase letter, and can contain letters, digits, underscores (_), or hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>lifecyclepolicy_01</p>
     */
    @NameInMap("LifecyclePolicyName")
    public String lifecyclePolicyName;

    /**
     * <p>The management rule associated with the lifecycle management policy.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>DEFAULT_ATIME_14: files that have not been accessed for 14 days.</li>
     * <li>DEFAULT_ATIME_30: files that have not been accessed for 30 days.</li>
     * <li>DEFAULT_ATIME_60: files that have not been accessed for 60 days.</li>
     * <li>DEFAULT_ATIME_90: files that have not been accessed for 90 days.</li>
     * <li>DEFAULT_ATIME_180: files that have not been accessed for 180 days. DEFAULT_ATIME_180 is supported only when StorageType is set to Archive.<blockquote>
     * <p>If an IA storage class policy has already been configured for the directory, the time period specified for the archive policy must be longer than that of the IA storage class policy.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT_ATIME_14</p>
     */
    @NameInMap("LifecycleRuleName")
    public String lifecycleRuleName;

    /**
     * <p>The absolute path of a single directory configured in the lifecycle management policy.</p>
     * <p>The path must start with a forward slash (/) and must be an existing path in the mount target.</p>
     * 
     * <strong>example:</strong>
     * <p>/pathway/to/folder</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The storage type.</p>
     * <ul>
     * <li>InfrequentAccess: IA storage class.</li>
     * <li>Archive: Archive storage class.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InfrequentAccess</p>
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

    public ModifyLifecyclePolicyRequest setLifecyclePolicyId(String lifecyclePolicyId) {
        this.lifecyclePolicyId = lifecyclePolicyId;
        return this;
    }
    public String getLifecyclePolicyId() {
        return this.lifecyclePolicyId;
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateLifecyclePolicyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>描述</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the file system.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>31a8e4****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The name of the lifecycle policy. The name must be 3 to 64 characters in length and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter.</p>
     * 
     * <strong>example:</strong>
     * <p>lifecyclepolicy_01</p>
     */
    @NameInMap("LifecyclePolicyName")
    public String lifecyclePolicyName;

    /**
     * <strong>example:</strong>
     * <p>Auto</p>
     */
    @NameInMap("LifecyclePolicyType")
    public String lifecyclePolicyType;

    /**
     * <p>The management rule that is associated with the lifecycle policy.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>DEFAULT_ATIME_14: Files that are not accessed in the last 14 days are dumped to the IA storage medium.</li>
     * <li>DEFAULT_ATIME_30: Files that are not accessed in the last 30 days are dumped to the IA storage medium.</li>
     * <li>DEFAULT_ATIME_60: Files that are not accessed in the last 60 days are dumped to the IA storage medium.</li>
     * <li>DEFAULT_ATIME_90: Files that are not accessed in the last 90 days are dumped to the IA storage medium.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT_ATIME_14</p>
     */
    @NameInMap("LifecycleRuleName")
    public String lifecycleRuleName;

    /**
     * <p>The absolute path of the directory that is associated with the lifecycle policy.</p>
     * <p>If you specify this parameter, you can associate the lifecycle policy with only one directory. The path must start with a forward slash (/) and must be a path that exists in the mount target.</p>
     * <blockquote>
     * <p>We recommend that you specify the Paths.N parameter so that you can associate the lifecycle policy with multiple directories.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/pathway/to/folder</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The absolute paths of the directories that are associated with the lifecycle policy.</p>
     * <p>If you specify this parameter, you can associate the lifecycle policy with multiple directories. Each path must start with a forward slash (/) and must be a path that exists in the mount target. Valid values of N: 1 to 10.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;/path1&quot;, &quot;/path2&quot;</p>
     */
    @NameInMap("Paths")
    public java.util.List<String> paths;

    @NameInMap("RetrieveRules")
    public java.util.List<CreateLifecyclePolicyRequestRetrieveRules> retrieveRules;

    /**
     * <p>The storage type of the data that is dumped to the IA storage medium.</p>
     * <p>Default value: InfrequentAccess (IA).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>InfrequentAccess</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    @NameInMap("TransitRules")
    public java.util.List<CreateLifecyclePolicyRequestTransitRules> transitRules;

    public static CreateLifecyclePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLifecyclePolicyRequest self = new CreateLifecyclePolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateLifecyclePolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
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

    public CreateLifecyclePolicyRequest setLifecyclePolicyType(String lifecyclePolicyType) {
        this.lifecyclePolicyType = lifecyclePolicyType;
        return this;
    }
    public String getLifecyclePolicyType() {
        return this.lifecyclePolicyType;
    }

    public CreateLifecyclePolicyRequest setLifecycleRuleName(String lifecycleRuleName) {
        this.lifecycleRuleName = lifecycleRuleName;
        return this;
    }
    public String getLifecycleRuleName() {
        return this.lifecycleRuleName;
    }

    public CreateLifecyclePolicyRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public CreateLifecyclePolicyRequest setPaths(java.util.List<String> paths) {
        this.paths = paths;
        return this;
    }
    public java.util.List<String> getPaths() {
        return this.paths;
    }

    public CreateLifecyclePolicyRequest setRetrieveRules(java.util.List<CreateLifecyclePolicyRequestRetrieveRules> retrieveRules) {
        this.retrieveRules = retrieveRules;
        return this;
    }
    public java.util.List<CreateLifecyclePolicyRequestRetrieveRules> getRetrieveRules() {
        return this.retrieveRules;
    }

    public CreateLifecyclePolicyRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public CreateLifecyclePolicyRequest setTransitRules(java.util.List<CreateLifecyclePolicyRequestTransitRules> transitRules) {
        this.transitRules = transitRules;
        return this;
    }
    public java.util.List<CreateLifecyclePolicyRequestTransitRules> getTransitRules() {
        return this.transitRules;
    }

    public static class CreateLifecyclePolicyRequestRetrieveRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>RetrieveType</p>
         */
        @NameInMap("Attribute")
        public String attribute;

        /**
         * <strong>example:</strong>
         * <p>All</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        public static CreateLifecyclePolicyRequestRetrieveRules build(java.util.Map<String, ?> map) throws Exception {
            CreateLifecyclePolicyRequestRetrieveRules self = new CreateLifecyclePolicyRequestRetrieveRules();
            return TeaModel.build(map, self);
        }

        public CreateLifecyclePolicyRequestRetrieveRules setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public String getAttribute() {
            return this.attribute;
        }

        public CreateLifecyclePolicyRequestRetrieveRules setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

    }

    public static class CreateLifecyclePolicyRequestTransitRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Atime</p>
         */
        @NameInMap("Attribute")
        public String attribute;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        public static CreateLifecyclePolicyRequestTransitRules build(java.util.Map<String, ?> map) throws Exception {
            CreateLifecyclePolicyRequestTransitRules self = new CreateLifecyclePolicyRequestTransitRules();
            return TeaModel.build(map, self);
        }

        public CreateLifecyclePolicyRequestTransitRules setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public String getAttribute() {
            return this.attribute;
        }

        public CreateLifecyclePolicyRequestTransitRules setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateLifecyclePolicyRequest extends TeaModel {
    /**
     * <p>The description of the lifecycle policy.</p>
     * <p>Format:
     * The description must be 3 to 64 characters in length, start with a letter, and can contain letters, digits, underscores (_), or hyphens (-).</p>
     * <blockquote>
     * <p>Only CPFS for Lingjun is supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>描述</p>
     */
    @NameInMap("Description")
    public String description;

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
     * <p>The Policy Name of the lifecycle management policy. The name must be 3 to 64 characters in length, start with an uppercase letter or lowercase letter, and can contain letters, digits, underscores (_), or hyphens (-).</p>
     * <blockquote>
     * <p>This parameter is required for General-purpose NAS but not required for CPFS for Lingjun.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>lifecyclepolicy_01</p>
     */
    @NameInMap("LifecyclePolicyName")
    public String lifecyclePolicyName;

    /**
     * <p>The policy type.</p>
     * <ul>
     * <li>Auto (default): automatic execution.</li>
     * <li>OnDemand: on-demand execution.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Auto</p>
     */
    @NameInMap("LifecyclePolicyType")
    public String lifecyclePolicyType;

    /**
     * <p>The management rule associated with the lifecycle management policy. Only General-purpose NAS is supported.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>DEFAULT_ATIME_14: files that have not been accessed for 14 days.</li>
     * <li>DEFAULT_ATIME_30: files that have not been accessed for 30 days.</li>
     * <li>DEFAULT_ATIME_60: files that have not been accessed for 60 days.</li>
     * <li>DEFAULT_ATIME_90: files that have not been accessed for 90 days.</li>
     * <li>DEFAULT_ATIME_180: files that have not been accessed for 180 days. DEFAULT_ATIME_180 is supported only when StorageType is set to Archive.<blockquote>
     * <ul>
     * <li>If an IA storage class policy has already been configured for the directory, the archive policy duration must be longer than the IA storage class policy duration.</li>
     * <li>Only General-purpose NAS supports this parameter.</li>
     * </ul>
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
     * <p>The absolute path of the directory associated with the lifecycle management policy. Only General-purpose NAS is supported.</p>
     * <ul>
     * <li>General-purpose NAS supports associating only a single directory. The path must start with a forward slash (/) and must be an existing path in the mount target.</li>
     * </ul>
     * <blockquote>
     * <p>Only General-purpose NAS is supported. For General-purpose NAS, use Paths.N to associate multiple directories at the same time.</p>
     * <ul>
     * <li>Only one of Path and Paths can be specified.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/pathway/to/folder</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The absolute paths of directories associated with the lifecycle management policy.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;/path1&quot;, &quot;/path2&quot;</p>
     */
    @NameInMap("Paths")
    public java.util.List<String> paths;

    /**
     * <p>The file data retrieval rules. A maximum of one rule can be configured.</p>
     * <blockquote>
     * <p>Only CPFS for Lingjun file systems are supported.</p>
     * </blockquote>
     * <blockquote>
     * <p>When LifecyclePolicyType is set to OnDemand, at least one of TransitRules or RetrieveRules must be specified.</p>
     * </blockquote>
     */
    @NameInMap("RetrieveRules")
    public java.util.List<CreateLifecyclePolicyRequestRetrieveRules> retrieveRules;

    /**
     * <p>The storage type.</p>
     * <ul>
     * <li>InfrequentAccess: IA storage class.</li>
     * <li>Archive: Archive storage.</li>
     * </ul>
     * <blockquote>
     * <p>General-purpose NAS supports InfrequentAccess and Archive. CPFS for Lingjun supports only InfrequentAccess.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>InfrequentAccess</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The file data transit rules. A maximum of one rule can be configured.</p>
     * <blockquote>
     * <p>Supported only when LifecyclePolicyType is set to Auto for CPFS for Lingjun file systems.</p>
     * </blockquote>
     */
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
         * <p>The rule attribute. Valid values:</p>
         * <ul>
         * <li>RetrieveType: the retrieval method.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RetrieveType</p>
         */
        @NameInMap("Attribute")
        public String attribute;

        /**
         * <p>The rule threshold. Valid values:</p>
         * <ul>
         * <li>RetrieveType<ul>
         * <li>AfterVisit: supported when LifecyclePolicyType is set to Auto. Indicates best-effort recall on visit.</li>
         * <li>All: supported when LifecyclePolicyType is set to OnDemand. Indicates retrieving all data.</li>
         * </ul>
         * </li>
         * </ul>
         * 
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
         * <p>The rule attribute.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Atime: the access time of the file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Atime</p>
         */
        @NameInMap("Attribute")
        public String attribute;

        /**
         * <p>The rule threshold.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>When Attribute is set to Atime, the value indicates the number of days since the file was last accessed. Valid values: 0 to 365.</li>
         * </ul>
         * 
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateLifecyclePolicyRequest extends TeaModel {
    /**
     * <p>The description of the lifecycle policy.</p>
     * <p>Format: The name must be 3 to 64 characters in length and must start with a letter. It can contain letters, digits, underscores (_), and hyphens (-).</p>
     * <blockquote>
     * <p> Only CPFS for Lingjun supports this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Description</p>
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
     * <p>The name of the lifecycle policy. The name must be 3 to 64 characters in length and must start with a letter. It can contain letters, digits, underscores (_), and hyphens (-).</p>
     * <blockquote>
     * <p> Required for General-purpose NAS.</p>
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
     * <li>Auto (default): The job is automatically triggered.</li>
     * <li>OnDemand: On-demand execution.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Auto</p>
     */
    @NameInMap("LifecyclePolicyType")
    public String lifecyclePolicyType;

    /**
     * <p>The management rule associated with the lifecycle policy. Only General-purpose NAS supports this parameter.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>DEFAULT_ATIME_14: Files not accessed for 14 days.</li>
     * <li>DEFAULT_ATIME_30: Files not accessed for 30 days.</li>
     * <li>DEFAULT_ATIME_60: Files not accessed for 60 days.</li>
     * <li>DEFAULT_ATIME_90: Files not accessed for 90 days.</li>
     * <li>DEFAULT_ATIME_180: Files not accessed for 180 days. DEFAULT_ATIME_180 is supported only when the StorageType parameter is set to Archive.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If an IA policy already exists for the directory, the new archive policy must have a longer transition period.</p>
     * </li>
     * <li><p>Only General-purpose NAS supports this parameter.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT_ATIME_14</p>
     */
    @NameInMap("LifecycleRuleName")
    public String lifecycleRuleName;

    /**
     * <p>The absolute path of the directory associated with the lifecycle policy. Only General-purpose NAS supports this parameter.</p>
     * <ul>
     * <li>Single value only. The path must start with a forward slash (/) and must be a path that exists in the mount target.</li>
     * </ul>
     * <blockquote>
     * <p> We recommend configuring the Paths.N parameter so that you can associate the policy with multiple directories at a time.</p>
     * </blockquote>
     * <ul>
     * <li>Path and Paths are mutually exclusive. You must specify one.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>/pathway/to/folder</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The absolute paths of the directories associated with the lifecycle policy.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;/path1&quot;, &quot;/path2&quot;</p>
     */
    @NameInMap("Paths")
    public java.util.List<String> paths;

    /**
     * <p>The file data retrieval rule. Only one rule can be configured.</p>
     * <blockquote>
     * <p> Only CPFS for Lingjun supports this parameter.</p>
     * </blockquote>
     */
    @NameInMap("RetrieveRules")
    public java.util.List<CreateLifecyclePolicyRequestRetrieveRules> retrieveRules;

    /**
     * <p>The storage class.</p>
     * <ul>
     * <li>InfrequentAccess: the Infrequent Access (IA) storage class.</li>
     * <li>Archive: the Archive storage class.</li>
     * </ul>
     * <blockquote>
     * <p> General-purpose NAS supports InfrequentAccess and Archive. CPFS for Lingjun only supports InfrequentAccess.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>InfrequentAccess</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The data transition rule. Only one rule can be configured.</p>
     * <blockquote>
     * <p> Supported only for CPFS for Lingjun file systems with LifecyclePolicyType set to Auto.</p>
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
         * <p>The attribute of the rule. Valid value:</p>
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
         * <p>The threshold of the rule. Valid values:</p>
         * <ul>
         * <li><p>RetrieveType</p>
         * <ul>
         * <li>AfterVisit: Supported when LifecyclePolicyType is Auto. Represents a best-effort recall on access.</li>
         * <li>All: Supported when LifecyclePolicyType is OnDemand. Represents retrieving all data.</li>
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
         * <p>Attribute of the rule.</p>
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
         * <p>Threshold for the rule.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>If Attribute is set to Atime, this value represents the number of days since the file was last accessed. Valid values: [1, 365].</li>
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

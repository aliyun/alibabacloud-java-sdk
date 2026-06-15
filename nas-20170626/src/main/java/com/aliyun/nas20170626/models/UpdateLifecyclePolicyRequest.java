// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class UpdateLifecyclePolicyRequest extends TeaModel {
    /**
     * <p>The description of the lifecycle policy.</p>
     * <p>The description must be 3 to 64 characters long and must start with a letter. It can contain letters, digits, underscores (_), and hyphens (-).</p>
     * <blockquote>
     * <p>This parameter is supported only for CPFS for AI file systems.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Lifecycle policy description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the file system.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bmcpfs-290w65p03ok64y*****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The ID of the lifecycle policy.</p>
     * <blockquote>
     * <p>This parameter is required for CPFS for AI file systems.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lsp-bp1234567890ab****</p>
     */
    @NameInMap("LifecyclePolicyId")
    public String lifecyclePolicyId;

    /**
     * <p>The absolute paths of the directories to which the lifecycle policy applies.</p>
     */
    @NameInMap("Paths")
    public java.util.List<String> paths;

    /**
     * <p>The retrieval rule for files. You can specify only one retrieval rule.</p>
     * <blockquote>
     * <p>This parameter is supported only for CPFS for AI file systems.</p>
     * </blockquote>
     */
    @NameInMap("RetrieveRules")
    public java.util.List<UpdateLifecyclePolicyRequestRetrieveRules> retrieveRules;

    /**
     * <p>The storage tier.</p>
     * <ul>
     * <li><p><code>InfrequentAccess</code>: The Infrequent Access storage tier. This is the default value.</p>
     * </li>
     * <li><p><code>Archive</code>: The Archive storage tier.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InfrequentAccess</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The transition rule for files. You can specify only one transition rule.</p>
     * <blockquote>
     * <p>This parameter is supported only for CPFS for AI file systems when <code>LifecyclePolicyType</code> is set to <code>Auto</code>.</p>
     * </blockquote>
     */
    @NameInMap("TransitRules")
    public java.util.List<UpdateLifecyclePolicyRequestTransitRules> transitRules;

    public static UpdateLifecyclePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLifecyclePolicyRequest self = new UpdateLifecyclePolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLifecyclePolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateLifecyclePolicyRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public UpdateLifecyclePolicyRequest setLifecyclePolicyId(String lifecyclePolicyId) {
        this.lifecyclePolicyId = lifecyclePolicyId;
        return this;
    }
    public String getLifecyclePolicyId() {
        return this.lifecyclePolicyId;
    }

    public UpdateLifecyclePolicyRequest setPaths(java.util.List<String> paths) {
        this.paths = paths;
        return this;
    }
    public java.util.List<String> getPaths() {
        return this.paths;
    }

    public UpdateLifecyclePolicyRequest setRetrieveRules(java.util.List<UpdateLifecyclePolicyRequestRetrieveRules> retrieveRules) {
        this.retrieveRules = retrieveRules;
        return this;
    }
    public java.util.List<UpdateLifecyclePolicyRequestRetrieveRules> getRetrieveRules() {
        return this.retrieveRules;
    }

    public UpdateLifecyclePolicyRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public UpdateLifecyclePolicyRequest setTransitRules(java.util.List<UpdateLifecyclePolicyRequestTransitRules> transitRules) {
        this.transitRules = transitRules;
        return this;
    }
    public java.util.List<UpdateLifecyclePolicyRequestTransitRules> getTransitRules() {
        return this.transitRules;
    }

    public static class UpdateLifecyclePolicyRequestRetrieveRules extends TeaModel {
        /**
         * <p>The rule attribute. Valid value:</p>
         * <ul>
         * <li><code>RetrieveType</code>: The retrieval method.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RetrieveType</p>
         */
        @NameInMap("Attribute")
        public String attribute;

        /**
         * <p>The retrieval method. Valid values:</p>
         * <ul>
         * <li><p>If <code>Attribute</code> is set to <code>RetrieveType</code>:</p>
         * <ul>
         * <li><p><code>AfterVisit</code>: Retrieves data on a best-effort basis after a file is accessed. This value is valid only when <code>LifecyclePolicyType</code> is <code>Auto</code>.</p>
         * </li>
         * <li><p><code>All</code>: Retrieves all data. This value is valid only when <code>LifecyclePolicyType</code> is <code>OnDemand</code>.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>All</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        public static UpdateLifecyclePolicyRequestRetrieveRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateLifecyclePolicyRequestRetrieveRules self = new UpdateLifecyclePolicyRequestRetrieveRules();
            return TeaModel.build(map, self);
        }

        public UpdateLifecyclePolicyRequestRetrieveRules setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public String getAttribute() {
            return this.attribute;
        }

        public UpdateLifecyclePolicyRequestRetrieveRules setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

    }

    public static class UpdateLifecyclePolicyRequestTransitRules extends TeaModel {
        /**
         * <p>The rule attribute.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li><code>Atime</code>: The last access time of a file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Atime</p>
         */
        @NameInMap("Attribute")
        public String attribute;

        /**
         * <p>The rule threshold.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>If <code>Attribute</code> is set to <code>Atime</code>, this parameter specifies the number of days since a file was last accessed. The value must be between 1 and 365.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        public static UpdateLifecyclePolicyRequestTransitRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateLifecyclePolicyRequestTransitRules self = new UpdateLifecyclePolicyRequestTransitRules();
            return TeaModel.build(map, self);
        }

        public UpdateLifecyclePolicyRequestTransitRules setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public String getAttribute() {
            return this.attribute;
        }

        public UpdateLifecyclePolicyRequestTransitRules setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

    }

}

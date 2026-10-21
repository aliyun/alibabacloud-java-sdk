// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class UpdateLifecyclePolicyRequest extends TeaModel {
    /**
     * <p>The expiration and deletion rules for file data.</p>
     */
    @NameInMap("DeleteRules")
    public java.util.List<UpdateLifecyclePolicyRequestDeleteRules> deleteRules;

    /**
     * <p>The description of the lifecycle policy.</p>
     * <p>Format:
     * The description must be 3 to 64 characters in length. It must start with a letter and can contain letters, digits, underscores (_), and hyphens (-).</p>
     * <blockquote>
     * <p>Supported only for CPFS for Lingjun.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Lifecycle policy description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the file system. The ID starts with bmcpfs-, such as bmcpfs-290w65p03ok64ya****. To use CPFS for Lingjun, you must first submit a ticket to apply for the service whitelist and then create the file system in the NAS console.</p>
     * <blockquote>
     * <p>Supported only when LifecyclePolicyType is set to OnDemand in the lifecycle management policy of a CPFS for Lingjun file system.</p>
     * </blockquote>
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
     * <p>Required for CPFS for Lingjun file systems.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lsp-bp1234567890ab****</p>
     */
    @NameInMap("LifecyclePolicyId")
    public String lifecyclePolicyId;

    /**
     * <p>The absolute path of the directory associated with the lifecycle management policy. This parameter is required when FileSystemId starts with bmcpfs-.</p>
     */
    @NameInMap("Paths")
    public java.util.List<String> paths;

    /**
     * <p>The data retrieval rules for files. You can configure up to one rule.</p>
     * <blockquote>
     * <p>Supported only for CPFS for Lingjun file systems.</p>
     * </blockquote>
     */
    @NameInMap("RetrieveRules")
    public java.util.List<UpdateLifecyclePolicyRequestRetrieveRules> retrieveRules;

    /**
     * <p>The tiered storage type. Valid values:</p>
     * <ul>
     * <li>InfrequentAccess: IA storage class. This is the default value.</li>
     * <li>Archive: Archive storage class.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InfrequentAccess</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The data transition rules for files. You can configure up to one rule.</p>
     * <blockquote>
     * <p>Supported only when LifecyclePolicyType is set to Auto for a CPFS for Lingjun file system.</p>
     * </blockquote>
     */
    @NameInMap("TransitRules")
    public java.util.List<UpdateLifecyclePolicyRequestTransitRules> transitRules;

    public static UpdateLifecyclePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLifecyclePolicyRequest self = new UpdateLifecyclePolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLifecyclePolicyRequest setDeleteRules(java.util.List<UpdateLifecyclePolicyRequestDeleteRules> deleteRules) {
        this.deleteRules = deleteRules;
        return this;
    }
    public java.util.List<UpdateLifecyclePolicyRequestDeleteRules> getDeleteRules() {
        return this.deleteRules;
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

    public static class UpdateLifecyclePolicyRequestDeleteRules extends TeaModel {
        /**
         * <p>The attribute of the rule.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Atime: the last access time of the file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Atime</p>
         */
        @NameInMap("Attribute")
        public String attribute;

        /**
         * <p>The threshold of the rule.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>If Attribute is set to Atime, the value indicates the number of days that a file has not been accessed. Valid values: 1 to 365.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Threshold")
        public String threshold;

        public static UpdateLifecyclePolicyRequestDeleteRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateLifecyclePolicyRequestDeleteRules self = new UpdateLifecyclePolicyRequestDeleteRules();
            return TeaModel.build(map, self);
        }

        public UpdateLifecyclePolicyRequestDeleteRules setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public String getAttribute() {
            return this.attribute;
        }

        public UpdateLifecyclePolicyRequestDeleteRules setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

    }

    public static class UpdateLifecyclePolicyRequestRetrieveRules extends TeaModel {
        /**
         * <p>The attribute of the rule. Valid values:</p>
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
         * <p>The threshold of the rule. Valid values for RetrieveType:</p>
         * <ul>
         * <li>AfterVisit: supported when LifecyclePolicyType is set to Auto. This value indicates best-effort recall on visit.</li>
         * <li>All: supported when LifecyclePolicyType is set to OnDemand. This value indicates that all data is retrieved.</li>
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
         * <p>The attribute of the rule.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Atime: the last access time of the file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Atime</p>
         */
        @NameInMap("Attribute")
        public String attribute;

        /**
         * <p>The threshold of the rule.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>If Attribute is set to Atime, the value indicates the number of days that a file has not been accessed. Valid values: 1 to 365.</li>
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

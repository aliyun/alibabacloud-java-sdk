// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class UpdateLifecyclePolicyRequest extends TeaModel {
    /**
     * <p>The file data expiration and deletion rules.</p>
     */
    @NameInMap("DeleteRules")
    public java.util.List<UpdateLifecyclePolicyRequestDeleteRules> deleteRules;

    /**
     * <p>The description of the lifecycle policy.</p>
     * <p>Format:
     * The description must be 3 to 64 characters in length, start with a letter, and can contain letters, digits, underscores (_), or hyphens (-).</p>
     * <blockquote>
     * <p>Only CPFS for Lingjun is supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Lifecycle policy description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The file system ID. The ID starts with bmcpfs-, such as bmcpfs-290w65p03ok64ya****.</p>
     * <blockquote>
     * <p>This parameter is supported only when LifecyclePolicyType is set to OnDemand in the lifecycle management policy of a CPFS for Lingjun file system.</p>
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
     * <p>This parameter is required for CPFS for Lingjun file systems.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lsp-bp1234567890ab****</p>
     */
    @NameInMap("LifecyclePolicyId")
    public String lifecyclePolicyId;

    /**
     * <p>The absolute paths of the directories associated with the lifecycle management policy.</p>
     */
    @NameInMap("Paths")
    public java.util.List<String> paths;

    /**
     * <p>The file data retrieval rules. You can configure up to one rule.</p>
     * <blockquote>
     * <p>Only CPFS for Lingjun file systems are supported.</p>
     * </blockquote>
     */
    @NameInMap("RetrieveRules")
    public java.util.List<UpdateLifecyclePolicyRequestRetrieveRules> retrieveRules;

    /**
     * <p>The tiered storage type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>InfrequentAccess: IA storage class. This is the default value.</li>
     * <li>Archive: Archive storage.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InfrequentAccess</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The file data transit rules. You can configure up to one rule.</p>
     * <blockquote>
     * <p>This parameter is supported only when LifecyclePolicyType is set to Auto for a CPFS for Lingjun file system.</p>
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
         * <li>Atime: the access time of the file.</li>
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
         * <li>If Attribute is set to Atime, the value specifies the number of days since the file was last accessed. Valid values: 1 to 365.</li>
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
         * <p>The attribute of the rule.</p>
         * <p>Valid values:</p>
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
         * <p>The threshold of the rule.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>RetrieveType<ul>
         * <li>AfterVisit: supported when LifecyclePolicyType is set to Auto. Indicates best-effort recall on visit.</li>
         * <li>All: supported when LifecyclePolicyType is set to OnDemand. Indicates retrieval of all data.</li>
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
         * <p>The attribute of the rule.</p>
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
         * <p>The threshold of the rule.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>If Attribute is set to Atime, the value specifies the number of days since the file was last accessed. Valid values: 1 to 365.</li>
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

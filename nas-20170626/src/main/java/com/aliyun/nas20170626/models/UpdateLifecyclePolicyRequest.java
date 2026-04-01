// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class UpdateLifecyclePolicyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Lifecycle policy description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bmcpfs-290w65p03ok64y*****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lsp-bp1234567890ab****</p>
     */
    @NameInMap("LifecyclePolicyId")
    public String lifecyclePolicyId;

    @NameInMap("Paths")
    public java.util.List<String> paths;

    @NameInMap("RetrieveRules")
    public java.util.List<UpdateLifecyclePolicyRequestRetrieveRules> retrieveRules;

    /**
     * <strong>example:</strong>
     * <p>InfrequentAccess</p>
     */
    @NameInMap("StorageType")
    public String storageType;

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

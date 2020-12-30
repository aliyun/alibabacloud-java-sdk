// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CreateResourceQueueRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Name")
    public String name;

    @NameInMap("QualifiedName")
    public String qualifiedName;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ParentQueueId")
    public Long parentQueueId;

    @NameInMap("Leaf")
    public Boolean leaf;

    @NameInMap("ResourcePoolId")
    public Long resourcePoolId;

    @NameInMap("Config")
    public java.util.List<CreateResourceQueueRequestConfig> config;

    public static CreateResourceQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceQueueRequest self = new CreateResourceQueueRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceQueueRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateResourceQueueRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateResourceQueueRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateResourceQueueRequest setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }
    public String getQualifiedName() {
        return this.qualifiedName;
    }

    public CreateResourceQueueRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateResourceQueueRequest setParentQueueId(Long parentQueueId) {
        this.parentQueueId = parentQueueId;
        return this;
    }
    public Long getParentQueueId() {
        return this.parentQueueId;
    }

    public CreateResourceQueueRequest setLeaf(Boolean leaf) {
        this.leaf = leaf;
        return this;
    }
    public Boolean getLeaf() {
        return this.leaf;
    }

    public CreateResourceQueueRequest setResourcePoolId(Long resourcePoolId) {
        this.resourcePoolId = resourcePoolId;
        return this;
    }
    public Long getResourcePoolId() {
        return this.resourcePoolId;
    }

    public CreateResourceQueueRequest setConfig(java.util.List<CreateResourceQueueRequestConfig> config) {
        this.config = config;
        return this;
    }
    public java.util.List<CreateResourceQueueRequestConfig> getConfig() {
        return this.config;
    }

    public static class CreateResourceQueueRequestConfig extends TeaModel {
        @NameInMap("ConfigValue")
        public String configValue;

        @NameInMap("Note")
        public String note;

        @NameInMap("Category")
        public String category;

        @NameInMap("ConfigKey")
        public String configKey;

        public static CreateResourceQueueRequestConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateResourceQueueRequestConfig self = new CreateResourceQueueRequestConfig();
            return TeaModel.build(map, self);
        }

        public CreateResourceQueueRequestConfig setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

        public CreateResourceQueueRequestConfig setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public CreateResourceQueueRequestConfig setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateResourceQueueRequestConfig setConfigKey(String configKey) {
            this.configKey = configKey;
            return this;
        }
        public String getConfigKey() {
            return this.configKey;
        }

    }

}

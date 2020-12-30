// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyResourceQueueRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Id")
    public String id;

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
    public java.util.List<ModifyResourceQueueRequestConfig> config;

    public static ModifyResourceQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyResourceQueueRequest self = new ModifyResourceQueueRequest();
        return TeaModel.build(map, self);
    }

    public ModifyResourceQueueRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyResourceQueueRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyResourceQueueRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyResourceQueueRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyResourceQueueRequest setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }
    public String getQualifiedName() {
        return this.qualifiedName;
    }

    public ModifyResourceQueueRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyResourceQueueRequest setParentQueueId(Long parentQueueId) {
        this.parentQueueId = parentQueueId;
        return this;
    }
    public Long getParentQueueId() {
        return this.parentQueueId;
    }

    public ModifyResourceQueueRequest setLeaf(Boolean leaf) {
        this.leaf = leaf;
        return this;
    }
    public Boolean getLeaf() {
        return this.leaf;
    }

    public ModifyResourceQueueRequest setResourcePoolId(Long resourcePoolId) {
        this.resourcePoolId = resourcePoolId;
        return this;
    }
    public Long getResourcePoolId() {
        return this.resourcePoolId;
    }

    public ModifyResourceQueueRequest setConfig(java.util.List<ModifyResourceQueueRequestConfig> config) {
        this.config = config;
        return this;
    }
    public java.util.List<ModifyResourceQueueRequestConfig> getConfig() {
        return this.config;
    }

    public static class ModifyResourceQueueRequestConfig extends TeaModel {
        @NameInMap("ConfigValue")
        public String configValue;

        @NameInMap("Note")
        public String note;

        @NameInMap("Category")
        public String category;

        @NameInMap("ConfigKey")
        public String configKey;

        @NameInMap("Id")
        public Long id;

        public static ModifyResourceQueueRequestConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyResourceQueueRequestConfig self = new ModifyResourceQueueRequestConfig();
            return TeaModel.build(map, self);
        }

        public ModifyResourceQueueRequestConfig setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

        public ModifyResourceQueueRequestConfig setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public ModifyResourceQueueRequestConfig setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ModifyResourceQueueRequestConfig setConfigKey(String configKey) {
            this.configKey = configKey;
            return this;
        }
        public String getConfigKey() {
            return this.configKey;
        }

        public ModifyResourceQueueRequestConfig setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}

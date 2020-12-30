// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CreateResourcePoolRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Name")
    public String name;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("PoolType")
    public String poolType;

    @NameInMap("Active")
    public Boolean active;

    @NameInMap("Note")
    public String note;

    @NameInMap("YarnSiteConfig")
    public String yarnSiteConfig;

    @NameInMap("Config")
    public java.util.List<CreateResourcePoolRequestConfig> config;

    public static CreateResourcePoolRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourcePoolRequest self = new CreateResourcePoolRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourcePoolRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateResourcePoolRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateResourcePoolRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateResourcePoolRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateResourcePoolRequest setPoolType(String poolType) {
        this.poolType = poolType;
        return this;
    }
    public String getPoolType() {
        return this.poolType;
    }

    public CreateResourcePoolRequest setActive(Boolean active) {
        this.active = active;
        return this;
    }
    public Boolean getActive() {
        return this.active;
    }

    public CreateResourcePoolRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public CreateResourcePoolRequest setYarnSiteConfig(String yarnSiteConfig) {
        this.yarnSiteConfig = yarnSiteConfig;
        return this;
    }
    public String getYarnSiteConfig() {
        return this.yarnSiteConfig;
    }

    public CreateResourcePoolRequest setConfig(java.util.List<CreateResourcePoolRequestConfig> config) {
        this.config = config;
        return this;
    }
    public java.util.List<CreateResourcePoolRequestConfig> getConfig() {
        return this.config;
    }

    public static class CreateResourcePoolRequestConfig extends TeaModel {
        @NameInMap("configType")
        public String configType;

        @NameInMap("ConfigValue")
        public String configValue;

        @NameInMap("TargetId")
        public String targetId;

        @NameInMap("Note")
        public String note;

        @NameInMap("Category")
        public String category;

        @NameInMap("ConfigKey")
        public String configKey;

        public static CreateResourcePoolRequestConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateResourcePoolRequestConfig self = new CreateResourcePoolRequestConfig();
            return TeaModel.build(map, self);
        }

        public CreateResourcePoolRequestConfig setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

        public CreateResourcePoolRequestConfig setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

        public CreateResourcePoolRequestConfig setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public CreateResourcePoolRequestConfig setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public CreateResourcePoolRequestConfig setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateResourcePoolRequestConfig setConfigKey(String configKey) {
            this.configKey = configKey;
            return this;
        }
        public String getConfigKey() {
            return this.configKey;
        }

    }

}

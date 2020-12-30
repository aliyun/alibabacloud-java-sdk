// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyResourcePoolRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Id")
    public String id;

    @NameInMap("Active")
    public Boolean active;

    @NameInMap("Name")
    public String name;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Yarnsiteconfig")
    public String yarnsiteconfig;

    @NameInMap("Config")
    public java.util.List<ModifyResourcePoolRequestConfig> config;

    public static ModifyResourcePoolRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyResourcePoolRequest self = new ModifyResourcePoolRequest();
        return TeaModel.build(map, self);
    }

    public ModifyResourcePoolRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyResourcePoolRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyResourcePoolRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyResourcePoolRequest setActive(Boolean active) {
        this.active = active;
        return this;
    }
    public Boolean getActive() {
        return this.active;
    }

    public ModifyResourcePoolRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyResourcePoolRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyResourcePoolRequest setYarnsiteconfig(String yarnsiteconfig) {
        this.yarnsiteconfig = yarnsiteconfig;
        return this;
    }
    public String getYarnsiteconfig() {
        return this.yarnsiteconfig;
    }

    public ModifyResourcePoolRequest setConfig(java.util.List<ModifyResourcePoolRequestConfig> config) {
        this.config = config;
        return this;
    }
    public java.util.List<ModifyResourcePoolRequestConfig> getConfig() {
        return this.config;
    }

    public static class ModifyResourcePoolRequestConfig extends TeaModel {
        @NameInMap("ConfigValue")
        public String configValue;

        @NameInMap("Note")
        public String note;

        @NameInMap("Category")
        public String category;

        @NameInMap("ConfigKey")
        public String configKey;

        @NameInMap("Id")
        public String id;

        public static ModifyResourcePoolRequestConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyResourcePoolRequestConfig self = new ModifyResourcePoolRequestConfig();
            return TeaModel.build(map, self);
        }

        public ModifyResourcePoolRequestConfig setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

        public ModifyResourcePoolRequestConfig setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public ModifyResourcePoolRequestConfig setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ModifyResourcePoolRequestConfig setConfigKey(String configKey) {
            this.configKey = configKey;
            return this;
        }
        public String getConfigKey() {
            return this.configKey;
        }

        public ModifyResourcePoolRequestConfig setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}

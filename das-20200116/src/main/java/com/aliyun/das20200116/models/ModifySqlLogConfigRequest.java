// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class ModifySqlLogConfigRequest extends TeaModel {
    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("Filters")
    public java.util.List<ModifySqlLogConfigRequestFilters> filters;

    @NameInMap("HotRetention")
    public Integer hotRetention;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RequestEnable")
    public Boolean requestEnable;

    @NameInMap("Retention")
    public Integer retention;

    public static ModifySqlLogConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySqlLogConfigRequest self = new ModifySqlLogConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifySqlLogConfigRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public ModifySqlLogConfigRequest setFilters(java.util.List<ModifySqlLogConfigRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<ModifySqlLogConfigRequestFilters> getFilters() {
        return this.filters;
    }

    public ModifySqlLogConfigRequest setHotRetention(Integer hotRetention) {
        this.hotRetention = hotRetention;
        return this;
    }
    public Integer getHotRetention() {
        return this.hotRetention;
    }

    public ModifySqlLogConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifySqlLogConfigRequest setRequestEnable(Boolean requestEnable) {
        this.requestEnable = requestEnable;
        return this;
    }
    public Boolean getRequestEnable() {
        return this.requestEnable;
    }

    public ModifySqlLogConfigRequest setRetention(Integer retention) {
        this.retention = retention;
        return this;
    }
    public Integer getRetention() {
        return this.retention;
    }

    public static class ModifySqlLogConfigRequestFilters extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ModifySqlLogConfigRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            ModifySqlLogConfigRequestFilters self = new ModifySqlLogConfigRequestFilters();
            return TeaModel.build(map, self);
        }

        public ModifySqlLogConfigRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModifySqlLogConfigRequestFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

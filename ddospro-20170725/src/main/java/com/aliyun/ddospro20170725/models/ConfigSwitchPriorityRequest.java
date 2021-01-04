// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class ConfigSwitchPriorityRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Config")
    public java.util.List<ConfigSwitchPriorityRequestConfig> config;

    public static ConfigSwitchPriorityRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigSwitchPriorityRequest self = new ConfigSwitchPriorityRequest();
        return TeaModel.build(map, self);
    }

    public ConfigSwitchPriorityRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ConfigSwitchPriorityRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ConfigSwitchPriorityRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ConfigSwitchPriorityRequest setConfig(java.util.List<ConfigSwitchPriorityRequestConfig> config) {
        this.config = config;
        return this;
    }
    public java.util.List<ConfigSwitchPriorityRequestConfig> getConfig() {
        return this.config;
    }

    public static class ConfigSwitchPriorityRequestConfig extends TeaModel {
        @NameInMap("Ip")
        public String ip;

        @NameInMap("Priority")
        public Integer priority;

        public static ConfigSwitchPriorityRequestConfig build(java.util.Map<String, ?> map) throws Exception {
            ConfigSwitchPriorityRequestConfig self = new ConfigSwitchPriorityRequestConfig();
            return TeaModel.build(map, self);
        }

        public ConfigSwitchPriorityRequestConfig setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ConfigSwitchPriorityRequestConfig setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

}

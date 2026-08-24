// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ConfigSetCreateRequest extends TeaModel {
    /**
     * <p>The description. The description can be up to 50 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the associated IP pool. This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("IpPoolId")
    public String ipPoolId;

    @NameInMap("IsPublicChannelBackoff")
    public Boolean isPublicChannelBackoff;

    /**
     * <p>The configuration name. This parameter is required. The name can be up to 50 characters in length and must be unique.</p>
     * 
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("ValidationOption")
    public ConfigSetCreateRequestValidationOption validationOption;

    public static ConfigSetCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigSetCreateRequest self = new ConfigSetCreateRequest();
        return TeaModel.build(map, self);
    }

    public ConfigSetCreateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ConfigSetCreateRequest setIpPoolId(String ipPoolId) {
        this.ipPoolId = ipPoolId;
        return this;
    }
    public String getIpPoolId() {
        return this.ipPoolId;
    }

    public ConfigSetCreateRequest setIsPublicChannelBackoff(Boolean isPublicChannelBackoff) {
        this.isPublicChannelBackoff = isPublicChannelBackoff;
        return this;
    }
    public Boolean getIsPublicChannelBackoff() {
        return this.isPublicChannelBackoff;
    }

    public ConfigSetCreateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ConfigSetCreateRequest setValidationOption(ConfigSetCreateRequestValidationOption validationOption) {
        this.validationOption = validationOption;
        return this;
    }
    public ConfigSetCreateRequestValidationOption getValidationOption() {
        return this.validationOption;
    }

    public static class ConfigSetCreateRequestValidationOption extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("ForbiddenStatusList")
        public java.util.List<String> forbiddenStatusList;

        @NameInMap("ForbiddenSubStatusList")
        public java.util.List<String> forbiddenSubStatusList;

        public static ConfigSetCreateRequestValidationOption build(java.util.Map<String, ?> map) throws Exception {
            ConfigSetCreateRequestValidationOption self = new ConfigSetCreateRequestValidationOption();
            return TeaModel.build(map, self);
        }

        public ConfigSetCreateRequestValidationOption setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ConfigSetCreateRequestValidationOption setForbiddenStatusList(java.util.List<String> forbiddenStatusList) {
            this.forbiddenStatusList = forbiddenStatusList;
            return this;
        }
        public java.util.List<String> getForbiddenStatusList() {
            return this.forbiddenStatusList;
        }

        public ConfigSetCreateRequestValidationOption setForbiddenSubStatusList(java.util.List<String> forbiddenSubStatusList) {
            this.forbiddenSubStatusList = forbiddenSubStatusList;
            return this;
        }
        public java.util.List<String> getForbiddenSubStatusList() {
            return this.forbiddenSubStatusList;
        }

    }

}

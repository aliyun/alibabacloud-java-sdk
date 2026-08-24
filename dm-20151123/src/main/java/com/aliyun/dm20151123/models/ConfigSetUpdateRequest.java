// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ConfigSetUpdateRequest extends TeaModel {
    /**
     * <p>The description. Maximum length: 50 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The configuration set ID. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The associated IP pool ID. This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("IpPoolId")
    public String ipPoolId;

    @NameInMap("IsPublicChannelBackoff")
    public Boolean isPublicChannelBackoff;

    /**
     * <p>The configuration name. This parameter is required. Maximum length: 50 characters. The name must be unique.</p>
     * 
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("ValidationOption")
    public ConfigSetUpdateRequestValidationOption validationOption;

    public static ConfigSetUpdateRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigSetUpdateRequest self = new ConfigSetUpdateRequest();
        return TeaModel.build(map, self);
    }

    public ConfigSetUpdateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ConfigSetUpdateRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ConfigSetUpdateRequest setIpPoolId(String ipPoolId) {
        this.ipPoolId = ipPoolId;
        return this;
    }
    public String getIpPoolId() {
        return this.ipPoolId;
    }

    public ConfigSetUpdateRequest setIsPublicChannelBackoff(Boolean isPublicChannelBackoff) {
        this.isPublicChannelBackoff = isPublicChannelBackoff;
        return this;
    }
    public Boolean getIsPublicChannelBackoff() {
        return this.isPublicChannelBackoff;
    }

    public ConfigSetUpdateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ConfigSetUpdateRequest setValidationOption(ConfigSetUpdateRequestValidationOption validationOption) {
        this.validationOption = validationOption;
        return this;
    }
    public ConfigSetUpdateRequestValidationOption getValidationOption() {
        return this.validationOption;
    }

    public static class ConfigSetUpdateRequestValidationOption extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("ForbiddenStatusList")
        public java.util.List<String> forbiddenStatusList;

        @NameInMap("ForbiddenSubStatusList")
        public java.util.List<String> forbiddenSubStatusList;

        public static ConfigSetUpdateRequestValidationOption build(java.util.Map<String, ?> map) throws Exception {
            ConfigSetUpdateRequestValidationOption self = new ConfigSetUpdateRequestValidationOption();
            return TeaModel.build(map, self);
        }

        public ConfigSetUpdateRequestValidationOption setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ConfigSetUpdateRequestValidationOption setForbiddenStatusList(java.util.List<String> forbiddenStatusList) {
            this.forbiddenStatusList = forbiddenStatusList;
            return this;
        }
        public java.util.List<String> getForbiddenStatusList() {
            return this.forbiddenStatusList;
        }

        public ConfigSetUpdateRequestValidationOption setForbiddenSubStatusList(java.util.List<String> forbiddenSubStatusList) {
            this.forbiddenSubStatusList = forbiddenSubStatusList;
            return this;
        }
        public java.util.List<String> getForbiddenSubStatusList() {
            return this.forbiddenSubStatusList;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreatePluginRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("PluginData")
    public String pluginData;

    @NameInMap("PluginName")
    public String pluginName;

    @NameInMap("PluginType")
    public String pluginType;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Tag")
    public java.util.List<CreatePluginRequestTag> tag;

    public static CreatePluginRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePluginRequest self = new CreatePluginRequest();
        return TeaModel.build(map, self);
    }

    public CreatePluginRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePluginRequest setPluginData(String pluginData) {
        this.pluginData = pluginData;
        return this;
    }
    public String getPluginData() {
        return this.pluginData;
    }

    public CreatePluginRequest setPluginName(String pluginName) {
        this.pluginName = pluginName;
        return this;
    }
    public String getPluginName() {
        return this.pluginName;
    }

    public CreatePluginRequest setPluginType(String pluginType) {
        this.pluginType = pluginType;
        return this;
    }
    public String getPluginType() {
        return this.pluginType;
    }

    public CreatePluginRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreatePluginRequest setTag(java.util.List<CreatePluginRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreatePluginRequestTag> getTag() {
        return this.tag;
    }

    public static class CreatePluginRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreatePluginRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreatePluginRequestTag self = new CreatePluginRequestTag();
            return TeaModel.build(map, self);
        }

        public CreatePluginRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreatePluginRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

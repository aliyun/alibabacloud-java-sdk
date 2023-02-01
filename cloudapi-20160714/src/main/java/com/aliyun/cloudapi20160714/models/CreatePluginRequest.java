// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreatePluginRequest extends TeaModel {
    /**
     * <p>The description of the plug-in. The description can contain a maximum of 200 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The plug-in definition statement, which can be in JSON or YAML format.</p>
     */
    @NameInMap("PluginData")
    public String pluginData;

    /**
     * <p>The name of the plug-in. The name must be 4 to 50 characters in length and can contain letters, digits, and underscores (\_). However, it cannot start with an underscore.</p>
     */
    @NameInMap("PluginName")
    public String pluginName;

    /**
     * <p>The type of the plug-in. Valid values:</p>
     * <br>
     * <p>*   **ipControl: IP address-based access control**</p>
     * <p>*   **trafficControl: throttling**</p>
     * <p>*   **backendSignature: backend signature**</p>
     * <p>*   **jwtAuth** :JWT (OpenId Connect) authentication</p>
     * <p>*   **cors** :cross-origin resource sharing (CORS)</p>
     * <p>*   **caching**</p>
     */
    @NameInMap("PluginType")
    public String pluginType;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The tag of objects that match the rule. You can specify multiple tags.</p>
     */
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
        /**
         * <p>The key of the tag.</p>
         * <br>
         * <p>N can be an integer from 1 to 20.``</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * <br>
         * <p>N can be an integer from 1 to 20.``</p>
         */
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

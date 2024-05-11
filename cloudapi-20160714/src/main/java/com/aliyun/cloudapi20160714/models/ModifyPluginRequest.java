// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyPluginRequest extends TeaModel {
    /**
     * <p>The description of the plug-in. The description can contain a maximum of 200 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The statement that is used to modify the plug-in definition.</p>
     */
    @NameInMap("PluginData")
    public String pluginData;

    /**
     * <p>The ID of the plug-in whose information you want to modify.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PluginId")
    public String pluginId;

    /**
     * <p>The name of the plug-in. The name must be 4 to 50 characters in length and can contain letters, digits, and underscores (_). However, it cannot start with an underscore.</p>
     */
    @NameInMap("PluginName")
    public String pluginName;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The tag of objects that match the rule. You can specify multiple tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ModifyPluginRequestTag> tag;

    public static ModifyPluginRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPluginRequest self = new ModifyPluginRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPluginRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyPluginRequest setPluginData(String pluginData) {
        this.pluginData = pluginData;
        return this;
    }
    public String getPluginData() {
        return this.pluginData;
    }

    public ModifyPluginRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public ModifyPluginRequest setPluginName(String pluginName) {
        this.pluginName = pluginName;
        return this;
    }
    public String getPluginName() {
        return this.pluginName;
    }

    public ModifyPluginRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyPluginRequest setTag(java.util.List<ModifyPluginRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ModifyPluginRequestTag> getTag() {
        return this.tag;
    }

    public static class ModifyPluginRequestTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * <br>
         * <p>N can be an integer from 1 to 20.``</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * <br>
         * <p>N can be an integer from 1 to 20.``</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ModifyPluginRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ModifyPluginRequestTag self = new ModifyPluginRequestTag();
            return TeaModel.build(map, self);
        }

        public ModifyPluginRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModifyPluginRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

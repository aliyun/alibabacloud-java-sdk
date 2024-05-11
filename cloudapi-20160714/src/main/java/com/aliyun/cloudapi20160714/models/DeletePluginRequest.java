// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeletePluginRequest extends TeaModel {
    /**
     * <p>The ID of the plug-in to be deleted.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PluginId")
    public String pluginId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The tag of objects that match the rule. You can specify multiple tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DeletePluginRequestTag> tag;

    public static DeletePluginRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePluginRequest self = new DeletePluginRequest();
        return TeaModel.build(map, self);
    }

    public DeletePluginRequest setPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    public String getPluginId() {
        return this.pluginId;
    }

    public DeletePluginRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DeletePluginRequest setTag(java.util.List<DeletePluginRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DeletePluginRequestTag> getTag() {
        return this.tag;
    }

    public static class DeletePluginRequestTag extends TeaModel {
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

        public static DeletePluginRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DeletePluginRequestTag self = new DeletePluginRequestTag();
            return TeaModel.build(map, self);
        }

        public DeletePluginRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DeletePluginRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

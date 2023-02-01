// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyAppRequest extends TeaModel {
    /**
     * <p>The ID of the app.</p>
     */
    @NameInMap("AppId")
    public Long appId;

    /**
     * <p>The value must be 4 to 26 characters in length and can contain letters, digits, and underscores (\_). It must start with a letter.</p>
     * <br>
     * <p>This parameter is required only when you want to modify the value.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The description of the app. The description can contain a maximum of 180 characters in length.</p>
     * <br>
     * <p>This parameter is required only when you want to modify the value.</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The tag of objects that match the rule. You can specify multiple tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ModifyAppRequestTag> tag;

    public static ModifyAppRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppRequest self = new ModifyAppRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public ModifyAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ModifyAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyAppRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyAppRequest setTag(java.util.List<ModifyAppRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ModifyAppRequestTag> getTag() {
        return this.tag;
    }

    public static class ModifyAppRequestTag extends TeaModel {
        /**
         * <p>The value of the tag.</p>
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

        public static ModifyAppRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ModifyAppRequestTag self = new ModifyAppRequestTag();
            return TeaModel.build(map, self);
        }

        public ModifyAppRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModifyAppRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

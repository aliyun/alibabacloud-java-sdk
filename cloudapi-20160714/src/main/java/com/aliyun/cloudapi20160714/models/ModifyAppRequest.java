// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyAppRequest extends TeaModel {
    /**
     * <p>The ID of the app.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20112314518278</p>
     */
    @NameInMap("AppId")
    public Long appId;

    /**
     * <p>The value must be 4 to 26 characters in length and can contain letters, digits, and underscores (_). It must start with a letter.</p>
     * <p>This parameter is required only when you want to modify the value.</p>
     * 
     * <strong>example:</strong>
     * <p>jiedian_pord</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The description of the app. The description can contain a maximum of 180 characters in length.</p>
     * <p>This parameter is required only when you want to modify the value.</p>
     * 
     * <strong>example:</strong>
     * <p>modidyTest</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>扩展信息</p>
     * 
     * <strong>example:</strong>
     * <p>110461946884</p>
     */
    @NameInMap("Extend")
    public String extend;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The tag of objects that match the rule. You can specify multiple tags.</p>
     * 
     * <strong>example:</strong>
     * <p>Key， Value</p>
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

    public ModifyAppRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
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
         * <p>N can be an integer from 1 to 20.``</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * <p>N can be an integer from 1 to 20.``</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
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

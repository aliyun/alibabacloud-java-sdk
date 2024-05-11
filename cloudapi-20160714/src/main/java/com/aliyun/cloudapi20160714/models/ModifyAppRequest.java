// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyAppRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public Long appId;

    /**
     * <p>The ID must be 4 to 26 characters in length and can contain letters, digits, and underscores (_). It must start with a letter.</p>
     * <br>
     * <p>If you do not want to modify the existing value, do not specify this parameter.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The description of the application. The description can be up to 180 characters in length.</p>
     * <br>
     * <p>If you do not want to modify the existing value, do not specify this parameter.</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("Extend")
    public String extend;

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
         * <p>The key of the tag.</p>
         * <br>
         * <p>Valid values of n: `[1, 20]`.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * <br>
         * <p>Valid values of n: `[1, 20]`.</p>
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

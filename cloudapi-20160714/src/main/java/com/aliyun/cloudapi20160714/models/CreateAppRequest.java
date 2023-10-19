// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateAppRequest extends TeaModel {
    /**
     * <p>The AppCode of the application.</p>
     */
    @NameInMap("AppCode")
    public String appCode;

    /**
     * <p>The key of the application that is used to make an API call.</p>
     */
    @NameInMap("AppKey")
    public String appKey;

    /**
     * <p>The name of the application. The name must be 4 to 26 characters in length. The name can contain letters, digits, and underscores (\_), and must start with a letter.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The password of the application.</p>
     */
    @NameInMap("AppSecret")
    public String appSecret;

    /**
     * <p>The description of the application. The description can be up to 180 characters in length.</p>
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
    public java.util.List<CreateAppRequestTag> tag;

    public static CreateAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppRequest self = new CreateAppRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public CreateAppRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public CreateAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateAppRequest setAppSecret(String appSecret) {
        this.appSecret = appSecret;
        return this;
    }
    public String getAppSecret() {
        return this.appSecret;
    }

    public CreateAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAppRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public CreateAppRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateAppRequest setTag(java.util.List<CreateAppRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateAppRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateAppRequestTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * <br>
         * <p>Valid values of n: `[1, 20]`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * <br>
         * <p>Valid values of n: `[1, 20]`. If the parameter has a value, you must specify a value for the tag key with the same N as tag.N.Key. Otherwise, an error is reported.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateAppRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateAppRequestTag self = new CreateAppRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateAppRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAppRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

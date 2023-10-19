// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteAppRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     */
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The tags. Up to 20 tags are allowed.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DeleteAppRequestTag> tag;

    public static DeleteAppRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppRequest self = new DeleteAppRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public DeleteAppRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DeleteAppRequest setTag(java.util.List<DeleteAppRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DeleteAppRequestTag> getTag() {
        return this.tag;
    }

    public static class DeleteAppRequestTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DeleteAppRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DeleteAppRequestTag self = new DeleteAppRequestTag();
            return TeaModel.build(map, self);
        }

        public DeleteAppRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DeleteAppRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

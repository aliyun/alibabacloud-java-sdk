// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeAppSecurityRequest extends TeaModel {
    /**
     * <p>The ID of the app.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20112314518278</p>
     */
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The tag of objects that match the rule. You can specify multiple tags.</p>
     * 
     * <strong>example:</strong>
     * <p>Key， Value</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeAppSecurityRequestTag> tag;

    public static DescribeAppSecurityRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppSecurityRequest self = new DescribeAppSecurityRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppSecurityRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public DescribeAppSecurityRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeAppSecurityRequest setTag(java.util.List<DescribeAppSecurityRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeAppSecurityRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeAppSecurityRequestTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeAppSecurityRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppSecurityRequestTag self = new DescribeAppSecurityRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeAppSecurityRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAppSecurityRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

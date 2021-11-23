// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeAppSecurityRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("SecurityToken")
    public String securityToken;

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
        @NameInMap("Key")
        public String key;

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

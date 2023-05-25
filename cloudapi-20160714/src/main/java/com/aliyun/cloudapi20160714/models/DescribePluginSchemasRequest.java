// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribePluginSchemasRequest extends TeaModel {
    @NameInMap("Language")
    public String language;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribePluginSchemasRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePluginSchemasRequest self = new DescribePluginSchemasRequest();
        return TeaModel.build(map, self);
    }

    public DescribePluginSchemasRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public DescribePluginSchemasRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}

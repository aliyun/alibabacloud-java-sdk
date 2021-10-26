// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribePluginTemplatesRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("PluginName")
    public String pluginName;

    @NameInMap("Language")
    public String language;

    public static DescribePluginTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePluginTemplatesRequest self = new DescribePluginTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DescribePluginTemplatesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribePluginTemplatesRequest setPluginName(String pluginName) {
        this.pluginName = pluginName;
        return this;
    }
    public String getPluginName() {
        return this.pluginName;
    }

    public DescribePluginTemplatesRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

}

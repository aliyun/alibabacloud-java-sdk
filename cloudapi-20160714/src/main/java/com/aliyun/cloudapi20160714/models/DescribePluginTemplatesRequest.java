// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribePluginTemplatesRequest extends TeaModel {
    /**
     * <p>The language that is used to return the description of the system policy. Valid values:</p>
     * <ul>
     * <li>en: English</li>
     * <li>zh-CN: Chinese.</li>
     * <li>ja: Japanese</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The name of the plug-in.</p>
     * 
     * <strong>example:</strong>
     * <p>jwtAuth</p>
     */
    @NameInMap("PluginName")
    public String pluginName;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribePluginTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePluginTemplatesRequest self = new DescribePluginTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DescribePluginTemplatesRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public DescribePluginTemplatesRequest setPluginName(String pluginName) {
        this.pluginName = pluginName;
        return this;
    }
    public String getPluginName() {
        return this.pluginName;
    }

    public DescribePluginTemplatesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}

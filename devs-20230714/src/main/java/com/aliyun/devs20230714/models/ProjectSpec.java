// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ProjectSpec extends TeaModel {
    @NameInMap("roleArn")
    public String roleArn;

    @NameInMap("templateConfig")
    public TemplateConfig templateConfig;

    @NameInMap("token")
    public String token;

    public static ProjectSpec build(java.util.Map<String, ?> map) throws Exception {
        ProjectSpec self = new ProjectSpec();
        return TeaModel.build(map, self);
    }

    public ProjectSpec setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public ProjectSpec setTemplateConfig(TemplateConfig templateConfig) {
        this.templateConfig = templateConfig;
        return this;
    }
    public TemplateConfig getTemplateConfig() {
        return this.templateConfig;
    }

    public ProjectSpec setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}

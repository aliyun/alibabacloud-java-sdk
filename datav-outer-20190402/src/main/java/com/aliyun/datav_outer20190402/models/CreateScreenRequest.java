// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class CreateScreenRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("Version")
    public String version;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("TemplateConfig")
    public String templateConfig;

    @NameInMap("WorkspaceId")
    public Integer workspaceId;

    @NameInMap("NeedShare")
    public Boolean needShare;

    @NameInMap("NeedToken")
    public Boolean needToken;

    @NameInMap("Name")
    public String name;

    public static CreateScreenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScreenRequest self = new CreateScreenRequest();
        return TeaModel.build(map, self);
    }

    public CreateScreenRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public CreateScreenRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public CreateScreenRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateScreenRequest setTemplateConfig(String templateConfig) {
        this.templateConfig = templateConfig;
        return this;
    }
    public String getTemplateConfig() {
        return this.templateConfig;
    }

    public CreateScreenRequest setWorkspaceId(Integer workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Integer getWorkspaceId() {
        return this.workspaceId;
    }

    public CreateScreenRequest setNeedShare(Boolean needShare) {
        this.needShare = needShare;
        return this;
    }
    public Boolean getNeedShare() {
        return this.needShare;
    }

    public CreateScreenRequest setNeedToken(Boolean needToken) {
        this.needToken = needToken;
        return this;
    }
    public Boolean getNeedToken() {
        return this.needToken;
    }

    public CreateScreenRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}

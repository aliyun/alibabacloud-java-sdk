// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class CreateTemplateByScreenRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("Version")
    public String version;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("ScreenId")
    public Integer screenId;

    @NameInMap("WorkspaceId")
    public Integer workspaceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("KeepDataSource")
    public Boolean keepDataSource;

    public static CreateTemplateByScreenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateByScreenRequest self = new CreateTemplateByScreenRequest();
        return TeaModel.build(map, self);
    }

    public CreateTemplateByScreenRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public CreateTemplateByScreenRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public CreateTemplateByScreenRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateTemplateByScreenRequest setScreenId(Integer screenId) {
        this.screenId = screenId;
        return this;
    }
    public Integer getScreenId() {
        return this.screenId;
    }

    public CreateTemplateByScreenRequest setWorkspaceId(Integer workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Integer getWorkspaceId() {
        return this.workspaceId;
    }

    public CreateTemplateByScreenRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTemplateByScreenRequest setKeepDataSource(Boolean keepDataSource) {
        this.keepDataSource = keepDataSource;
        return this;
    }
    public Boolean getKeepDataSource() {
        return this.keepDataSource;
    }

}

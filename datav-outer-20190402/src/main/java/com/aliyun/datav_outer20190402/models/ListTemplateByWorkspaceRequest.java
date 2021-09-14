// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class ListTemplateByWorkspaceRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("Version")
    public String version;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListTemplateByWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateByWorkspaceRequest self = new ListTemplateByWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public ListTemplateByWorkspaceRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public ListTemplateByWorkspaceRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public ListTemplateByWorkspaceRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ListTemplateByWorkspaceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

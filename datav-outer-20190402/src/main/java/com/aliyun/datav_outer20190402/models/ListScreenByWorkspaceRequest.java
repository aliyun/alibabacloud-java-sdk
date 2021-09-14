// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class ListScreenByWorkspaceRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("Version")
    public String version;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("WorkspaceId")
    public Integer workspaceId;

    public static ListScreenByWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListScreenByWorkspaceRequest self = new ListScreenByWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public ListScreenByWorkspaceRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public ListScreenByWorkspaceRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public ListScreenByWorkspaceRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ListScreenByWorkspaceRequest setWorkspaceId(Integer workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Integer getWorkspaceId() {
        return this.workspaceId;
    }

}

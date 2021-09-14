// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class CreateDCStorageShrinkRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("Version")
    public String version;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("WorkspaceId")
    public Integer workspaceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Host")
    public String host;

    @NameInMap("Port")
    public Integer port;

    @NameInMap("Authorization")
    public String authorizationShrink;

    @NameInMap("Extra")
    public String extraShrink;

    @NameInMap("Type")
    public String type;

    @NameInMap("Association")
    public String association;

    public static CreateDCStorageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDCStorageShrinkRequest self = new CreateDCStorageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDCStorageShrinkRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public CreateDCStorageShrinkRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public CreateDCStorageShrinkRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateDCStorageShrinkRequest setWorkspaceId(Integer workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Integer getWorkspaceId() {
        return this.workspaceId;
    }

    public CreateDCStorageShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDCStorageShrinkRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public CreateDCStorageShrinkRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public CreateDCStorageShrinkRequest setAuthorizationShrink(String authorizationShrink) {
        this.authorizationShrink = authorizationShrink;
        return this;
    }
    public String getAuthorizationShrink() {
        return this.authorizationShrink;
    }

    public CreateDCStorageShrinkRequest setExtraShrink(String extraShrink) {
        this.extraShrink = extraShrink;
        return this;
    }
    public String getExtraShrink() {
        return this.extraShrink;
    }

    public CreateDCStorageShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateDCStorageShrinkRequest setAssociation(String association) {
        this.association = association;
        return this;
    }
    public String getAssociation() {
        return this.association;
    }

}

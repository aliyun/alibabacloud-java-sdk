// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class CreateDCStorageRequest extends TeaModel {
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
    public java.util.Map<String, ?> authorization;

    @NameInMap("Extra")
    public java.util.Map<String, ?> extra;

    @NameInMap("Type")
    public String type;

    @NameInMap("Association")
    public String association;

    public static CreateDCStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDCStorageRequest self = new CreateDCStorageRequest();
        return TeaModel.build(map, self);
    }

    public CreateDCStorageRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public CreateDCStorageRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public CreateDCStorageRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateDCStorageRequest setWorkspaceId(Integer workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Integer getWorkspaceId() {
        return this.workspaceId;
    }

    public CreateDCStorageRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDCStorageRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public CreateDCStorageRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public CreateDCStorageRequest setAuthorization(java.util.Map<String, ?> authorization) {
        this.authorization = authorization;
        return this;
    }
    public java.util.Map<String, ?> getAuthorization() {
        return this.authorization;
    }

    public CreateDCStorageRequest setExtra(java.util.Map<String, ?> extra) {
        this.extra = extra;
        return this;
    }
    public java.util.Map<String, ?> getExtra() {
        return this.extra;
    }

    public CreateDCStorageRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateDCStorageRequest setAssociation(String association) {
        this.association = association;
        return this;
    }
    public String getAssociation() {
        return this.association;
    }

}

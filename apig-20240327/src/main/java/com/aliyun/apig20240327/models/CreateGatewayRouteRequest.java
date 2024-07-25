// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateGatewayRouteRequest extends TeaModel {
    @NameInMap("backendConfig")
    public GatewayRouteBackendConfig backendConfig;

    @NameInMap("description")
    public String description;

    @NameInMap("domainConfig")
    public GatewayRouteDomainConfig domainConfig;

    @NameInMap("match")
    public HttpRouteMatch match;

    /**
     * <strong>example:</strong>
     * <p>itemcenter-route</p>
     */
    @NameInMap("name")
    public String name;

    public static CreateGatewayRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayRouteRequest self = new CreateGatewayRouteRequest();
        return TeaModel.build(map, self);
    }

    public CreateGatewayRouteRequest setBackendConfig(GatewayRouteBackendConfig backendConfig) {
        this.backendConfig = backendConfig;
        return this;
    }
    public GatewayRouteBackendConfig getBackendConfig() {
        return this.backendConfig;
    }

    public CreateGatewayRouteRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateGatewayRouteRequest setDomainConfig(GatewayRouteDomainConfig domainConfig) {
        this.domainConfig = domainConfig;
        return this;
    }
    public GatewayRouteDomainConfig getDomainConfig() {
        return this.domainConfig;
    }

    public CreateGatewayRouteRequest setMatch(HttpRouteMatch match) {
        this.match = match;
        return this;
    }
    public HttpRouteMatch getMatch() {
        return this.match;
    }

    public CreateGatewayRouteRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}

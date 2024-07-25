// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteRequest extends TeaModel {
    @NameInMap("backendConfig")
    public GatewayRouteBackendConfig backendConfig;

    @NameInMap("description")
    public String description;

    @NameInMap("domainConfig")
    public GatewayRouteDomainConfig domainConfig;

    @NameInMap("match")
    public HttpRouteMatch match;

    public static UpdateGatewayRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRouteRequest self = new UpdateGatewayRouteRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRouteRequest setBackendConfig(GatewayRouteBackendConfig backendConfig) {
        this.backendConfig = backendConfig;
        return this;
    }
    public GatewayRouteBackendConfig getBackendConfig() {
        return this.backendConfig;
    }

    public UpdateGatewayRouteRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateGatewayRouteRequest setDomainConfig(GatewayRouteDomainConfig domainConfig) {
        this.domainConfig = domainConfig;
        return this;
    }
    public GatewayRouteDomainConfig getDomainConfig() {
        return this.domainConfig;
    }

    public UpdateGatewayRouteRequest setMatch(HttpRouteMatch match) {
        this.match = match;
        return this;
    }
    public HttpRouteMatch getMatch() {
        return this.match;
    }

}

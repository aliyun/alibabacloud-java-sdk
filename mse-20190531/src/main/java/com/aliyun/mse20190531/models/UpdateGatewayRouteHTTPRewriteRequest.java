// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteHTTPRewriteRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("GatewayId")
    public Long gatewayId;

    @NameInMap("HttpRewriteJSON")
    public String httpRewriteJSON;

    public static UpdateGatewayRouteHTTPRewriteRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRouteHTTPRewriteRequest self = new UpdateGatewayRouteHTTPRewriteRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRouteHTTPRewriteRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateGatewayRouteHTTPRewriteRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public UpdateGatewayRouteHTTPRewriteRequest setHttpRewriteJSON(String httpRewriteJSON) {
        this.httpRewriteJSON = httpRewriteJSON;
        return this;
    }
    public String getHttpRewriteJSON() {
        return this.httpRewriteJSON;
    }

}

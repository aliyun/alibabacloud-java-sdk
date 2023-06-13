// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteHTTPRewriteRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the gateway.</p>
     */
    @NameInMap("GatewayId")
    public Long gatewayId;

    /**
     * <p>The unique ID of the gateway.</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The information about the rewrite policy. The JSON format is supported.</p>
     */
    @NameInMap("HttpRewriteJSON")
    public String httpRewriteJSON;

    /**
     * <p>The ID of the route.</p>
     */
    @NameInMap("Id")
    public Long id;

    public static UpdateGatewayRouteHTTPRewriteRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRouteHTTPRewriteRequest self = new UpdateGatewayRouteHTTPRewriteRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRouteHTTPRewriteRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayRouteHTTPRewriteRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public UpdateGatewayRouteHTTPRewriteRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayRouteHTTPRewriteRequest setHttpRewriteJSON(String httpRewriteJSON) {
        this.httpRewriteJSON = httpRewriteJSON;
        return this;
    }
    public String getHttpRewriteJSON() {
        return this.httpRewriteJSON;
    }

    public UpdateGatewayRouteHTTPRewriteRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}

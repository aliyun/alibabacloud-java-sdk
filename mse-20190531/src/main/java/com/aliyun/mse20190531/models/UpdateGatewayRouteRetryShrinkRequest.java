// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteRetryShrinkRequest extends TeaModel {
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
     * <p>The ID of the associated record.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The information about the retry policy.</p>
     */
    @NameInMap("RetryJSON")
    public String retryJSONShrink;

    public static UpdateGatewayRouteRetryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRouteRetryShrinkRequest self = new UpdateGatewayRouteRetryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRouteRetryShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayRouteRetryShrinkRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public UpdateGatewayRouteRetryShrinkRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayRouteRetryShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateGatewayRouteRetryShrinkRequest setRetryJSONShrink(String retryJSONShrink) {
        this.retryJSONShrink = retryJSONShrink;
        return this;
    }
    public String getRetryJSONShrink() {
        return this.retryJSONShrink;
    }

}

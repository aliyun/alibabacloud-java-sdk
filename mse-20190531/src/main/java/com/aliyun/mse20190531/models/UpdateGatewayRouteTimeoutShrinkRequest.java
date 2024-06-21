// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteTimeoutShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>85</p>
     */
    @NameInMap("GatewayId")
    public Long gatewayId;

    /**
     * <p>The unique ID of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-533290d279c1405f9628c64f7c8272ee</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The ID of the associated record.</p>
     * 
     * <strong>example:</strong>
     * <p>567</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The timeout period.</p>
     */
    @NameInMap("TimeoutJSON")
    public String timeoutJSONShrink;

    public static UpdateGatewayRouteTimeoutShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRouteTimeoutShrinkRequest self = new UpdateGatewayRouteTimeoutShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRouteTimeoutShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayRouteTimeoutShrinkRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public UpdateGatewayRouteTimeoutShrinkRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayRouteTimeoutShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateGatewayRouteTimeoutShrinkRequest setTimeoutJSONShrink(String timeoutJSONShrink) {
        this.timeoutJSONShrink = timeoutJSONShrink;
        return this;
    }
    public String getTimeoutJSONShrink() {
        return this.timeoutJSONShrink;
    }

}

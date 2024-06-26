// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteAuthShrinkRequest extends TeaModel {
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
     * <p>The authentication configurations.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AuthJSON")
    public String authJSONShrink;

    /**
     * <p>The gateway ID.</p>
     * 
     * <strong>example:</strong>
     * <p>102</p>
     */
    @NameInMap("GatewayId")
    public Long gatewayId;

    /**
     * <p>The unique ID of the gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-0adf3ad751284cc69fcf9669fba*****</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The route ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>109</p>
     */
    @NameInMap("Id")
    public Long id;

    public static UpdateGatewayRouteAuthShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRouteAuthShrinkRequest self = new UpdateGatewayRouteAuthShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRouteAuthShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayRouteAuthShrinkRequest setAuthJSONShrink(String authJSONShrink) {
        this.authJSONShrink = authJSONShrink;
        return this;
    }
    public String getAuthJSONShrink() {
        return this.authJSONShrink;
    }

    public UpdateGatewayRouteAuthShrinkRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public UpdateGatewayRouteAuthShrinkRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayRouteAuthShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}

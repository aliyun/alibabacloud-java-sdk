// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteAuthRequest extends TeaModel {
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
    public UpdateGatewayRouteAuthRequestAuthJSON authJSON;

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

    public static UpdateGatewayRouteAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRouteAuthRequest self = new UpdateGatewayRouteAuthRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRouteAuthRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayRouteAuthRequest setAuthJSON(UpdateGatewayRouteAuthRequestAuthJSON authJSON) {
        this.authJSON = authJSON;
        return this;
    }
    public UpdateGatewayRouteAuthRequestAuthJSON getAuthJSON() {
        return this.authJSON;
    }

    public UpdateGatewayRouteAuthRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public UpdateGatewayRouteAuthRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayRouteAuthRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public static class UpdateGatewayRouteAuthRequestAuthJSON extends TeaModel {
        /**
         * <p>The authentication type. If an empty string is passed, no authentication type is available. Valid values:</p>
         * <ul>
         * <li>JWT</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>JWT</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateGatewayRouteAuthRequestAuthJSON build(java.util.Map<String, ?> map) throws Exception {
            UpdateGatewayRouteAuthRequestAuthJSON self = new UpdateGatewayRouteAuthRequestAuthJSON();
            return TeaModel.build(map, self);
        }

        public UpdateGatewayRouteAuthRequestAuthJSON setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}

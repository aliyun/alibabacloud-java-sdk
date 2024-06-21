// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteHeaderOpRequest extends TeaModel {
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
     * <p>324</p>
     */
    @NameInMap("GatewayId")
    public Long gatewayId;

    /**
     * <p>The unique ID of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-6bdc977deda44bf589c49d063b4c2d1d</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The description of user header settings.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;status\&quot;:\&quot;on\&quot;,\&quot;headerOpItems\&quot;:[{\&quot;directionType\&quot;:\&quot;Request\&quot;,\&quot;opType\&quot;:\&quot;Update\&quot;,\&quot;key\&quot;:\&quot;hosts\&quot;,\&quot;value\&quot;:\&quot;test.com\&quot;}]}</p>
     */
    @NameInMap("HeaderOpJSON")
    public String headerOpJSON;

    /**
     * <p>The ID of the record.</p>
     * 
     * <strong>example:</strong>
     * <p>411</p>
     */
    @NameInMap("Id")
    public Long id;

    public static UpdateGatewayRouteHeaderOpRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRouteHeaderOpRequest self = new UpdateGatewayRouteHeaderOpRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRouteHeaderOpRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayRouteHeaderOpRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public UpdateGatewayRouteHeaderOpRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayRouteHeaderOpRequest setHeaderOpJSON(String headerOpJSON) {
        this.headerOpJSON = headerOpJSON;
        return this;
    }
    public String getHeaderOpJSON() {
        return this.headerOpJSON;
    }

    public UpdateGatewayRouteHeaderOpRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}

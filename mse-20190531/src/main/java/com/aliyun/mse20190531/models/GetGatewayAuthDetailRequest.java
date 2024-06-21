// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGatewayAuthDetailRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <strong>example:</strong>
     * <p>2274</p>
     */
    @NameInMap("GatewayId")
    public Long gatewayId;

    /**
     * <strong>example:</strong>
     * <p>gw-6f0dbd108a0249d2b675b3ef50b*****</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <strong>example:</strong>
     * <p>1100</p>
     */
    @NameInMap("Id")
    public Long id;

    public static GetGatewayAuthDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayAuthDetailRequest self = new GetGatewayAuthDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetGatewayAuthDetailRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public GetGatewayAuthDetailRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public GetGatewayAuthDetailRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public GetGatewayAuthDetailRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}

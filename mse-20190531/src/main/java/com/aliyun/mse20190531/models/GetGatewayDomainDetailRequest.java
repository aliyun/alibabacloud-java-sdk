// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGatewayDomainDetailRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    @NameInMap("Id")
    public String id;

    public static GetGatewayDomainDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayDomainDetailRequest self = new GetGatewayDomainDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetGatewayDomainDetailRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public GetGatewayDomainDetailRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public GetGatewayDomainDetailRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}

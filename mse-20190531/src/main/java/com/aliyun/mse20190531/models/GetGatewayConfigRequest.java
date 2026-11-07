// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGatewayConfigRequest extends TeaModel {
    /**
     * <p>The language of the returned results. Valid values: zh (default): Chinese. en: English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The unique ID of the gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-61f465fa2dd044069e2208c4912*****</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    public static GetGatewayConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayConfigRequest self = new GetGatewayConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetGatewayConfigRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public GetGatewayConfigRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

}

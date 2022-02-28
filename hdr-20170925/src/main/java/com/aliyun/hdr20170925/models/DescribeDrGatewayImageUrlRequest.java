// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeDrGatewayImageUrlRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeDrGatewayImageUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrGatewayImageUrlRequest self = new DescribeDrGatewayImageUrlRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDrGatewayImageUrlRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public DescribeDrGatewayImageUrlRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}

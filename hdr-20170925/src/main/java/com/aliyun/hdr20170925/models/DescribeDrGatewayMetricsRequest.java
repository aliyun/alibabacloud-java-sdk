// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeDrGatewayMetricsRequest extends TeaModel {
    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("Query")
    public String query;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeDrGatewayMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrGatewayMetricsRequest self = new DescribeDrGatewayMetricsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDrGatewayMetricsRequest setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public DescribeDrGatewayMetricsRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public DescribeDrGatewayMetricsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}

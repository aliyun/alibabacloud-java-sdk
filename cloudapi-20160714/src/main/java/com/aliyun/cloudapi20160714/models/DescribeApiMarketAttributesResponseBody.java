// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiMarketAttributesResponseBody extends TeaModel {
    @NameInMap("ApiId")
    public String apiId;

    @NameInMap("MarketChargingMode")
    public String marketChargingMode;

    @NameInMap("NeedCharging")
    public String needCharging;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeApiMarketAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiMarketAttributesResponseBody self = new DescribeApiMarketAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiMarketAttributesResponseBody setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public DescribeApiMarketAttributesResponseBody setMarketChargingMode(String marketChargingMode) {
        this.marketChargingMode = marketChargingMode;
        return this;
    }
    public String getMarketChargingMode() {
        return this.marketChargingMode;
    }

    public DescribeApiMarketAttributesResponseBody setNeedCharging(String needCharging) {
        this.needCharging = needCharging;
        return this;
    }
    public String getNeedCharging() {
        return this.needCharging;
    }

    public DescribeApiMarketAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

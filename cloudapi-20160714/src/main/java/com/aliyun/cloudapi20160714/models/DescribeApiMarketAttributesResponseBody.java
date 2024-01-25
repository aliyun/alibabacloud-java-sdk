// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiMarketAttributesResponseBody extends TeaModel {
    /**
     * <p>The ID of the API.</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The billing method used by the Alibaba Cloud Marketplace.</p>
     */
    @NameInMap("MarketChargingMode")
    public String marketChargingMode;

    /**
     * <p>Indicates whether fees are charged.</p>
     */
    @NameInMap("NeedCharging")
    public String needCharging;

    /**
     * <p>The ID of the request.</p>
     */
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

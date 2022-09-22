// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribePrePaidResourceRefundPriceResponseBody extends TeaModel {
    @NameInMap("Currency")
    public String currency;

    @NameInMap("Refunds")
    public Float refunds;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePrePaidResourceRefundPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePrePaidResourceRefundPriceResponseBody self = new DescribePrePaidResourceRefundPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePrePaidResourceRefundPriceResponseBody setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public DescribePrePaidResourceRefundPriceResponseBody setRefunds(Float refunds) {
        this.refunds = refunds;
        return this;
    }
    public Float getRefunds() {
        return this.refunds;
    }

    public DescribePrePaidResourceRefundPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

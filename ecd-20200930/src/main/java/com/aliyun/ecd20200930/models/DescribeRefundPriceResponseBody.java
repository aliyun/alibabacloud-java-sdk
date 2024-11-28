// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeRefundPriceResponseBody extends TeaModel {
    @NameInMap("PriceInfo")
    public DescribeRefundPriceResponseBodyPriceInfo priceInfo;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRefundPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRefundPriceResponseBody self = new DescribeRefundPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRefundPriceResponseBody setPriceInfo(DescribeRefundPriceResponseBodyPriceInfo priceInfo) {
        this.priceInfo = priceInfo;
        return this;
    }
    public DescribeRefundPriceResponseBodyPriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public DescribeRefundPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRefundPriceResponseBodyPriceInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <strong>example:</strong>
         * <p>3990.75</p>
         */
        @NameInMap("RefundFee")
        public Float refundFee;

        public static DescribeRefundPriceResponseBodyPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRefundPriceResponseBodyPriceInfo self = new DescribeRefundPriceResponseBodyPriceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeRefundPriceResponseBodyPriceInfo setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribeRefundPriceResponseBodyPriceInfo setRefundFee(Float refundFee) {
            this.refundFee = refundFee;
            return this;
        }
        public Float getRefundFee() {
            return this.refundFee;
        }

    }

}

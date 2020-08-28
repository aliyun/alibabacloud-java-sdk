// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryCashCouponsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryCashCouponsResponseData data;

    public static QueryCashCouponsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCashCouponsResponse self = new QueryCashCouponsResponse();
        return TeaModel.build(map, self);
    }

    public static class QueryCashCouponsResponseDataCashCoupon extends TeaModel {
        @NameInMap("CashCouponId")
        @Validation(required = true)
        public Long cashCouponId;

        @NameInMap("CashCouponNo")
        @Validation(required = true)
        public String cashCouponNo;

        @NameInMap("GrantedTime")
        @Validation(required = true)
        public String grantedTime;

        @NameInMap("EffectiveTime")
        @Validation(required = true)
        public String effectiveTime;

        @NameInMap("ExpiryTime")
        @Validation(required = true)
        public String expiryTime;

        @NameInMap("ApplicableProducts")
        @Validation(required = true)
        public String applicableProducts;

        @NameInMap("ApplicableScenarios")
        @Validation(required = true)
        public String applicableScenarios;

        @NameInMap("NominalValue")
        @Validation(required = true)
        public String nominalValue;

        @NameInMap("Balance")
        @Validation(required = true)
        public String balance;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static QueryCashCouponsResponseDataCashCoupon build(java.util.Map<String, ?> map) throws Exception {
            QueryCashCouponsResponseDataCashCoupon self = new QueryCashCouponsResponseDataCashCoupon();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryCashCouponsResponseData extends TeaModel {
        @NameInMap("CashCoupon")
        @Validation(required = true)
        public java.util.List<QueryCashCouponsResponseDataCashCoupon> cashCoupon;

        public static QueryCashCouponsResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryCashCouponsResponseData self = new QueryCashCouponsResponseData();
            return TeaModel.build(map, self);
        }

    }

}

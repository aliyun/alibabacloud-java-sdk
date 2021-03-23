// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryCashCouponsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public QueryCashCouponsResponseBodyData data;

    public static QueryCashCouponsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCashCouponsResponseBody self = new QueryCashCouponsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCashCouponsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCashCouponsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryCashCouponsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCashCouponsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCashCouponsResponseBody setData(QueryCashCouponsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryCashCouponsResponseBodyData getData() {
        return this.data;
    }

    public static class QueryCashCouponsResponseBodyDataCashCoupon extends TeaModel {
        @NameInMap("CashCouponId")
        public Long cashCouponId;

        @NameInMap("CashCouponNo")
        public String cashCouponNo;

        @NameInMap("GrantedTime")
        public String grantedTime;

        @NameInMap("EffectiveTime")
        public String effectiveTime;

        @NameInMap("ExpiryTime")
        public String expiryTime;

        @NameInMap("ApplicableProducts")
        public String applicableProducts;

        @NameInMap("ApplicableScenarios")
        public String applicableScenarios;

        @NameInMap("NominalValue")
        public String nominalValue;

        @NameInMap("Balance")
        public String balance;

        @NameInMap("Status")
        public String status;

        public static QueryCashCouponsResponseBodyDataCashCoupon build(java.util.Map<String, ?> map) throws Exception {
            QueryCashCouponsResponseBodyDataCashCoupon self = new QueryCashCouponsResponseBodyDataCashCoupon();
            return TeaModel.build(map, self);
        }

        public QueryCashCouponsResponseBodyDataCashCoupon setCashCouponId(Long cashCouponId) {
            this.cashCouponId = cashCouponId;
            return this;
        }
        public Long getCashCouponId() {
            return this.cashCouponId;
        }

        public QueryCashCouponsResponseBodyDataCashCoupon setCashCouponNo(String cashCouponNo) {
            this.cashCouponNo = cashCouponNo;
            return this;
        }
        public String getCashCouponNo() {
            return this.cashCouponNo;
        }

        public QueryCashCouponsResponseBodyDataCashCoupon setGrantedTime(String grantedTime) {
            this.grantedTime = grantedTime;
            return this;
        }
        public String getGrantedTime() {
            return this.grantedTime;
        }

        public QueryCashCouponsResponseBodyDataCashCoupon setEffectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        public QueryCashCouponsResponseBodyDataCashCoupon setExpiryTime(String expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }
        public String getExpiryTime() {
            return this.expiryTime;
        }

        public QueryCashCouponsResponseBodyDataCashCoupon setApplicableProducts(String applicableProducts) {
            this.applicableProducts = applicableProducts;
            return this;
        }
        public String getApplicableProducts() {
            return this.applicableProducts;
        }

        public QueryCashCouponsResponseBodyDataCashCoupon setApplicableScenarios(String applicableScenarios) {
            this.applicableScenarios = applicableScenarios;
            return this;
        }
        public String getApplicableScenarios() {
            return this.applicableScenarios;
        }

        public QueryCashCouponsResponseBodyDataCashCoupon setNominalValue(String nominalValue) {
            this.nominalValue = nominalValue;
            return this;
        }
        public String getNominalValue() {
            return this.nominalValue;
        }

        public QueryCashCouponsResponseBodyDataCashCoupon setBalance(String balance) {
            this.balance = balance;
            return this;
        }
        public String getBalance() {
            return this.balance;
        }

        public QueryCashCouponsResponseBodyDataCashCoupon setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class QueryCashCouponsResponseBodyData extends TeaModel {
        @NameInMap("CashCoupon")
        public java.util.List<QueryCashCouponsResponseBodyDataCashCoupon> cashCoupon;

        public static QueryCashCouponsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCashCouponsResponseBodyData self = new QueryCashCouponsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCashCouponsResponseBodyData setCashCoupon(java.util.List<QueryCashCouponsResponseBodyDataCashCoupon> cashCoupon) {
            this.cashCoupon = cashCoupon;
            return this;
        }
        public java.util.List<QueryCashCouponsResponseBodyDataCashCoupon> getCashCoupon() {
            return this.cashCoupon;
        }

    }

}

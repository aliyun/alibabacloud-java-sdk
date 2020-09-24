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

    public QueryCashCouponsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCashCouponsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryCashCouponsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCashCouponsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCashCouponsResponse setData(QueryCashCouponsResponseData data) {
        this.data = data;
        return this;
    }
    public QueryCashCouponsResponseData getData() {
        return this.data;
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

        public QueryCashCouponsResponseDataCashCoupon setCashCouponId(Long cashCouponId) {
            this.cashCouponId = cashCouponId;
            return this;
        }
        public Long getCashCouponId() {
            return this.cashCouponId;
        }

        public QueryCashCouponsResponseDataCashCoupon setCashCouponNo(String cashCouponNo) {
            this.cashCouponNo = cashCouponNo;
            return this;
        }
        public String getCashCouponNo() {
            return this.cashCouponNo;
        }

        public QueryCashCouponsResponseDataCashCoupon setGrantedTime(String grantedTime) {
            this.grantedTime = grantedTime;
            return this;
        }
        public String getGrantedTime() {
            return this.grantedTime;
        }

        public QueryCashCouponsResponseDataCashCoupon setEffectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        public QueryCashCouponsResponseDataCashCoupon setExpiryTime(String expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }
        public String getExpiryTime() {
            return this.expiryTime;
        }

        public QueryCashCouponsResponseDataCashCoupon setApplicableProducts(String applicableProducts) {
            this.applicableProducts = applicableProducts;
            return this;
        }
        public String getApplicableProducts() {
            return this.applicableProducts;
        }

        public QueryCashCouponsResponseDataCashCoupon setApplicableScenarios(String applicableScenarios) {
            this.applicableScenarios = applicableScenarios;
            return this;
        }
        public String getApplicableScenarios() {
            return this.applicableScenarios;
        }

        public QueryCashCouponsResponseDataCashCoupon setNominalValue(String nominalValue) {
            this.nominalValue = nominalValue;
            return this;
        }
        public String getNominalValue() {
            return this.nominalValue;
        }

        public QueryCashCouponsResponseDataCashCoupon setBalance(String balance) {
            this.balance = balance;
            return this;
        }
        public String getBalance() {
            return this.balance;
        }

        public QueryCashCouponsResponseDataCashCoupon setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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

        public QueryCashCouponsResponseData setCashCoupon(java.util.List<QueryCashCouponsResponseDataCashCoupon> cashCoupon) {
            this.cashCoupon = cashCoupon;
            return this;
        }
        public java.util.List<QueryCashCouponsResponseDataCashCoupon> getCashCoupon() {
            return this.cashCoupon;
        }

    }

}

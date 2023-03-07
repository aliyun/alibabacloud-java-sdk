// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryCashCouponsResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public QueryCashCouponsResponseBodyData data;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryCashCouponsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCashCouponsResponseBody self = new QueryCashCouponsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCashCouponsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCashCouponsResponseBody setData(QueryCashCouponsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryCashCouponsResponseBodyData getData() {
        return this.data;
    }

    public QueryCashCouponsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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

    public static class QueryCashCouponsResponseBodyDataCashCoupon extends TeaModel {
        /**
         * <p>The service to which the voucher is applicable.</p>
         */
        @NameInMap("ApplicableProducts")
        public String applicableProducts;

        /**
         * <p>The scenario to which the voucher is applicable.</p>
         */
        @NameInMap("ApplicableScenarios")
        public String applicableScenarios;

        /**
         * <p>The remaining quota of the voucher.</p>
         */
        @NameInMap("Balance")
        public String balance;

        /**
         * <p>The ID of the voucher.</p>
         */
        @NameInMap("CashCouponId")
        public Long cashCouponId;

        /**
         * <p>The code of the voucher.</p>
         */
        @NameInMap("CashCouponNo")
        public String cashCouponNo;

        /**
         * <p>The time when the voucher took effect.</p>
         */
        @NameInMap("EffectiveTime")
        public String effectiveTime;

        /**
         * <p>The time when the voucher expired.</p>
         */
        @NameInMap("ExpiryTime")
        public String expiryTime;

        /**
         * <p>The time when the voucher was released.</p>
         */
        @NameInMap("GrantedTime")
        public String grantedTime;

        /**
         * <p>The denomination of the voucher.</p>
         */
        @NameInMap("NominalValue")
        public String nominalValue;

        /**
         * <p>The state of the voucher. Valid values:</p>
         * <br>
         * <p>*   Available: The voucher is valid.</p>
         * <p>*   Expired: The voucher has expired.</p>
         * <p>*   Cancelled: The voucher is canceled.</p>
         */
        @NameInMap("Status")
        public String status;

        public static QueryCashCouponsResponseBodyDataCashCoupon build(java.util.Map<String, ?> map) throws Exception {
            QueryCashCouponsResponseBodyDataCashCoupon self = new QueryCashCouponsResponseBodyDataCashCoupon();
            return TeaModel.build(map, self);
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

        public QueryCashCouponsResponseBodyDataCashCoupon setBalance(String balance) {
            this.balance = balance;
            return this;
        }
        public String getBalance() {
            return this.balance;
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

        public QueryCashCouponsResponseBodyDataCashCoupon setGrantedTime(String grantedTime) {
            this.grantedTime = grantedTime;
            return this;
        }
        public String getGrantedTime() {
            return this.grantedTime;
        }

        public QueryCashCouponsResponseBodyDataCashCoupon setNominalValue(String nominalValue) {
            this.nominalValue = nominalValue;
            return this;
        }
        public String getNominalValue() {
            return this.nominalValue;
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryRedeemResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public QueryRedeemResponseBodyData data;

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

    public static QueryRedeemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRedeemResponseBody self = new QueryRedeemResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRedeemResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRedeemResponseBody setData(QueryRedeemResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryRedeemResponseBodyData getData() {
        return this.data;
    }

    public QueryRedeemResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRedeemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRedeemResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryRedeemResponseBodyDataRedeemRedeem extends TeaModel {
        /**
         * <p>The services to which the redemption coupon is applicable.</p>
         */
        @NameInMap("ApplicableProducts")
        public String applicableProducts;

        /**
         * <p>The balance of the redemption coupon.</p>
         */
        @NameInMap("Balance")
        public String balance;

        /**
         * <p>The time when the redemption coupon took effect.</p>
         */
        @NameInMap("EffectiveTime")
        public String effectiveTime;

        /**
         * <p>The time when the redemption coupon expired.</p>
         */
        @NameInMap("ExpiryTime")
        public String expiryTime;

        /**
         * <p>The time when the redemption coupon was issued.</p>
         */
        @NameInMap("GrantedTime")
        public String grantedTime;

        /**
         * <p>The nominal value of the redemption coupon.</p>
         */
        @NameInMap("NominalValue")
        public String nominalValue;

        /**
         * <p>The ID of the redemption coupon.</p>
         */
        @NameInMap("RedeemId")
        public String redeemId;

        /**
         * <p>The number of the redemption coupon.</p>
         */
        @NameInMap("RedeemNo")
        public String redeemNo;

        /**
         * <p>The specifications of the redemption coupon.</p>
         */
        @NameInMap("Specification")
        public String specification;

        /**
         * <p>The status of the redemption coupon. Valid values:</p>
         * <br>
         * <p>*   Generated</p>
         * <p>*   CallBack</p>
         * <p>*   RefundPending</p>
         * <p>*   Canceled</p>
         * <p>*   Order_Canceled</p>
         * <p>*   ActivePending</p>
         * <p>*   ActiveSuccess</p>
         * <p>*   ExchangePending</p>
         * <p>*   ExchangeSuccess</p>
         * <p>*   Expired</p>
         */
        @NameInMap("Status")
        public String status;

        public static QueryRedeemResponseBodyDataRedeemRedeem build(java.util.Map<String, ?> map) throws Exception {
            QueryRedeemResponseBodyDataRedeemRedeem self = new QueryRedeemResponseBodyDataRedeemRedeem();
            return TeaModel.build(map, self);
        }

        public QueryRedeemResponseBodyDataRedeemRedeem setApplicableProducts(String applicableProducts) {
            this.applicableProducts = applicableProducts;
            return this;
        }
        public String getApplicableProducts() {
            return this.applicableProducts;
        }

        public QueryRedeemResponseBodyDataRedeemRedeem setBalance(String balance) {
            this.balance = balance;
            return this;
        }
        public String getBalance() {
            return this.balance;
        }

        public QueryRedeemResponseBodyDataRedeemRedeem setEffectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        public QueryRedeemResponseBodyDataRedeemRedeem setExpiryTime(String expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }
        public String getExpiryTime() {
            return this.expiryTime;
        }

        public QueryRedeemResponseBodyDataRedeemRedeem setGrantedTime(String grantedTime) {
            this.grantedTime = grantedTime;
            return this;
        }
        public String getGrantedTime() {
            return this.grantedTime;
        }

        public QueryRedeemResponseBodyDataRedeemRedeem setNominalValue(String nominalValue) {
            this.nominalValue = nominalValue;
            return this;
        }
        public String getNominalValue() {
            return this.nominalValue;
        }

        public QueryRedeemResponseBodyDataRedeemRedeem setRedeemId(String redeemId) {
            this.redeemId = redeemId;
            return this;
        }
        public String getRedeemId() {
            return this.redeemId;
        }

        public QueryRedeemResponseBodyDataRedeemRedeem setRedeemNo(String redeemNo) {
            this.redeemNo = redeemNo;
            return this;
        }
        public String getRedeemNo() {
            return this.redeemNo;
        }

        public QueryRedeemResponseBodyDataRedeemRedeem setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

        public QueryRedeemResponseBodyDataRedeemRedeem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class QueryRedeemResponseBodyDataRedeem extends TeaModel {
        @NameInMap("Redeem")
        public java.util.List<QueryRedeemResponseBodyDataRedeemRedeem> redeem;

        public static QueryRedeemResponseBodyDataRedeem build(java.util.Map<String, ?> map) throws Exception {
            QueryRedeemResponseBodyDataRedeem self = new QueryRedeemResponseBodyDataRedeem();
            return TeaModel.build(map, self);
        }

        public QueryRedeemResponseBodyDataRedeem setRedeem(java.util.List<QueryRedeemResponseBodyDataRedeemRedeem> redeem) {
            this.redeem = redeem;
            return this;
        }
        public java.util.List<QueryRedeemResponseBodyDataRedeemRedeem> getRedeem() {
            return this.redeem;
        }

    }

    public static class QueryRedeemResponseBodyData extends TeaModel {
        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("PageNum")
        public Long pageNum;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The details of the redemption coupon.</p>
         */
        @NameInMap("Redeem")
        public QueryRedeemResponseBodyDataRedeem redeem;

        /**
         * <p>The total number of returned entries.</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static QueryRedeemResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryRedeemResponseBodyData self = new QueryRedeemResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryRedeemResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public QueryRedeemResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryRedeemResponseBodyData setRedeem(QueryRedeemResponseBodyDataRedeem redeem) {
            this.redeem = redeem;
            return this;
        }
        public QueryRedeemResponseBodyDataRedeem getRedeem() {
            return this.redeem;
        }

        public QueryRedeemResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}

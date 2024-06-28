// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryRedeemResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
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
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E503DC7B-E4F0-4B3C-BC89-BCECF1338F0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>Elastic Compute Service (ECS)</p>
         */
        @NameInMap("ApplicableProducts")
        public String applicableProducts;

        /**
         * <p>The balance of the redemption coupon.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Balance")
        public String balance;

        /**
         * <p>The time when the redemption coupon took effect.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-05-14 20:25:00</p>
         */
        @NameInMap("EffectiveTime")
        public String effectiveTime;

        /**
         * <p>The time when the redemption coupon expired.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-06-13 20:25:00</p>
         */
        @NameInMap("ExpiryTime")
        public String expiryTime;

        /**
         * <p>The time when the redemption coupon was issued.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-05-14 20:25:00</p>
         */
        @NameInMap("GrantedTime")
        public String grantedTime;

        /**
         * <p>The nominal value of the redemption coupon.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NominalValue")
        public String nominalValue;

        /**
         * <p>The ID of the redemption coupon.</p>
         * 
         * <strong>example:</strong>
         * <p>1342</p>
         */
        @NameInMap("RedeemId")
        public String redeemId;

        /**
         * <p>The number of the redemption coupon.</p>
         * 
         * <strong>example:</strong>
         * <p>4889*****1610</p>
         */
        @NameInMap("RedeemNo")
        public String redeemNo;

        /**
         * <p>The specifications of the redemption coupon.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("Specification")
        public String specification;

        /**
         * <p>The status of the redemption coupon. Valid values:</p>
         * <ul>
         * <li>Generated</li>
         * <li>CallBack</li>
         * <li>RefundPending</li>
         * <li>Canceled</li>
         * <li>Order_Canceled</li>
         * <li>ActivePending</li>
         * <li>ActiveSuccess</li>
         * <li>ExchangePending</li>
         * <li>ExchangeSuccess</li>
         * <li>Expired</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Generated</p>
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
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Long pageNum;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * 
         * <strong>example:</strong>
         * <p>1</p>
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

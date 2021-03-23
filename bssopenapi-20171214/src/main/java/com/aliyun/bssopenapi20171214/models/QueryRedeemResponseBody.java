// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryRedeemResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public QueryRedeemResponseBodyData data;

    public static QueryRedeemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRedeemResponseBody self = new QueryRedeemResponseBody();
        return TeaModel.build(map, self);
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

    public QueryRedeemResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRedeemResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRedeemResponseBody setData(QueryRedeemResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryRedeemResponseBodyData getData() {
        return this.data;
    }

    public static class QueryRedeemResponseBodyDataRedeemRedeem extends TeaModel {
        @NameInMap("RedeemId")
        public String redeemId;

        @NameInMap("RedeemNo")
        public String redeemNo;

        @NameInMap("Status")
        public String status;

        @NameInMap("GrantedTime")
        public String grantedTime;

        @NameInMap("EffectiveTime")
        public String effectiveTime;

        @NameInMap("ExpiryTime")
        public String expiryTime;

        @NameInMap("NominalValue")
        public String nominalValue;

        @NameInMap("Balance")
        public String balance;

        @NameInMap("ApplicableProducts")
        public String applicableProducts;

        @NameInMap("Specification")
        public String specification;

        public static QueryRedeemResponseBodyDataRedeemRedeem build(java.util.Map<String, ?> map) throws Exception {
            QueryRedeemResponseBodyDataRedeemRedeem self = new QueryRedeemResponseBodyDataRedeemRedeem();
            return TeaModel.build(map, self);
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

        public QueryRedeemResponseBodyDataRedeemRedeem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryRedeemResponseBodyDataRedeemRedeem setGrantedTime(String grantedTime) {
            this.grantedTime = grantedTime;
            return this;
        }
        public String getGrantedTime() {
            return this.grantedTime;
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

        public QueryRedeemResponseBodyDataRedeemRedeem setNominalValue(String nominalValue) {
            this.nominalValue = nominalValue;
            return this;
        }
        public String getNominalValue() {
            return this.nominalValue;
        }

        public QueryRedeemResponseBodyDataRedeemRedeem setBalance(String balance) {
            this.balance = balance;
            return this;
        }
        public String getBalance() {
            return this.balance;
        }

        public QueryRedeemResponseBodyDataRedeemRedeem setApplicableProducts(String applicableProducts) {
            this.applicableProducts = applicableProducts;
            return this;
        }
        public String getApplicableProducts() {
            return this.applicableProducts;
        }

        public QueryRedeemResponseBodyDataRedeemRedeem setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
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
        @NameInMap("PageNum")
        public Long pageNum;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("Redeem")
        public QueryRedeemResponseBodyDataRedeem redeem;

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

        public QueryRedeemResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryRedeemResponseBodyData setRedeem(QueryRedeemResponseBodyDataRedeem redeem) {
            this.redeem = redeem;
            return this;
        }
        public QueryRedeemResponseBodyDataRedeem getRedeem() {
            return this.redeem;
        }

    }

}

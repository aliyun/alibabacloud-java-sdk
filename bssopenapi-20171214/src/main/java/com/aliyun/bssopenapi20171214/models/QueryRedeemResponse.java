// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryRedeemResponse extends TeaModel {
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
    public QueryRedeemResponseData data;

    public static QueryRedeemResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRedeemResponse self = new QueryRedeemResponse();
        return TeaModel.build(map, self);
    }

    public QueryRedeemResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRedeemResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryRedeemResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRedeemResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRedeemResponse setData(QueryRedeemResponseData data) {
        this.data = data;
        return this;
    }
    public QueryRedeemResponseData getData() {
        return this.data;
    }

    public static class QueryRedeemResponseDataRedeemRedeem extends TeaModel {
        @NameInMap("RedeemId")
        @Validation(required = true)
        public String redeemId;

        @NameInMap("RedeemNo")
        @Validation(required = true)
        public String redeemNo;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("GrantedTime")
        @Validation(required = true)
        public String grantedTime;

        @NameInMap("EffectiveTime")
        @Validation(required = true)
        public String effectiveTime;

        @NameInMap("ExpiryTime")
        @Validation(required = true)
        public String expiryTime;

        @NameInMap("NominalValue")
        @Validation(required = true)
        public String nominalValue;

        @NameInMap("Balance")
        @Validation(required = true)
        public String balance;

        @NameInMap("ApplicableProducts")
        @Validation(required = true)
        public String applicableProducts;

        @NameInMap("Specification")
        @Validation(required = true)
        public String specification;

        public static QueryRedeemResponseDataRedeemRedeem build(java.util.Map<String, ?> map) throws Exception {
            QueryRedeemResponseDataRedeemRedeem self = new QueryRedeemResponseDataRedeemRedeem();
            return TeaModel.build(map, self);
        }

        public QueryRedeemResponseDataRedeemRedeem setRedeemId(String redeemId) {
            this.redeemId = redeemId;
            return this;
        }
        public String getRedeemId() {
            return this.redeemId;
        }

        public QueryRedeemResponseDataRedeemRedeem setRedeemNo(String redeemNo) {
            this.redeemNo = redeemNo;
            return this;
        }
        public String getRedeemNo() {
            return this.redeemNo;
        }

        public QueryRedeemResponseDataRedeemRedeem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryRedeemResponseDataRedeemRedeem setGrantedTime(String grantedTime) {
            this.grantedTime = grantedTime;
            return this;
        }
        public String getGrantedTime() {
            return this.grantedTime;
        }

        public QueryRedeemResponseDataRedeemRedeem setEffectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        public QueryRedeemResponseDataRedeemRedeem setExpiryTime(String expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }
        public String getExpiryTime() {
            return this.expiryTime;
        }

        public QueryRedeemResponseDataRedeemRedeem setNominalValue(String nominalValue) {
            this.nominalValue = nominalValue;
            return this;
        }
        public String getNominalValue() {
            return this.nominalValue;
        }

        public QueryRedeemResponseDataRedeemRedeem setBalance(String balance) {
            this.balance = balance;
            return this;
        }
        public String getBalance() {
            return this.balance;
        }

        public QueryRedeemResponseDataRedeemRedeem setApplicableProducts(String applicableProducts) {
            this.applicableProducts = applicableProducts;
            return this;
        }
        public String getApplicableProducts() {
            return this.applicableProducts;
        }

        public QueryRedeemResponseDataRedeemRedeem setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

    }

    public static class QueryRedeemResponseDataRedeem extends TeaModel {
        @NameInMap("Redeem")
        @Validation(required = true)
        public java.util.List<QueryRedeemResponseDataRedeemRedeem> redeem;

        public static QueryRedeemResponseDataRedeem build(java.util.Map<String, ?> map) throws Exception {
            QueryRedeemResponseDataRedeem self = new QueryRedeemResponseDataRedeem();
            return TeaModel.build(map, self);
        }

        public QueryRedeemResponseDataRedeem setRedeem(java.util.List<QueryRedeemResponseDataRedeemRedeem> redeem) {
            this.redeem = redeem;
            return this;
        }
        public java.util.List<QueryRedeemResponseDataRedeemRedeem> getRedeem() {
            return this.redeem;
        }

    }

    public static class QueryRedeemResponseData extends TeaModel {
        @NameInMap("PageNum")
        @Validation(required = true)
        public Long pageNum;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Long pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        @NameInMap("Redeem")
        @Validation(required = true)
        public QueryRedeemResponseDataRedeem redeem;

        public static QueryRedeemResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryRedeemResponseData self = new QueryRedeemResponseData();
            return TeaModel.build(map, self);
        }

        public QueryRedeemResponseData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public QueryRedeemResponseData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryRedeemResponseData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryRedeemResponseData setRedeem(QueryRedeemResponseDataRedeem redeem) {
            this.redeem = redeem;
            return this;
        }
        public QueryRedeemResponseDataRedeem getRedeem() {
            return this.redeem;
        }

    }

}

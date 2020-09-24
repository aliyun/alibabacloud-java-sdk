// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryPrepaidCardsResponse extends TeaModel {
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
    public QueryPrepaidCardsResponseData data;

    public static QueryPrepaidCardsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPrepaidCardsResponse self = new QueryPrepaidCardsResponse();
        return TeaModel.build(map, self);
    }

    public QueryPrepaidCardsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPrepaidCardsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryPrepaidCardsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPrepaidCardsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryPrepaidCardsResponse setData(QueryPrepaidCardsResponseData data) {
        this.data = data;
        return this;
    }
    public QueryPrepaidCardsResponseData getData() {
        return this.data;
    }

    public static class QueryPrepaidCardsResponseDataPrepaidCard extends TeaModel {
        @NameInMap("PrepaidCardId")
        @Validation(required = true)
        public Long prepaidCardId;

        @NameInMap("PrepaidCardNo")
        @Validation(required = true)
        public String prepaidCardNo;

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

        public static QueryPrepaidCardsResponseDataPrepaidCard build(java.util.Map<String, ?> map) throws Exception {
            QueryPrepaidCardsResponseDataPrepaidCard self = new QueryPrepaidCardsResponseDataPrepaidCard();
            return TeaModel.build(map, self);
        }

        public QueryPrepaidCardsResponseDataPrepaidCard setPrepaidCardId(Long prepaidCardId) {
            this.prepaidCardId = prepaidCardId;
            return this;
        }
        public Long getPrepaidCardId() {
            return this.prepaidCardId;
        }

        public QueryPrepaidCardsResponseDataPrepaidCard setPrepaidCardNo(String prepaidCardNo) {
            this.prepaidCardNo = prepaidCardNo;
            return this;
        }
        public String getPrepaidCardNo() {
            return this.prepaidCardNo;
        }

        public QueryPrepaidCardsResponseDataPrepaidCard setGrantedTime(String grantedTime) {
            this.grantedTime = grantedTime;
            return this;
        }
        public String getGrantedTime() {
            return this.grantedTime;
        }

        public QueryPrepaidCardsResponseDataPrepaidCard setEffectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        public QueryPrepaidCardsResponseDataPrepaidCard setExpiryTime(String expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }
        public String getExpiryTime() {
            return this.expiryTime;
        }

        public QueryPrepaidCardsResponseDataPrepaidCard setApplicableProducts(String applicableProducts) {
            this.applicableProducts = applicableProducts;
            return this;
        }
        public String getApplicableProducts() {
            return this.applicableProducts;
        }

        public QueryPrepaidCardsResponseDataPrepaidCard setApplicableScenarios(String applicableScenarios) {
            this.applicableScenarios = applicableScenarios;
            return this;
        }
        public String getApplicableScenarios() {
            return this.applicableScenarios;
        }

        public QueryPrepaidCardsResponseDataPrepaidCard setNominalValue(String nominalValue) {
            this.nominalValue = nominalValue;
            return this;
        }
        public String getNominalValue() {
            return this.nominalValue;
        }

        public QueryPrepaidCardsResponseDataPrepaidCard setBalance(String balance) {
            this.balance = balance;
            return this;
        }
        public String getBalance() {
            return this.balance;
        }

        public QueryPrepaidCardsResponseDataPrepaidCard setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class QueryPrepaidCardsResponseData extends TeaModel {
        @NameInMap("PrepaidCard")
        @Validation(required = true)
        public java.util.List<QueryPrepaidCardsResponseDataPrepaidCard> prepaidCard;

        public static QueryPrepaidCardsResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryPrepaidCardsResponseData self = new QueryPrepaidCardsResponseData();
            return TeaModel.build(map, self);
        }

        public QueryPrepaidCardsResponseData setPrepaidCard(java.util.List<QueryPrepaidCardsResponseDataPrepaidCard> prepaidCard) {
            this.prepaidCard = prepaidCard;
            return this;
        }
        public java.util.List<QueryPrepaidCardsResponseDataPrepaidCard> getPrepaidCard() {
            return this.prepaidCard;
        }

    }

}

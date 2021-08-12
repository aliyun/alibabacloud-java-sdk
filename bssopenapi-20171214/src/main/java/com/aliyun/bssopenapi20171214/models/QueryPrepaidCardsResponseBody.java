// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryPrepaidCardsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public QueryPrepaidCardsResponseBodyData data;

    public static QueryPrepaidCardsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPrepaidCardsResponseBody self = new QueryPrepaidCardsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPrepaidCardsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPrepaidCardsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryPrepaidCardsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPrepaidCardsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryPrepaidCardsResponseBody setData(QueryPrepaidCardsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryPrepaidCardsResponseBodyData getData() {
        return this.data;
    }

    public static class QueryPrepaidCardsResponseBodyDataPrepaidCard extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ExpiryTime")
        public String expiryTime;

        @NameInMap("GrantedTime")
        public String grantedTime;

        @NameInMap("NominalValue")
        public String nominalValue;

        @NameInMap("EffectiveTime")
        public String effectiveTime;

        @NameInMap("PrepaidCardNo")
        public String prepaidCardNo;

        @NameInMap("ApplicableScenarios")
        public String applicableScenarios;

        @NameInMap("PrepaidCardId")
        public Long prepaidCardId;

        @NameInMap("ApplicableProducts")
        public String applicableProducts;

        @NameInMap("Balance")
        public String balance;

        public static QueryPrepaidCardsResponseBodyDataPrepaidCard build(java.util.Map<String, ?> map) throws Exception {
            QueryPrepaidCardsResponseBodyDataPrepaidCard self = new QueryPrepaidCardsResponseBodyDataPrepaidCard();
            return TeaModel.build(map, self);
        }

        public QueryPrepaidCardsResponseBodyDataPrepaidCard setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryPrepaidCardsResponseBodyDataPrepaidCard setExpiryTime(String expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }
        public String getExpiryTime() {
            return this.expiryTime;
        }

        public QueryPrepaidCardsResponseBodyDataPrepaidCard setGrantedTime(String grantedTime) {
            this.grantedTime = grantedTime;
            return this;
        }
        public String getGrantedTime() {
            return this.grantedTime;
        }

        public QueryPrepaidCardsResponseBodyDataPrepaidCard setNominalValue(String nominalValue) {
            this.nominalValue = nominalValue;
            return this;
        }
        public String getNominalValue() {
            return this.nominalValue;
        }

        public QueryPrepaidCardsResponseBodyDataPrepaidCard setEffectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        public QueryPrepaidCardsResponseBodyDataPrepaidCard setPrepaidCardNo(String prepaidCardNo) {
            this.prepaidCardNo = prepaidCardNo;
            return this;
        }
        public String getPrepaidCardNo() {
            return this.prepaidCardNo;
        }

        public QueryPrepaidCardsResponseBodyDataPrepaidCard setApplicableScenarios(String applicableScenarios) {
            this.applicableScenarios = applicableScenarios;
            return this;
        }
        public String getApplicableScenarios() {
            return this.applicableScenarios;
        }

        public QueryPrepaidCardsResponseBodyDataPrepaidCard setPrepaidCardId(Long prepaidCardId) {
            this.prepaidCardId = prepaidCardId;
            return this;
        }
        public Long getPrepaidCardId() {
            return this.prepaidCardId;
        }

        public QueryPrepaidCardsResponseBodyDataPrepaidCard setApplicableProducts(String applicableProducts) {
            this.applicableProducts = applicableProducts;
            return this;
        }
        public String getApplicableProducts() {
            return this.applicableProducts;
        }

        public QueryPrepaidCardsResponseBodyDataPrepaidCard setBalance(String balance) {
            this.balance = balance;
            return this;
        }
        public String getBalance() {
            return this.balance;
        }

    }

    public static class QueryPrepaidCardsResponseBodyData extends TeaModel {
        @NameInMap("PrepaidCard")
        public java.util.List<QueryPrepaidCardsResponseBodyDataPrepaidCard> prepaidCard;

        public static QueryPrepaidCardsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryPrepaidCardsResponseBodyData self = new QueryPrepaidCardsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryPrepaidCardsResponseBodyData setPrepaidCard(java.util.List<QueryPrepaidCardsResponseBodyDataPrepaidCard> prepaidCard) {
            this.prepaidCard = prepaidCard;
            return this;
        }
        public java.util.List<QueryPrepaidCardsResponseBodyDataPrepaidCard> getPrepaidCard() {
            return this.prepaidCard;
        }

    }

}

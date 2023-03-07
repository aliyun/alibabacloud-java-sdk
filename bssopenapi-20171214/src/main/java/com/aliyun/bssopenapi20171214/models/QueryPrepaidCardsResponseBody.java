// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryPrepaidCardsResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public QueryPrepaidCardsResponseBodyData data;

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

    public QueryPrepaidCardsResponseBody setData(QueryPrepaidCardsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryPrepaidCardsResponseBodyData getData() {
        return this.data;
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

    public static class QueryPrepaidCardsResponseBodyDataPrepaidCard extends TeaModel {
        /**
         * <p>The services to which the prepaid card is applicable.</p>
         */
        @NameInMap("ApplicableProducts")
        public String applicableProducts;

        /**
         * <p>The scenario to which the prepaid card is applicable.</p>
         */
        @NameInMap("ApplicableScenarios")
        public String applicableScenarios;

        /**
         * <p>The balance of the prepaid card.</p>
         */
        @NameInMap("Balance")
        public String balance;

        /**
         * <p>The time when the prepaid card took effect.</p>
         */
        @NameInMap("EffectiveTime")
        public String effectiveTime;

        /**
         * <p>The time when the prepaid card expired.</p>
         */
        @NameInMap("ExpiryTime")
        public String expiryTime;

        /**
         * <p>The time when the prepaid card was issued.</p>
         */
        @NameInMap("GrantedTime")
        public String grantedTime;

        /**
         * <p>The nominal value of the prepaid card.</p>
         */
        @NameInMap("NominalValue")
        public String nominalValue;

        /**
         * <p>The ID of the prepaid card.</p>
         */
        @NameInMap("PrepaidCardId")
        public Long prepaidCardId;

        /**
         * <p>The number of the prepaid card.</p>
         */
        @NameInMap("PrepaidCardNo")
        public String prepaidCardNo;

        /**
         * <p>The status of the prepaid card. Valid values:</p>
         * <br>
         * <p>*   Available: The prepaid card is valid.</p>
         * <p>*   Expired: The prepaid card expired.</p>
         * <p>*   Cancelled: The prepaid card is invalid.</p>
         */
        @NameInMap("Status")
        public String status;

        public static QueryPrepaidCardsResponseBodyDataPrepaidCard build(java.util.Map<String, ?> map) throws Exception {
            QueryPrepaidCardsResponseBodyDataPrepaidCard self = new QueryPrepaidCardsResponseBodyDataPrepaidCard();
            return TeaModel.build(map, self);
        }

        public QueryPrepaidCardsResponseBodyDataPrepaidCard setApplicableProducts(String applicableProducts) {
            this.applicableProducts = applicableProducts;
            return this;
        }
        public String getApplicableProducts() {
            return this.applicableProducts;
        }

        public QueryPrepaidCardsResponseBodyDataPrepaidCard setApplicableScenarios(String applicableScenarios) {
            this.applicableScenarios = applicableScenarios;
            return this;
        }
        public String getApplicableScenarios() {
            return this.applicableScenarios;
        }

        public QueryPrepaidCardsResponseBodyDataPrepaidCard setBalance(String balance) {
            this.balance = balance;
            return this;
        }
        public String getBalance() {
            return this.balance;
        }

        public QueryPrepaidCardsResponseBodyDataPrepaidCard setEffectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public String getEffectiveTime() {
            return this.effectiveTime;
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

        public QueryPrepaidCardsResponseBodyDataPrepaidCard setPrepaidCardId(Long prepaidCardId) {
            this.prepaidCardId = prepaidCardId;
            return this;
        }
        public Long getPrepaidCardId() {
            return this.prepaidCardId;
        }

        public QueryPrepaidCardsResponseBodyDataPrepaidCard setPrepaidCardNo(String prepaidCardNo) {
            this.prepaidCardNo = prepaidCardNo;
            return this;
        }
        public String getPrepaidCardNo() {
            return this.prepaidCardNo;
        }

        public QueryPrepaidCardsResponseBodyDataPrepaidCard setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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

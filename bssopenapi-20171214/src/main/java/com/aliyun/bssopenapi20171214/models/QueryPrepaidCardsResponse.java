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

    }

    public static class QueryPrepaidCardsResponseData extends TeaModel {
        @NameInMap("PrepaidCard")
        @Validation(required = true)
        public java.util.List<QueryPrepaidCardsResponseDataPrepaidCard> prepaidCard;

        public static QueryPrepaidCardsResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryPrepaidCardsResponseData self = new QueryPrepaidCardsResponseData();
            return TeaModel.build(map, self);
        }

    }

}

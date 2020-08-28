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

    }

    public static class QueryRedeemResponseDataRedeem extends TeaModel {
        @NameInMap("Redeem")
        @Validation(required = true)
        public java.util.List<QueryRedeemResponseDataRedeemRedeem> redeem;

        public static QueryRedeemResponseDataRedeem build(java.util.Map<String, ?> map) throws Exception {
            QueryRedeemResponseDataRedeem self = new QueryRedeemResponseDataRedeem();
            return TeaModel.build(map, self);
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

    }

}

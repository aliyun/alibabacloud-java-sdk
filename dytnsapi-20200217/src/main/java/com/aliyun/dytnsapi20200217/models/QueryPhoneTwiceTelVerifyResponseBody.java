// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class QueryPhoneTwiceTelVerifyResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryPhoneTwiceTelVerifyResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryPhoneTwiceTelVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPhoneTwiceTelVerifyResponseBody self = new QueryPhoneTwiceTelVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPhoneTwiceTelVerifyResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryPhoneTwiceTelVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPhoneTwiceTelVerifyResponseBody setData(QueryPhoneTwiceTelVerifyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryPhoneTwiceTelVerifyResponseBodyData getData() {
        return this.data;
    }

    public QueryPhoneTwiceTelVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryPhoneTwiceTelVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryPhoneTwiceTelVerifyResponseBodyData extends TeaModel {
        @NameInMap("CarrierCode")
        public String carrierCode;

        @NameInMap("VerifyResult")
        public Long verifyResult;

        public static QueryPhoneTwiceTelVerifyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryPhoneTwiceTelVerifyResponseBodyData self = new QueryPhoneTwiceTelVerifyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryPhoneTwiceTelVerifyResponseBodyData setCarrierCode(String carrierCode) {
            this.carrierCode = carrierCode;
            return this;
        }
        public String getCarrierCode() {
            return this.carrierCode;
        }

        public QueryPhoneTwiceTelVerifyResponseBodyData setVerifyResult(Long verifyResult) {
            this.verifyResult = verifyResult;
            return this;
        }
        public Long getVerifyResult() {
            return this.verifyResult;
        }

    }

}

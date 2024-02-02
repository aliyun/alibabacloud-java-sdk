// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class QueryPhoneNumberOnlineTimeResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryPhoneNumberOnlineTimeResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryPhoneNumberOnlineTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPhoneNumberOnlineTimeResponseBody self = new QueryPhoneNumberOnlineTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPhoneNumberOnlineTimeResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryPhoneNumberOnlineTimeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPhoneNumberOnlineTimeResponseBody setData(QueryPhoneNumberOnlineTimeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryPhoneNumberOnlineTimeResponseBodyData getData() {
        return this.data;
    }

    public QueryPhoneNumberOnlineTimeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryPhoneNumberOnlineTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryPhoneNumberOnlineTimeResponseBodyData extends TeaModel {
        @NameInMap("CarrierCode")
        public String carrierCode;

        @NameInMap("VerifyResult")
        public Long verifyResult;

        public static QueryPhoneNumberOnlineTimeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryPhoneNumberOnlineTimeResponseBodyData self = new QueryPhoneNumberOnlineTimeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryPhoneNumberOnlineTimeResponseBodyData setCarrierCode(String carrierCode) {
            this.carrierCode = carrierCode;
            return this;
        }
        public String getCarrierCode() {
            return this.carrierCode;
        }

        public QueryPhoneNumberOnlineTimeResponseBodyData setVerifyResult(Long verifyResult) {
            this.verifyResult = verifyResult;
            return this;
        }
        public Long getVerifyResult() {
            return this.verifyResult;
        }

    }

}

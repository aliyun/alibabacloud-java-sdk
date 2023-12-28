// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribePhoneNumberRiskResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribePhoneNumberRiskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePhoneNumberRiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePhoneNumberRiskResponseBody self = new DescribePhoneNumberRiskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePhoneNumberRiskResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribePhoneNumberRiskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePhoneNumberRiskResponseBody setData(DescribePhoneNumberRiskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribePhoneNumberRiskResponseBodyData getData() {
        return this.data;
    }

    public DescribePhoneNumberRiskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePhoneNumberRiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePhoneNumberRiskResponseBodyData extends TeaModel {
        @NameInMap("VerifyResult")
        public String verifyResult;

        public static DescribePhoneNumberRiskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePhoneNumberRiskResponseBodyData self = new DescribePhoneNumberRiskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePhoneNumberRiskResponseBodyData setVerifyResult(String verifyResult) {
            this.verifyResult = verifyResult;
            return this;
        }
        public String getVerifyResult() {
            return this.verifyResult;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class CompanyTwoElementsVerificationResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CompanyTwoElementsVerificationResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CompanyTwoElementsVerificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CompanyTwoElementsVerificationResponseBody self = new CompanyTwoElementsVerificationResponseBody();
        return TeaModel.build(map, self);
    }

    public CompanyTwoElementsVerificationResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CompanyTwoElementsVerificationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CompanyTwoElementsVerificationResponseBody setData(CompanyTwoElementsVerificationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CompanyTwoElementsVerificationResponseBodyData getData() {
        return this.data;
    }

    public CompanyTwoElementsVerificationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CompanyTwoElementsVerificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CompanyTwoElementsVerificationResponseBodyData extends TeaModel {
        @NameInMap("DetailInfo")
        public java.util.Map<String, ?> detailInfo;

        @NameInMap("ReasonCode")
        public String reasonCode;

        @NameInMap("VerifyResult")
        public String verifyResult;

        public static CompanyTwoElementsVerificationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CompanyTwoElementsVerificationResponseBodyData self = new CompanyTwoElementsVerificationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CompanyTwoElementsVerificationResponseBodyData setDetailInfo(java.util.Map<String, ?> detailInfo) {
            this.detailInfo = detailInfo;
            return this;
        }
        public java.util.Map<String, ?> getDetailInfo() {
            return this.detailInfo;
        }

        public CompanyTwoElementsVerificationResponseBodyData setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

        public CompanyTwoElementsVerificationResponseBodyData setVerifyResult(String verifyResult) {
            this.verifyResult = verifyResult;
            return this;
        }
        public String getVerifyResult() {
            return this.verifyResult;
        }

    }

}

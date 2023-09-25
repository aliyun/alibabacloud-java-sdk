// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class CompanyThreeElementsVerificationResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CompanyThreeElementsVerificationResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CompanyThreeElementsVerificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CompanyThreeElementsVerificationResponseBody self = new CompanyThreeElementsVerificationResponseBody();
        return TeaModel.build(map, self);
    }

    public CompanyThreeElementsVerificationResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CompanyThreeElementsVerificationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CompanyThreeElementsVerificationResponseBody setData(CompanyThreeElementsVerificationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CompanyThreeElementsVerificationResponseBodyData getData() {
        return this.data;
    }

    public CompanyThreeElementsVerificationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CompanyThreeElementsVerificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CompanyThreeElementsVerificationResponseBodyData extends TeaModel {
        @NameInMap("DetailInfo")
        public java.util.Map<String, ?> detailInfo;

        @NameInMap("ReasonCode")
        public Long reasonCode;

        @NameInMap("VerifyResult")
        public String verifyResult;

        public static CompanyThreeElementsVerificationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CompanyThreeElementsVerificationResponseBodyData self = new CompanyThreeElementsVerificationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CompanyThreeElementsVerificationResponseBodyData setDetailInfo(java.util.Map<String, ?> detailInfo) {
            this.detailInfo = detailInfo;
            return this;
        }
        public java.util.Map<String, ?> getDetailInfo() {
            return this.detailInfo;
        }

        public CompanyThreeElementsVerificationResponseBodyData setReasonCode(Long reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public Long getReasonCode() {
            return this.reasonCode;
        }

        public CompanyThreeElementsVerificationResponseBodyData setVerifyResult(String verifyResult) {
            this.verifyResult = verifyResult;
            return this;
        }
        public String getVerifyResult() {
            return this.verifyResult;
        }

    }

}

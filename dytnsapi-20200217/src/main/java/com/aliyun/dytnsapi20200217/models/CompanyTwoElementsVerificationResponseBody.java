// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class CompanyTwoElementsVerificationResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public CompanyTwoElementsVerificationResponseBodyData data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique request ID. It is a common parameter and can be used to troubleshoot issues.</p>
     */
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

    public static class CompanyTwoElementsVerificationResponseBodyDataDetailInfo extends TeaModel {
        /**
         * <p>The business status of the enterprise.</p>
         */
        @NameInMap("EnterpriseStatus")
        public String enterpriseStatus;

        /**
         * <p>The business term of the enterprise.</p>
         */
        @NameInMap("OpenTime")
        public String openTime;

        public static CompanyTwoElementsVerificationResponseBodyDataDetailInfo build(java.util.Map<String, ?> map) throws Exception {
            CompanyTwoElementsVerificationResponseBodyDataDetailInfo self = new CompanyTwoElementsVerificationResponseBodyDataDetailInfo();
            return TeaModel.build(map, self);
        }

        public CompanyTwoElementsVerificationResponseBodyDataDetailInfo setEnterpriseStatus(String enterpriseStatus) {
            this.enterpriseStatus = enterpriseStatus;
            return this;
        }
        public String getEnterpriseStatus() {
            return this.enterpriseStatus;
        }

        public CompanyTwoElementsVerificationResponseBodyDataDetailInfo setOpenTime(String openTime) {
            this.openTime = openTime;
            return this;
        }
        public String getOpenTime() {
            return this.openTime;
        }

    }

    public static class CompanyTwoElementsVerificationResponseBodyData extends TeaModel {
        /**
         * <p>The information about the enterprise.</p>
         */
        @NameInMap("DetailInfo")
        public CompanyTwoElementsVerificationResponseBodyDataDetailInfo detailInfo;

        /**
         * <p>The fields to be verified.</p>
         */
        @NameInMap("InconsistentData")
        public java.util.List<String> inconsistentData;

        /**
         * <p>The code of the verification result. Valid values:</p>
         * <br>
         * <p>*   0: The two elements belong to the same enterprise.</p>
         * <p>*   1: The two elements belong to the same enterprise, but the business status of the enterprise is abnormal.</p>
         * <p>*   3: The two elements do not belong to the same enterprise.</p>
         * <p>*   4: No information about the enterprise is found.</p>
         */
        @NameInMap("ReasonCode")
        public String reasonCode;

        /**
         * <p>The verification result. Valid values:</p>
         * <br>
         * <p>*   true: The two elements belong to the same enterprise and the business status of the enterprise is Active.</p>
         * <p>*   false: The two elements do not belong to the same enterprise.</p>
         */
        @NameInMap("VerifyResult")
        public String verifyResult;

        public static CompanyTwoElementsVerificationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CompanyTwoElementsVerificationResponseBodyData self = new CompanyTwoElementsVerificationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CompanyTwoElementsVerificationResponseBodyData setDetailInfo(CompanyTwoElementsVerificationResponseBodyDataDetailInfo detailInfo) {
            this.detailInfo = detailInfo;
            return this;
        }
        public CompanyTwoElementsVerificationResponseBodyDataDetailInfo getDetailInfo() {
            return this.detailInfo;
        }

        public CompanyTwoElementsVerificationResponseBodyData setInconsistentData(java.util.List<String> inconsistentData) {
            this.inconsistentData = inconsistentData;
            return this;
        }
        public java.util.List<String> getInconsistentData() {
            return this.inconsistentData;
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

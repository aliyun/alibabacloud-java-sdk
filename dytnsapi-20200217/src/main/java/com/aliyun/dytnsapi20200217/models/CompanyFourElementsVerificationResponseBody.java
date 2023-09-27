// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class CompanyFourElementsVerificationResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CompanyFourElementsVerificationResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CompanyFourElementsVerificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CompanyFourElementsVerificationResponseBody self = new CompanyFourElementsVerificationResponseBody();
        return TeaModel.build(map, self);
    }

    public CompanyFourElementsVerificationResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CompanyFourElementsVerificationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CompanyFourElementsVerificationResponseBody setData(CompanyFourElementsVerificationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CompanyFourElementsVerificationResponseBodyData getData() {
        return this.data;
    }

    public CompanyFourElementsVerificationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CompanyFourElementsVerificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CompanyFourElementsVerificationResponseBodyDataDetailInfo extends TeaModel {
        @NameInMap("EnterpriseStatus")
        public String enterpriseStatus;

        @NameInMap("OpenTime")
        public String openTime;

        public static CompanyFourElementsVerificationResponseBodyDataDetailInfo build(java.util.Map<String, ?> map) throws Exception {
            CompanyFourElementsVerificationResponseBodyDataDetailInfo self = new CompanyFourElementsVerificationResponseBodyDataDetailInfo();
            return TeaModel.build(map, self);
        }

        public CompanyFourElementsVerificationResponseBodyDataDetailInfo setEnterpriseStatus(String enterpriseStatus) {
            this.enterpriseStatus = enterpriseStatus;
            return this;
        }
        public String getEnterpriseStatus() {
            return this.enterpriseStatus;
        }

        public CompanyFourElementsVerificationResponseBodyDataDetailInfo setOpenTime(String openTime) {
            this.openTime = openTime;
            return this;
        }
        public String getOpenTime() {
            return this.openTime;
        }

    }

    public static class CompanyFourElementsVerificationResponseBodyData extends TeaModel {
        @NameInMap("DetailInfo")
        public CompanyFourElementsVerificationResponseBodyDataDetailInfo detailInfo;

        @NameInMap("InconsistentData")
        public java.util.List<String> inconsistentData;

        @NameInMap("ReasonCode")
        public Long reasonCode;

        @NameInMap("VerifyResult")
        public String verifyResult;

        public static CompanyFourElementsVerificationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CompanyFourElementsVerificationResponseBodyData self = new CompanyFourElementsVerificationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CompanyFourElementsVerificationResponseBodyData setDetailInfo(CompanyFourElementsVerificationResponseBodyDataDetailInfo detailInfo) {
            this.detailInfo = detailInfo;
            return this;
        }
        public CompanyFourElementsVerificationResponseBodyDataDetailInfo getDetailInfo() {
            return this.detailInfo;
        }

        public CompanyFourElementsVerificationResponseBodyData setInconsistentData(java.util.List<String> inconsistentData) {
            this.inconsistentData = inconsistentData;
            return this;
        }
        public java.util.List<String> getInconsistentData() {
            return this.inconsistentData;
        }

        public CompanyFourElementsVerificationResponseBodyData setReasonCode(Long reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public Long getReasonCode() {
            return this.reasonCode;
        }

        public CompanyFourElementsVerificationResponseBodyData setVerifyResult(String verifyResult) {
            this.verifyResult = verifyResult;
            return this;
        }
        public String getVerifyResult() {
            return this.verifyResult;
        }

    }

}

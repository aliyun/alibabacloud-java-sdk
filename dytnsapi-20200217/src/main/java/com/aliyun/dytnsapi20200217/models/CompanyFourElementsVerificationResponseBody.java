// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class CompanyFourElementsVerificationResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The request status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The structure.</p>
     */
    @NameInMap("Data")
    public CompanyFourElementsVerificationResponseBodyData data;

    /**
     * <p>The description of the returned status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The common parameter. The ID returned for each request is unique and can be used to troubleshoot and locate issues.</p>
     * 
     * <strong>example:</strong>
     * <p>CC3BB6D2-2FDF-4321-9DCE-B38165CE4C47</p>
     */
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
        /**
         * <p>The operating status of the enterprise.</p>
         * 
         * <strong>example:</strong>
         * <p>在营（开业）</p>
         */
        @NameInMap("EnterpriseStatus")
        public String enterpriseStatus;

        /**
         * <p>The business term of the enterprise.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-25/2053-05-24</p>
         */
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
        /**
         * <p>The enterprise details.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;enterpriseStatus&quot;: &quot;在营（开业）&quot;, 
         * &quot;openTime&quot;: &quot;2023-05-25/2053-05-24&quot; }</p>
         */
        @NameInMap("DetailInfo")
        public CompanyFourElementsVerificationResponseBodyDataDetailInfo detailInfo;

        /**
         * <p>The fields that failed verification.</p>
         */
        @NameInMap("InconsistentData")
        public java.util.List<String> inconsistentData;

        /**
         * <p>The verification result code. Valid values:</p>
         * <ul>
         * <li>0: Verification passed.</li>
         * <li>1: Verification passed, but the enterprise is not operating normally.</li>
         * <li>2: The legal person and enterprise information are inconsistent.</li>
         * <li>3: The enterprise four-element verification failed.</li>
         * <li>4: The enterprise was not found.</li>
         * <li>5: The legal person was not found in the database.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ReasonCode")
        public Long reasonCode;

        /**
         * <p>The verification result. Valid values:</p>
         * <ul>
         * <li>true: The information is consistent and the enterprise is operating normally.</li>
         * <li>false: Verification failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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

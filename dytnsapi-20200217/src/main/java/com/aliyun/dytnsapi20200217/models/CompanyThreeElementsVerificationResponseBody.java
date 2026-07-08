// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class CompanyThreeElementsVerificationResponseBody extends TeaModel {
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
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public CompanyThreeElementsVerificationResponseBodyData data;

    /**
     * <p>The description of the returned status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The common parameter. Each request returns a unique ID, which can be used to troubleshoot and locate issues.</p>
     * 
     * <strong>example:</strong>
     * <p>68A40250-50CD-034C-B728-0BD135850177</p>
     */
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

    public static class CompanyThreeElementsVerificationResponseBodyDataDetailInfo extends TeaModel {
        /**
         * <p>The operating status of the company.</p>
         * 
         * <strong>example:</strong>
         * <p>在营（开业）</p>
         */
        @NameInMap("EnterpriseStatus")
        public String enterpriseStatus;

        /**
         * <p>The business term of the company.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-25/2053-05-24</p>
         */
        @NameInMap("OpenTime")
        public String openTime;

        public static CompanyThreeElementsVerificationResponseBodyDataDetailInfo build(java.util.Map<String, ?> map) throws Exception {
            CompanyThreeElementsVerificationResponseBodyDataDetailInfo self = new CompanyThreeElementsVerificationResponseBodyDataDetailInfo();
            return TeaModel.build(map, self);
        }

        public CompanyThreeElementsVerificationResponseBodyDataDetailInfo setEnterpriseStatus(String enterpriseStatus) {
            this.enterpriseStatus = enterpriseStatus;
            return this;
        }
        public String getEnterpriseStatus() {
            return this.enterpriseStatus;
        }

        public CompanyThreeElementsVerificationResponseBodyDataDetailInfo setOpenTime(String openTime) {
            this.openTime = openTime;
            return this;
        }
        public String getOpenTime() {
            return this.openTime;
        }

    }

    public static class CompanyThreeElementsVerificationResponseBodyData extends TeaModel {
        /**
         * <p>The company details.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;enterpriseStatus&quot;: &quot;在营（开业）&quot;,
         *       &quot;openTime&quot;: &quot;2023-05-25/2053-05-24&quot;
         * }</p>
         */
        @NameInMap("DetailInfo")
        public CompanyThreeElementsVerificationResponseBodyDataDetailInfo detailInfo;

        /**
         * <p>The fields whose verification results are inconsistent.</p>
         */
        @NameInMap("InconsistentData")
        public java.util.List<String> inconsistentData;

        /**
         * <p>The verification result code. Valid values:</p>
         * <ul>
         * <li>0: The verification is consistent.</li>
         * <li>1: The verification is consistent, but the company is not operating normally.</li>
         * <li>2: The person-company verification is inconsistent.</li>
         * <li>3: The two-element company verification failed.</li>
         * <li>4: The company is not found.</li>
         * <li>5: The person does not exist in the database.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ReasonCode")
        public Long reasonCode;

        /**
         * <p>The verification result. Valid values:</p>
         * <ul>
         * <li>true: The information is consistent and the company is operating normally.</li>
         * <li>false: The verification failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("VerifyResult")
        public String verifyResult;

        public static CompanyThreeElementsVerificationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CompanyThreeElementsVerificationResponseBodyData self = new CompanyThreeElementsVerificationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CompanyThreeElementsVerificationResponseBodyData setDetailInfo(CompanyThreeElementsVerificationResponseBodyDataDetailInfo detailInfo) {
            this.detailInfo = detailInfo;
            return this;
        }
        public CompanyThreeElementsVerificationResponseBodyDataDetailInfo getDetailInfo() {
            return this.detailInfo;
        }

        public CompanyThreeElementsVerificationResponseBodyData setInconsistentData(java.util.List<String> inconsistentData) {
            this.inconsistentData = inconsistentData;
            return this;
        }
        public java.util.List<String> getInconsistentData() {
            return this.inconsistentData;
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

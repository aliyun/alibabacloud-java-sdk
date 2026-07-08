// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class CompanyTwoElementsVerificationResponseBody extends TeaModel {
    /**
     * <p>Details about the access denial.</p>
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
     * <p>The struct.</p>
     */
    @NameInMap("Data")
    public CompanyTwoElementsVerificationResponseBodyData data;

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
         * <p>Enterprise details.</p>
         * <blockquote>
         * <p>This field is not returned for public institutions or civil groups.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;enterpriseStatus&quot;: &quot;在营（开业）&quot;,
         *       &quot;openTime&quot;: &quot;2023-05-25/2053-05-24&quot;
         * }</p>
         */
        @NameInMap("DetailInfo")
        public CompanyTwoElementsVerificationResponseBodyDataDetailInfo detailInfo;

        /**
         * <p>The fields that are inconsistent in the verification.</p>
         */
        @NameInMap("InconsistentData")
        public java.util.List<String> inconsistentData;

        /**
         * <p>The verification result code. Valid values:</p>
         * <ul>
         * <li>0: Verification consistent</li>
         * <li>1: Verification consistent, the enterprise is not in normal operation</li>
         * <li>3: The two enterprise elements failed verification</li>
         * <li>4: No such enterprise found</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ReasonCode")
        public String reasonCode;

        /**
         * <p>The verification result. Valid values:</p>
         * <ul>
         * <li>true: The information is verified to be consistent, and the enterprise is operating normally.</li>
         * <li>false: The verification failed.</li>
         * </ul>
         * <blockquote>
         * <p>The operating status verification is not supported for public institutions or civil groups. Only the consistency between the enterprise name and the enterprise certificate number is verified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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

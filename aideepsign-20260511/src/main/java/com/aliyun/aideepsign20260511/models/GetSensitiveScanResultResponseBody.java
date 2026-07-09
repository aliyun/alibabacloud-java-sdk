// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class GetSensitiveScanResultResponseBody extends TeaModel {
    /**
     * <p>The business error code. The value &quot;OK&quot; is returned when the request succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code. The value 200 is returned when the request succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The additional information. The value &quot;success&quot; is returned when the request succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-7890-ABCD-EF1234567890</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The scan result. This parameter is returned only when the status is completed.</p>
     */
    @NameInMap("Result")
    public GetSensitiveScanResultResponseBodyResult result;

    /**
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li>running: The task is running.</li>
     * <li>completed: The task is completed.</li>
     * <li>terminated: The task is terminated or failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>completed</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetSensitiveScanResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSensitiveScanResultResponseBody self = new GetSensitiveScanResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSensitiveScanResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSensitiveScanResultResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetSensitiveScanResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSensitiveScanResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSensitiveScanResultResponseBody setResult(GetSensitiveScanResultResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetSensitiveScanResultResponseBodyResult getResult() {
        return this.result;
    }

    public GetSensitiveScanResultResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetSensitiveScanResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSensitiveScanResultResponseBodyResultOssObjectDetailRuleList extends TeaModel {
        /**
         * <p>The category name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>个人信息</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <p>The number of hits.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The risk level name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>S2</p>
         */
        @NameInMap("RiskLevelName")
        public String riskLevelName;

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>身份证号</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        public static GetSensitiveScanResultResponseBodyResultOssObjectDetailRuleList build(java.util.Map<String, ?> map) throws Exception {
            GetSensitiveScanResultResponseBodyResultOssObjectDetailRuleList self = new GetSensitiveScanResultResponseBodyResultOssObjectDetailRuleList();
            return TeaModel.build(map, self);
        }

        public GetSensitiveScanResultResponseBodyResultOssObjectDetailRuleList setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public GetSensitiveScanResultResponseBodyResultOssObjectDetailRuleList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetSensitiveScanResultResponseBodyResultOssObjectDetailRuleList setRiskLevelName(String riskLevelName) {
            this.riskLevelName = riskLevelName;
            return this;
        }
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        public GetSensitiveScanResultResponseBodyResultOssObjectDetailRuleList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class GetSensitiveScanResultResponseBodyResultOssObjectDetail extends TeaModel {
        /**
         * <p>The name of the bucket to which the object belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>aideepsign-bucket</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The sensitive data category name.</p>
         * 
         * <strong>example:</strong>
         * <p>个人信息</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <p>The name of the scanned object.</p>
         * 
         * <strong>example:</strong>
         * <p>abc12345.jpg</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The overall risk level name.</p>
         * 
         * <strong>example:</strong>
         * <p>S2</p>
         */
        @NameInMap("RiskLevelName")
        public String riskLevelName;

        /**
         * <p>The list of sensitive data rules that are hit.</p>
         */
        @NameInMap("RuleList")
        public java.util.List<GetSensitiveScanResultResponseBodyResultOssObjectDetailRuleList> ruleList;

        public static GetSensitiveScanResultResponseBodyResultOssObjectDetail build(java.util.Map<String, ?> map) throws Exception {
            GetSensitiveScanResultResponseBodyResultOssObjectDetail self = new GetSensitiveScanResultResponseBodyResultOssObjectDetail();
            return TeaModel.build(map, self);
        }

        public GetSensitiveScanResultResponseBodyResultOssObjectDetail setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public GetSensitiveScanResultResponseBodyResultOssObjectDetail setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public GetSensitiveScanResultResponseBodyResultOssObjectDetail setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSensitiveScanResultResponseBodyResultOssObjectDetail setRiskLevelName(String riskLevelName) {
            this.riskLevelName = riskLevelName;
            return this;
        }
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        public GetSensitiveScanResultResponseBodyResultOssObjectDetail setRuleList(java.util.List<GetSensitiveScanResultResponseBodyResultOssObjectDetailRuleList> ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public java.util.List<GetSensitiveScanResultResponseBodyResultOssObjectDetailRuleList> getRuleList() {
            return this.ruleList;
        }

    }

    public static class GetSensitiveScanResultResponseBodyResult extends TeaModel {
        /**
         * <p>The name of the scanned object.</p>
         */
        @NameInMap("OssObjectDetail")
        public GetSensitiveScanResultResponseBodyResultOssObjectDetail ossObjectDetail;

        public static GetSensitiveScanResultResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetSensitiveScanResultResponseBodyResult self = new GetSensitiveScanResultResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetSensitiveScanResultResponseBodyResult setOssObjectDetail(GetSensitiveScanResultResponseBodyResultOssObjectDetail ossObjectDetail) {
            this.ossObjectDetail = ossObjectDetail;
            return this;
        }
        public GetSensitiveScanResultResponseBodyResultOssObjectDetail getOssObjectDetail() {
            return this.ossObjectDetail;
        }

    }

}

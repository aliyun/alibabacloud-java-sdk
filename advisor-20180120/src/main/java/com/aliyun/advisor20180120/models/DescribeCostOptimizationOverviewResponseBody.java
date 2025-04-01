// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeCostOptimizationOverviewResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public DescribeCostOptimizationOverviewResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeCostOptimizationOverviewResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Internal service issue. Detail:.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>566331F9-****-550F-B745-A730331F97A9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeCostOptimizationOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCostOptimizationOverviewResponseBody self = new DescribeCostOptimizationOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCostOptimizationOverviewResponseBody setAccessDeniedDetail(DescribeCostOptimizationOverviewResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DescribeCostOptimizationOverviewResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeCostOptimizationOverviewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeCostOptimizationOverviewResponseBody setData(DescribeCostOptimizationOverviewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCostOptimizationOverviewResponseBodyData getData() {
        return this.data;
    }

    public DescribeCostOptimizationOverviewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCostOptimizationOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCostOptimizationOverviewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCostOptimizationOverviewResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>AuthAction</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("NoPermissionType")
        public String noPermissionType;

        /**
         * <strong>example:</strong>
         * <p>PauseNotify</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static DescribeCostOptimizationOverviewResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeCostOptimizationOverviewResponseBodyAccessDeniedDetail self = new DescribeCostOptimizationOverviewResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DescribeCostOptimizationOverviewResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DescribeCostOptimizationOverviewResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DescribeCostOptimizationOverviewResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DescribeCostOptimizationOverviewResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DescribeCostOptimizationOverviewResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DescribeCostOptimizationOverviewResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DescribeCostOptimizationOverviewResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DescribeCostOptimizationOverviewResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("BillingCycleDate")
        public String billingCycleDate;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CurrentBillingCost")
        public String currentBillingCost;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ExpectedSavingCost")
        public String expectedSavingCost;

        /**
         * <strong>example:</strong>
         * <p>2023-07-01 00:00:00</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("OptCheckItemNum")
        public String optCheckItemNum;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("OptResourceNum")
        public String optResourceNum;

        /**
         * <strong>example:</strong>
         * <p>95***135</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        public static DescribeCostOptimizationOverviewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCostOptimizationOverviewResponseBodyData self = new DescribeCostOptimizationOverviewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCostOptimizationOverviewResponseBodyData setBillingCycleDate(String billingCycleDate) {
            this.billingCycleDate = billingCycleDate;
            return this;
        }
        public String getBillingCycleDate() {
            return this.billingCycleDate;
        }

        public DescribeCostOptimizationOverviewResponseBodyData setCurrentBillingCost(String currentBillingCost) {
            this.currentBillingCost = currentBillingCost;
            return this;
        }
        public String getCurrentBillingCost() {
            return this.currentBillingCost;
        }

        public DescribeCostOptimizationOverviewResponseBodyData setExpectedSavingCost(String expectedSavingCost) {
            this.expectedSavingCost = expectedSavingCost;
            return this;
        }
        public String getExpectedSavingCost() {
            return this.expectedSavingCost;
        }

        public DescribeCostOptimizationOverviewResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeCostOptimizationOverviewResponseBodyData setOptCheckItemNum(String optCheckItemNum) {
            this.optCheckItemNum = optCheckItemNum;
            return this;
        }
        public String getOptCheckItemNum() {
            return this.optCheckItemNum;
        }

        public DescribeCostOptimizationOverviewResponseBodyData setOptResourceNum(String optResourceNum) {
            this.optResourceNum = optResourceNum;
            return this;
        }
        public String getOptResourceNum() {
            return this.optResourceNum;
        }

        public DescribeCostOptimizationOverviewResponseBodyData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}

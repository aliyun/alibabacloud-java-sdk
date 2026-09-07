// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateBackendReportResponseBody extends TeaModel {
    /**
     * <p>The number of user-object combinations that failed to be created.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FailedCount")
    public Integer failedCount;

    /**
     * <p>The processing results for each user-object combination. If some combinations fail, the operation still returns results for all combinations.</p>
     */
    @NameInMap("Items")
    public java.util.List<CreateBackendReportResponseBodyItems> items;

    /**
     * <p>The number of deduplicated filing objects.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ObjectCount")
    public Integer objectCount;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D6707286-A50E-57B1-B2CF-EFAC59E8****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of user-object combinations that are created.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SuccessCount")
    public Integer successCount;

    /**
     * <p>The number of deduplicated filing users.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TargetCount")
    public Integer targetCount;

    /**
     * <p>The total number of expanded user-object combinations.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static CreateBackendReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBackendReportResponseBody self = new CreateBackendReportResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBackendReportResponseBody setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }
    public Integer getFailedCount() {
        return this.failedCount;
    }

    public CreateBackendReportResponseBody setItems(java.util.List<CreateBackendReportResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<CreateBackendReportResponseBodyItems> getItems() {
        return this.items;
    }

    public CreateBackendReportResponseBody setObjectCount(Integer objectCount) {
        this.objectCount = objectCount;
        return this;
    }
    public Integer getObjectCount() {
        return this.objectCount;
    }

    public CreateBackendReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBackendReportResponseBody setSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }
    public Integer getSuccessCount() {
        return this.successCount;
    }

    public CreateBackendReportResponseBody setTargetCount(Integer targetCount) {
        this.targetCount = targetCount;
        return this;
    }
    public Integer getTargetCount() {
        return this.targetCount;
    }

    public CreateBackendReportResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class CreateBackendReportResponseBodyItemsTarget extends TeaModel {
        /**
         * <p>The SASE user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>su_1b91e674235a25e4117faf5c36a8ad4e69a14303247fb7d9f2046ce8b372****</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static CreateBackendReportResponseBodyItemsTarget build(java.util.Map<String, ?> map) throws Exception {
            CreateBackendReportResponseBodyItemsTarget self = new CreateBackendReportResponseBodyItemsTarget();
            return TeaModel.build(map, self);
        }

        public CreateBackendReportResponseBodyItemsTarget setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class CreateBackendReportResponseBodyItems extends TeaModel {
        /**
         * <p>The approval instance ID generated after a successful creation. This parameter is not returned if the creation fails.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-6b5188a28634****</p>
         */
        @NameInMap("ApprovalId")
        public String approvalId;

        /**
         * <p>The error code returned when the current combination fails to be created. This parameter is not returned if the creation succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>TargetNotFound</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The filing effective status. Enabled is returned when the creation succeeds, which indicates that the filing is valid.</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("EffectStatus")
        public String effectStatus;

        /**
         * <p>The error message returned when the current combination fails to be created. This parameter is not returned if the creation succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>target user is not found</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The filing object corresponding to the current combination. The fields vary based on the PolicyType value.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;ApplicationId&quot;:&quot;pa-application-92b60359213a****&quot;}]</p>
         */
        @NameInMap("ReportObject")
        public Object reportObject;

        /**
         * <p>The filing type. BackendReport is always returned when the creation succeeds, which indicates a backend filing.</p>
         * 
         * <strong>example:</strong>
         * <p>BackendReport</p>
         */
        @NameInMap("ReportType")
        public String reportType;

        /**
         * <p>The approval status. Approved is returned when the creation succeeds, which indicates that the filing is approved.</p>
         * 
         * <strong>example:</strong>
         * <p>Approved</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Indicates whether the current combination is created.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        /**
         * <p>The filing user corresponding to the current combination.</p>
         */
        @NameInMap("Target")
        public CreateBackendReportResponseBodyItemsTarget target;

        public static CreateBackendReportResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            CreateBackendReportResponseBodyItems self = new CreateBackendReportResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public CreateBackendReportResponseBodyItems setApprovalId(String approvalId) {
            this.approvalId = approvalId;
            return this;
        }
        public String getApprovalId() {
            return this.approvalId;
        }

        public CreateBackendReportResponseBodyItems setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateBackendReportResponseBodyItems setEffectStatus(String effectStatus) {
            this.effectStatus = effectStatus;
            return this;
        }
        public String getEffectStatus() {
            return this.effectStatus;
        }

        public CreateBackendReportResponseBodyItems setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateBackendReportResponseBodyItems setReportObject(Object reportObject) {
            this.reportObject = reportObject;
            return this;
        }
        public Object getReportObject() {
            return this.reportObject;
        }

        public CreateBackendReportResponseBodyItems setReportType(String reportType) {
            this.reportType = reportType;
            return this;
        }
        public String getReportType() {
            return this.reportType;
        }

        public CreateBackendReportResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateBackendReportResponseBodyItems setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public CreateBackendReportResponseBodyItems setTarget(CreateBackendReportResponseBodyItemsTarget target) {
            this.target = target;
            return this;
        }
        public CreateBackendReportResponseBodyItemsTarget getTarget() {
            return this.target;
        }

    }

}

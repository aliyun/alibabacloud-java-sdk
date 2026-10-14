// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeHistoryTasksResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial. This field is returned only when RAM authentication fails.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DescribeHistoryTasksResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The API status code or POP error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The task list.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeHistoryTasksResponseBodyItems> items;

    /**
     * <p>The additional information about the call result. Valid values:</p>
     * <ul>
     * <li>If the request is normal, <strong>Success</strong> is returned. </li>
     * <li>If the request is abnormal, a specific error code is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number of the query result.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E51713A3-BB45-5616-AB15-170B704F8F01</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Successful.</li>
     * <li><strong>false</strong>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeHistoryTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHistoryTasksResponseBody self = new DescribeHistoryTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHistoryTasksResponseBody setAccessDeniedDetail(DescribeHistoryTasksResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DescribeHistoryTasksResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeHistoryTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeHistoryTasksResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeHistoryTasksResponseBody setItems(java.util.List<DescribeHistoryTasksResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeHistoryTasksResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeHistoryTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeHistoryTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHistoryTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHistoryTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHistoryTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeHistoryTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeHistoryTasksResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The authentication action.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>The display name of the authorization principal.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <p>The Alibaba Cloud account ID of the authentication principal.</p>
         * 
         * <strong>example:</strong>
         * <p>141345906006****</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <p>The type of the authorization principal.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        /**
         * <p>The encoded diagnostic message.</p>
         * 
         * <strong>example:</strong>
         * <p>AQFmy+hZZsvoWTQ2NTJFQUFBLUIyNjktMzk5NS05MEZCLUMxMzgwNDUwMDA2Ng==</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <p>The type of the access policy denial. Valid values:</p>
         * <ul>
         * <li><strong>ImplicitDeny</strong>: The resource owner has not configured a relevant access policy for the current user, and unauthorized operations are denied by default.</li>
         * <li><strong>ExplicitDeny</strong>: The RAM policy configured by the resource owner explicitly denies the current user from accessing the corresponding resource.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ImplicitDeny</p>
         */
        @NameInMap("NoPermissionType")
        public String noPermissionType;

        /**
         * <p>The type of the policy that causes the permission denial. Valid values:</p>
         * <ul>
         * <li><strong>ControlPolicy</strong>: Control policy.</li>
         * <li><strong>SessionPolicy</strong>: Session policy, which is an additional permission policy added to a temporary token.</li>
         * <li><strong>AssumeRolePolicy</strong>: Assume role policy, which is the trust policy of a RAM role.</li>
         * <li><strong>AccountLevelIdentityBasedPolicy</strong>: Account-level identity-access policy, which includes custom policies and system policies.</li>
         * <li><strong>ResourceGroupLevelIdentityBasedPolicy</strong>: Resource group-level identity-access policy, which includes custom policies and system policies.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ControlPolicy</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static DescribeHistoryTasksResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeHistoryTasksResponseBodyAccessDeniedDetail self = new DescribeHistoryTasksResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DescribeHistoryTasksResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DescribeHistoryTasksResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DescribeHistoryTasksResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DescribeHistoryTasksResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DescribeHistoryTasksResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DescribeHistoryTasksResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DescribeHistoryTasksResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DescribeHistoryTasksResponseBodyItems extends TeaModel {
        /**
         * <p>The allowed operation information. When you use this parameter, the system matches the operation action based on the currentStepName and status in this information. If no action is matched, the current task status does not support the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;steps\&quot;:[{\&quot;action_info\&quot;:{\&quot;Waiting\&quot;:[\&quot;modifySwitchTime\&quot;]},\&quot;step_name\&quot;:\&quot;exec_task\&quot;}]}</p>
         */
        @NameInMap("ActionInfo")
        public String actionInfo;

        /**
         * <p>The ID of the requesting user. If callerSource is User, it represents the user UID.</p>
         * 
         * <strong>example:</strong>
         * <p>141345906006****</p>
         */
        @NameInMap("CallerSource")
        public String callerSource;

        /**
         * <p>The request source. Valid values:</p>
         * <ul>
         * <li><p><strong>System</strong>: System.</p>
         * </li>
         * <li><p><strong>User</strong>: User.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>User</p>
         */
        @NameInMap("CallerUid")
        public String callerUid;

        /**
         * <p>The name of the current step. If this parameter is empty, the task has not started.</p>
         * 
         * <strong>example:</strong>
         * <p>exec_task</p>
         */
        @NameInMap("CurrentStepName")
        public String currentStepName;

        /**
         * <p>The database type.</p>
         * 
         * <strong>example:</strong>
         * <p>analyticdb</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The end time of the task. The time is displayed in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-03T12:06:17Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-********</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The product.</p>
         * 
         * <strong>example:</strong>
         * <p>ads</p>
         */
        @NameInMap("Product")
        public String product;

        /**
         * <p>The current progress.</p>
         * 
         * <strong>example:</strong>
         * <p>79.0</p>
         */
        @NameInMap("Progress")
        public Float progress;

        /**
         * <p>The reason why the current task is initiated.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ReasonCode")
        public String reasonCode;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The estimated remaining execution time. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("RemainTime")
        public Integer remainTime;

        /**
         * <p>The start time of the task. The time is displayed in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-03T11:31:03Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li><p><strong>Scheduled</strong>: Pending execution.</p>
         * </li>
         * <li><p><strong>Running</strong>: Running.</p>
         * </li>
         * <li><p><strong>Succeed</strong>: Succeeded.</p>
         * </li>
         * <li><p><strong>Failed</strong>: Failed.</p>
         * </li>
         * <li><p><strong>Cancelling</strong>: Being canceled.</p>
         * </li>
         * <li><p><strong>Canceled</strong>: Canceled.</p>
         * </li>
         * <li><p><strong>Waiting</strong>: Waiting for the scheduled time.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The task details.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;callerUid\&quot;:\&quot;test\&quot;}</p>
         */
        @NameInMap("TaskDetail")
        public String taskDetail;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t-83br18hloy3faf****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The task type.</p>
         * 
         * <strong>example:</strong>
         * <p>autotest_dispatch_cases</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The ID of the user to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>141345906006****</p>
         */
        @NameInMap("Uid")
        public String uid;

        public static DescribeHistoryTasksResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeHistoryTasksResponseBodyItems self = new DescribeHistoryTasksResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeHistoryTasksResponseBodyItems setActionInfo(String actionInfo) {
            this.actionInfo = actionInfo;
            return this;
        }
        public String getActionInfo() {
            return this.actionInfo;
        }

        public DescribeHistoryTasksResponseBodyItems setCallerSource(String callerSource) {
            this.callerSource = callerSource;
            return this;
        }
        public String getCallerSource() {
            return this.callerSource;
        }

        public DescribeHistoryTasksResponseBodyItems setCallerUid(String callerUid) {
            this.callerUid = callerUid;
            return this;
        }
        public String getCallerUid() {
            return this.callerUid;
        }

        public DescribeHistoryTasksResponseBodyItems setCurrentStepName(String currentStepName) {
            this.currentStepName = currentStepName;
            return this;
        }
        public String getCurrentStepName() {
            return this.currentStepName;
        }

        public DescribeHistoryTasksResponseBodyItems setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DescribeHistoryTasksResponseBodyItems setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeHistoryTasksResponseBodyItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeHistoryTasksResponseBodyItems setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeHistoryTasksResponseBodyItems setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeHistoryTasksResponseBodyItems setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeHistoryTasksResponseBodyItems setProgress(Float progress) {
            this.progress = progress;
            return this;
        }
        public Float getProgress() {
            return this.progress;
        }

        public DescribeHistoryTasksResponseBodyItems setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

        public DescribeHistoryTasksResponseBodyItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeHistoryTasksResponseBodyItems setRemainTime(Integer remainTime) {
            this.remainTime = remainTime;
            return this;
        }
        public Integer getRemainTime() {
            return this.remainTime;
        }

        public DescribeHistoryTasksResponseBodyItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeHistoryTasksResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHistoryTasksResponseBodyItems setTaskDetail(String taskDetail) {
            this.taskDetail = taskDetail;
            return this;
        }
        public String getTaskDetail() {
            return this.taskDetail;
        }

        public DescribeHistoryTasksResponseBodyItems setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeHistoryTasksResponseBodyItems setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public DescribeHistoryTasksResponseBodyItems setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}

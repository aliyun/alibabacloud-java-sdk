// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListOperationAuditLogsResponseBody extends TeaModel {
    /**
     * <p>The list of administrator operation audit logs. The logs are sorted in descending order of operation time.</p>
     */
    @NameInMap("Logs")
    public java.util.List<ListOperationAuditLogsResponseBodyLogs> logs;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E9D4B681-0E79-57B7-AF0D-4A675D40141C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of logs that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("TotalNum")
    public Long totalNum;

    public static ListOperationAuditLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOperationAuditLogsResponseBody self = new ListOperationAuditLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOperationAuditLogsResponseBody setLogs(java.util.List<ListOperationAuditLogsResponseBodyLogs> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<ListOperationAuditLogsResponseBodyLogs> getLogs() {
        return this.logs;
    }

    public ListOperationAuditLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOperationAuditLogsResponseBody setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public static class ListOperationAuditLogsResponseBodyLogs extends TeaModel {
        /**
         * <p>The snapshot after the operation. It is recorded as-is by the audit framework and is not localized. This field is empty for historical logs that are not connected to the audit framework.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;RequestId&quot;:&quot;01A03244-5BAD-5FAA-93D6-E4F4A1A2****&quot;}</p>
         */
        @NameInMap("AfterAction")
        public String afterAction;

        /**
         * <p>The snapshot before the operation. It is recorded as-is by the audit framework and is not localized. This field is empty for historical logs that are not connected to the audit framework.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;pa-application-ea73352b4b75****&quot;</p>
         */
        @NameInMap("BeforeAction")
        public String beforeAction;

        /**
         * <p>The error code returned when the operation fails. This field is empty when the operation is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>ResourceNotFound</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned when the operation fails. This field is empty when the operation is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>the specified resource is not found</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The source type of the event. Valid values:</p>
         * <ul>
         * <li><strong>console</strong>: The event is triggered by a console call.</li>
         * <li><strong>sdk</strong>: The event is triggered by an SDK call.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>console</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The operation feature module. The return value is localized based on the request language.</p>
         * 
         * <strong>example:</strong>
         * <p>Office data protection</p>
         */
        @NameInMap("OperationFunc")
        public String operationFunc;

        /**
         * <p>The operation page. The return value is localized based on the request language.</p>
         * 
         * <strong>example:</strong>
         * <p>Peripheral management</p>
         */
        @NameInMap("OperationPage")
        public String operationPage;

        /**
         * <p>The operation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-24 13:38:06</p>
         */
        @NameInMap("OperationTime")
        public String operationTime;

        /**
         * <p>The operation type. The return value is localized based on the request language.</p>
         * 
         * <strong>example:</strong>
         * <p>Modify peripheral control policy</p>
         */
        @NameInMap("OperationType")
        public String operationType;

        /**
         * <p>The Alibaba Cloud account ID (AliUid) of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>1234****</p>
         */
        @NameInMap("OperatorId")
        public String operatorId;

        /**
         * <p>Indicates whether the operation was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static ListOperationAuditLogsResponseBodyLogs build(java.util.Map<String, ?> map) throws Exception {
            ListOperationAuditLogsResponseBodyLogs self = new ListOperationAuditLogsResponseBodyLogs();
            return TeaModel.build(map, self);
        }

        public ListOperationAuditLogsResponseBodyLogs setAfterAction(String afterAction) {
            this.afterAction = afterAction;
            return this;
        }
        public String getAfterAction() {
            return this.afterAction;
        }

        public ListOperationAuditLogsResponseBodyLogs setBeforeAction(String beforeAction) {
            this.beforeAction = beforeAction;
            return this;
        }
        public String getBeforeAction() {
            return this.beforeAction;
        }

        public ListOperationAuditLogsResponseBodyLogs setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListOperationAuditLogsResponseBodyLogs setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListOperationAuditLogsResponseBodyLogs setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public ListOperationAuditLogsResponseBodyLogs setOperationFunc(String operationFunc) {
            this.operationFunc = operationFunc;
            return this;
        }
        public String getOperationFunc() {
            return this.operationFunc;
        }

        public ListOperationAuditLogsResponseBodyLogs setOperationPage(String operationPage) {
            this.operationPage = operationPage;
            return this;
        }
        public String getOperationPage() {
            return this.operationPage;
        }

        public ListOperationAuditLogsResponseBodyLogs setOperationTime(String operationTime) {
            this.operationTime = operationTime;
            return this;
        }
        public String getOperationTime() {
            return this.operationTime;
        }

        public ListOperationAuditLogsResponseBodyLogs setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public ListOperationAuditLogsResponseBodyLogs setOperatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }
        public String getOperatorId() {
            return this.operatorId;
        }

        public ListOperationAuditLogsResponseBodyLogs setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}

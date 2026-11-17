// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateGatewayQuotaRuleSubjectUsageExportTaskResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;taskId&quot;: &quot;finops-export-abcdef1234567890&quot;,
     *   &quot;status&quot;: &quot;Pending&quot;
     * }</p>
     */
    @NameInMap("data")
    public CreateGatewayQuotaRuleSubjectUsageExportTaskResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID of this OpenAPI call, which is used to troubleshoot call issues. This is different from the request_id of each consumption record in the exported file.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateGatewayQuotaRuleSubjectUsageExportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayQuotaRuleSubjectUsageExportTaskResponseBody self = new CreateGatewayQuotaRuleSubjectUsageExportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGatewayQuotaRuleSubjectUsageExportTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateGatewayQuotaRuleSubjectUsageExportTaskResponseBody setData(CreateGatewayQuotaRuleSubjectUsageExportTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateGatewayQuotaRuleSubjectUsageExportTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateGatewayQuotaRuleSubjectUsageExportTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateGatewayQuotaRuleSubjectUsageExportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateGatewayQuotaRuleSubjectUsageExportTaskResponseBodyData extends TeaModel {
        /**
         * <p>The current status of create task.</p>
         * <ul>
         * <li>Pending: Create task is submitted and waiting to be processed.</li>
         * <li>Running: The system is querying details, generating the file, or uploading the file.</li>
         * <li>Success: The export is successful. Call the query operation to obtain the file information.</li>
         * <li>Failed: The export fails. Call the query operation to view the errorMessage.</li>
         * </ul>
         * <p>A newly created task returns Pending. When an existing task is reused through clientToken, the status of create task at that time is returned, which is not guaranteed to be Pending.</p>
         * 
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The ID of the export task. When you call GetGatewayQuotaRuleSubjectUsageExportTask, pass this value along with the gatewayId, ruleId, and subjectId from this request.</p>
         * 
         * <strong>example:</strong>
         * <p>finops-export-abcdef1234567890</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static CreateGatewayQuotaRuleSubjectUsageExportTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateGatewayQuotaRuleSubjectUsageExportTaskResponseBodyData self = new CreateGatewayQuotaRuleSubjectUsageExportTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateGatewayQuotaRuleSubjectUsageExportTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateGatewayQuotaRuleSubjectUsageExportTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateGatewayQuotaRuleSubjectUsageExportTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>{
     *   &quot;taskId&quot;: &quot;finops-export-abcdef1234567890&quot;,
     *   &quot;status&quot;: &quot;Pending&quot;
     * }</p>
     */
    @NameInMap("data")
    public CreateGatewayQuotaRuleSubjectUsageExportTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
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
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("status")
        public String status;

        /**
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

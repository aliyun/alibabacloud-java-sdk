// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetStreamOpsRecordResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The start or stop operation record of the real-time task. You can call the GetStreamOpsRecord operation to query the log content by using the log storage identifier in the list.</p>
     */
    @NameInMap("Data")
    public GetStreamOpsRecordResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The details of the backend response exception.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetStreamOpsRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStreamOpsRecordResponseBody self = new GetStreamOpsRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStreamOpsRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetStreamOpsRecordResponseBody setData(GetStreamOpsRecordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetStreamOpsRecordResponseBodyData getData() {
        return this.data;
    }

    public GetStreamOpsRecordResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetStreamOpsRecordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetStreamOpsRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStreamOpsRecordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetStreamOpsRecordResponseBodyData extends TeaModel {
        /**
         * <p>The deployment ID of the task. This ID is used to identify the deployment and is different from the specific running instance ID deploymentInstanceId.</p>
         * 
         * <strong>example:</strong>
         * <p>ac6e5a34bbd44d7f8b7851ef28c90d12</p>
         */
        @NameInMap("DeploymentId")
        public String deploymentId;

        /**
         * <p>The deployment instance ID associated with this operation. This ID corresponds to the DeploymentInstanceId request parameter in the log and TaskManager query operations.</p>
         * 
         * <strong>example:</strong>
         * <p>7db678957dc449aab0086b931c9f8218</p>
         */
        @NameInMap("DeploymentInstanceId")
        public String deploymentInstanceId;

        /**
         * <p>The end time of the operation. The time is in the yyyy-MM-dd HH:mm:ss format. If the operation has not ended, this parameter may be null.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-15 13:46:40</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The operation logs. In the ListStreamOpsRecords operation, this parameter may be a log storage identity. After you invoke the GetStreamOpsRecord operation, the log content or operation information is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-15 13:46:26 INFO Starting Flink deployment</p>
         */
        @NameInMap("LogContent")
        public String logContent;

        /**
         * <p>The operation type. Valid values: START, PAUSE, RESUME, and STOP. This parameter does not indicate the running status of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>START</p>
         */
        @NameInMap("Operate")
        public String operate;

        /**
         * <p>The ID of the operation record. This ID corresponds to the OpsRecordId request parameter in the GetStreamOpsRecord operation.</p>
         * 
         * <strong>example:</strong>
         * <p>646</p>
         */
        @NameInMap("OpsRecordId")
        public String opsRecordId;

        /**
         * <p>The start time of the operation. The time is in the yyyy-MM-dd HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-15 13:46:26</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static GetStreamOpsRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetStreamOpsRecordResponseBodyData self = new GetStreamOpsRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetStreamOpsRecordResponseBodyData setDeploymentId(String deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }
        public String getDeploymentId() {
            return this.deploymentId;
        }

        public GetStreamOpsRecordResponseBodyData setDeploymentInstanceId(String deploymentInstanceId) {
            this.deploymentInstanceId = deploymentInstanceId;
            return this;
        }
        public String getDeploymentInstanceId() {
            return this.deploymentInstanceId;
        }

        public GetStreamOpsRecordResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetStreamOpsRecordResponseBodyData setLogContent(String logContent) {
            this.logContent = logContent;
            return this;
        }
        public String getLogContent() {
            return this.logContent;
        }

        public GetStreamOpsRecordResponseBodyData setOperate(String operate) {
            this.operate = operate;
            return this;
        }
        public String getOperate() {
            return this.operate;
        }

        public GetStreamOpsRecordResponseBodyData setOpsRecordId(String opsRecordId) {
            this.opsRecordId = opsRecordId;
            return this;
        }
        public String getOpsRecordId() {
            return this.opsRecordId;
        }

        public GetStreamOpsRecordResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}

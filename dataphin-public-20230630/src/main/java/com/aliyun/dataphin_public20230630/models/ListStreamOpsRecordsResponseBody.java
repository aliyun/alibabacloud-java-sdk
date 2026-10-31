// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListStreamOpsRecordsResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The start and stop operation records of real-time tasks.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListStreamOpsRecordsResponseBodyData> data;

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

    public static ListStreamOpsRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStreamOpsRecordsResponseBody self = new ListStreamOpsRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStreamOpsRecordsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListStreamOpsRecordsResponseBody setData(java.util.List<ListStreamOpsRecordsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListStreamOpsRecordsResponseBodyData> getData() {
        return this.data;
    }

    public ListStreamOpsRecordsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListStreamOpsRecordsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListStreamOpsRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStreamOpsRecordsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListStreamOpsRecordsResponseBodyData extends TeaModel {
        /**
         * <p>deploymentId</p>
         * 
         * <strong>example:</strong>
         * <p>ac6e5a34bbd44d7f8b7851ef28c90d12</p>
         */
        @NameInMap("DeploymentId")
        public String deploymentId;

        /**
         * <p>deploymentInstanceId</p>
         * 
         * <strong>example:</strong>
         * <p>7db678957dc449aab0086b931c9f8218</p>
         */
        @NameInMap("DeploymentInstanceId")
        public String deploymentInstanceId;

        /**
         * <p>The end time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-15 13:46:40</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The log content.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-15 13:46:26 INFO Starting Flink deployment</p>
         */
        @NameInMap("LogContent")
        public String logContent;

        /**
         * <p>The instance status. Valid values: START, PAUSE, RESUME, and STOP. Displayed as Start, Pause, Recover, or Stop.</p>
         * 
         * <strong>example:</strong>
         * <p>START</p>
         */
        @NameInMap("Operate")
        public String operate;

        /**
         * <p>opsRecordId</p>
         * 
         * <strong>example:</strong>
         * <p>646</p>
         */
        @NameInMap("OpsRecordId")
        public String opsRecordId;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-15 13:46:26</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static ListStreamOpsRecordsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListStreamOpsRecordsResponseBodyData self = new ListStreamOpsRecordsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListStreamOpsRecordsResponseBodyData setDeploymentId(String deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }
        public String getDeploymentId() {
            return this.deploymentId;
        }

        public ListStreamOpsRecordsResponseBodyData setDeploymentInstanceId(String deploymentInstanceId) {
            this.deploymentInstanceId = deploymentInstanceId;
            return this;
        }
        public String getDeploymentInstanceId() {
            return this.deploymentInstanceId;
        }

        public ListStreamOpsRecordsResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListStreamOpsRecordsResponseBodyData setLogContent(String logContent) {
            this.logContent = logContent;
            return this;
        }
        public String getLogContent() {
            return this.logContent;
        }

        public ListStreamOpsRecordsResponseBodyData setOperate(String operate) {
            this.operate = operate;
            return this;
        }
        public String getOperate() {
            return this.operate;
        }

        public ListStreamOpsRecordsResponseBodyData setOpsRecordId(String opsRecordId) {
            this.opsRecordId = opsRecordId;
            return this;
        }
        public String getOpsRecordId() {
            return this.opsRecordId;
        }

        public ListStreamOpsRecordsResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}

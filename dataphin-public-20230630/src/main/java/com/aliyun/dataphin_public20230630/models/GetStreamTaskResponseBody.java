// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetStreamTaskResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The basic information and running information of the real-time task instance. The fileId can be used to subsequently query operation records and historical running instances.</p>
     */
    @NameInMap("Data")
    public GetStreamTaskResponseBodyData data;

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

    public static GetStreamTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStreamTaskResponseBody self = new GetStreamTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStreamTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetStreamTaskResponseBody setData(GetStreamTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetStreamTaskResponseBodyData getData() {
        return this.data;
    }

    public GetStreamTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetStreamTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetStreamTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStreamTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetStreamTaskResponseBodyData extends TeaModel {
        /**
         * <p>The time corresponding to the latest read position. The format is yyyy-MM-dd HH:mm:ss. If no consumption metrics are available, the value is null.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-15 13:45:52</p>
         */
        @NameInMap("ConsumeLocationDate")
        public String consumeLocationDate;

        /**
         * <p>The database engine version of the compute DPI engine used to run the node.</p>
         * 
         * <strong>example:</strong>
         * <p>1.15.3</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The ID of the task file. This corresponds to the FileId request parameter in ListStreamOpsRecords and ListStreamInstanceRecords. It is not a nodeId or a template file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7333610201479808</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>The name of the node to which the real-time task belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rt_mysql_doris</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the node. The ID starts with n_ and identifies a development node. It is different from the task file ID.</p>
         * 
         * <strong>example:</strong>
         * <p>n_8442437168737681408</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <p>The ID of the user who last operated the task.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        @NameInMap("OperatorId")
        public String operatorId;

        /**
         * <p>The display name of the user who last operated the task.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        @NameInMap("OperatorName")
        public String operatorName;

        /**
         * <p>The ID of the Dataphin project to which the task belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>7299592831043008</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The project mode. Valid values: BASIC for the basic mode, and DEV_PROD for the development-production isolation mode.</p>
         * 
         * <strong>example:</strong>
         * <p>BASIC</p>
         */
        @NameInMap("ProjectMode")
        public String projectMode;

        /**
         * <p>The name of the Dataphin project to which the task belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>flink_k8s</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The display information of the resource queue used by the task, including the queue name and ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Dedicated for real-time development (1052061)</p>
         */
        @NameInMap("ResourceQueue")
        public String resourceQueue;

        /**
         * <p>The running status of the task. The original TaskStatusEnum enumeration name is returned. Common real-time statuses include: STREAMING_STARTING (starting), STREAMING_RUNNING (running), STREAMING_PAUSING (pausing), STREAMING_PAUSED (paused), STREAMING_RESUMING (resuming), STREAMING_STOPPING (stopping), STREAMING_STOPPED (stopped), STREAMING_INIT (initial status), STREAMING_FAILED (running exception), STREAMING_START_FAILED (start exception), STREAMING_RESUME_FAILED (resume exception), and STREAMING_FINISHED (completed). Other known statuses also return the original enumeration name. If the status cannot be identified, UNKNOWN is returned. If the original status is empty, null is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>STREAMING_RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Instance ID of the real-time task instance. Instance ID starts with t_ and corresponds to the TaskId request parameter in GetStreamTask.</p>
         * 
         * <strong>example:</strong>
         * <p>t_8442437168737681408_20261014_8442447717177229312</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The type of the task, such as REAL_TIME_PIPELINE (real-time integration), FLINK_SQL (SQL task), FLINK_TEMPLATE_SQL (template task), and FLINK_DATASTREAM (DataStream task).</p>
         * 
         * <strong>example:</strong>
         * <p>REAL_TIME_PIPELINE</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetStreamTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetStreamTaskResponseBodyData self = new GetStreamTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetStreamTaskResponseBodyData setConsumeLocationDate(String consumeLocationDate) {
            this.consumeLocationDate = consumeLocationDate;
            return this;
        }
        public String getConsumeLocationDate() {
            return this.consumeLocationDate;
        }

        public GetStreamTaskResponseBodyData setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public GetStreamTaskResponseBodyData setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public GetStreamTaskResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetStreamTaskResponseBodyData setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetStreamTaskResponseBodyData setOperatorId(String operatorId) {
            this.operatorId = operatorId;
            return this;
        }
        public String getOperatorId() {
            return this.operatorId;
        }

        public GetStreamTaskResponseBodyData setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

        public GetStreamTaskResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetStreamTaskResponseBodyData setProjectMode(String projectMode) {
            this.projectMode = projectMode;
            return this;
        }
        public String getProjectMode() {
            return this.projectMode;
        }

        public GetStreamTaskResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetStreamTaskResponseBodyData setResourceQueue(String resourceQueue) {
            this.resourceQueue = resourceQueue;
            return this;
        }
        public String getResourceQueue() {
            return this.resourceQueue;
        }

        public GetStreamTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetStreamTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetStreamTaskResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class CreateDiagnosticTaskRequest extends TeaModel {
    /**
     * <p>The log information.</p>
     */
    @NameInMap("AiJobLogInfo")
    public CreateDiagnosticTaskRequestAiJobLogInfo aiJobLogInfo;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i118913031696573280136</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The diagnostics type.</p>
     * 
     * <strong>example:</strong>
     * <p>CheckByAiJobLogs</p>
     */
    @NameInMap("DiagnosticType")
    public String diagnosticType;

    /**
     * <p>The IDs of the nodes.</p>
     */
    @NameInMap("NodeIds")
    public java.util.List<String> nodeIds;

    public static CreateDiagnosticTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDiagnosticTaskRequest self = new CreateDiagnosticTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateDiagnosticTaskRequest setAiJobLogInfo(CreateDiagnosticTaskRequestAiJobLogInfo aiJobLogInfo) {
        this.aiJobLogInfo = aiJobLogInfo;
        return this;
    }
    public CreateDiagnosticTaskRequestAiJobLogInfo getAiJobLogInfo() {
        return this.aiJobLogInfo;
    }

    public CreateDiagnosticTaskRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateDiagnosticTaskRequest setDiagnosticType(String diagnosticType) {
        this.diagnosticType = diagnosticType;
        return this;
    }
    public String getDiagnosticType() {
        return this.diagnosticType;
    }

    public CreateDiagnosticTaskRequest setNodeIds(java.util.List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
    }

    public static class CreateDiagnosticTaskRequestAiJobLogInfoAiJobLogsLogs extends TeaModel {
        /**
         * <p>The sending date in the yyyymmdd format.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-05T10:10:01</p>
         */
        @NameInMap("Datetime")
        public String datetime;

        /**
         * <p>The log content.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("LogContent")
        public String logContent;

        public static CreateDiagnosticTaskRequestAiJobLogInfoAiJobLogsLogs build(java.util.Map<String, ?> map) throws Exception {
            CreateDiagnosticTaskRequestAiJobLogInfoAiJobLogsLogs self = new CreateDiagnosticTaskRequestAiJobLogInfoAiJobLogsLogs();
            return TeaModel.build(map, self);
        }

        public CreateDiagnosticTaskRequestAiJobLogInfoAiJobLogsLogs setDatetime(String datetime) {
            this.datetime = datetime;
            return this;
        }
        public String getDatetime() {
            return this.datetime;
        }

        public CreateDiagnosticTaskRequestAiJobLogInfoAiJobLogsLogs setLogContent(String logContent) {
            this.logContent = logContent;
            return this;
        }
        public String getLogContent() {
            return this.logContent;
        }

    }

    public static class CreateDiagnosticTaskRequestAiJobLogInfoAiJobLogs extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("AiInstance")
        public String aiInstance;

        /**
         * <p>The logs.</p>
         */
        @NameInMap("Logs")
        public java.util.List<CreateDiagnosticTaskRequestAiJobLogInfoAiJobLogsLogs> logs;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e01-tw-p2p2al5u1hn</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        public static CreateDiagnosticTaskRequestAiJobLogInfoAiJobLogs build(java.util.Map<String, ?> map) throws Exception {
            CreateDiagnosticTaskRequestAiJobLogInfoAiJobLogs self = new CreateDiagnosticTaskRequestAiJobLogInfoAiJobLogs();
            return TeaModel.build(map, self);
        }

        public CreateDiagnosticTaskRequestAiJobLogInfoAiJobLogs setAiInstance(String aiInstance) {
            this.aiInstance = aiInstance;
            return this;
        }
        public String getAiInstance() {
            return this.aiInstance;
        }

        public CreateDiagnosticTaskRequestAiJobLogInfoAiJobLogs setLogs(java.util.List<CreateDiagnosticTaskRequestAiJobLogInfoAiJobLogsLogs> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<CreateDiagnosticTaskRequestAiJobLogInfoAiJobLogsLogs> getLogs() {
            return this.logs;
        }

        public CreateDiagnosticTaskRequestAiJobLogInfoAiJobLogs setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

    }

    public static class CreateDiagnosticTaskRequestAiJobLogInfo extends TeaModel {
        /**
         * <p>The task logs.</p>
         */
        @NameInMap("AiJobLogs")
        public java.util.List<CreateDiagnosticTaskRequestAiJobLogInfoAiJobLogs> aiJobLogs;

        /**
         * <p>The end time. The value is in the timestamp format. Unit: seconds.</p>
         * <blockquote>
         * <p> This timestamp must indicate a point in time that is accurate to the minute.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2024-08-05T10:10:01</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The start time. The value is in the timestamp format. Unit: seconds.</p>
         * <blockquote>
         * <p> This timestamp must indicate a point in time that is accurate to the minute.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2024-10-11T00:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static CreateDiagnosticTaskRequestAiJobLogInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateDiagnosticTaskRequestAiJobLogInfo self = new CreateDiagnosticTaskRequestAiJobLogInfo();
            return TeaModel.build(map, self);
        }

        public CreateDiagnosticTaskRequestAiJobLogInfo setAiJobLogs(java.util.List<CreateDiagnosticTaskRequestAiJobLogInfoAiJobLogs> aiJobLogs) {
            this.aiJobLogs = aiJobLogs;
            return this;
        }
        public java.util.List<CreateDiagnosticTaskRequestAiJobLogInfoAiJobLogs> getAiJobLogs() {
            return this.aiJobLogs;
        }

        public CreateDiagnosticTaskRequestAiJobLogInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CreateDiagnosticTaskRequestAiJobLogInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}

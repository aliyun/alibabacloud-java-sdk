// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryIProductionJobResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("FinishTime")
    public String finishTime;

    @NameInMap("FunctionName")
    public String functionName;

    @NameInMap("Input")
    public QueryIProductionJobResponseBodyInput input;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("JobParams")
    public String jobParams;

    @NameInMap("Name")
    public String name;

    @NameInMap("Output")
    public QueryIProductionJobResponseBodyOutput output;

    @NameInMap("OutputFiles")
    public java.util.List<String> outputFiles;

    @NameInMap("OutputUrls")
    public java.util.List<String> outputUrls;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    @NameInMap("ScheduleConfig")
    public QueryIProductionJobResponseBodyScheduleConfig scheduleConfig;

    @NameInMap("Status")
    public String status;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("UserData")
    public String userData;

    public static QueryIProductionJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryIProductionJobResponseBody self = new QueryIProductionJobResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryIProductionJobResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public QueryIProductionJobResponseBody setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public String getFinishTime() {
        return this.finishTime;
    }

    public QueryIProductionJobResponseBody setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public QueryIProductionJobResponseBody setInput(QueryIProductionJobResponseBodyInput input) {
        this.input = input;
        return this;
    }
    public QueryIProductionJobResponseBodyInput getInput() {
        return this.input;
    }

    public QueryIProductionJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public QueryIProductionJobResponseBody setJobParams(String jobParams) {
        this.jobParams = jobParams;
        return this;
    }
    public String getJobParams() {
        return this.jobParams;
    }

    public QueryIProductionJobResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryIProductionJobResponseBody setOutput(QueryIProductionJobResponseBodyOutput output) {
        this.output = output;
        return this;
    }
    public QueryIProductionJobResponseBodyOutput getOutput() {
        return this.output;
    }

    public QueryIProductionJobResponseBody setOutputFiles(java.util.List<String> outputFiles) {
        this.outputFiles = outputFiles;
        return this;
    }
    public java.util.List<String> getOutputFiles() {
        return this.outputFiles;
    }

    public QueryIProductionJobResponseBody setOutputUrls(java.util.List<String> outputUrls) {
        this.outputUrls = outputUrls;
        return this;
    }
    public java.util.List<String> getOutputUrls() {
        return this.outputUrls;
    }

    public QueryIProductionJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryIProductionJobResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public QueryIProductionJobResponseBody setScheduleConfig(QueryIProductionJobResponseBodyScheduleConfig scheduleConfig) {
        this.scheduleConfig = scheduleConfig;
        return this;
    }
    public QueryIProductionJobResponseBodyScheduleConfig getScheduleConfig() {
        return this.scheduleConfig;
    }

    public QueryIProductionJobResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryIProductionJobResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public QueryIProductionJobResponseBody setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class QueryIProductionJobResponseBodyInput extends TeaModel {
        @NameInMap("Media")
        public String media;

        @NameInMap("Type")
        public String type;

        public static QueryIProductionJobResponseBodyInput build(java.util.Map<String, ?> map) throws Exception {
            QueryIProductionJobResponseBodyInput self = new QueryIProductionJobResponseBodyInput();
            return TeaModel.build(map, self);
        }

        public QueryIProductionJobResponseBodyInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public QueryIProductionJobResponseBodyInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryIProductionJobResponseBodyOutput extends TeaModel {
        @NameInMap("Media")
        public String media;

        @NameInMap("Type")
        public String type;

        public static QueryIProductionJobResponseBodyOutput build(java.util.Map<String, ?> map) throws Exception {
            QueryIProductionJobResponseBodyOutput self = new QueryIProductionJobResponseBodyOutput();
            return TeaModel.build(map, self);
        }

        public QueryIProductionJobResponseBodyOutput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public QueryIProductionJobResponseBodyOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryIProductionJobResponseBodyScheduleConfig extends TeaModel {
        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("Priority")
        public Integer priority;

        public static QueryIProductionJobResponseBodyScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryIProductionJobResponseBodyScheduleConfig self = new QueryIProductionJobResponseBodyScheduleConfig();
            return TeaModel.build(map, self);
        }

        public QueryIProductionJobResponseBodyScheduleConfig setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QueryIProductionJobResponseBodyScheduleConfig setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

}

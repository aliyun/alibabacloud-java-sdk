// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class GetJobResponseBody extends TeaModel {
    @NameInMap("JobInfo")
    public GetJobResponseBodyJobInfo jobInfo;

    /**
     * <strong>example:</strong>
     * <p>04F0****-1335-<strong><strong>-A1D7-6C044FE7</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobResponseBody self = new GetJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobResponseBody setJobInfo(GetJobResponseBodyJobInfo jobInfo) {
        this.jobInfo = jobInfo;
        return this;
    }
    public GetJobResponseBodyJobInfo getJobInfo() {
        return this.jobInfo;
    }

    public GetJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJobResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetJobResponseBodyJobInfoResources extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cores")
        public String cores;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Gpus")
        public String gpus;

        /**
         * <strong>example:</strong>
         * <p>1gb</p>
         */
        @NameInMap("Memory")
        public String memory;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Nodes")
        public String nodes;

        public static GetJobResponseBodyJobInfoResources build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobInfoResources self = new GetJobResponseBodyJobInfoResources();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobInfoResources setCores(String cores) {
            this.cores = cores;
            return this;
        }
        public String getCores() {
            return this.cores;
        }

        public GetJobResponseBodyJobInfoResources setGpus(String gpus) {
            this.gpus = gpus;
            return this;
        }
        public String getGpus() {
            return this.gpus;
        }

        public GetJobResponseBodyJobInfoResources setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public GetJobResponseBodyJobInfoResources setNodes(String nodes) {
            this.nodes = nodes;
            return this;
        }
        public String getNodes() {
            return this.nodes;
        }

    }

    public static class GetJobResponseBodyJobInfoResourcesUsed extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cores")
        public String cores;

        /**
         * <strong>example:</strong>
         * <p>512mb</p>
         */
        @NameInMap("Memory")
        public String memory;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Nodes")
        public String nodes;

        public static GetJobResponseBodyJobInfoResourcesUsed build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobInfoResourcesUsed self = new GetJobResponseBodyJobInfoResourcesUsed();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobInfoResourcesUsed setCores(String cores) {
            this.cores = cores;
            return this;
        }
        public String getCores() {
            return this.cores;
        }

        public GetJobResponseBodyJobInfoResourcesUsed setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public GetJobResponseBodyJobInfoResourcesUsed setNodes(String nodes) {
            this.nodes = nodes;
            return this;
        }
        public String getNodes() {
            return this.nodes;
        }

    }

    public static class GetJobResponseBodyJobInfoVariables extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ProxyIP</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>10.x.x.x</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetJobResponseBodyJobInfoVariables build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobInfoVariables self = new GetJobResponseBodyJobInfoVariables();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobInfoVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetJobResponseBodyJobInfoVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetJobResponseBodyJobInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ArrayJobId")
        public String arrayJobId;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ArrayJobSubId")
        public String arrayJobSubId;

        /**
         * <strong>example:</strong>
         * <p>1-5:2</p>
         */
        @NameInMap("ArrayRequest")
        public String arrayRequest;

        /**
         * <strong>example:</strong>
         * <p>/home/huangsf/ehpc/job_meta.pbs</p>
         */
        @NameInMap("CommandLine")
        public String commandLine;

        /**
         * <strong>example:</strong>
         * <p>2024-08-16T10:52:48</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>/home/xxx/STDIN.e1</p>
         */
        @NameInMap("ErrorLog")
        public String errorLog;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ExtraInfo")
        public String extraInfo;

        /**
         * <strong>example:</strong>
         * <p>1.manager</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>testJob</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <strong>example:</strong>
         * <p>workq</p>
         */
        @NameInMap("JobQueue")
        public String jobQueue;

        /**
         * <strong>example:</strong>
         * <p>2024-08-16T10:52:48</p>
         */
        @NameInMap("LastModifyTime")
        public String lastModifyTime;

        /**
         * <strong>example:</strong>
         * <p>compute000</p>
         */
        @NameInMap("NodeList")
        public String nodeList;

        /**
         * <strong>example:</strong>
         * <p>/home/xxx/STDIN.o1</p>
         */
        @NameInMap("OutputLog")
        public String outputLog;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Priority")
        public String priority;

        @NameInMap("Resources")
        public GetJobResponseBodyJobInfoResources resources;

        @NameInMap("ResourcesUsed")
        public GetJobResponseBodyJobInfoResourcesUsed resourcesUsed;

        /**
         * <strong>example:</strong>
         * <p>testuser</p>
         */
        @NameInMap("RunasUser")
        public String runasUser;

        /**
         * <strong>example:</strong>
         * <p>2024-08-16T10:52:48</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("State")
        public String state;

        @NameInMap("Variables")
        public java.util.List<GetJobResponseBodyJobInfoVariables> variables;

        public static GetJobResponseBodyJobInfo build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobInfo self = new GetJobResponseBodyJobInfo();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobInfo setArrayJobId(String arrayJobId) {
            this.arrayJobId = arrayJobId;
            return this;
        }
        public String getArrayJobId() {
            return this.arrayJobId;
        }

        public GetJobResponseBodyJobInfo setArrayJobSubId(String arrayJobSubId) {
            this.arrayJobSubId = arrayJobSubId;
            return this;
        }
        public String getArrayJobSubId() {
            return this.arrayJobSubId;
        }

        public GetJobResponseBodyJobInfo setArrayRequest(String arrayRequest) {
            this.arrayRequest = arrayRequest;
            return this;
        }
        public String getArrayRequest() {
            return this.arrayRequest;
        }

        public GetJobResponseBodyJobInfo setCommandLine(String commandLine) {
            this.commandLine = commandLine;
            return this;
        }
        public String getCommandLine() {
            return this.commandLine;
        }

        public GetJobResponseBodyJobInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetJobResponseBodyJobInfo setErrorLog(String errorLog) {
            this.errorLog = errorLog;
            return this;
        }
        public String getErrorLog() {
            return this.errorLog;
        }

        public GetJobResponseBodyJobInfo setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public GetJobResponseBodyJobInfo setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetJobResponseBodyJobInfo setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetJobResponseBodyJobInfo setJobQueue(String jobQueue) {
            this.jobQueue = jobQueue;
            return this;
        }
        public String getJobQueue() {
            return this.jobQueue;
        }

        public GetJobResponseBodyJobInfo setLastModifyTime(String lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }
        public String getLastModifyTime() {
            return this.lastModifyTime;
        }

        public GetJobResponseBodyJobInfo setNodeList(String nodeList) {
            this.nodeList = nodeList;
            return this;
        }
        public String getNodeList() {
            return this.nodeList;
        }

        public GetJobResponseBodyJobInfo setOutputLog(String outputLog) {
            this.outputLog = outputLog;
            return this;
        }
        public String getOutputLog() {
            return this.outputLog;
        }

        public GetJobResponseBodyJobInfo setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public GetJobResponseBodyJobInfo setResources(GetJobResponseBodyJobInfoResources resources) {
            this.resources = resources;
            return this;
        }
        public GetJobResponseBodyJobInfoResources getResources() {
            return this.resources;
        }

        public GetJobResponseBodyJobInfo setResourcesUsed(GetJobResponseBodyJobInfoResourcesUsed resourcesUsed) {
            this.resourcesUsed = resourcesUsed;
            return this;
        }
        public GetJobResponseBodyJobInfoResourcesUsed getResourcesUsed() {
            return this.resourcesUsed;
        }

        public GetJobResponseBodyJobInfo setRunasUser(String runasUser) {
            this.runasUser = runasUser;
            return this;
        }
        public String getRunasUser() {
            return this.runasUser;
        }

        public GetJobResponseBodyJobInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetJobResponseBodyJobInfo setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetJobResponseBodyJobInfo setVariables(java.util.List<GetJobResponseBodyJobInfoVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<GetJobResponseBodyJobInfoVariables> getVariables() {
            return this.variables;
        }

    }

}

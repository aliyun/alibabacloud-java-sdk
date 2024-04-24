// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class GetJobResponseBody extends TeaModel {
    @NameInMap("JobInfo")
    public GetJobResponseBodyJobInfo jobInfo;

    @NameInMap("RequestId")
    public String requestId;

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

    public static class GetJobResponseBodyJobInfoDeploymentPolicyNetwork extends TeaModel {
        @NameInMap("Vswitch")
        public java.util.List<String> vswitch;

        public static GetJobResponseBodyJobInfoDeploymentPolicyNetwork build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobInfoDeploymentPolicyNetwork self = new GetJobResponseBodyJobInfoDeploymentPolicyNetwork();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobInfoDeploymentPolicyNetwork setVswitch(java.util.List<String> vswitch) {
            this.vswitch = vswitch;
            return this;
        }
        public java.util.List<String> getVswitch() {
            return this.vswitch;
        }

    }

    public static class GetJobResponseBodyJobInfoDeploymentPolicy extends TeaModel {
        @NameInMap("AllocationSpec")
        public String allocationSpec;

        @NameInMap("Network")
        public GetJobResponseBodyJobInfoDeploymentPolicyNetwork network;

        public static GetJobResponseBodyJobInfoDeploymentPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobInfoDeploymentPolicy self = new GetJobResponseBodyJobInfoDeploymentPolicy();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobInfoDeploymentPolicy setAllocationSpec(String allocationSpec) {
            this.allocationSpec = allocationSpec;
            return this;
        }
        public String getAllocationSpec() {
            return this.allocationSpec;
        }

        public GetJobResponseBodyJobInfoDeploymentPolicy setNetwork(GetJobResponseBodyJobInfoDeploymentPolicyNetwork network) {
            this.network = network;
            return this;
        }
        public GetJobResponseBodyJobInfoDeploymentPolicyNetwork getNetwork() {
            return this.network;
        }

    }

    public static class GetJobResponseBodyJobInfoTasksExecutorPolicyArraySpec extends TeaModel {
        @NameInMap("IndexEnd")
        public Integer indexEnd;

        @NameInMap("IndexStart")
        public Integer indexStart;

        @NameInMap("IndexStep")
        public Integer indexStep;

        public static GetJobResponseBodyJobInfoTasksExecutorPolicyArraySpec build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobInfoTasksExecutorPolicyArraySpec self = new GetJobResponseBodyJobInfoTasksExecutorPolicyArraySpec();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobInfoTasksExecutorPolicyArraySpec setIndexEnd(Integer indexEnd) {
            this.indexEnd = indexEnd;
            return this;
        }
        public Integer getIndexEnd() {
            return this.indexEnd;
        }

        public GetJobResponseBodyJobInfoTasksExecutorPolicyArraySpec setIndexStart(Integer indexStart) {
            this.indexStart = indexStart;
            return this;
        }
        public Integer getIndexStart() {
            return this.indexStart;
        }

        public GetJobResponseBodyJobInfoTasksExecutorPolicyArraySpec setIndexStep(Integer indexStep) {
            this.indexStep = indexStep;
            return this;
        }
        public Integer getIndexStep() {
            return this.indexStep;
        }

    }

    public static class GetJobResponseBodyJobInfoTasksExecutorPolicy extends TeaModel {
        @NameInMap("ArraySpec")
        public GetJobResponseBodyJobInfoTasksExecutorPolicyArraySpec arraySpec;

        @NameInMap("MaxCount")
        public Integer maxCount;

        public static GetJobResponseBodyJobInfoTasksExecutorPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobInfoTasksExecutorPolicy self = new GetJobResponseBodyJobInfoTasksExecutorPolicy();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobInfoTasksExecutorPolicy setArraySpec(GetJobResponseBodyJobInfoTasksExecutorPolicyArraySpec arraySpec) {
            this.arraySpec = arraySpec;
            return this;
        }
        public GetJobResponseBodyJobInfoTasksExecutorPolicyArraySpec getArraySpec() {
            return this.arraySpec;
        }

        public GetJobResponseBodyJobInfoTasksExecutorPolicy setMaxCount(Integer maxCount) {
            this.maxCount = maxCount;
            return this;
        }
        public Integer getMaxCount() {
            return this.maxCount;
        }

    }

    public static class GetJobResponseBodyJobInfoTasksExecutorStatus extends TeaModel {
        @NameInMap("ArrayId")
        public Integer arrayId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusReason")
        public String statusReason;

        public static GetJobResponseBodyJobInfoTasksExecutorStatus build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobInfoTasksExecutorStatus self = new GetJobResponseBodyJobInfoTasksExecutorStatus();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobInfoTasksExecutorStatus setArrayId(Integer arrayId) {
            this.arrayId = arrayId;
            return this;
        }
        public Integer getArrayId() {
            return this.arrayId;
        }

        public GetJobResponseBodyJobInfoTasksExecutorStatus setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetJobResponseBodyJobInfoTasksExecutorStatus setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetJobResponseBodyJobInfoTasksExecutorStatus setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetJobResponseBodyJobInfoTasksExecutorStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetJobResponseBodyJobInfoTasksExecutorStatus setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

    }

    public static class GetJobResponseBodyJobInfoTasksTaskSpecResourceDisks extends TeaModel {
        @NameInMap("Size")
        public Integer size;

        @NameInMap("Type")
        public String type;

        public static GetJobResponseBodyJobInfoTasksTaskSpecResourceDisks build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobInfoTasksTaskSpecResourceDisks self = new GetJobResponseBodyJobInfoTasksTaskSpecResourceDisks();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobInfoTasksTaskSpecResourceDisks setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public GetJobResponseBodyJobInfoTasksTaskSpecResourceDisks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetJobResponseBodyJobInfoTasksTaskSpecResource extends TeaModel {
        @NameInMap("Cores")
        public Float cores;

        @NameInMap("Disks")
        public java.util.List<GetJobResponseBodyJobInfoTasksTaskSpecResourceDisks> disks;

        @NameInMap("Memory")
        public Integer memory;

        public static GetJobResponseBodyJobInfoTasksTaskSpecResource build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobInfoTasksTaskSpecResource self = new GetJobResponseBodyJobInfoTasksTaskSpecResource();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobInfoTasksTaskSpecResource setCores(Float cores) {
            this.cores = cores;
            return this;
        }
        public Float getCores() {
            return this.cores;
        }

        public GetJobResponseBodyJobInfoTasksTaskSpecResource setDisks(java.util.List<GetJobResponseBodyJobInfoTasksTaskSpecResourceDisks> disks) {
            this.disks = disks;
            return this;
        }
        public java.util.List<GetJobResponseBodyJobInfoTasksTaskSpecResourceDisks> getDisks() {
            return this.disks;
        }

        public GetJobResponseBodyJobInfoTasksTaskSpecResource setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

    }

    public static class GetJobResponseBodyJobInfoTasksTaskSpecTaskExecutorVM extends TeaModel {
        @NameInMap("Image")
        public String image;

        @NameInMap("PrologScript")
        public String prologScript;

        @NameInMap("Script")
        public String script;

        public static GetJobResponseBodyJobInfoTasksTaskSpecTaskExecutorVM build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobInfoTasksTaskSpecTaskExecutorVM self = new GetJobResponseBodyJobInfoTasksTaskSpecTaskExecutorVM();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobInfoTasksTaskSpecTaskExecutorVM setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public GetJobResponseBodyJobInfoTasksTaskSpecTaskExecutorVM setPrologScript(String prologScript) {
            this.prologScript = prologScript;
            return this;
        }
        public String getPrologScript() {
            return this.prologScript;
        }

        public GetJobResponseBodyJobInfoTasksTaskSpecTaskExecutorVM setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

    }

    public static class GetJobResponseBodyJobInfoTasksTaskSpecTaskExecutor extends TeaModel {
        @NameInMap("VM")
        public GetJobResponseBodyJobInfoTasksTaskSpecTaskExecutorVM VM;

        public static GetJobResponseBodyJobInfoTasksTaskSpecTaskExecutor build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobInfoTasksTaskSpecTaskExecutor self = new GetJobResponseBodyJobInfoTasksTaskSpecTaskExecutor();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobInfoTasksTaskSpecTaskExecutor setVM(GetJobResponseBodyJobInfoTasksTaskSpecTaskExecutorVM VM) {
            this.VM = VM;
            return this;
        }
        public GetJobResponseBodyJobInfoTasksTaskSpecTaskExecutorVM getVM() {
            return this.VM;
        }

    }

    public static class GetJobResponseBodyJobInfoTasksTaskSpec extends TeaModel {
        @NameInMap("Resource")
        public GetJobResponseBodyJobInfoTasksTaskSpecResource resource;

        @NameInMap("TaskExecutor")
        public java.util.List<GetJobResponseBodyJobInfoTasksTaskSpecTaskExecutor> taskExecutor;

        public static GetJobResponseBodyJobInfoTasksTaskSpec build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobInfoTasksTaskSpec self = new GetJobResponseBodyJobInfoTasksTaskSpec();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobInfoTasksTaskSpec setResource(GetJobResponseBodyJobInfoTasksTaskSpecResource resource) {
            this.resource = resource;
            return this;
        }
        public GetJobResponseBodyJobInfoTasksTaskSpecResource getResource() {
            return this.resource;
        }

        public GetJobResponseBodyJobInfoTasksTaskSpec setTaskExecutor(java.util.List<GetJobResponseBodyJobInfoTasksTaskSpecTaskExecutor> taskExecutor) {
            this.taskExecutor = taskExecutor;
            return this;
        }
        public java.util.List<GetJobResponseBodyJobInfoTasksTaskSpecTaskExecutor> getTaskExecutor() {
            return this.taskExecutor;
        }

    }

    public static class GetJobResponseBodyJobInfoTasks extends TeaModel {
        @NameInMap("ExecutorPolicy")
        public GetJobResponseBodyJobInfoTasksExecutorPolicy executorPolicy;

        @NameInMap("ExecutorStatus")
        public java.util.List<GetJobResponseBodyJobInfoTasksExecutorStatus> executorStatus;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TaskSpec")
        public GetJobResponseBodyJobInfoTasksTaskSpec taskSpec;

        @NameInMap("TaskSustainable")
        public Boolean taskSustainable;

        public static GetJobResponseBodyJobInfoTasks build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobInfoTasks self = new GetJobResponseBodyJobInfoTasks();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobInfoTasks setExecutorPolicy(GetJobResponseBodyJobInfoTasksExecutorPolicy executorPolicy) {
            this.executorPolicy = executorPolicy;
            return this;
        }
        public GetJobResponseBodyJobInfoTasksExecutorPolicy getExecutorPolicy() {
            return this.executorPolicy;
        }

        public GetJobResponseBodyJobInfoTasks setExecutorStatus(java.util.List<GetJobResponseBodyJobInfoTasksExecutorStatus> executorStatus) {
            this.executorStatus = executorStatus;
            return this;
        }
        public java.util.List<GetJobResponseBodyJobInfoTasksExecutorStatus> getExecutorStatus() {
            return this.executorStatus;
        }

        public GetJobResponseBodyJobInfoTasks setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public GetJobResponseBodyJobInfoTasks setTaskSpec(GetJobResponseBodyJobInfoTasksTaskSpec taskSpec) {
            this.taskSpec = taskSpec;
            return this;
        }
        public GetJobResponseBodyJobInfoTasksTaskSpec getTaskSpec() {
            return this.taskSpec;
        }

        public GetJobResponseBodyJobInfoTasks setTaskSustainable(Boolean taskSustainable) {
            this.taskSustainable = taskSustainable;
            return this;
        }
        public Boolean getTaskSustainable() {
            return this.taskSustainable;
        }

    }

    public static class GetJobResponseBodyJobInfo extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DeploymentPolicy")
        public GetJobResponseBodyJobInfoDeploymentPolicy deploymentPolicy;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("JobDescription")
        public String jobDescription;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tasks")
        public java.util.List<GetJobResponseBodyJobInfoTasks> tasks;

        public static GetJobResponseBodyJobInfo build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobInfo self = new GetJobResponseBodyJobInfo();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetJobResponseBodyJobInfo setDeploymentPolicy(GetJobResponseBodyJobInfoDeploymentPolicy deploymentPolicy) {
            this.deploymentPolicy = deploymentPolicy;
            return this;
        }
        public GetJobResponseBodyJobInfoDeploymentPolicy getDeploymentPolicy() {
            return this.deploymentPolicy;
        }

        public GetJobResponseBodyJobInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetJobResponseBodyJobInfo setJobDescription(String jobDescription) {
            this.jobDescription = jobDescription;
            return this;
        }
        public String getJobDescription() {
            return this.jobDescription;
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

        public GetJobResponseBodyJobInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetJobResponseBodyJobInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetJobResponseBodyJobInfo setTasks(java.util.List<GetJobResponseBodyJobInfoTasks> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<GetJobResponseBodyJobInfoTasks> getTasks() {
            return this.tasks;
        }

    }

}

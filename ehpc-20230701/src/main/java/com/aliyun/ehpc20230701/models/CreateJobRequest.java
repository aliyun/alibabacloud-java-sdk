// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20230701.models;

import com.aliyun.tea.*;

public class CreateJobRequest extends TeaModel {
    @NameInMap("DeploymentPolicy")
    public CreateJobRequestDeploymentPolicy deploymentPolicy;

    @NameInMap("JobDescription")
    public String jobDescription;

    @NameInMap("JobName")
    public String jobName;

    @NameInMap("Tasks")
    public java.util.List<CreateJobRequestTasks> tasks;

    public static CreateJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobRequest self = new CreateJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobRequest setDeploymentPolicy(CreateJobRequestDeploymentPolicy deploymentPolicy) {
        this.deploymentPolicy = deploymentPolicy;
        return this;
    }
    public CreateJobRequestDeploymentPolicy getDeploymentPolicy() {
        return this.deploymentPolicy;
    }

    public CreateJobRequest setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
        return this;
    }
    public String getJobDescription() {
        return this.jobDescription;
    }

    public CreateJobRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public CreateJobRequest setTasks(java.util.List<CreateJobRequestTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<CreateJobRequestTasks> getTasks() {
        return this.tasks;
    }

    public static class CreateJobRequestDeploymentPolicyNetwork extends TeaModel {
        @NameInMap("Vswitch")
        public java.util.List<String> vswitch;

        public static CreateJobRequestDeploymentPolicyNetwork build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestDeploymentPolicyNetwork self = new CreateJobRequestDeploymentPolicyNetwork();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestDeploymentPolicyNetwork setVswitch(java.util.List<String> vswitch) {
            this.vswitch = vswitch;
            return this;
        }
        public java.util.List<String> getVswitch() {
            return this.vswitch;
        }

    }

    public static class CreateJobRequestDeploymentPolicy extends TeaModel {
        @NameInMap("AllocationSpec")
        public String allocationSpec;

        @NameInMap("Network")
        public CreateJobRequestDeploymentPolicyNetwork network;

        public static CreateJobRequestDeploymentPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestDeploymentPolicy self = new CreateJobRequestDeploymentPolicy();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestDeploymentPolicy setAllocationSpec(String allocationSpec) {
            this.allocationSpec = allocationSpec;
            return this;
        }
        public String getAllocationSpec() {
            return this.allocationSpec;
        }

        public CreateJobRequestDeploymentPolicy setNetwork(CreateJobRequestDeploymentPolicyNetwork network) {
            this.network = network;
            return this;
        }
        public CreateJobRequestDeploymentPolicyNetwork getNetwork() {
            return this.network;
        }

    }

    public static class CreateJobRequestTasksExecutorPolicyArraySpec extends TeaModel {
        @NameInMap("IndexEnd")
        public Integer indexEnd;

        @NameInMap("IndexStart")
        public Integer indexStart;

        @NameInMap("IndexStep")
        public Integer indexStep;

        public static CreateJobRequestTasksExecutorPolicyArraySpec build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestTasksExecutorPolicyArraySpec self = new CreateJobRequestTasksExecutorPolicyArraySpec();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestTasksExecutorPolicyArraySpec setIndexEnd(Integer indexEnd) {
            this.indexEnd = indexEnd;
            return this;
        }
        public Integer getIndexEnd() {
            return this.indexEnd;
        }

        public CreateJobRequestTasksExecutorPolicyArraySpec setIndexStart(Integer indexStart) {
            this.indexStart = indexStart;
            return this;
        }
        public Integer getIndexStart() {
            return this.indexStart;
        }

        public CreateJobRequestTasksExecutorPolicyArraySpec setIndexStep(Integer indexStep) {
            this.indexStep = indexStep;
            return this;
        }
        public Integer getIndexStep() {
            return this.indexStep;
        }

    }

    public static class CreateJobRequestTasksExecutorPolicy extends TeaModel {
        @NameInMap("ArraySpec")
        public CreateJobRequestTasksExecutorPolicyArraySpec arraySpec;

        @NameInMap("MaxCount")
        public Integer maxCount;

        public static CreateJobRequestTasksExecutorPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestTasksExecutorPolicy self = new CreateJobRequestTasksExecutorPolicy();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestTasksExecutorPolicy setArraySpec(CreateJobRequestTasksExecutorPolicyArraySpec arraySpec) {
            this.arraySpec = arraySpec;
            return this;
        }
        public CreateJobRequestTasksExecutorPolicyArraySpec getArraySpec() {
            return this.arraySpec;
        }

        public CreateJobRequestTasksExecutorPolicy setMaxCount(Integer maxCount) {
            this.maxCount = maxCount;
            return this;
        }
        public Integer getMaxCount() {
            return this.maxCount;
        }

    }

    public static class CreateJobRequestTasksTaskSpecResourceDisks extends TeaModel {
        @NameInMap("Size")
        public Integer size;

        @NameInMap("Type")
        public String type;

        public static CreateJobRequestTasksTaskSpecResourceDisks build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestTasksTaskSpecResourceDisks self = new CreateJobRequestTasksTaskSpecResourceDisks();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestTasksTaskSpecResourceDisks setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public CreateJobRequestTasksTaskSpecResourceDisks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateJobRequestTasksTaskSpecResource extends TeaModel {
        @NameInMap("Cores")
        public Float cores;

        @NameInMap("Disks")
        public java.util.List<CreateJobRequestTasksTaskSpecResourceDisks> disks;

        @NameInMap("Memory")
        public Float memory;

        public static CreateJobRequestTasksTaskSpecResource build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestTasksTaskSpecResource self = new CreateJobRequestTasksTaskSpecResource();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestTasksTaskSpecResource setCores(Float cores) {
            this.cores = cores;
            return this;
        }
        public Float getCores() {
            return this.cores;
        }

        public CreateJobRequestTasksTaskSpecResource setDisks(java.util.List<CreateJobRequestTasksTaskSpecResourceDisks> disks) {
            this.disks = disks;
            return this;
        }
        public java.util.List<CreateJobRequestTasksTaskSpecResourceDisks> getDisks() {
            return this.disks;
        }

        public CreateJobRequestTasksTaskSpecResource setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

    }

    public static class CreateJobRequestTasksTaskSpecTaskExecutorVM extends TeaModel {
        @NameInMap("Image")
        public String image;

        @NameInMap("PrologScript")
        public String prologScript;

        @NameInMap("Script")
        public String script;

        public static CreateJobRequestTasksTaskSpecTaskExecutorVM build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestTasksTaskSpecTaskExecutorVM self = new CreateJobRequestTasksTaskSpecTaskExecutorVM();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestTasksTaskSpecTaskExecutorVM setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public CreateJobRequestTasksTaskSpecTaskExecutorVM setPrologScript(String prologScript) {
            this.prologScript = prologScript;
            return this;
        }
        public String getPrologScript() {
            return this.prologScript;
        }

        public CreateJobRequestTasksTaskSpecTaskExecutorVM setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

    }

    public static class CreateJobRequestTasksTaskSpecTaskExecutor extends TeaModel {
        @NameInMap("VM")
        public CreateJobRequestTasksTaskSpecTaskExecutorVM VM;

        public static CreateJobRequestTasksTaskSpecTaskExecutor build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestTasksTaskSpecTaskExecutor self = new CreateJobRequestTasksTaskSpecTaskExecutor();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestTasksTaskSpecTaskExecutor setVM(CreateJobRequestTasksTaskSpecTaskExecutorVM VM) {
            this.VM = VM;
            return this;
        }
        public CreateJobRequestTasksTaskSpecTaskExecutorVM getVM() {
            return this.VM;
        }

    }

    public static class CreateJobRequestTasksTaskSpec extends TeaModel {
        @NameInMap("Resource")
        public CreateJobRequestTasksTaskSpecResource resource;

        @NameInMap("TaskExecutor")
        public java.util.List<CreateJobRequestTasksTaskSpecTaskExecutor> taskExecutor;

        public static CreateJobRequestTasksTaskSpec build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestTasksTaskSpec self = new CreateJobRequestTasksTaskSpec();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestTasksTaskSpec setResource(CreateJobRequestTasksTaskSpecResource resource) {
            this.resource = resource;
            return this;
        }
        public CreateJobRequestTasksTaskSpecResource getResource() {
            return this.resource;
        }

        public CreateJobRequestTasksTaskSpec setTaskExecutor(java.util.List<CreateJobRequestTasksTaskSpecTaskExecutor> taskExecutor) {
            this.taskExecutor = taskExecutor;
            return this;
        }
        public java.util.List<CreateJobRequestTasksTaskSpecTaskExecutor> getTaskExecutor() {
            return this.taskExecutor;
        }

    }

    public static class CreateJobRequestTasks extends TeaModel {
        @NameInMap("ExecutorPolicy")
        public CreateJobRequestTasksExecutorPolicy executorPolicy;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TaskSpec")
        public CreateJobRequestTasksTaskSpec taskSpec;

        @NameInMap("TaskSustainable")
        public Boolean taskSustainable;

        public static CreateJobRequestTasks build(java.util.Map<String, ?> map) throws Exception {
            CreateJobRequestTasks self = new CreateJobRequestTasks();
            return TeaModel.build(map, self);
        }

        public CreateJobRequestTasks setExecutorPolicy(CreateJobRequestTasksExecutorPolicy executorPolicy) {
            this.executorPolicy = executorPolicy;
            return this;
        }
        public CreateJobRequestTasksExecutorPolicy getExecutorPolicy() {
            return this.executorPolicy;
        }

        public CreateJobRequestTasks setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public CreateJobRequestTasks setTaskSpec(CreateJobRequestTasksTaskSpec taskSpec) {
            this.taskSpec = taskSpec;
            return this;
        }
        public CreateJobRequestTasksTaskSpec getTaskSpec() {
            return this.taskSpec;
        }

        public CreateJobRequestTasks setTaskSustainable(Boolean taskSustainable) {
            this.taskSustainable = taskSustainable;
            return this;
        }
        public Boolean getTaskSustainable() {
            return this.taskSustainable;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class GetJobResponseBody extends TeaModel {
    /**
     * <p>The job details.</p>
     */
    @NameInMap("JobInfo")
    public GetJobResponseBodyJobInfo jobInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>896D338C-E4F4-41EC-A154-D605E5DE****</p>
     */
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

    public static class GetJobResponseBodyJobInfoDependencyPolicyJobDependency extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Type")
        public String type;

        public static GetJobResponseBodyJobInfoDependencyPolicyJobDependency build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobInfoDependencyPolicyJobDependency self = new GetJobResponseBodyJobInfoDependencyPolicyJobDependency();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobInfoDependencyPolicyJobDependency setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetJobResponseBodyJobInfoDependencyPolicyJobDependency setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetJobResponseBodyJobInfoDependencyPolicy extends TeaModel {
        @NameInMap("JobDependency")
        public java.util.List<GetJobResponseBodyJobInfoDependencyPolicyJobDependency> jobDependency;

        public static GetJobResponseBodyJobInfoDependencyPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobInfoDependencyPolicy self = new GetJobResponseBodyJobInfoDependencyPolicy();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobInfoDependencyPolicy setJobDependency(java.util.List<GetJobResponseBodyJobInfoDependencyPolicyJobDependency> jobDependency) {
            this.jobDependency = jobDependency;
            return this;
        }
        public java.util.List<GetJobResponseBodyJobInfoDependencyPolicyJobDependency> getJobDependency() {
            return this.jobDependency;
        }

    }

    public static class GetJobResponseBodyJobInfoDeploymentPolicyNetwork extends TeaModel {
        /**
         * <p>Whether the resource is created in the zone corresponding to the passed-in VSwitch parameter.</p>
         * <ul>
         * <li>true: The resource is created in the zone corresponding to the passed-in VSwitch parameter.</li>
         * <li>false: The resource is created in any zone that has resources.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableENIMapping")
        public Boolean enableENIMapping;

        /**
         * <p>Whether to create a public IP address.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>false: false.</li>
         * <li>true: true.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableExternalIpAddress")
        public Boolean enableExternalIpAddress;

        /**
         * <p>The VSwitch array.</p>
         */
        @NameInMap("Vswitch")
        public java.util.List<String> vswitch;

        public static GetJobResponseBodyJobInfoDeploymentPolicyNetwork build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobInfoDeploymentPolicyNetwork self = new GetJobResponseBodyJobInfoDeploymentPolicyNetwork();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobInfoDeploymentPolicyNetwork setEnableENIMapping(Boolean enableENIMapping) {
            this.enableENIMapping = enableENIMapping;
            return this;
        }
        public Boolean getEnableENIMapping() {
            return this.enableENIMapping;
        }

        public GetJobResponseBodyJobInfoDeploymentPolicyNetwork setEnableExternalIpAddress(Boolean enableExternalIpAddress) {
            this.enableExternalIpAddress = enableExternalIpAddress;
            return this;
        }
        public Boolean getEnableExternalIpAddress() {
            return this.enableExternalIpAddress;
        }

        public GetJobResponseBodyJobInfoDeploymentPolicyNetwork setVswitch(java.util.List<String> vswitch) {
            this.vswitch = vswitch;
            return this;
        }
        public java.util.List<String> getVswitch() {
            return this.vswitch;
        }

    }

    public static class GetJobResponseBodyJobInfoDeploymentPolicyTags extends TeaModel {
        /**
         * <p>The key of the job tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the job tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static GetJobResponseBodyJobInfoDeploymentPolicyTags build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobInfoDeploymentPolicyTags self = new GetJobResponseBodyJobInfoDeploymentPolicyTags();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobInfoDeploymentPolicyTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetJobResponseBodyJobInfoDeploymentPolicyTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetJobResponseBodyJobInfoDeploymentPolicy extends TeaModel {
        /**
         * <p>The type of the resource. Only Dedicated is supported. You must enable a whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>Dedicated</p>
         */
        @NameInMap("AllocationSpec")
        public String allocationSpec;

        /**
         * <p>The computing power level. The following disk categories are supported:</p>
         * <ul>
         * <li>General</li>
         * <li>Performance</li>
         * </ul>
         * <p>Default value: General</p>
         * 
         * <strong>example:</strong>
         * <p>General</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The network configuration information.</p>
         */
        @NameInMap("Network")
        public GetJobResponseBodyJobInfoDeploymentPolicyNetwork network;

        /**
         * <p>The list of job tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetJobResponseBodyJobInfoDeploymentPolicyTags> tags;

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

        public GetJobResponseBodyJobInfoDeploymentPolicy setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetJobResponseBodyJobInfoDeploymentPolicy setNetwork(GetJobResponseBodyJobInfoDeploymentPolicyNetwork network) {
            this.network = network;
            return this;
        }
        public GetJobResponseBodyJobInfoDeploymentPolicyNetwork getNetwork() {
            return this.network;
        }

        public GetJobResponseBodyJobInfoDeploymentPolicy setTags(java.util.List<GetJobResponseBodyJobInfoDeploymentPolicyTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetJobResponseBodyJobInfoDeploymentPolicyTags> getTags() {
            return this.tags;
        }

    }

    public static class GetJobResponseBodyJobInfoSecurityPolicySecurityGroup extends TeaModel {
        @NameInMap("SecurityGroupIds")
        public java.util.List<String> securityGroupIds;

        public static GetJobResponseBodyJobInfoSecurityPolicySecurityGroup build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobInfoSecurityPolicySecurityGroup self = new GetJobResponseBodyJobInfoSecurityPolicySecurityGroup();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobInfoSecurityPolicySecurityGroup setSecurityGroupIds(java.util.List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

    }

    public static class GetJobResponseBodyJobInfoSecurityPolicy extends TeaModel {
        @NameInMap("SecurityGroup")
        public GetJobResponseBodyJobInfoSecurityPolicySecurityGroup securityGroup;

        public static GetJobResponseBodyJobInfoSecurityPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobInfoSecurityPolicy self = new GetJobResponseBodyJobInfoSecurityPolicy();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobInfoSecurityPolicy setSecurityGroup(GetJobResponseBodyJobInfoSecurityPolicySecurityGroup securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public GetJobResponseBodyJobInfoSecurityPolicySecurityGroup getSecurityGroup() {
            return this.securityGroup;
        }

    }

    public static class GetJobResponseBodyJobInfoTasksExecutorPolicyArraySpec extends TeaModel {
        /**
         * <p>The end value of the array job index. Valid values: 0 to 4999. The value must be greater than or equal to the value of IndexStart.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("IndexEnd")
        public Integer indexEnd;

        /**
         * <p>The starting value of the array job index. Valid values: 0 to 4999.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IndexStart")
        public Integer indexStart;

        /**
         * <p>The interval of the array job index.</p>
         * <blockquote>
         * <p>If the array job property is IndexStart=1,IndexEnd=5, and IndexStep=2, the array job contains three subtasks. The values of the subtask indexes are 1,3, and 5.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <p>The details of the array job.</p>
         */
        @NameInMap("ArraySpec")
        public GetJobResponseBodyJobInfoTasksExecutorPolicyArraySpec arraySpec;

        /**
         * <p>The maximum number of nodes to run the job.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
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
        /**
         * <p>Sub-job ID</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ArrayId")
        public Integer arrayId;

        /**
         * <p>The time when the job was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-02-04 13:54:10</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The end time of the scaling plan job.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-02-04 13:54:10</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The start time of the scaling plan job.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-02-04 13:54:10</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The reason why the stack instance is in the OUTDATED state.</p>
         * 
         * <strong>example:</strong>
         * <p>Creating executor</p>
         */
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
        /**
         * <p>The size of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The type of the disk. The following disk categories are supported:</p>
         * <ul>
         * <li>System: system disk.</li>
         * <li>Data: data disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
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
        /**
         * <p>The number of CPUs on which the job is run.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cores")
        public Float cores;

        /**
         * <p>The array of the disks.</p>
         */
        @NameInMap("Disks")
        public java.util.List<GetJobResponseBodyJobInfoTasksTaskSpecResourceDisks> disks;

        @NameInMap("EnableHT")
        public Boolean enableHT;

        @NameInMap("HostNamePrefix")
        public String hostNamePrefix;

        @NameInMap("InstanceTypes")
        public java.util.List<String> instanceTypes;

        /**
         * <p>The memory capacity. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
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

        public GetJobResponseBodyJobInfoTasksTaskSpecResource setEnableHT(Boolean enableHT) {
            this.enableHT = enableHT;
            return this;
        }
        public Boolean getEnableHT() {
            return this.enableHT;
        }

        public GetJobResponseBodyJobInfoTasksTaskSpecResource setHostNamePrefix(String hostNamePrefix) {
            this.hostNamePrefix = hostNamePrefix;
            return this;
        }
        public String getHostNamePrefix() {
            return this.hostNamePrefix;
        }

        public GetJobResponseBodyJobInfoTasksTaskSpecResource setInstanceTypes(java.util.List<String> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

        public GetJobResponseBodyJobInfoTasksTaskSpecResource setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

    }

    public static class GetJobResponseBodyJobInfoTasksTaskSpecRetryPolicyExitCodeActions extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("ExitCode")
        public Long exitCode;

        public static GetJobResponseBodyJobInfoTasksTaskSpecRetryPolicyExitCodeActions build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobInfoTasksTaskSpecRetryPolicyExitCodeActions self = new GetJobResponseBodyJobInfoTasksTaskSpecRetryPolicyExitCodeActions();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobInfoTasksTaskSpecRetryPolicyExitCodeActions setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetJobResponseBodyJobInfoTasksTaskSpecRetryPolicyExitCodeActions setExitCode(Long exitCode) {
            this.exitCode = exitCode;
            return this;
        }
        public Long getExitCode() {
            return this.exitCode;
        }

    }

    public static class GetJobResponseBodyJobInfoTasksTaskSpecRetryPolicy extends TeaModel {
        @NameInMap("ExitCodeActions")
        public java.util.List<GetJobResponseBodyJobInfoTasksTaskSpecRetryPolicyExitCodeActions> exitCodeActions;

        @NameInMap("RetryCount")
        public Integer retryCount;

        public static GetJobResponseBodyJobInfoTasksTaskSpecRetryPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobInfoTasksTaskSpecRetryPolicy self = new GetJobResponseBodyJobInfoTasksTaskSpecRetryPolicy();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobInfoTasksTaskSpecRetryPolicy setExitCodeActions(java.util.List<GetJobResponseBodyJobInfoTasksTaskSpecRetryPolicyExitCodeActions> exitCodeActions) {
            this.exitCodeActions = exitCodeActions;
            return this;
        }
        public java.util.List<GetJobResponseBodyJobInfoTasksTaskSpecRetryPolicyExitCodeActions> getExitCodeActions() {
            return this.exitCodeActions;
        }

        public GetJobResponseBodyJobInfoTasksTaskSpecRetryPolicy setRetryCount(Integer retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Integer getRetryCount() {
            return this.retryCount;
        }

    }

    public static class GetJobResponseBodyJobInfoTasksTaskSpecTaskExecutorVM extends TeaModel {
        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>m-xxxx</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The pre-processing script. Base64 encoding is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ZWNobyAiMTIzNCIgPiBgZGF0ZSArJXNg</p>
         */
        @NameInMap("PrologScript")
        public String prologScript;

        /**
         * <p>The running-job script. Base64 encoding is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ZWNobyAiMTIzNCIgPiBgZGF0ZSArJXNg</p>
         */
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
        /**
         * <p>Use ECS instances.</p>
         */
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

    public static class GetJobResponseBodyJobInfoTasksTaskSpecVolumeMount extends TeaModel {
        @NameInMap("MountOptions")
        public String mountOptions;

        @NameInMap("MountPath")
        public String mountPath;

        @NameInMap("VolumeDriver")
        public String volumeDriver;

        public static GetJobResponseBodyJobInfoTasksTaskSpecVolumeMount build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobInfoTasksTaskSpecVolumeMount self = new GetJobResponseBodyJobInfoTasksTaskSpecVolumeMount();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobInfoTasksTaskSpecVolumeMount setMountOptions(String mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }
        public String getMountOptions() {
            return this.mountOptions;
        }

        public GetJobResponseBodyJobInfoTasksTaskSpecVolumeMount setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public GetJobResponseBodyJobInfoTasksTaskSpecVolumeMount setVolumeDriver(String volumeDriver) {
            this.volumeDriver = volumeDriver;
            return this;
        }
        public String getVolumeDriver() {
            return this.volumeDriver;
        }

    }

    public static class GetJobResponseBodyJobInfoTasksTaskSpec extends TeaModel {
        /**
         * <p>The resource information.</p>
         */
        @NameInMap("Resource")
        public GetJobResponseBodyJobInfoTasksTaskSpecResource resource;

        @NameInMap("RetryPolicy")
        public GetJobResponseBodyJobInfoTasksTaskSpecRetryPolicy retryPolicy;

        /**
         * <p>The task execution configurations.</p>
         */
        @NameInMap("TaskExecutor")
        public java.util.List<GetJobResponseBodyJobInfoTasksTaskSpecTaskExecutor> taskExecutor;

        @NameInMap("VolumeMount")
        public java.util.List<GetJobResponseBodyJobInfoTasksTaskSpecVolumeMount> volumeMount;

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

        public GetJobResponseBodyJobInfoTasksTaskSpec setRetryPolicy(GetJobResponseBodyJobInfoTasksTaskSpecRetryPolicy retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }
        public GetJobResponseBodyJobInfoTasksTaskSpecRetryPolicy getRetryPolicy() {
            return this.retryPolicy;
        }

        public GetJobResponseBodyJobInfoTasksTaskSpec setTaskExecutor(java.util.List<GetJobResponseBodyJobInfoTasksTaskSpecTaskExecutor> taskExecutor) {
            this.taskExecutor = taskExecutor;
            return this;
        }
        public java.util.List<GetJobResponseBodyJobInfoTasksTaskSpecTaskExecutor> getTaskExecutor() {
            return this.taskExecutor;
        }

        public GetJobResponseBodyJobInfoTasksTaskSpec setVolumeMount(java.util.List<GetJobResponseBodyJobInfoTasksTaskSpecVolumeMount> volumeMount) {
            this.volumeMount = volumeMount;
            return this;
        }
        public java.util.List<GetJobResponseBodyJobInfoTasksTaskSpecVolumeMount> getVolumeMount() {
            return this.volumeMount;
        }

    }

    public static class GetJobResponseBodyJobInfoTasks extends TeaModel {
        /**
         * <p>The task execution policy.</p>
         */
        @NameInMap("ExecutorPolicy")
        public GetJobResponseBodyJobInfoTasksExecutorPolicy executorPolicy;

        /**
         * <p>The execution status of the task.</p>
         */
        @NameInMap("ExecutorStatus")
        public java.util.List<GetJobResponseBodyJobInfoTasksExecutorStatus> executorStatus;

        /**
         * <p>The name of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>task0</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The details of the task specification.</p>
         */
        @NameInMap("TaskSpec")
        public GetJobResponseBodyJobInfoTasksTaskSpec taskSpec;

        /**
         * <p>Indicate whether the job is a long-running job.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
        /**
         * <p>The additional information about the application.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;xxx\&quot;: \&quot;xxxxx\&quot;}</p>
         */
        @NameInMap("AppExtraInfo")
        public String appExtraInfo;

        /**
         * <p>The time when the job was submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-05 20:00:46</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DependencyPolicy")
        public GetJobResponseBodyJobInfoDependencyPolicy dependencyPolicy;

        /**
         * <p>The resource deployment policy.</p>
         */
        @NameInMap("DeploymentPolicy")
        public GetJobResponseBodyJobInfoDeploymentPolicy deploymentPolicy;

        /**
         * <p>The time when the job is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-05 20:01:48</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The description of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>Demo</p>
         */
        @NameInMap("JobDescription")
        public String jobDescription;

        /**
         * <p>The ID of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>job-xxxx</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The job name.</p>
         * 
         * <strong>example:</strong>
         * <p>testJob</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <p>The type of the job scheduler.</p>
         * 
         * <strong>example:</strong>
         * <p>HPC</p>
         */
        @NameInMap("JobScheduler")
        public String jobScheduler;

        @NameInMap("SecurityPolicy")
        public GetJobResponseBodyJobInfoSecurityPolicy securityPolicy;

        /**
         * <p>The time when the job started.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-05 20:00:48</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The job status. Valid values:</p>
         * <ul>
         * <li>Pending: The job is being queued.</li>
         * <li>Initing: The job is being initialized.</li>
         * <li>Succeed: The job is successfully run.</li>
         * <li>Failed: The job failed to run.</li>
         * <li>Running: The job is running.</li>
         * <li>Exception: scheduling exception</li>
         * <li>Retrying: The job is being retried.</li>
         * <li>Expired: The job timed out.</li>
         * <li>Deleted: The job is deleted.</li>
         * <li>Suspended: job hibernation</li>
         * <li>Restarting: The job is being restarted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The list of tasks. Only one task is supported.</p>
         */
        @NameInMap("Tasks")
        public java.util.List<GetJobResponseBodyJobInfoTasks> tasks;

        public static GetJobResponseBodyJobInfo build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobInfo self = new GetJobResponseBodyJobInfo();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobInfo setAppExtraInfo(String appExtraInfo) {
            this.appExtraInfo = appExtraInfo;
            return this;
        }
        public String getAppExtraInfo() {
            return this.appExtraInfo;
        }

        public GetJobResponseBodyJobInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetJobResponseBodyJobInfo setDependencyPolicy(GetJobResponseBodyJobInfoDependencyPolicy dependencyPolicy) {
            this.dependencyPolicy = dependencyPolicy;
            return this;
        }
        public GetJobResponseBodyJobInfoDependencyPolicy getDependencyPolicy() {
            return this.dependencyPolicy;
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

        public GetJobResponseBodyJobInfo setJobScheduler(String jobScheduler) {
            this.jobScheduler = jobScheduler;
            return this;
        }
        public String getJobScheduler() {
            return this.jobScheduler;
        }

        public GetJobResponseBodyJobInfo setSecurityPolicy(GetJobResponseBodyJobInfoSecurityPolicy securityPolicy) {
            this.securityPolicy = securityPolicy;
            return this;
        }
        public GetJobResponseBodyJobInfoSecurityPolicy getSecurityPolicy() {
            return this.securityPolicy;
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

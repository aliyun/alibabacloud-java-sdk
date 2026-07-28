// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetJobResponseBody extends TeaModel {
    /**
     * <p>The job details.</p>
     */
    @NameInMap("job")
    public GetJobResponseBodyJob job;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1435C78A-AED9-53D6-B7A6-E2661D29B1FA</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobResponseBody self = new GetJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobResponseBody setJob(GetJobResponseBodyJob job) {
        this.job = job;
        return this;
    }
    public GetJobResponseBodyJob getJob() {
        return this.job;
    }

    public GetJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetJobResponseBodyJobAllParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>regionId</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("secret")
        public Boolean secret;

        /**
         * <strong>example:</strong>
         * <p>cn-zhangjiakou</p>
         */
        @NameInMap("value")
        public String value;

        public static GetJobResponseBodyJobAllParameters build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobAllParameters self = new GetJobResponseBodyJobAllParameters();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobAllParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetJobResponseBodyJobAllParameters setSecret(Boolean secret) {
            this.secret = secret;
            return this;
        }
        public Boolean getSecret() {
            return this.secret;
        }

        public GetJobResponseBodyJobAllParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetJobResponseBodyJobAssertCheckDetail extends TeaModel {
        /**
         * <p>The comparison operator. Valid values:</p>
         * <ul>
         * <li>eq: equal to</li>
         * <li>n_eq: not equal to</li>
         * <li>ctn: contains</li>
         * <li>n_ctn: does not contain</li>
         * <li>regex: regular expression match.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>eq</p>
         */
        @NameInMap("comparison")
        public String comparison;

        /**
         * <p>The expected value.</p>
         * 
         * <strong>example:</strong>
         * <p>期望值</p>
         */
        @NameInMap("expectedValue")
        public String expectedValue;

        /**
         * <p>Indicates whether the assertion check is passed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isPass")
        public Boolean isPass;

        /**
         * <p>The assertion type. Valid values:</p>
         * <ul>
         * <li>state: task status</li>
         * <li>result: execution result</li>
         * <li>resourceChange: resource change.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>result</p>
         */
        @NameInMap("type")
        public String type;

        public static GetJobResponseBodyJobAssertCheckDetail build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobAssertCheckDetail self = new GetJobResponseBodyJobAssertCheckDetail();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobAssertCheckDetail setComparison(String comparison) {
            this.comparison = comparison;
            return this;
        }
        public String getComparison() {
            return this.comparison;
        }

        public GetJobResponseBodyJobAssertCheckDetail setExpectedValue(String expectedValue) {
            this.expectedValue = expectedValue;
            return this;
        }
        public String getExpectedValue() {
            return this.expectedValue;
        }

        public GetJobResponseBodyJobAssertCheckDetail setIsPass(Boolean isPass) {
            this.isPass = isPass;
            return this;
        }
        public Boolean getIsPass() {
            return this.isPass;
        }

        public GetJobResponseBodyJobAssertCheckDetail setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetJobResponseBodyJobConfig extends TeaModel {
        /**
         * <p>Specifies whether to automatically execute the task.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("autoApply")
        public Boolean autoApply;

        /**
         * <p>Specifies whether compliance pre-check is performed for this job.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("hasConfigProactive")
        public String hasConfigProactive;

        /**
         * <p>Specifies whether to destroy resources.</p>
         * 
         * <strong>example:</strong>
         * <p>fales</p>
         */
        @NameInMap("isDestroy")
        public Boolean isDestroy;

        /**
         * <p>The template version.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("moduleVersion")
        public String moduleVersion;

        /**
         * <p>The resource change content.</p>
         * 
         * <strong>example:</strong>
         * <p>+0 ~0 -0</p>
         */
        @NameInMap("resourcesChanged")
        public String resourcesChanged;

        /**
         * <p>The operation command.</p>
         * 
         * <strong>example:</strong>
         * <p>destroy</p>
         */
        @NameInMap("subCommand")
        public String subCommand;

        public static GetJobResponseBodyJobConfig build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJobConfig self = new GetJobResponseBodyJobConfig();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJobConfig setAutoApply(Boolean autoApply) {
            this.autoApply = autoApply;
            return this;
        }
        public Boolean getAutoApply() {
            return this.autoApply;
        }

        public GetJobResponseBodyJobConfig setHasConfigProactive(String hasConfigProactive) {
            this.hasConfigProactive = hasConfigProactive;
            return this;
        }
        public String getHasConfigProactive() {
            return this.hasConfigProactive;
        }

        public GetJobResponseBodyJobConfig setIsDestroy(Boolean isDestroy) {
            this.isDestroy = isDestroy;
            return this;
        }
        public Boolean getIsDestroy() {
            return this.isDestroy;
        }

        public GetJobResponseBodyJobConfig setModuleVersion(String moduleVersion) {
            this.moduleVersion = moduleVersion;
            return this;
        }
        public String getModuleVersion() {
            return this.moduleVersion;
        }

        public GetJobResponseBodyJobConfig setResourcesChanged(String resourcesChanged) {
            this.resourcesChanged = resourcesChanged;
            return this;
        }
        public String getResourcesChanged() {
            return this.resourcesChanged;
        }

        public GetJobResponseBodyJobConfig setSubCommand(String subCommand) {
            this.subCommand = subCommand;
            return this;
        }
        public String getSubCommand() {
            return this.subCommand;
        }

    }

    public static class GetJobResponseBodyJob extends TeaModel {
        @NameInMap("allParameters")
        public java.util.List<GetJobResponseBodyJobAllParameters> allParameters;

        /**
         * <p>The list of assertion checks. This parameter applies to scenario-based testing tasks.</p>
         */
        @NameInMap("assertCheckDetail")
        public java.util.List<GetJobResponseBodyJobAssertCheckDetail> assertCheckDetail;

        /**
         * <p>The job configuration.</p>
         */
        @NameInMap("config")
        public GetJobResponseBodyJobConfig config;

        /**
         * <p>The time when the job was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-31T03:38:40Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The job description.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The download URL.</p>
         * 
         * <strong>example:</strong>
         * <p>url</p>
         */
        @NameInMap("downloadUrl")
        public java.util.Map<String, ?> downloadUrl;

        /**
         * <p>The execution duration.</p>
         * 
         * <strong>example:</strong>
         * <p>3s</p>
         */
        @NameInMap("elapsedTime")
        public Long elapsedTime;

        /**
         * <p>The execution type. Valid values:</p>
         * <ul>
         * <li>Manual: manual execution (default)</li>
         * <li>Auto: automatic execution.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        @NameInMap("executeType")
        public String executeType;

        /**
         * <p>Indicates whether the assertion check is passed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isPassAssertCheck")
        public Boolean isPassAssertCheck;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>job-518855d9a058cfff0dc933e6b5767</p>
         */
        @NameInMap("jobId")
        public String jobId;

        /**
         * <p>The job type.</p>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("jobType")
        public String jobType;

        /**
         * <p>The run logs. The following log content (key values) is currently supported:</p>
         * <ul>
         * <li><p>tf-init.run.error.log</p>
         * </li>
         * <li><p>tf-init.plan.log</p>
         * </li>
         * <li><p>tf-plan.run.log</p>
         * </li>
         * <li><p>tf-apply.run.log</p>
         * </li>
         * <li><p>tf-init.apply.log.</p>
         * </li>
         * </ul>
         */
        @NameInMap("logFile")
        public java.util.Map<String, ?> logFile;

        /**
         * <p>The job output.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("output")
        public String output;

        /**
         * <p>The change details of the Plan phase.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;formatVersion&quot;: &quot;1.2&quot;,
         *     &quot;terraformVersion&quot;: &quot;1.5.7&quot;,
         *     &quot;providerVersion&quot;: &quot;1.262.1&quot;,
         *     &quot;plannedValues&quot;: {
         *         &quot;root_module&quot;: {
         *         }
         *     },
         *     &quot;resourceChanges&quot;: [
         *         {
         *             &quot;address&quot;: &quot;alicloud_instance.uuid_ae98dda8_xxxxxxx&quot;,
         *             &quot;mode&quot;: &quot;managed&quot;,
         *             &quot;type&quot;: &quot;alicloud_instance&quot;,
         *             &quot;name&quot;: &quot;uuid_ae98dda8_xxxxxx&quot;,
         *             &quot;providerName&quot;: &quot;registry.terraform.io/aliyun/alicloud&quot;,
         *             &quot;change&quot;: {
         *                 &quot;actions&quot;: [
         *                     &quot;delete&quot;
         *                 ],
         *                 &quot;before&quot;: Object{...},
         *                 &quot;after_unknown&quot;: {
         *                 },
         *                 &quot;before_sensitive&quot;: Object{...},
         *                 &quot;after_sensitive&quot;: false
         *             },
         *             &quot;cloudSpecResourceCode&quot;: &quot;ACS::ECS::Instance&quot;
         *         }
         *     ],
         *     &quot;configuration&quot;: Object{...}
         * }</p>
         */
        @NameInMap("outputJsonPlan")
        public Object outputJsonPlan;

        /**
         * <p>The collection of parameters.</p>
         */
        @NameInMap("parameters")
        public java.util.Map<String, String> parameters;

        /**
         * <p>The job status. Valid values:</p>
         * <ul>
         * <li>Pending: the initial status after the job is created.</li>
         * <li>PlanQueued: the job is queued because no available worker is ready after the job is created.</li>
         * <li>Planning: the resource job is in the Plan phase.</li>
         * <li>ConfigProactiveInProgress: compliance pre-check is in progress. The compliance pre-check feature must be enabled for the account.</li>
         * <li>ConfigProactiveSuccess: compliance pre-check succeeded. The compliance pre-check feature must be enabled for the account.</li>
         * <li>Planned: the resource job has completed the Plan phase.</li>
         * <li>PlannedAndFinished: no diff is found after the Plan phase is completed. This is a final status.</li>
         * <li>Confirmed: the resource job is waiting for confirmation after the Plan phase is completed.</li>
         * <li>ApplyQueued: the job is queued because no available worker is ready during execution.</li>
         * <li>Applying: the resource job is in the Apply phase.</li>
         * <li>Applied: the resource job has completed the Apply phase. This is a final status.</li>
         * <li>Errored: the job execution encountered an error. This is a final status.</li>
         * <li>Canceled: the job execution was canceled. This is a final status.</li>
         * <li>Discarded: the plan of the resource job was discarded. This is a final status.</li>
         * <li>ConfigProactiveFailure: compliance pre-check failed. The compliance pre-check feature must be enabled for the account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Errored</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The job status details.</p>
         */
        @NameInMap("statusDetail")
        public java.util.Map<String, JobStatusDetailValue> statusDetail;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>task-3b6cb9fa4751a1b9b5f22cbcf4e</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li>Task: regular task (default)</li>
         * <li>SceneTestingTask: scenario-based testing task.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SceneTestingTask</p>
         */
        @NameInMap("taskType")
        public String taskType;

        /**
         * <p>The Terraform provider version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.230.0</p>
         */
        @NameInMap("terraformProviderVersion")
        public String terraformProviderVersion;

        public static GetJobResponseBodyJob build(java.util.Map<String, ?> map) throws Exception {
            GetJobResponseBodyJob self = new GetJobResponseBodyJob();
            return TeaModel.build(map, self);
        }

        public GetJobResponseBodyJob setAllParameters(java.util.List<GetJobResponseBodyJobAllParameters> allParameters) {
            this.allParameters = allParameters;
            return this;
        }
        public java.util.List<GetJobResponseBodyJobAllParameters> getAllParameters() {
            return this.allParameters;
        }

        public GetJobResponseBodyJob setAssertCheckDetail(java.util.List<GetJobResponseBodyJobAssertCheckDetail> assertCheckDetail) {
            this.assertCheckDetail = assertCheckDetail;
            return this;
        }
        public java.util.List<GetJobResponseBodyJobAssertCheckDetail> getAssertCheckDetail() {
            return this.assertCheckDetail;
        }

        public GetJobResponseBodyJob setConfig(GetJobResponseBodyJobConfig config) {
            this.config = config;
            return this;
        }
        public GetJobResponseBodyJobConfig getConfig() {
            return this.config;
        }

        public GetJobResponseBodyJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetJobResponseBodyJob setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetJobResponseBodyJob setDownloadUrl(java.util.Map<String, ?> downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public java.util.Map<String, ?> getDownloadUrl() {
            return this.downloadUrl;
        }

        public GetJobResponseBodyJob setElapsedTime(Long elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }
        public Long getElapsedTime() {
            return this.elapsedTime;
        }

        public GetJobResponseBodyJob setExecuteType(String executeType) {
            this.executeType = executeType;
            return this;
        }
        public String getExecuteType() {
            return this.executeType;
        }

        public GetJobResponseBodyJob setIsPassAssertCheck(Boolean isPassAssertCheck) {
            this.isPassAssertCheck = isPassAssertCheck;
            return this;
        }
        public Boolean getIsPassAssertCheck() {
            return this.isPassAssertCheck;
        }

        public GetJobResponseBodyJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetJobResponseBodyJob setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public GetJobResponseBodyJob setLogFile(java.util.Map<String, ?> logFile) {
            this.logFile = logFile;
            return this;
        }
        public java.util.Map<String, ?> getLogFile() {
            return this.logFile;
        }

        public GetJobResponseBodyJob setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public GetJobResponseBodyJob setOutputJsonPlan(Object outputJsonPlan) {
            this.outputJsonPlan = outputJsonPlan;
            return this;
        }
        public Object getOutputJsonPlan() {
            return this.outputJsonPlan;
        }

        public GetJobResponseBodyJob setParameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, String> getParameters() {
            return this.parameters;
        }

        public GetJobResponseBodyJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetJobResponseBodyJob setStatusDetail(java.util.Map<String, JobStatusDetailValue> statusDetail) {
            this.statusDetail = statusDetail;
            return this;
        }
        public java.util.Map<String, JobStatusDetailValue> getStatusDetail() {
            return this.statusDetail;
        }

        public GetJobResponseBodyJob setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetJobResponseBodyJob setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public GetJobResponseBodyJob setTerraformProviderVersion(String terraformProviderVersion) {
            this.terraformProviderVersion = terraformProviderVersion;
            return this;
        }
        public String getTerraformProviderVersion() {
            return this.terraformProviderVersion;
        }

    }

}

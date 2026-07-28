// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetStackDeploymentsResponseBody extends TeaModel {
    /**
     * <p>The deployment results of the stack.</p>
     */
    @NameInMap("deployments")
    public java.util.List<GetStackDeploymentsResponseBodyDeployments> deployments;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BF72A6FB-B071-5F2E-A036-9D62545B962C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static GetStackDeploymentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStackDeploymentsResponseBody self = new GetStackDeploymentsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStackDeploymentsResponseBody setDeployments(java.util.List<GetStackDeploymentsResponseBodyDeployments> deployments) {
        this.deployments = deployments;
        return this;
    }
    public java.util.List<GetStackDeploymentsResponseBodyDeployments> getDeployments() {
        return this.deployments;
    }

    public GetStackDeploymentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStackDeploymentsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class GetStackDeploymentsResponseBodyDeploymentsConfig extends TeaModel {
        /**
         * <p>Specifies whether to automatically execute the task. Default value: false. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: No.</li>
         * <li><strong>true</strong>: Yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("autoApply")
        public Boolean autoApply;

        /**
         * <p>Specifies whether this is a destroy job.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isDestroy")
        public Boolean isDestroy;

        public static GetStackDeploymentsResponseBodyDeploymentsConfig build(java.util.Map<String, ?> map) throws Exception {
            GetStackDeploymentsResponseBodyDeploymentsConfig self = new GetStackDeploymentsResponseBodyDeploymentsConfig();
            return TeaModel.build(map, self);
        }

        public GetStackDeploymentsResponseBodyDeploymentsConfig setAutoApply(Boolean autoApply) {
            this.autoApply = autoApply;
            return this;
        }
        public Boolean getAutoApply() {
            return this.autoApply;
        }

        public GetStackDeploymentsResponseBodyDeploymentsConfig setIsDestroy(Boolean isDestroy) {
            this.isDestroy = isDestroy;
            return this;
        }
        public Boolean getIsDestroy() {
            return this.isDestroy;
        }

    }

    public static class GetStackDeploymentsResponseBodyDeploymentsOutputs extends TeaModel {
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>The name of the SLS log project</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The expression, which can reference component outputs. Format: component.{component name}.{component output name}.</p>
         * 
         * <strong>example:</strong>
         * <p>component.sls.project_name</p>
         */
        @NameInMap("expression")
        public String expression;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>project_name</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The parameter type.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The actual value after the deployment is completed.</p>
         * 
         * <strong>example:</strong>
         * <p>log-project-xxxx</p>
         */
        @NameInMap("value")
        public String value;

        public static GetStackDeploymentsResponseBodyDeploymentsOutputs build(java.util.Map<String, ?> map) throws Exception {
            GetStackDeploymentsResponseBodyDeploymentsOutputs self = new GetStackDeploymentsResponseBodyDeploymentsOutputs();
            return TeaModel.build(map, self);
        }

        public GetStackDeploymentsResponseBodyDeploymentsOutputs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetStackDeploymentsResponseBodyDeploymentsOutputs setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public GetStackDeploymentsResponseBodyDeploymentsOutputs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetStackDeploymentsResponseBodyDeploymentsOutputs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetStackDeploymentsResponseBodyDeploymentsOutputs setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetStackDeploymentsResponseBodyDeploymentsParameters extends TeaModel {
        /**
         * <p>The default value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("defaultValue")
        public String defaultValue;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>region of the resource</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>region</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("sensitive")
        public Boolean sensitive;

        /**
         * <p>The parameter type.</p>
         * 
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-southeast-6</p>
         */
        @NameInMap("value")
        public String value;

        public static GetStackDeploymentsResponseBodyDeploymentsParameters build(java.util.Map<String, ?> map) throws Exception {
            GetStackDeploymentsResponseBodyDeploymentsParameters self = new GetStackDeploymentsResponseBodyDeploymentsParameters();
            return TeaModel.build(map, self);
        }

        public GetStackDeploymentsResponseBodyDeploymentsParameters setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetStackDeploymentsResponseBodyDeploymentsParameters setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetStackDeploymentsResponseBodyDeploymentsParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetStackDeploymentsResponseBodyDeploymentsParameters setSensitive(Boolean sensitive) {
            this.sensitive = sensitive;
            return this;
        }
        public Boolean getSensitive() {
            return this.sensitive;
        }

        public GetStackDeploymentsResponseBodyDeploymentsParameters setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetStackDeploymentsResponseBodyDeploymentsParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetStackDeploymentsResponseBodyDeploymentsPlanOutputsModuleActionDetail extends TeaModel {
        /**
         * <p>The number of resources to be created.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("add")
        public Integer add;

        /**
         * <p>The number of resources to be changed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("change")
        public Integer change;

        /**
         * <p>The number of resources to be destroyed.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("destroy")
        public Integer destroy;

        public static GetStackDeploymentsResponseBodyDeploymentsPlanOutputsModuleActionDetail build(java.util.Map<String, ?> map) throws Exception {
            GetStackDeploymentsResponseBodyDeploymentsPlanOutputsModuleActionDetail self = new GetStackDeploymentsResponseBodyDeploymentsPlanOutputsModuleActionDetail();
            return TeaModel.build(map, self);
        }

        public GetStackDeploymentsResponseBodyDeploymentsPlanOutputsModuleActionDetail setAdd(Integer add) {
            this.add = add;
            return this;
        }
        public Integer getAdd() {
            return this.add;
        }

        public GetStackDeploymentsResponseBodyDeploymentsPlanOutputsModuleActionDetail setChange(Integer change) {
            this.change = change;
            return this;
        }
        public Integer getChange() {
            return this.change;
        }

        public GetStackDeploymentsResponseBodyDeploymentsPlanOutputsModuleActionDetail setDestroy(Integer destroy) {
            this.destroy = destroy;
            return this;
        }
        public Integer getDestroy() {
            return this.destroy;
        }

    }

    public static class GetStackDeploymentsResponseBodyDeploymentsPlanOutputsResourceChanges extends TeaModel {
        /**
         * <p>The difference information of the resource change.</p>
         * 
         * <strong>example:</strong>
         * <p>~ resource \&quot;alicloud_log_store\&quot; \&quot;default\&quot; {\n        id                    = \&quot;alb-log-project-v1-ph-xxxxx:alb-log-store-ph\&quot;\n      ~ max_split_shard_count = 64 -&gt; 32\n        name                  = \&quot;alb-log-store-ph\&quot;\n\n        # (13 unchanged attributes hidden)\n    }</p>
         */
        @NameInMap("change")
        public String change;

        /**
         * <p>The types of resource change actions included in this resource change.</p>
         */
        @NameInMap("resourceActions")
        public java.util.List<String> resourceActions;

        /**
         * <p>The unique identifier of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>alicloud_log_store.default</p>
         */
        @NameInMap("resourceIdentifier")
        public String resourceIdentifier;

        public static GetStackDeploymentsResponseBodyDeploymentsPlanOutputsResourceChanges build(java.util.Map<String, ?> map) throws Exception {
            GetStackDeploymentsResponseBodyDeploymentsPlanOutputsResourceChanges self = new GetStackDeploymentsResponseBodyDeploymentsPlanOutputsResourceChanges();
            return TeaModel.build(map, self);
        }

        public GetStackDeploymentsResponseBodyDeploymentsPlanOutputsResourceChanges setChange(String change) {
            this.change = change;
            return this;
        }
        public String getChange() {
            return this.change;
        }

        public GetStackDeploymentsResponseBodyDeploymentsPlanOutputsResourceChanges setResourceActions(java.util.List<String> resourceActions) {
            this.resourceActions = resourceActions;
            return this;
        }
        public java.util.List<String> getResourceActions() {
            return this.resourceActions;
        }

        public GetStackDeploymentsResponseBodyDeploymentsPlanOutputsResourceChanges setResourceIdentifier(String resourceIdentifier) {
            this.resourceIdentifier = resourceIdentifier;
            return this;
        }
        public String getResourceIdentifier() {
            return this.resourceIdentifier;
        }

    }

    public static class GetStackDeploymentsResponseBodyDeploymentsPlanOutputs extends TeaModel {
        /**
         * <p>The change type of the component. Valid values:</p>
         * <ul>
         * <li>create: all resource changes in the component are additions.</li>
         * <li>delete: all resource changes in the component are deletions.</li>
         * <li>read: all resource changes in the component are read operations.</li>
         * <li>update: resource changes in the component include two or more types among additions, deletions, and read operations.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>update</p>
         */
        @NameInMap("moduleAction")
        public String moduleAction;

        /**
         * <p>The number of resources to be added, updated, and destroyed in this deployment.</p>
         */
        @NameInMap("moduleActionDetail")
        public GetStackDeploymentsResponseBodyDeploymentsPlanOutputsModuleActionDetail moduleActionDetail;

        /**
         * <p>The resource change information.</p>
         */
        @NameInMap("resourceChanges")
        public java.util.List<GetStackDeploymentsResponseBodyDeploymentsPlanOutputsResourceChanges> resourceChanges;

        /**
         * <p>The component name of the stack.</p>
         * 
         * <strong>example:</strong>
         * <p>sls</p>
         */
        @NameInMap("stackModuleName")
        public String stackModuleName;

        public static GetStackDeploymentsResponseBodyDeploymentsPlanOutputs build(java.util.Map<String, ?> map) throws Exception {
            GetStackDeploymentsResponseBodyDeploymentsPlanOutputs self = new GetStackDeploymentsResponseBodyDeploymentsPlanOutputs();
            return TeaModel.build(map, self);
        }

        public GetStackDeploymentsResponseBodyDeploymentsPlanOutputs setModuleAction(String moduleAction) {
            this.moduleAction = moduleAction;
            return this;
        }
        public String getModuleAction() {
            return this.moduleAction;
        }

        public GetStackDeploymentsResponseBodyDeploymentsPlanOutputs setModuleActionDetail(GetStackDeploymentsResponseBodyDeploymentsPlanOutputsModuleActionDetail moduleActionDetail) {
            this.moduleActionDetail = moduleActionDetail;
            return this;
        }
        public GetStackDeploymentsResponseBodyDeploymentsPlanOutputsModuleActionDetail getModuleActionDetail() {
            return this.moduleActionDetail;
        }

        public GetStackDeploymentsResponseBodyDeploymentsPlanOutputs setResourceChanges(java.util.List<GetStackDeploymentsResponseBodyDeploymentsPlanOutputsResourceChanges> resourceChanges) {
            this.resourceChanges = resourceChanges;
            return this;
        }
        public java.util.List<GetStackDeploymentsResponseBodyDeploymentsPlanOutputsResourceChanges> getResourceChanges() {
            return this.resourceChanges;
        }

        public GetStackDeploymentsResponseBodyDeploymentsPlanOutputs setStackModuleName(String stackModuleName) {
            this.stackModuleName = stackModuleName;
            return this;
        }
        public String getStackModuleName() {
            return this.stackModuleName;
        }

    }

    public static class GetStackDeploymentsResponseBodyDeployments extends TeaModel {
        /**
         * <p>The configuration item.</p>
         */
        @NameInMap("config")
        public GetStackDeploymentsResponseBodyDeploymentsConfig config;

        /**
         * <p>The configuration version, such as v1. The initial value is v1. The version number increments each time the stack is updated or refreshed and the configuration changes.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("configVersion")
        public String configVersion;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-01T12:10:18Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The deployment name.</p>
         * 
         * <strong>example:</strong>
         * <p>production</p>
         */
        @NameInMap("deploymentName")
        public String deploymentName;

        /**
         * <p>The deployment number. The deployment number of each stack starts from 1 and increments each time a deployment is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("deploymentNo")
        public String deploymentNo;

        /**
         * <p>Deprecated field.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("deploymentVersion")
        public String deploymentVersion;

        /**
         * <p>The execution duration, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>38000</p>
         */
        @NameInMap("elapsedTime")
        public Long elapsedTime;

        /**
         * <p>The execution type.</p>
         * <p>Manual: manual execution (default).</p>
         * <p>Auto: automatic execution.</p>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        @NameInMap("executeType")
        public String executeType;

        /**
         * <p>The failure reason.</p>
         * 
         * <strong>example:</strong>
         * <p>\n Error: Invalid value for input variable\n \n   on main.tf line 17, in module \&quot;alb\&quot;:\n   17:   log_project           = var.log_project.project_name\n \n The given value is not suitable for module.alb.var.log_project declared at\n modules/alb/main.tf:34,1-23: string required.\n╵\n</p>
         */
        @NameInMap("failedReason")
        public String failedReason;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>job-as154vldqt46mv0ixxxxx</p>
         */
        @NameInMap("jobId")
        public String jobId;

        /**
         * <p>The outputs.</p>
         */
        @NameInMap("outputs")
        public java.util.List<GetStackDeploymentsResponseBodyDeploymentsOutputs> outputs;

        /**
         * <p>The parameter set content.</p>
         */
        @NameInMap("parameters")
        public java.util.List<GetStackDeploymentsResponseBodyDeploymentsParameters> parameters;

        /**
         * <p>The state file output results.</p>
         */
        @NameInMap("planOutputs")
        public java.util.List<GetStackDeploymentsResponseBodyDeploymentsPlanOutputs> planOutputs;

        /**
         * <p>The deployment status.</p>
         * <table>
         * <thead>
         * <tr>
         * <th>Name</th>
         * <th>Description</th>
         * </tr>
         * </thead>
         * <tbody><tr>
         * <td>Pending</td>
         * <td>The initial status after a deployment is created.</td>
         * </tr>
         * <tr>
         * <td>PriorityQueued</td>
         * <td>The deployment is queued by priority.</td>
         * </tr>
         * <tr>
         * <td>PlanQueued</td>
         * <td>The deployment is queued because no workflow is available after the deployment is created.</td>
         * </tr>
         * <tr>
         * <td>ApplyQueued</td>
         * <td>The deployment is queued because no workflow is available during execution.</td>
         * </tr>
         * <tr>
         * <td>Planning</td>
         * <td>The resource deployment is in the Plan phase.</td>
         * </tr>
         * <tr>
         * <td>Planned</td>
         * <td>The resource deployment has completed the Plan phase.</td>
         * </tr>
         * <tr>
         * <td>ConfigProactiveInProgress</td>
         * <td>A compliance pre-check is in progress.</td>
         * </tr>
         * <tr>
         * <td>ConfigProactiveSuccess</td>
         * <td>The compliance pre-check succeeded.</td>
         * </tr>
         * <tr>
         * <td>DetectInProgress</td>
         * <td>Drift detection is in progress.</td>
         * </tr>
         * <tr>
         * <td>ImportQueued</td>
         * <td>The deployment is queued because no workflow is available during the Import phase.</td>
         * </tr>
         * <tr>
         * <td>Importing</td>
         * <td>The resource deployment is in the Import phase.</td>
         * </tr>
         * <tr>
         * <td>Imported</td>
         * <td>The resource deployment has completed the Import phase.</td>
         * </tr>
         * <tr>
         * <td>StateQueued</td>
         * <td>The deployment is queued because no workflow is available during the state command execution.</td>
         * </tr>
         * <tr>
         * <td>Stating</td>
         * <td>The resource deployment is executing the state command.</td>
         * </tr>
         * <tr>
         * <td>Stated</td>
         * <td>The resource deployment has completed the state command execution.</td>
         * </tr>
         * <tr>
         * <td>Confirmed</td>
         * <td>The resource deployment has been confirmed after the Plan phase.</td>
         * </tr>
         * <tr>
         * <td>PlannedAndFinished</td>
         * <td>No differences were found after the Plan phase. The deployment is in a final status.</td>
         * </tr>
         * <tr>
         * <td>Applying</td>
         * <td>The resource deployment is in the Apply phase.</td>
         * </tr>
         * <tr>
         * <td>Applied</td>
         * <td>The resource deployment has completed the Apply phase.</td>
         * </tr>
         * <tr>
         * <td>Discarded</td>
         * <td>The resource deployment has been discarded and is in a final status.</td>
         * </tr>
         * <tr>
         * <td>Errored</td>
         * <td>The deployment encountered an error and is in a final status.</td>
         * </tr>
         * <tr>
         * <td>ConfigProactiveFailure</td>
         * <td>The compliance pre-check failed.</td>
         * </tr>
         * <tr>
         * <td>Canceled</td>
         * <td>The deployment has been canceled and is in a final status.</td>
         * </tr>
         * </tbody></table>
         * 
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>task-as1d4vld8ogb2l32xxxxxx</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static GetStackDeploymentsResponseBodyDeployments build(java.util.Map<String, ?> map) throws Exception {
            GetStackDeploymentsResponseBodyDeployments self = new GetStackDeploymentsResponseBodyDeployments();
            return TeaModel.build(map, self);
        }

        public GetStackDeploymentsResponseBodyDeployments setConfig(GetStackDeploymentsResponseBodyDeploymentsConfig config) {
            this.config = config;
            return this;
        }
        public GetStackDeploymentsResponseBodyDeploymentsConfig getConfig() {
            return this.config;
        }

        public GetStackDeploymentsResponseBodyDeployments setConfigVersion(String configVersion) {
            this.configVersion = configVersion;
            return this;
        }
        public String getConfigVersion() {
            return this.configVersion;
        }

        public GetStackDeploymentsResponseBodyDeployments setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetStackDeploymentsResponseBodyDeployments setDeploymentName(String deploymentName) {
            this.deploymentName = deploymentName;
            return this;
        }
        public String getDeploymentName() {
            return this.deploymentName;
        }

        public GetStackDeploymentsResponseBodyDeployments setDeploymentNo(String deploymentNo) {
            this.deploymentNo = deploymentNo;
            return this;
        }
        public String getDeploymentNo() {
            return this.deploymentNo;
        }

        public GetStackDeploymentsResponseBodyDeployments setDeploymentVersion(String deploymentVersion) {
            this.deploymentVersion = deploymentVersion;
            return this;
        }
        public String getDeploymentVersion() {
            return this.deploymentVersion;
        }

        public GetStackDeploymentsResponseBodyDeployments setElapsedTime(Long elapsedTime) {
            this.elapsedTime = elapsedTime;
            return this;
        }
        public Long getElapsedTime() {
            return this.elapsedTime;
        }

        public GetStackDeploymentsResponseBodyDeployments setExecuteType(String executeType) {
            this.executeType = executeType;
            return this;
        }
        public String getExecuteType() {
            return this.executeType;
        }

        public GetStackDeploymentsResponseBodyDeployments setFailedReason(String failedReason) {
            this.failedReason = failedReason;
            return this;
        }
        public String getFailedReason() {
            return this.failedReason;
        }

        public GetStackDeploymentsResponseBodyDeployments setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetStackDeploymentsResponseBodyDeployments setOutputs(java.util.List<GetStackDeploymentsResponseBodyDeploymentsOutputs> outputs) {
            this.outputs = outputs;
            return this;
        }
        public java.util.List<GetStackDeploymentsResponseBodyDeploymentsOutputs> getOutputs() {
            return this.outputs;
        }

        public GetStackDeploymentsResponseBodyDeployments setParameters(java.util.List<GetStackDeploymentsResponseBodyDeploymentsParameters> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<GetStackDeploymentsResponseBodyDeploymentsParameters> getParameters() {
            return this.parameters;
        }

        public GetStackDeploymentsResponseBodyDeployments setPlanOutputs(java.util.List<GetStackDeploymentsResponseBodyDeploymentsPlanOutputs> planOutputs) {
            this.planOutputs = planOutputs;
            return this;
        }
        public java.util.List<GetStackDeploymentsResponseBodyDeploymentsPlanOutputs> getPlanOutputs() {
            return this.planOutputs;
        }

        public GetStackDeploymentsResponseBodyDeployments setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetStackDeploymentsResponseBodyDeployments setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}

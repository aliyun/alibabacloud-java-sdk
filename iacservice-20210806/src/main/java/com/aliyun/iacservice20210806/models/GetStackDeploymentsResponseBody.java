// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetStackDeploymentsResponseBody extends TeaModel {
    @NameInMap("deployments")
    public java.util.List<GetStackDeploymentsResponseBodyDeployments> deployments;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>BF72A6FB-B071-5F2E-A036-9D62545B962C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("autoApply")
        public Boolean autoApply;

        /**
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
         * <strong>example:</strong>
         * <p>The name of the SLS log project</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>component.sls.project_name</p>
         */
        @NameInMap("expression")
        public String expression;

        /**
         * <strong>example:</strong>
         * <p>project_name</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("type")
        public String type;

        /**
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
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("defaultValue")
        public String defaultValue;

        /**
         * <strong>example:</strong>
         * <p>region of the resource</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>region</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>string</p>
         */
        @NameInMap("type")
        public String type;

        /**
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
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("add")
        public Integer add;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("change")
        public Integer change;

        /**
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
         * <strong>example:</strong>
         * <p>~ resource \&quot;alicloud_log_store\&quot; \&quot;default\&quot; {\n        id                    = \&quot;alb-log-project-v1-ph-xxxxx:alb-log-store-ph\&quot;\n      ~ max_split_shard_count = 64 -&gt; 32\n        name                  = \&quot;alb-log-store-ph\&quot;\n\n        # (13 unchanged attributes hidden)\n    }</p>
         */
        @NameInMap("change")
        public String change;

        @NameInMap("resourceActions")
        public java.util.List<String> resourceActions;

        /**
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
         * <strong>example:</strong>
         * <p>update</p>
         */
        @NameInMap("moduleAction")
        public String moduleAction;

        @NameInMap("moduleActionDetail")
        public GetStackDeploymentsResponseBodyDeploymentsPlanOutputsModuleActionDetail moduleActionDetail;

        @NameInMap("resourceChanges")
        public java.util.List<GetStackDeploymentsResponseBodyDeploymentsPlanOutputsResourceChanges> resourceChanges;

        /**
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
        @NameInMap("config")
        public GetStackDeploymentsResponseBodyDeploymentsConfig config;

        /**
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("configVersion")
        public String configVersion;

        /**
         * <strong>example:</strong>
         * <p>2026-04-01T12:10:18Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>production</p>
         */
        @NameInMap("deploymentName")
        public String deploymentName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("deploymentNo")
        public String deploymentNo;

        /**
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("deploymentVersion")
        public String deploymentVersion;

        /**
         * <strong>example:</strong>
         * <p>38000</p>
         */
        @NameInMap("elapsedTime")
        public Long elapsedTime;

        /**
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        @NameInMap("executeType")
        public String executeType;

        /**
         * <strong>example:</strong>
         * <p>\n Error: Invalid value for input variable\n \n   on main.tf line 17, in module \&quot;alb\&quot;:\n   17:   log_project           = var.log_project.project_name\n \n The given value is not suitable for module.alb.var.log_project declared at\n modules/alb/main.tf:34,1-23: string required.\n╵\n</p>
         */
        @NameInMap("failedReason")
        public String failedReason;

        /**
         * <strong>example:</strong>
         * <p>job-as154vldqt46mv0ixxxxx</p>
         */
        @NameInMap("jobId")
        public String jobId;

        @NameInMap("outputs")
        public java.util.List<GetStackDeploymentsResponseBodyDeploymentsOutputs> outputs;

        @NameInMap("parameters")
        public java.util.List<GetStackDeploymentsResponseBodyDeploymentsParameters> parameters;

        @NameInMap("planOutputs")
        public java.util.List<GetStackDeploymentsResponseBodyDeploymentsPlanOutputs> planOutputs;

        /**
         * <strong>example:</strong>
         * <p>Pending</p>
         */
        @NameInMap("status")
        public String status;

        /**
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

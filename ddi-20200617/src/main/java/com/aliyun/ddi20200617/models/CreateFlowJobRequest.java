// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class CreateFlowJobRequest extends TeaModel {
    @NameInMap("Adhoc")
    public Boolean adhoc;

    @NameInMap("AlertConf")
    public String alertConf;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("CustomVariables")
    public String customVariables;

    @NameInMap("Description")
    public String description;

    @NameInMap("EnvConf")
    public String envConf;

    @NameInMap("FailAct")
    public String failAct;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("MonitorConf")
    public String monitorConf;

    @NameInMap("Name")
    public String name;

    @NameInMap("ParamConf")
    public String paramConf;

    @NameInMap("Params")
    public String params;

    @NameInMap("ParentCategory")
    public String parentCategory;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceList")
    public java.util.List<CreateFlowJobRequestResourceList> resourceList;

    @NameInMap("RetryPolicy")
    public String retryPolicy;

    @NameInMap("RunConf")
    public String runConf;

    @NameInMap("Type")
    public String type;

    public static CreateFlowJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowJobRequest self = new CreateFlowJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlowJobRequest setAdhoc(Boolean adhoc) {
        this.adhoc = adhoc;
        return this;
    }
    public Boolean getAdhoc() {
        return this.adhoc;
    }

    public CreateFlowJobRequest setAlertConf(String alertConf) {
        this.alertConf = alertConf;
        return this;
    }
    public String getAlertConf() {
        return this.alertConf;
    }

    public CreateFlowJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateFlowJobRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateFlowJobRequest setCustomVariables(String customVariables) {
        this.customVariables = customVariables;
        return this;
    }
    public String getCustomVariables() {
        return this.customVariables;
    }

    public CreateFlowJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateFlowJobRequest setEnvConf(String envConf) {
        this.envConf = envConf;
        return this;
    }
    public String getEnvConf() {
        return this.envConf;
    }

    public CreateFlowJobRequest setFailAct(String failAct) {
        this.failAct = failAct;
        return this;
    }
    public String getFailAct() {
        return this.failAct;
    }

    public CreateFlowJobRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public CreateFlowJobRequest setMonitorConf(String monitorConf) {
        this.monitorConf = monitorConf;
        return this;
    }
    public String getMonitorConf() {
        return this.monitorConf;
    }

    public CreateFlowJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateFlowJobRequest setParamConf(String paramConf) {
        this.paramConf = paramConf;
        return this;
    }
    public String getParamConf() {
        return this.paramConf;
    }

    public CreateFlowJobRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public CreateFlowJobRequest setParentCategory(String parentCategory) {
        this.parentCategory = parentCategory;
        return this;
    }
    public String getParentCategory() {
        return this.parentCategory;
    }

    public CreateFlowJobRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateFlowJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateFlowJobRequest setResourceList(java.util.List<CreateFlowJobRequestResourceList> resourceList) {
        this.resourceList = resourceList;
        return this;
    }
    public java.util.List<CreateFlowJobRequestResourceList> getResourceList() {
        return this.resourceList;
    }

    public CreateFlowJobRequest setRetryPolicy(String retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }
    public String getRetryPolicy() {
        return this.retryPolicy;
    }

    public CreateFlowJobRequest setRunConf(String runConf) {
        this.runConf = runConf;
        return this;
    }
    public String getRunConf() {
        return this.runConf;
    }

    public CreateFlowJobRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateFlowJobRequestResourceList extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("Path")
        public String path;

        public static CreateFlowJobRequestResourceList build(java.util.Map<String, ?> map) throws Exception {
            CreateFlowJobRequestResourceList self = new CreateFlowJobRequestResourceList();
            return TeaModel.build(map, self);
        }

        public CreateFlowJobRequestResourceList setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public CreateFlowJobRequestResourceList setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

}

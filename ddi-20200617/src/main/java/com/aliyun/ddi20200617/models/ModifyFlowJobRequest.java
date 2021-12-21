// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ModifyFlowJobRequest extends TeaModel {
    @NameInMap("AlertConf")
    public String alertConf;

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

    @NameInMap("Id")
    public String id;

    @NameInMap("KnoxPassword")
    public String knoxPassword;

    @NameInMap("KnoxUser")
    public String knoxUser;

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

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceList")
    public java.util.List<ModifyFlowJobRequestResourceList> resourceList;

    @NameInMap("RetryPolicy")
    public String retryPolicy;

    @NameInMap("RunConf")
    public String runConf;

    public static ModifyFlowJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFlowJobRequest self = new ModifyFlowJobRequest();
        return TeaModel.build(map, self);
    }

    public ModifyFlowJobRequest setAlertConf(String alertConf) {
        this.alertConf = alertConf;
        return this;
    }
    public String getAlertConf() {
        return this.alertConf;
    }

    public ModifyFlowJobRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyFlowJobRequest setCustomVariables(String customVariables) {
        this.customVariables = customVariables;
        return this;
    }
    public String getCustomVariables() {
        return this.customVariables;
    }

    public ModifyFlowJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyFlowJobRequest setEnvConf(String envConf) {
        this.envConf = envConf;
        return this;
    }
    public String getEnvConf() {
        return this.envConf;
    }

    public ModifyFlowJobRequest setFailAct(String failAct) {
        this.failAct = failAct;
        return this;
    }
    public String getFailAct() {
        return this.failAct;
    }

    public ModifyFlowJobRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyFlowJobRequest setKnoxPassword(String knoxPassword) {
        this.knoxPassword = knoxPassword;
        return this;
    }
    public String getKnoxPassword() {
        return this.knoxPassword;
    }

    public ModifyFlowJobRequest setKnoxUser(String knoxUser) {
        this.knoxUser = knoxUser;
        return this;
    }
    public String getKnoxUser() {
        return this.knoxUser;
    }

    public ModifyFlowJobRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ModifyFlowJobRequest setMonitorConf(String monitorConf) {
        this.monitorConf = monitorConf;
        return this;
    }
    public String getMonitorConf() {
        return this.monitorConf;
    }

    public ModifyFlowJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyFlowJobRequest setParamConf(String paramConf) {
        this.paramConf = paramConf;
        return this;
    }
    public String getParamConf() {
        return this.paramConf;
    }

    public ModifyFlowJobRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public ModifyFlowJobRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ModifyFlowJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyFlowJobRequest setResourceList(java.util.List<ModifyFlowJobRequestResourceList> resourceList) {
        this.resourceList = resourceList;
        return this;
    }
    public java.util.List<ModifyFlowJobRequestResourceList> getResourceList() {
        return this.resourceList;
    }

    public ModifyFlowJobRequest setRetryPolicy(String retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }
    public String getRetryPolicy() {
        return this.retryPolicy;
    }

    public ModifyFlowJobRequest setRunConf(String runConf) {
        this.runConf = runConf;
        return this;
    }
    public String getRunConf() {
        return this.runConf;
    }

    public static class ModifyFlowJobRequestResourceList extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("Path")
        public String path;

        public static ModifyFlowJobRequestResourceList build(java.util.Map<String, ?> map) throws Exception {
            ModifyFlowJobRequestResourceList self = new ModifyFlowJobRequestResourceList();
            return TeaModel.build(map, self);
        }

        public ModifyFlowJobRequestResourceList setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public ModifyFlowJobRequestResourceList setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

}

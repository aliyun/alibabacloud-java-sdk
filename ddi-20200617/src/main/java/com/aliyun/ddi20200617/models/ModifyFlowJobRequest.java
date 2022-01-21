// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ModifyFlowJobRequest extends TeaModel {
    // 保留参数。
    @NameInMap("AlertConf")
    public String alertConf;

    // 集群ID。您可以调用ListClusters查看集群的ID。
    @NameInMap("ClusterId")
    public String clusterId;

    // 自定义变量。
    @NameInMap("CustomVariables")
    public String customVariables;

    // 修改后的作业描述。
    @NameInMap("Description")
    public String description;

    // 环境变量设置。
    @NameInMap("EnvConf")
    public String envConf;

    // 失败策略，可能的取值：CONTINUE（提过本次作业），STOP（停止作业）
    @NameInMap("FailAct")
    public String failAct;

    // 需要修改的作业的ID。
    @NameInMap("Id")
    public String id;

    // Knox的用户密码，执行Zeppelin Notebook时必须提供。
    @NameInMap("KnoxPassword")
    public String knoxPassword;

    // Knox的用户名，执行Zeppelin Notebook时必须提供。
    @NameInMap("KnoxUser")
    public String knoxUser;

    // 模型模式，取值如下：  YARN：将作业包装成一个Launcher提交至YARN中执行，LOCAL：作业直接在机器上以进程方式运行。
    @NameInMap("Mode")
    public String mode;

    // 监控配置，仅SPARK_STREAMING类型作业支持监控配置。
    @NameInMap("MonitorConf")
    public String monitorConf;

    // 修改后的作业名称。
    @NameInMap("Name")
    public String name;

    // 参数设置。
    @NameInMap("ParamConf")
    public String paramConf;

    // 作业内容。如果是spark作业，该参数的内容会作为spark-submit的参数。
    @NameInMap("Params")
    public String params;

    // 项目ID。您可以调用ListFlowProject查看项目的ID。
    @NameInMap("ProjectId")
    public String projectId;

    // 地域ID。您可以调用DescribeRegions查看最新的阿里云地域列表。
    @NameInMap("RegionId")
    public String regionId;

    // 保留参数。
    @NameInMap("ResourceList")
    public java.util.List<ModifyFlowJobRequestResourceList> resourceList;

    // 重试策略，保留参数。
    @NameInMap("RetryPolicy")
    public String retryPolicy;

    // 运行配置，取值如下：priority（优先级），userName（任务的Linux提交用户），memory（内存，单位为MB），cores（核数）
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
        // 保留参数。
        @NameInMap("Alias")
        public String alias;

        // 保留参数。
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

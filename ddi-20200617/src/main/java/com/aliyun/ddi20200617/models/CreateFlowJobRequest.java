// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class CreateFlowJobRequest extends TeaModel {
    // 是否临时查询。
    @NameInMap("Adhoc")
    public Boolean adhoc;

    // 保留参数。
    @NameInMap("AlertConf")
    public String alertConf;

    // 保留参数。
    @NameInMap("ClientToken")
    public String clientToken;

    // 集群ID。您可以调用ListClusters查看集群的ID。
    @NameInMap("ClusterId")
    public String clusterId;

    // 自定义变量。
    @NameInMap("CustomVariables")
    public String customVariables;

    // 作业的描述。
    @NameInMap("Description")
    public String description;

    // 环境变量设置。
    @NameInMap("EnvConf")
    public String envConf;

    // 失败策略，可能的取值：CONTINUE（提过本次作业），STOP（停止作业）
    @NameInMap("FailAct")
    public String failAct;

    // 模型模式，取值如下：  YARN：将作业包装成一个Launcher提交至YARN中执行，LOCAL：作业直接在机器上以进程方式运行。
    @NameInMap("Mode")
    public String mode;

    // 监控配置，仅SPARK_STREAMING类型作业支持监控配置。
    @NameInMap("MonitorConf")
    public String monitorConf;

    // 作业的名称。
    @NameInMap("Name")
    public String name;

    // 参数设置。
    @NameInMap("ParamConf")
    public String paramConf;

    // 作业内容。
    @NameInMap("Params")
    public String params;

    // 父目录ID。您可以调用DescribeFlowCategory查看。
    @NameInMap("ParentCategory")
    public String parentCategory;

    // 项目ID。您可以调用ListFlowProject查看项目的ID。
    @NameInMap("ProjectId")
    public String projectId;

    // 地域ID。您可以调用DescribeRegions查看最新的阿里云地域列表。
    @NameInMap("RegionId")
    public String regionId;

    // 保留参数。
    @NameInMap("ResourceList")
    public java.util.List<CreateFlowJobRequestResourceList> resourceList;

    // 重试策略，保留参数。
    @NameInMap("RetryPolicy")
    public String retryPolicy;

    // 运行配置，取值如下：priority（优先级），userName（任务的Linux提交用户），memory（内存，单位为MB），cores（核数）
    @NameInMap("RunConf")
    public String runConf;

    // 作业的类型，可能的取值有：SPARK，SPARK_STREAMING，ZEPPELIN
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
        // 保留参数。
        @NameInMap("Alias")
        public String alias;

        // 保留参数。
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

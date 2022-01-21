// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeFlowJobResponseBody extends TeaModel {
    // 是否临时查询。
    @NameInMap("Adhoc")
    public String adhoc;

    // 报警配置。
    @NameInMap("AlertConf")
    public String alertConf;

    // 作业所在目录ID。
    @NameInMap("CategoryId")
    public String categoryId;

    // 自定义变量。
    @NameInMap("CustomVariables")
    public String customVariables;

    // 作业的描述。
    @NameInMap("Description")
    public String description;

    // 保留参数。
    @NameInMap("EditLockDetail")
    public String editLockDetail;

    // 环境变量设置。
    @NameInMap("EnvConf")
    public String envConf;

    // 失败策略，可能的取值：CONTINUE（提过本次作业），STOP（停止作业）
    @NameInMap("FailAct")
    public String failAct;

    // 创建时间。
    @NameInMap("GmtCreate")
    public Long gmtCreate;

    // 最后修改时间。
    @NameInMap("GmtModified")
    public Long gmtModified;

    // 作业ID。
    @NameInMap("Id")
    public String id;

    // Knox的用户密码，执行Zeppelin Notebook时必须提供。
    @NameInMap("KnoxPassword")
    public String knoxPassword;

    // Knox的用户名，执行Zeppelin Notebook时必须提供。
    @NameInMap("KnoxUser")
    public String knoxUser;

    // 最后一次执行的实例ID。
    @NameInMap("LastInstanceId")
    public String lastInstanceId;

    // 最大重试次数。
    @NameInMap("MaxRetry")
    public Integer maxRetry;

    // 保留参数。
    @NameInMap("MaxRunningTimeSec")
    public Long maxRunningTimeSec;

    // 模型模式，取值如下：  YARN：将作业包装成一个Launcher提交至YARN中执行，LOCAL：作业直接在机器上以进程方式运行。
    @NameInMap("Mode")
    public String mode;

    // 监控配置，仅SPARK_STREAMING类型作业支持监控配置。
    @NameInMap("MonitorConf")
    public String monitorConf;

    // 作业名称。
    @NameInMap("Name")
    public String name;

    // 参数设置。
    @NameInMap("ParamConf")
    public String paramConf;

    // 作业内容。
    @NameInMap("Params")
    public String params;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceList")
    public DescribeFlowJobResponseBodyResourceList resourceList;

    // 重试间隔 0~300（秒）。
    @NameInMap("RetryInterval")
    public Long retryInterval;

    // 重试策略，保留参数。
    @NameInMap("RetryPolicy")
    public String retryPolicy;

    // 运行配置，取值如下：priority（优先级），userName（任务的Linux提交用户），memory（内存，单位为MB），cores（核数）
    @NameInMap("RunConf")
    public String runConf;

    // 作业的类型，可能的取值有：SPARK，SPARK_STREAMING，ZEPPELIN
    @NameInMap("Type")
    public String type;

    public static DescribeFlowJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowJobResponseBody self = new DescribeFlowJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlowJobResponseBody setAdhoc(String adhoc) {
        this.adhoc = adhoc;
        return this;
    }
    public String getAdhoc() {
        return this.adhoc;
    }

    public DescribeFlowJobResponseBody setAlertConf(String alertConf) {
        this.alertConf = alertConf;
        return this;
    }
    public String getAlertConf() {
        return this.alertConf;
    }

    public DescribeFlowJobResponseBody setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public DescribeFlowJobResponseBody setCustomVariables(String customVariables) {
        this.customVariables = customVariables;
        return this;
    }
    public String getCustomVariables() {
        return this.customVariables;
    }

    public DescribeFlowJobResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeFlowJobResponseBody setEditLockDetail(String editLockDetail) {
        this.editLockDetail = editLockDetail;
        return this;
    }
    public String getEditLockDetail() {
        return this.editLockDetail;
    }

    public DescribeFlowJobResponseBody setEnvConf(String envConf) {
        this.envConf = envConf;
        return this;
    }
    public String getEnvConf() {
        return this.envConf;
    }

    public DescribeFlowJobResponseBody setFailAct(String failAct) {
        this.failAct = failAct;
        return this;
    }
    public String getFailAct() {
        return this.failAct;
    }

    public DescribeFlowJobResponseBody setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public DescribeFlowJobResponseBody setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public DescribeFlowJobResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeFlowJobResponseBody setKnoxPassword(String knoxPassword) {
        this.knoxPassword = knoxPassword;
        return this;
    }
    public String getKnoxPassword() {
        return this.knoxPassword;
    }

    public DescribeFlowJobResponseBody setKnoxUser(String knoxUser) {
        this.knoxUser = knoxUser;
        return this;
    }
    public String getKnoxUser() {
        return this.knoxUser;
    }

    public DescribeFlowJobResponseBody setLastInstanceId(String lastInstanceId) {
        this.lastInstanceId = lastInstanceId;
        return this;
    }
    public String getLastInstanceId() {
        return this.lastInstanceId;
    }

    public DescribeFlowJobResponseBody setMaxRetry(Integer maxRetry) {
        this.maxRetry = maxRetry;
        return this;
    }
    public Integer getMaxRetry() {
        return this.maxRetry;
    }

    public DescribeFlowJobResponseBody setMaxRunningTimeSec(Long maxRunningTimeSec) {
        this.maxRunningTimeSec = maxRunningTimeSec;
        return this;
    }
    public Long getMaxRunningTimeSec() {
        return this.maxRunningTimeSec;
    }

    public DescribeFlowJobResponseBody setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public DescribeFlowJobResponseBody setMonitorConf(String monitorConf) {
        this.monitorConf = monitorConf;
        return this;
    }
    public String getMonitorConf() {
        return this.monitorConf;
    }

    public DescribeFlowJobResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeFlowJobResponseBody setParamConf(String paramConf) {
        this.paramConf = paramConf;
        return this;
    }
    public String getParamConf() {
        return this.paramConf;
    }

    public DescribeFlowJobResponseBody setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public DescribeFlowJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlowJobResponseBody setResourceList(DescribeFlowJobResponseBodyResourceList resourceList) {
        this.resourceList = resourceList;
        return this;
    }
    public DescribeFlowJobResponseBodyResourceList getResourceList() {
        return this.resourceList;
    }

    public DescribeFlowJobResponseBody setRetryInterval(Long retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }
    public Long getRetryInterval() {
        return this.retryInterval;
    }

    public DescribeFlowJobResponseBody setRetryPolicy(String retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }
    public String getRetryPolicy() {
        return this.retryPolicy;
    }

    public DescribeFlowJobResponseBody setRunConf(String runConf) {
        this.runConf = runConf;
        return this;
    }
    public String getRunConf() {
        return this.runConf;
    }

    public DescribeFlowJobResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class DescribeFlowJobResponseBodyResourceListResource extends TeaModel {
        // 保留参数。
        @NameInMap("Alias")
        public String alias;

        // 保留参数。
        @NameInMap("Path")
        public String path;

        public static DescribeFlowJobResponseBodyResourceListResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowJobResponseBodyResourceListResource self = new DescribeFlowJobResponseBodyResourceListResource();
            return TeaModel.build(map, self);
        }

        public DescribeFlowJobResponseBodyResourceListResource setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public DescribeFlowJobResponseBodyResourceListResource setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class DescribeFlowJobResponseBodyResourceList extends TeaModel {
        @NameInMap("Resource")
        public java.util.List<DescribeFlowJobResponseBodyResourceListResource> resource;

        public static DescribeFlowJobResponseBodyResourceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowJobResponseBodyResourceList self = new DescribeFlowJobResponseBodyResourceList();
            return TeaModel.build(map, self);
        }

        public DescribeFlowJobResponseBodyResourceList setResource(java.util.List<DescribeFlowJobResponseBodyResourceListResource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<DescribeFlowJobResponseBodyResourceListResource> getResource() {
            return this.resource;
        }

    }

}

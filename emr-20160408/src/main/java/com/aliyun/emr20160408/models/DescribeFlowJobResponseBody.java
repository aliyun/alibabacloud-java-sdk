// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeFlowJobResponseBody extends TeaModel {
    @NameInMap("FailAct")
    public String failAct;

    @NameInMap("CategoryId")
    public String categoryId;

    @NameInMap("Description")
    public String description;

    @NameInMap("GmtModified")
    public Long gmtModified;

    @NameInMap("Name")
    public String name;

    @NameInMap("ParamConf")
    public String paramConf;

    @NameInMap("mode")
    public String mode;

    @NameInMap("Adhoc")
    public String adhoc;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LastInstanceId")
    public String lastInstanceId;

    @NameInMap("Params")
    public String params;

    @NameInMap("MaxRetry")
    public Integer maxRetry;

    @NameInMap("MaxRunningTimeSec")
    public Long maxRunningTimeSec;

    @NameInMap("EditLockDetail")
    public String editLockDetail;

    @NameInMap("Type")
    public String type;

    @NameInMap("GmtCreate")
    public Long gmtCreate;

    @NameInMap("ResourceList")
    public DescribeFlowJobResponseBodyResourceList resourceList;

    @NameInMap("EnvConf")
    public String envConf;

    @NameInMap("MonitorConf")
    public String monitorConf;

    @NameInMap("RetryInterval")
    public Long retryInterval;

    @NameInMap("RunConf")
    public String runConf;

    @NameInMap("Id")
    public String id;

    @NameInMap("RetryPolicy")
    public String retryPolicy;

    @NameInMap("CustomVariables")
    public String customVariables;

    @NameInMap("AlertConf")
    public String alertConf;

    public static DescribeFlowJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowJobResponseBody self = new DescribeFlowJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlowJobResponseBody setFailAct(String failAct) {
        this.failAct = failAct;
        return this;
    }
    public String getFailAct() {
        return this.failAct;
    }

    public DescribeFlowJobResponseBody setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public DescribeFlowJobResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeFlowJobResponseBody setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
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

    public DescribeFlowJobResponseBody setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public DescribeFlowJobResponseBody setAdhoc(String adhoc) {
        this.adhoc = adhoc;
        return this;
    }
    public String getAdhoc() {
        return this.adhoc;
    }

    public DescribeFlowJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlowJobResponseBody setLastInstanceId(String lastInstanceId) {
        this.lastInstanceId = lastInstanceId;
        return this;
    }
    public String getLastInstanceId() {
        return this.lastInstanceId;
    }

    public DescribeFlowJobResponseBody setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
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

    public DescribeFlowJobResponseBody setEditLockDetail(String editLockDetail) {
        this.editLockDetail = editLockDetail;
        return this;
    }
    public String getEditLockDetail() {
        return this.editLockDetail;
    }

    public DescribeFlowJobResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeFlowJobResponseBody setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public DescribeFlowJobResponseBody setResourceList(DescribeFlowJobResponseBodyResourceList resourceList) {
        this.resourceList = resourceList;
        return this;
    }
    public DescribeFlowJobResponseBodyResourceList getResourceList() {
        return this.resourceList;
    }

    public DescribeFlowJobResponseBody setEnvConf(String envConf) {
        this.envConf = envConf;
        return this;
    }
    public String getEnvConf() {
        return this.envConf;
    }

    public DescribeFlowJobResponseBody setMonitorConf(String monitorConf) {
        this.monitorConf = monitorConf;
        return this;
    }
    public String getMonitorConf() {
        return this.monitorConf;
    }

    public DescribeFlowJobResponseBody setRetryInterval(Long retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }
    public Long getRetryInterval() {
        return this.retryInterval;
    }

    public DescribeFlowJobResponseBody setRunConf(String runConf) {
        this.runConf = runConf;
        return this;
    }
    public String getRunConf() {
        return this.runConf;
    }

    public DescribeFlowJobResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeFlowJobResponseBody setRetryPolicy(String retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }
    public String getRetryPolicy() {
        return this.retryPolicy;
    }

    public DescribeFlowJobResponseBody setCustomVariables(String customVariables) {
        this.customVariables = customVariables;
        return this;
    }
    public String getCustomVariables() {
        return this.customVariables;
    }

    public DescribeFlowJobResponseBody setAlertConf(String alertConf) {
        this.alertConf = alertConf;
        return this;
    }
    public String getAlertConf() {
        return this.alertConf;
    }

    public static class DescribeFlowJobResponseBodyResourceListResource extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Alias")
        public String alias;

        public static DescribeFlowJobResponseBodyResourceListResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowJobResponseBodyResourceListResource self = new DescribeFlowJobResponseBodyResourceListResource();
            return TeaModel.build(map, self);
        }

        public DescribeFlowJobResponseBodyResourceListResource setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeFlowJobResponseBodyResourceListResource setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
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

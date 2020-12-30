// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListFlowJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("JobList")
    public ListFlowJobResponseBodyJobList jobList;

    public static ListFlowJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowJobResponseBody self = new ListFlowJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowJobResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFlowJobResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFlowJobResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListFlowJobResponseBody setJobList(ListFlowJobResponseBodyJobList jobList) {
        this.jobList = jobList;
        return this;
    }
    public ListFlowJobResponseBodyJobList getJobList() {
        return this.jobList;
    }

    public static class ListFlowJobResponseBodyJobListJobResourceListResource extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Alias")
        public String alias;

        public static ListFlowJobResponseBodyJobListJobResourceListResource build(java.util.Map<String, ?> map) throws Exception {
            ListFlowJobResponseBodyJobListJobResourceListResource self = new ListFlowJobResponseBodyJobListJobResourceListResource();
            return TeaModel.build(map, self);
        }

        public ListFlowJobResponseBodyJobListJobResourceListResource setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListFlowJobResponseBodyJobListJobResourceListResource setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

    }

    public static class ListFlowJobResponseBodyJobListJobResourceList extends TeaModel {
        @NameInMap("Resource")
        public java.util.List<ListFlowJobResponseBodyJobListJobResourceListResource> resource;

        public static ListFlowJobResponseBodyJobListJobResourceList build(java.util.Map<String, ?> map) throws Exception {
            ListFlowJobResponseBodyJobListJobResourceList self = new ListFlowJobResponseBodyJobListJobResourceList();
            return TeaModel.build(map, self);
        }

        public ListFlowJobResponseBodyJobListJobResourceList setResource(java.util.List<ListFlowJobResponseBodyJobListJobResourceListResource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<ListFlowJobResponseBodyJobListJobResourceListResource> getResource() {
            return this.resource;
        }

    }

    public static class ListFlowJobResponseBodyJobListJob extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("FailAct")
        public String failAct;

        @NameInMap("CustomVariables")
        public String customVariables;

        @NameInMap("ResourceList")
        public ListFlowJobResponseBodyJobListJobResourceList resourceList;

        @NameInMap("RetryInterval")
        public Long retryInterval;

        @NameInMap("EnvConf")
        public String envConf;

        @NameInMap("ParamConf")
        public String paramConf;

        @NameInMap("mode")
        public String mode;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("MonitorConf")
        public String monitorConf;

        @NameInMap("LastInstanceDetail")
        public String lastInstanceDetail;

        @NameInMap("RunConf")
        public String runConf;

        @NameInMap("Params")
        public String params;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("CategoryId")
        public String categoryId;

        @NameInMap("Adhoc")
        public String adhoc;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        @NameInMap("AlertConf")
        public String alertConf;

        @NameInMap("MaxRetry")
        public Integer maxRetry;

        public static ListFlowJobResponseBodyJobListJob build(java.util.Map<String, ?> map) throws Exception {
            ListFlowJobResponseBodyJobListJob self = new ListFlowJobResponseBodyJobListJob();
            return TeaModel.build(map, self);
        }

        public ListFlowJobResponseBodyJobListJob setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListFlowJobResponseBodyJobListJob setFailAct(String failAct) {
            this.failAct = failAct;
            return this;
        }
        public String getFailAct() {
            return this.failAct;
        }

        public ListFlowJobResponseBodyJobListJob setCustomVariables(String customVariables) {
            this.customVariables = customVariables;
            return this;
        }
        public String getCustomVariables() {
            return this.customVariables;
        }

        public ListFlowJobResponseBodyJobListJob setResourceList(ListFlowJobResponseBodyJobListJobResourceList resourceList) {
            this.resourceList = resourceList;
            return this;
        }
        public ListFlowJobResponseBodyJobListJobResourceList getResourceList() {
            return this.resourceList;
        }

        public ListFlowJobResponseBodyJobListJob setRetryInterval(Long retryInterval) {
            this.retryInterval = retryInterval;
            return this;
        }
        public Long getRetryInterval() {
            return this.retryInterval;
        }

        public ListFlowJobResponseBodyJobListJob setEnvConf(String envConf) {
            this.envConf = envConf;
            return this;
        }
        public String getEnvConf() {
            return this.envConf;
        }

        public ListFlowJobResponseBodyJobListJob setParamConf(String paramConf) {
            this.paramConf = paramConf;
            return this;
        }
        public String getParamConf() {
            return this.paramConf;
        }

        public ListFlowJobResponseBodyJobListJob setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListFlowJobResponseBodyJobListJob setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListFlowJobResponseBodyJobListJob setMonitorConf(String monitorConf) {
            this.monitorConf = monitorConf;
            return this;
        }
        public String getMonitorConf() {
            return this.monitorConf;
        }

        public ListFlowJobResponseBodyJobListJob setLastInstanceDetail(String lastInstanceDetail) {
            this.lastInstanceDetail = lastInstanceDetail;
            return this;
        }
        public String getLastInstanceDetail() {
            return this.lastInstanceDetail;
        }

        public ListFlowJobResponseBodyJobListJob setRunConf(String runConf) {
            this.runConf = runConf;
            return this;
        }
        public String getRunConf() {
            return this.runConf;
        }

        public ListFlowJobResponseBodyJobListJob setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

        public ListFlowJobResponseBodyJobListJob setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListFlowJobResponseBodyJobListJob setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListFlowJobResponseBodyJobListJob setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public ListFlowJobResponseBodyJobListJob setAdhoc(String adhoc) {
            this.adhoc = adhoc;
            return this;
        }
        public String getAdhoc() {
            return this.adhoc;
        }

        public ListFlowJobResponseBodyJobListJob setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFlowJobResponseBodyJobListJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListFlowJobResponseBodyJobListJob setAlertConf(String alertConf) {
            this.alertConf = alertConf;
            return this;
        }
        public String getAlertConf() {
            return this.alertConf;
        }

        public ListFlowJobResponseBodyJobListJob setMaxRetry(Integer maxRetry) {
            this.maxRetry = maxRetry;
            return this;
        }
        public Integer getMaxRetry() {
            return this.maxRetry;
        }

    }

    public static class ListFlowJobResponseBodyJobList extends TeaModel {
        @NameInMap("Job")
        public java.util.List<ListFlowJobResponseBodyJobListJob> job;

        public static ListFlowJobResponseBodyJobList build(java.util.Map<String, ?> map) throws Exception {
            ListFlowJobResponseBodyJobList self = new ListFlowJobResponseBodyJobList();
            return TeaModel.build(map, self);
        }

        public ListFlowJobResponseBodyJobList setJob(java.util.List<ListFlowJobResponseBodyJobListJob> job) {
            this.job = job;
            return this;
        }
        public java.util.List<ListFlowJobResponseBodyJobListJob> getJob() {
            return this.job;
        }

    }

}

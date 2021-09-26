// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListFlowJobsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("JobList")
    public ListFlowJobsResponseBodyJobList jobList;

    public static ListFlowJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowJobsResponseBody self = new ListFlowJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowJobsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFlowJobsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFlowJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowJobsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListFlowJobsResponseBody setJobList(ListFlowJobsResponseBodyJobList jobList) {
        this.jobList = jobList;
        return this;
    }
    public ListFlowJobsResponseBodyJobList getJobList() {
        return this.jobList;
    }

    public static class ListFlowJobsResponseBodyJobListJobResourceListResource extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("Alias")
        public String alias;

        public static ListFlowJobsResponseBodyJobListJobResourceListResource build(java.util.Map<String, ?> map) throws Exception {
            ListFlowJobsResponseBodyJobListJobResourceListResource self = new ListFlowJobsResponseBodyJobListJobResourceListResource();
            return TeaModel.build(map, self);
        }

        public ListFlowJobsResponseBodyJobListJobResourceListResource setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListFlowJobsResponseBodyJobListJobResourceListResource setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

    }

    public static class ListFlowJobsResponseBodyJobListJobResourceList extends TeaModel {
        @NameInMap("Resource")
        public java.util.List<ListFlowJobsResponseBodyJobListJobResourceListResource> resource;

        public static ListFlowJobsResponseBodyJobListJobResourceList build(java.util.Map<String, ?> map) throws Exception {
            ListFlowJobsResponseBodyJobListJobResourceList self = new ListFlowJobsResponseBodyJobListJobResourceList();
            return TeaModel.build(map, self);
        }

        public ListFlowJobsResponseBodyJobListJobResourceList setResource(java.util.List<ListFlowJobsResponseBodyJobListJobResourceListResource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<ListFlowJobsResponseBodyJobListJobResourceListResource> getResource() {
            return this.resource;
        }

    }

    public static class ListFlowJobsResponseBodyJobListJob extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("FailAct")
        public String failAct;

        @NameInMap("CustomVariables")
        public String customVariables;

        @NameInMap("RetryInterval")
        public Long retryInterval;

        @NameInMap("EnvConf")
        public String envConf;

        @NameInMap("ParamConf")
        public String paramConf;

        @NameInMap("Mode")
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

        @NameInMap("MaxRetry")
        public Integer maxRetry;

        @NameInMap("AlertConf")
        public String alertConf;

        @NameInMap("ResourceList")
        public ListFlowJobsResponseBodyJobListJobResourceList resourceList;

        public static ListFlowJobsResponseBodyJobListJob build(java.util.Map<String, ?> map) throws Exception {
            ListFlowJobsResponseBodyJobListJob self = new ListFlowJobsResponseBodyJobListJob();
            return TeaModel.build(map, self);
        }

        public ListFlowJobsResponseBodyJobListJob setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListFlowJobsResponseBodyJobListJob setFailAct(String failAct) {
            this.failAct = failAct;
            return this;
        }
        public String getFailAct() {
            return this.failAct;
        }

        public ListFlowJobsResponseBodyJobListJob setCustomVariables(String customVariables) {
            this.customVariables = customVariables;
            return this;
        }
        public String getCustomVariables() {
            return this.customVariables;
        }

        public ListFlowJobsResponseBodyJobListJob setRetryInterval(Long retryInterval) {
            this.retryInterval = retryInterval;
            return this;
        }
        public Long getRetryInterval() {
            return this.retryInterval;
        }

        public ListFlowJobsResponseBodyJobListJob setEnvConf(String envConf) {
            this.envConf = envConf;
            return this;
        }
        public String getEnvConf() {
            return this.envConf;
        }

        public ListFlowJobsResponseBodyJobListJob setParamConf(String paramConf) {
            this.paramConf = paramConf;
            return this;
        }
        public String getParamConf() {
            return this.paramConf;
        }

        public ListFlowJobsResponseBodyJobListJob setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListFlowJobsResponseBodyJobListJob setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListFlowJobsResponseBodyJobListJob setMonitorConf(String monitorConf) {
            this.monitorConf = monitorConf;
            return this;
        }
        public String getMonitorConf() {
            return this.monitorConf;
        }

        public ListFlowJobsResponseBodyJobListJob setLastInstanceDetail(String lastInstanceDetail) {
            this.lastInstanceDetail = lastInstanceDetail;
            return this;
        }
        public String getLastInstanceDetail() {
            return this.lastInstanceDetail;
        }

        public ListFlowJobsResponseBodyJobListJob setRunConf(String runConf) {
            this.runConf = runConf;
            return this;
        }
        public String getRunConf() {
            return this.runConf;
        }

        public ListFlowJobsResponseBodyJobListJob setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

        public ListFlowJobsResponseBodyJobListJob setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListFlowJobsResponseBodyJobListJob setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListFlowJobsResponseBodyJobListJob setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public ListFlowJobsResponseBodyJobListJob setAdhoc(String adhoc) {
            this.adhoc = adhoc;
            return this;
        }
        public String getAdhoc() {
            return this.adhoc;
        }

        public ListFlowJobsResponseBodyJobListJob setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFlowJobsResponseBodyJobListJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListFlowJobsResponseBodyJobListJob setMaxRetry(Integer maxRetry) {
            this.maxRetry = maxRetry;
            return this;
        }
        public Integer getMaxRetry() {
            return this.maxRetry;
        }

        public ListFlowJobsResponseBodyJobListJob setAlertConf(String alertConf) {
            this.alertConf = alertConf;
            return this;
        }
        public String getAlertConf() {
            return this.alertConf;
        }

        public ListFlowJobsResponseBodyJobListJob setResourceList(ListFlowJobsResponseBodyJobListJobResourceList resourceList) {
            this.resourceList = resourceList;
            return this;
        }
        public ListFlowJobsResponseBodyJobListJobResourceList getResourceList() {
            return this.resourceList;
        }

    }

    public static class ListFlowJobsResponseBodyJobList extends TeaModel {
        @NameInMap("Job")
        public java.util.List<ListFlowJobsResponseBodyJobListJob> job;

        public static ListFlowJobsResponseBodyJobList build(java.util.Map<String, ?> map) throws Exception {
            ListFlowJobsResponseBodyJobList self = new ListFlowJobsResponseBodyJobList();
            return TeaModel.build(map, self);
        }

        public ListFlowJobsResponseBodyJobList setJob(java.util.List<ListFlowJobsResponseBodyJobListJob> job) {
            this.job = job;
            return this;
        }
        public java.util.List<ListFlowJobsResponseBodyJobListJob> getJob() {
            return this.job;
        }

    }

}

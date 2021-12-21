// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListFlowJobsResponseBody extends TeaModel {
    @NameInMap("JobList")
    public ListFlowJobsResponseBodyJobList jobList;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    public static ListFlowJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowJobsResponseBody self = new ListFlowJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowJobsResponseBody setJobList(ListFlowJobsResponseBodyJobList jobList) {
        this.jobList = jobList;
        return this;
    }
    public ListFlowJobsResponseBodyJobList getJobList() {
        return this.jobList;
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

    public static class ListFlowJobsResponseBodyJobListJobResourceListResource extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("Path")
        public String path;

        public static ListFlowJobsResponseBodyJobListJobResourceListResource build(java.util.Map<String, ?> map) throws Exception {
            ListFlowJobsResponseBodyJobListJobResourceListResource self = new ListFlowJobsResponseBodyJobListJobResourceListResource();
            return TeaModel.build(map, self);
        }

        public ListFlowJobsResponseBodyJobListJobResourceListResource setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public ListFlowJobsResponseBodyJobListJobResourceListResource setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
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
        @NameInMap("Adhoc")
        public String adhoc;

        @NameInMap("AlertConf")
        public String alertConf;

        @NameInMap("CategoryId")
        public String categoryId;

        @NameInMap("CustomVariables")
        public String customVariables;

        @NameInMap("Description")
        public String description;

        @NameInMap("EnvConf")
        public String envConf;

        @NameInMap("FailAct")
        public String failAct;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public String id;

        @NameInMap("LastInstanceDetail")
        public String lastInstanceDetail;

        @NameInMap("MaxRetry")
        public Integer maxRetry;

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

        @NameInMap("ResourceList")
        public ListFlowJobsResponseBodyJobListJobResourceList resourceList;

        @NameInMap("RetryInterval")
        public Long retryInterval;

        @NameInMap("RunConf")
        public String runConf;

        @NameInMap("Type")
        public String type;

        public static ListFlowJobsResponseBodyJobListJob build(java.util.Map<String, ?> map) throws Exception {
            ListFlowJobsResponseBodyJobListJob self = new ListFlowJobsResponseBodyJobListJob();
            return TeaModel.build(map, self);
        }

        public ListFlowJobsResponseBodyJobListJob setAdhoc(String adhoc) {
            this.adhoc = adhoc;
            return this;
        }
        public String getAdhoc() {
            return this.adhoc;
        }

        public ListFlowJobsResponseBodyJobListJob setAlertConf(String alertConf) {
            this.alertConf = alertConf;
            return this;
        }
        public String getAlertConf() {
            return this.alertConf;
        }

        public ListFlowJobsResponseBodyJobListJob setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public ListFlowJobsResponseBodyJobListJob setCustomVariables(String customVariables) {
            this.customVariables = customVariables;
            return this;
        }
        public String getCustomVariables() {
            return this.customVariables;
        }

        public ListFlowJobsResponseBodyJobListJob setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListFlowJobsResponseBodyJobListJob setEnvConf(String envConf) {
            this.envConf = envConf;
            return this;
        }
        public String getEnvConf() {
            return this.envConf;
        }

        public ListFlowJobsResponseBodyJobListJob setFailAct(String failAct) {
            this.failAct = failAct;
            return this;
        }
        public String getFailAct() {
            return this.failAct;
        }

        public ListFlowJobsResponseBodyJobListJob setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListFlowJobsResponseBodyJobListJob setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListFlowJobsResponseBodyJobListJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListFlowJobsResponseBodyJobListJob setLastInstanceDetail(String lastInstanceDetail) {
            this.lastInstanceDetail = lastInstanceDetail;
            return this;
        }
        public String getLastInstanceDetail() {
            return this.lastInstanceDetail;
        }

        public ListFlowJobsResponseBodyJobListJob setMaxRetry(Integer maxRetry) {
            this.maxRetry = maxRetry;
            return this;
        }
        public Integer getMaxRetry() {
            return this.maxRetry;
        }

        public ListFlowJobsResponseBodyJobListJob setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListFlowJobsResponseBodyJobListJob setMonitorConf(String monitorConf) {
            this.monitorConf = monitorConf;
            return this;
        }
        public String getMonitorConf() {
            return this.monitorConf;
        }

        public ListFlowJobsResponseBodyJobListJob setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFlowJobsResponseBodyJobListJob setParamConf(String paramConf) {
            this.paramConf = paramConf;
            return this;
        }
        public String getParamConf() {
            return this.paramConf;
        }

        public ListFlowJobsResponseBodyJobListJob setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

        public ListFlowJobsResponseBodyJobListJob setResourceList(ListFlowJobsResponseBodyJobListJobResourceList resourceList) {
            this.resourceList = resourceList;
            return this;
        }
        public ListFlowJobsResponseBodyJobListJobResourceList getResourceList() {
            return this.resourceList;
        }

        public ListFlowJobsResponseBodyJobListJob setRetryInterval(Long retryInterval) {
            this.retryInterval = retryInterval;
            return this;
        }
        public Long getRetryInterval() {
            return this.retryInterval;
        }

        public ListFlowJobsResponseBodyJobListJob setRunConf(String runConf) {
            this.runConf = runConf;
            return this;
        }
        public String getRunConf() {
            return this.runConf;
        }

        public ListFlowJobsResponseBodyJobListJob setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class PageableQueryExperimentTaskByClusterIdResponseBody extends TeaModel {
    @NameInMap("Pages")
    public Integer pages;

    @NameInMap("ExperimentTasks")
    public java.util.List<PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasks> experimentTasks;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static PageableQueryExperimentTaskByClusterIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PageableQueryExperimentTaskByClusterIdResponseBody self = new PageableQueryExperimentTaskByClusterIdResponseBody();
        return TeaModel.build(map, self);
    }

    public PageableQueryExperimentTaskByClusterIdResponseBody setPages(Integer pages) {
        this.pages = pages;
        return this;
    }
    public Integer getPages() {
        return this.pages;
    }

    public PageableQueryExperimentTaskByClusterIdResponseBody setExperimentTasks(java.util.List<PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasks> experimentTasks) {
        this.experimentTasks = experimentTasks;
        return this;
    }
    public java.util.List<PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasks> getExperimentTasks() {
        return this.experimentTasks;
    }

    public PageableQueryExperimentTaskByClusterIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PageableQueryExperimentTaskByClusterIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PageableQueryExperimentTaskByClusterIdResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public PageableQueryExperimentTaskByClusterIdResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public PageableQueryExperimentTaskByClusterIdResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public PageableQueryExperimentTaskByClusterIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public PageableQueryExperimentTaskByClusterIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PageableQueryExperimentTaskByClusterIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasksExtInfoSchedulerConfig extends TeaModel {
        @NameInMap("FixedTime")
        public String fixedTime;

        @NameInMap("CronExpression")
        public String cronExpression;

        public static PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasksExtInfoSchedulerConfig build(java.util.Map<String, ?> map) throws Exception {
            PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasksExtInfoSchedulerConfig self = new PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasksExtInfoSchedulerConfig();
            return TeaModel.build(map, self);
        }

        public PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasksExtInfoSchedulerConfig setFixedTime(String fixedTime) {
            this.fixedTime = fixedTime;
            return this;
        }
        public String getFixedTime() {
            return this.fixedTime;
        }

        public PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasksExtInfoSchedulerConfig setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

    }

    public static class PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasksExtInfo extends TeaModel {
        @NameInMap("SchedulerConfig")
        public PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasksExtInfoSchedulerConfig schedulerConfig;

        public static PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasksExtInfo build(java.util.Map<String, ?> map) throws Exception {
            PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasksExtInfo self = new PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasksExtInfo();
            return TeaModel.build(map, self);
        }

        public PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasksExtInfo setSchedulerConfig(PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasksExtInfoSchedulerConfig schedulerConfig) {
            this.schedulerConfig = schedulerConfig;
            return this;
        }
        public PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasksExtInfoSchedulerConfig getSchedulerConfig() {
            return this.schedulerConfig;
        }

    }

    public static class PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasksCreator extends TeaModel {
        @NameInMap("SubUserId")
        public String subUserId;

        @NameInMap("UserId")
        public String userId;

        public static PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasksCreator build(java.util.Map<String, ?> map) throws Exception {
            PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasksCreator self = new PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasksCreator();
            return TeaModel.build(map, self);
        }

        public PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasksCreator setSubUserId(String subUserId) {
            this.subUserId = subUserId;
            return this;
        }
        public String getSubUserId() {
            return this.subUserId;
        }

        public PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasksCreator setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasks extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Result")
        public String result;

        @NameInMap("State")
        public String state;

        @NameInMap("CurrentPhase")
        public String currentPhase;

        @NameInMap("ExperimentId")
        public String experimentId;

        @NameInMap("Message")
        public String message;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("ExperimentName")
        public String experimentName;

        @NameInMap("ExtInfo")
        public PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasksExtInfo extInfo;

        @NameInMap("Creator")
        public PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasksCreator creator;

        @NameInMap("Namespace")
        public String namespace;

        public static PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasks build(java.util.Map<String, ?> map) throws Exception {
            PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasks self = new PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasks();
            return TeaModel.build(map, self);
        }

        public PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasks setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasks setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasks setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasks setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasks setCurrentPhase(String currentPhase) {
            this.currentPhase = currentPhase;
            return this;
        }
        public String getCurrentPhase() {
            return this.currentPhase;
        }

        public PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasks setExperimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public String getExperimentId() {
            return this.experimentId;
        }

        public PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasks setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasks setExperimentName(String experimentName) {
            this.experimentName = experimentName;
            return this;
        }
        public String getExperimentName() {
            return this.experimentName;
        }

        public PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasks setExtInfo(PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasksExtInfo extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasksExtInfo getExtInfo() {
            return this.extInfo;
        }

        public PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasks setCreator(PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasksCreator creator) {
            this.creator = creator;
            return this;
        }
        public PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasksCreator getCreator() {
            return this.creator;
        }

        public PageableQueryExperimentTaskByClusterIdResponseBodyExperimentTasks setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

    }

}

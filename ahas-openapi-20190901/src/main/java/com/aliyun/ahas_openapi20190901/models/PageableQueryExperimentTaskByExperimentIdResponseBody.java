// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class PageableQueryExperimentTaskByExperimentIdResponseBody extends TeaModel {
    @NameInMap("Pages")
    public Integer pages;

    @NameInMap("ExperimentTasks")
    public java.util.List<PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasks> experimentTasks;

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

    public static PageableQueryExperimentTaskByExperimentIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PageableQueryExperimentTaskByExperimentIdResponseBody self = new PageableQueryExperimentTaskByExperimentIdResponseBody();
        return TeaModel.build(map, self);
    }

    public PageableQueryExperimentTaskByExperimentIdResponseBody setPages(Integer pages) {
        this.pages = pages;
        return this;
    }
    public Integer getPages() {
        return this.pages;
    }

    public PageableQueryExperimentTaskByExperimentIdResponseBody setExperimentTasks(java.util.List<PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasks> experimentTasks) {
        this.experimentTasks = experimentTasks;
        return this;
    }
    public java.util.List<PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasks> getExperimentTasks() {
        return this.experimentTasks;
    }

    public PageableQueryExperimentTaskByExperimentIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PageableQueryExperimentTaskByExperimentIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PageableQueryExperimentTaskByExperimentIdResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public PageableQueryExperimentTaskByExperimentIdResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public PageableQueryExperimentTaskByExperimentIdResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public PageableQueryExperimentTaskByExperimentIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public PageableQueryExperimentTaskByExperimentIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PageableQueryExperimentTaskByExperimentIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasksExtInfoSchedulerConfig extends TeaModel {
        @NameInMap("FixedTime")
        public String fixedTime;

        @NameInMap("CronExpression")
        public String cronExpression;

        public static PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasksExtInfoSchedulerConfig build(java.util.Map<String, ?> map) throws Exception {
            PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasksExtInfoSchedulerConfig self = new PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasksExtInfoSchedulerConfig();
            return TeaModel.build(map, self);
        }

        public PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasksExtInfoSchedulerConfig setFixedTime(String fixedTime) {
            this.fixedTime = fixedTime;
            return this;
        }
        public String getFixedTime() {
            return this.fixedTime;
        }

        public PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasksExtInfoSchedulerConfig setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

    }

    public static class PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasksExtInfo extends TeaModel {
        @NameInMap("SchedulerConfig")
        public PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasksExtInfoSchedulerConfig schedulerConfig;

        public static PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasksExtInfo build(java.util.Map<String, ?> map) throws Exception {
            PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasksExtInfo self = new PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasksExtInfo();
            return TeaModel.build(map, self);
        }

        public PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasksExtInfo setSchedulerConfig(PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasksExtInfoSchedulerConfig schedulerConfig) {
            this.schedulerConfig = schedulerConfig;
            return this;
        }
        public PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasksExtInfoSchedulerConfig getSchedulerConfig() {
            return this.schedulerConfig;
        }

    }

    public static class PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasksCreator extends TeaModel {
        @NameInMap("SubUserId")
        public String subUserId;

        @NameInMap("UserId")
        public String userId;

        public static PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasksCreator build(java.util.Map<String, ?> map) throws Exception {
            PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasksCreator self = new PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasksCreator();
            return TeaModel.build(map, self);
        }

        public PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasksCreator setSubUserId(String subUserId) {
            this.subUserId = subUserId;
            return this;
        }
        public String getSubUserId() {
            return this.subUserId;
        }

        public PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasksCreator setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasks extends TeaModel {
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
        public PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasksExtInfo extInfo;

        @NameInMap("Creator")
        public PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasksCreator creator;

        public static PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasks build(java.util.Map<String, ?> map) throws Exception {
            PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasks self = new PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasks();
            return TeaModel.build(map, self);
        }

        public PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasks setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasks setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasks setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasks setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasks setCurrentPhase(String currentPhase) {
            this.currentPhase = currentPhase;
            return this;
        }
        public String getCurrentPhase() {
            return this.currentPhase;
        }

        public PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasks setExperimentId(String experimentId) {
            this.experimentId = experimentId;
            return this;
        }
        public String getExperimentId() {
            return this.experimentId;
        }

        public PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasks setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasks setExperimentName(String experimentName) {
            this.experimentName = experimentName;
            return this;
        }
        public String getExperimentName() {
            return this.experimentName;
        }

        public PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasks setExtInfo(PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasksExtInfo extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasksExtInfo getExtInfo() {
            return this.extInfo;
        }

        public PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasks setCreator(PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasksCreator creator) {
            this.creator = creator;
            return this;
        }
        public PageableQueryExperimentTaskByExperimentIdResponseBodyExperimentTasksCreator getCreator() {
            return this.creator;
        }

    }

}

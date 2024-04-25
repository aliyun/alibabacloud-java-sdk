// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSqlLogTasksResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    /**
     * <p>ListResult<SqlLogTask></p>
     */
    @NameInMap("Data")
    public DescribeSqlLogTasksResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static DescribeSqlLogTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlLogTasksResponseBody self = new DescribeSqlLogTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSqlLogTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSqlLogTasksResponseBody setData(DescribeSqlLogTasksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSqlLogTasksResponseBodyData getData() {
        return this.data;
    }

    public DescribeSqlLogTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSqlLogTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSqlLogTasksResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeSqlLogTasksResponseBodyDataListFilters extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeSqlLogTasksResponseBodyDataListFilters build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlLogTasksResponseBodyDataListFilters self = new DescribeSqlLogTasksResponseBodyDataListFilters();
            return TeaModel.build(map, self);
        }

        public DescribeSqlLogTasksResponseBodyDataListFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeSqlLogTasksResponseBodyDataListFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeSqlLogTasksResponseBodyDataList extends TeaModel {
        @NameInMap("AnalysisTaskFinishTime")
        public Long analysisTaskFinishTime;

        @NameInMap("AnalysisTaskStatus")
        public String analysisTaskStatus;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("End")
        public Long end;

        @NameInMap("Expire")
        public Boolean expire;

        @NameInMap("Filters")
        public java.util.List<DescribeSqlLogTasksResponseBodyDataListFilters> filters;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LogCount")
        public Long logCount;

        @NameInMap("Name")
        public String name;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("Result")
        public String result;

        @NameInMap("ScanFileSize")
        public Long scanFileSize;

        @NameInMap("Start")
        public Long start;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskType")
        public String taskType;

        public static DescribeSqlLogTasksResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlLogTasksResponseBodyDataList self = new DescribeSqlLogTasksResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeSqlLogTasksResponseBodyDataList setAnalysisTaskFinishTime(Long analysisTaskFinishTime) {
            this.analysisTaskFinishTime = analysisTaskFinishTime;
            return this;
        }
        public Long getAnalysisTaskFinishTime() {
            return this.analysisTaskFinishTime;
        }

        public DescribeSqlLogTasksResponseBodyDataList setAnalysisTaskStatus(String analysisTaskStatus) {
            this.analysisTaskStatus = analysisTaskStatus;
            return this;
        }
        public String getAnalysisTaskStatus() {
            return this.analysisTaskStatus;
        }

        public DescribeSqlLogTasksResponseBodyDataList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeSqlLogTasksResponseBodyDataList setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public DescribeSqlLogTasksResponseBodyDataList setExpire(Boolean expire) {
            this.expire = expire;
            return this;
        }
        public Boolean getExpire() {
            return this.expire;
        }

        public DescribeSqlLogTasksResponseBodyDataList setFilters(java.util.List<DescribeSqlLogTasksResponseBodyDataListFilters> filters) {
            this.filters = filters;
            return this;
        }
        public java.util.List<DescribeSqlLogTasksResponseBodyDataListFilters> getFilters() {
            return this.filters;
        }

        public DescribeSqlLogTasksResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSqlLogTasksResponseBodyDataList setLogCount(Long logCount) {
            this.logCount = logCount;
            return this;
        }
        public Long getLogCount() {
            return this.logCount;
        }

        public DescribeSqlLogTasksResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSqlLogTasksResponseBodyDataList setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeSqlLogTasksResponseBodyDataList setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public DescribeSqlLogTasksResponseBodyDataList setScanFileSize(Long scanFileSize) {
            this.scanFileSize = scanFileSize;
            return this;
        }
        public Long getScanFileSize() {
            return this.scanFileSize;
        }

        public DescribeSqlLogTasksResponseBodyDataList setStart(Long start) {
            this.start = start;
            return this;
        }
        public Long getStart() {
            return this.start;
        }

        public DescribeSqlLogTasksResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSqlLogTasksResponseBodyDataList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeSqlLogTasksResponseBodyDataList setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

    public static class DescribeSqlLogTasksResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<DescribeSqlLogTasksResponseBodyDataList> list;

        @NameInMap("PageNo")
        public Long pageNo;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        public static DescribeSqlLogTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlLogTasksResponseBodyData self = new DescribeSqlLogTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSqlLogTasksResponseBodyData setList(java.util.List<DescribeSqlLogTasksResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<DescribeSqlLogTasksResponseBodyDataList> getList() {
            return this.list;
        }

        public DescribeSqlLogTasksResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public DescribeSqlLogTasksResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeSqlLogTasksResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}

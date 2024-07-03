// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSqlLogTasksResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribeSqlLogTasksResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <blockquote>
     * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The name of the filter parameter.</p>
         * <blockquote>
         * <p> For more information about the filter parameters, see the <strong>Valid values of Key</strong> section of this topic.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>delimiter</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>,</p>
         */
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
        /**
         * <p>The time when the analysis task was complete. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1712751923000</p>
         */
        @NameInMap("AnalysisTaskFinishTime")
        public Long analysisTaskFinishTime;

        /**
         * <p>The state of the analysis task.</p>
         * <blockquote>
         * <p> This parameter is a system parameter. You do not need to pay attention to the parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SCAN_ANALYZE_COMPLETED</p>
         */
        @NameInMap("AnalysisTaskStatus")
        public String analysisTaskStatus;

        /**
         * <p>The time when the task was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1681363254423</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The time when the task ended. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1705975320000</p>
         */
        @NameInMap("End")
        public Long end;

        /**
         * <p>Indicates whether the task expired. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Expire")
        public Boolean expire;

        /**
         * <p>The filter parameters.</p>
         */
        @NameInMap("Filters")
        public java.util.List<DescribeSqlLogTasksResponseBodyDataListFilters> filters;

        /**
         * <p>The ID of the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2zew761kf7ho18752</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The number of log records.</p>
         * 
         * <strong>example:</strong>
         * <p>99999</p>
         */
        @NameInMap("LogCount")
        public Long logCount;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>test01</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The task progress.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>The URL that is returned if the value of TaskType is <strong>Export</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://das-sqllog-download-cn-shanghai.oss-cn-shanghai.aliyuncs.com/la">https://das-sqllog-download-cn-shanghai.oss-cn-shanghai.aliyuncs.com/la</a></p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The number of files that are scanned.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("ScanFileSize")
        public Long scanFileSize;

        /**
         * <p>The time when the task started. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1683859555482</p>
         */
        @NameInMap("Start")
        public Long start;

        /**
         * <p>The task state. Valid values:</p>
         * <ul>
         * <li><strong>INIT</strong>: The task is to be scheduled.</li>
         * <li><strong>RUNNING</strong>: The task is running.</li>
         * <li><strong>FAILED</strong>: The task failed.</li>
         * <li><strong>CANCELED</strong>: The task is canceled.</li>
         * <li><strong>COMPLETED</strong>: The task is complete.</li>
         * </ul>
         * <blockquote>
         * <p> If a task is in the <strong>COMPLETED</strong> state, you can view the results of the task.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9a4f5c4494dbd6713185d87a97aa53e8</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li><strong>Export</strong></li>
         * <li><strong>Query</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Export</p>
         */
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
        /**
         * <p>The details of the data returned.</p>
         */
        @NameInMap("List")
        public java.util.List<DescribeSqlLogTasksResponseBodyDataList> list;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Long pageNo;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The number of tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListTasksHistoriesResponseBody extends TeaModel {
    // 总记录数。
    @NameInMap("TotalCount")
    public Integer totalCount;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public Integer nextToken;

    // 数组，返回示例目录。
    @NameInMap("InspectionTasks")
    public java.util.List<ListTasksHistoriesResponseBodyInspectionTasks> inspectionTasks;

    public static ListTasksHistoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTasksHistoriesResponseBody self = new ListTasksHistoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTasksHistoriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTasksHistoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTasksHistoriesResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListTasksHistoriesResponseBody setInspectionTasks(java.util.List<ListTasksHistoriesResponseBodyInspectionTasks> inspectionTasks) {
        this.inspectionTasks = inspectionTasks;
        return this;
    }
    public java.util.List<ListTasksHistoriesResponseBodyInspectionTasks> getInspectionTasks() {
        return this.inspectionTasks;
    }

    public static class ListTasksHistoriesResponseBodyInspectionTasksInspectionAlarmRules extends TeaModel {
        // 告警表达式
        @NameInMap("AlarmExpression")
        public String alarmExpression;

        // 告警操作符
        @NameInMap("AlarmOperator")
        public String alarmOperator;

        // 告警值
        @NameInMap("AlarmValue")
        public String alarmValue;

        // 告警实际值
        @NameInMap("ActualValue")
        public String actualValue;

        // 告警级别
        @NameInMap("AlarmLevel")
        public String alarmLevel;

        public static ListTasksHistoriesResponseBodyInspectionTasksInspectionAlarmRules build(java.util.Map<String, ?> map) throws Exception {
            ListTasksHistoriesResponseBodyInspectionTasksInspectionAlarmRules self = new ListTasksHistoriesResponseBodyInspectionTasksInspectionAlarmRules();
            return TeaModel.build(map, self);
        }

        public ListTasksHistoriesResponseBodyInspectionTasksInspectionAlarmRules setAlarmExpression(String alarmExpression) {
            this.alarmExpression = alarmExpression;
            return this;
        }
        public String getAlarmExpression() {
            return this.alarmExpression;
        }

        public ListTasksHistoriesResponseBodyInspectionTasksInspectionAlarmRules setAlarmOperator(String alarmOperator) {
            this.alarmOperator = alarmOperator;
            return this;
        }
        public String getAlarmOperator() {
            return this.alarmOperator;
        }

        public ListTasksHistoriesResponseBodyInspectionTasksInspectionAlarmRules setAlarmValue(String alarmValue) {
            this.alarmValue = alarmValue;
            return this;
        }
        public String getAlarmValue() {
            return this.alarmValue;
        }

        public ListTasksHistoriesResponseBodyInspectionTasksInspectionAlarmRules setActualValue(String actualValue) {
            this.actualValue = actualValue;
            return this;
        }
        public String getActualValue() {
            return this.actualValue;
        }

        public ListTasksHistoriesResponseBodyInspectionTasksInspectionAlarmRules setAlarmLevel(String alarmLevel) {
            this.alarmLevel = alarmLevel;
            return this;
        }
        public String getAlarmLevel() {
            return this.alarmLevel;
        }

    }

    public static class ListTasksHistoriesResponseBodyInspectionTasks extends TeaModel {
        // 巡检结束时间
        @NameInMap("ExecutionEndTime")
        public String executionEndTime;

        // 巡检开始时间
        @NameInMap("ExecutionBeginTime")
        public String executionBeginTime;

        // 巡检结果
        @NameInMap("InspectionResult")
        public String inspectionResult;

        // 告警规则
        @NameInMap("InspectionAlarmRules")
        public java.util.List<ListTasksHistoriesResponseBodyInspectionTasksInspectionAlarmRules> inspectionAlarmRules;

        // 任务ID
        @NameInMap("TaskId")
        public String taskId;

        public static ListTasksHistoriesResponseBodyInspectionTasks build(java.util.Map<String, ?> map) throws Exception {
            ListTasksHistoriesResponseBodyInspectionTasks self = new ListTasksHistoriesResponseBodyInspectionTasks();
            return TeaModel.build(map, self);
        }

        public ListTasksHistoriesResponseBodyInspectionTasks setExecutionEndTime(String executionEndTime) {
            this.executionEndTime = executionEndTime;
            return this;
        }
        public String getExecutionEndTime() {
            return this.executionEndTime;
        }

        public ListTasksHistoriesResponseBodyInspectionTasks setExecutionBeginTime(String executionBeginTime) {
            this.executionBeginTime = executionBeginTime;
            return this;
        }
        public String getExecutionBeginTime() {
            return this.executionBeginTime;
        }

        public ListTasksHistoriesResponseBodyInspectionTasks setInspectionResult(String inspectionResult) {
            this.inspectionResult = inspectionResult;
            return this;
        }
        public String getInspectionResult() {
            return this.inspectionResult;
        }

        public ListTasksHistoriesResponseBodyInspectionTasks setInspectionAlarmRules(java.util.List<ListTasksHistoriesResponseBodyInspectionTasksInspectionAlarmRules> inspectionAlarmRules) {
            this.inspectionAlarmRules = inspectionAlarmRules;
            return this;
        }
        public java.util.List<ListTasksHistoriesResponseBodyInspectionTasksInspectionAlarmRules> getInspectionAlarmRules() {
            return this.inspectionAlarmRules;
        }

        public ListTasksHistoriesResponseBodyInspectionTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}

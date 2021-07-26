// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListInspectionTaskReportsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 内容
    @NameInMap("InspectionTask")
    public java.util.List<ListInspectionTaskReportsResponseBodyInspectionTask> inspectionTask;

    public static ListInspectionTaskReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInspectionTaskReportsResponseBody self = new ListInspectionTaskReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInspectionTaskReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInspectionTaskReportsResponseBody setInspectionTask(java.util.List<ListInspectionTaskReportsResponseBodyInspectionTask> inspectionTask) {
        this.inspectionTask = inspectionTask;
        return this;
    }
    public java.util.List<ListInspectionTaskReportsResponseBodyInspectionTask> getInspectionTask() {
        return this.inspectionTask;
    }

    public static class ListInspectionTaskReportsResponseBodyInspectionTaskAlarmStatistic extends TeaModel {
        // 巡检项
        @NameInMap("InspectionItem")
        public String inspectionItem;

        // 厂商
        @NameInMap("Vendor")
        public String vendor;

        // 型号
        @NameInMap("Model")
        public String model;

        // 高危数量
        @NameInMap("CriticalNumber")
        public Long criticalNumber;

        // 中危数量
        @NameInMap("WarningNumber")
        public Long warningNumber;

        public static ListInspectionTaskReportsResponseBodyInspectionTaskAlarmStatistic build(java.util.Map<String, ?> map) throws Exception {
            ListInspectionTaskReportsResponseBodyInspectionTaskAlarmStatistic self = new ListInspectionTaskReportsResponseBodyInspectionTaskAlarmStatistic();
            return TeaModel.build(map, self);
        }

        public ListInspectionTaskReportsResponseBodyInspectionTaskAlarmStatistic setInspectionItem(String inspectionItem) {
            this.inspectionItem = inspectionItem;
            return this;
        }
        public String getInspectionItem() {
            return this.inspectionItem;
        }

        public ListInspectionTaskReportsResponseBodyInspectionTaskAlarmStatistic setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public ListInspectionTaskReportsResponseBodyInspectionTaskAlarmStatistic setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListInspectionTaskReportsResponseBodyInspectionTaskAlarmStatistic setCriticalNumber(Long criticalNumber) {
            this.criticalNumber = criticalNumber;
            return this;
        }
        public Long getCriticalNumber() {
            return this.criticalNumber;
        }

        public ListInspectionTaskReportsResponseBodyInspectionTaskAlarmStatistic setWarningNumber(Long warningNumber) {
            this.warningNumber = warningNumber;
            return this;
        }
        public Long getWarningNumber() {
            return this.warningNumber;
        }

    }

    public static class ListInspectionTaskReportsResponseBodyInspectionTask extends TeaModel {
        // 总设备数
        @NameInMap("TotalDeviceNumber")
        public Long totalDeviceNumber;

        // 实际设备数
        @NameInMap("ActualDeviceNumber")
        public Long actualDeviceNumber;

        // 设备占比
        @NameInMap("DeviceRate")
        public String deviceRate;

        // 任务数
        @NameInMap("TaskNumber")
        public Long taskNumber;

        // 正在运行任务数
        @NameInMap("RunningTaskNumber")
        public Long runningTaskNumber;

        // 运行占比
        @NameInMap("RunningTaskRate")
        public String runningTaskRate;

        // 成功任务数
        @NameInMap("SuccessTaskNumber")
        public Long successTaskNumber;

        // 成功占比
        @NameInMap("SuccessTaskRate")
        public String successTaskRate;

        // 失败任务数
        @NameInMap("FailureTaskNumber")
        public Long failureTaskNumber;

        // 失败占比
        @NameInMap("FailureTaskRate")
        public String failureTaskRate;

        // 失败详情
        @NameInMap("FailureStatistic")
        public String failureStatistic;

        // 告警数量
        @NameInMap("AlarmNumber")
        public Long alarmNumber;

        // 高危数量
        @NameInMap("CriticalNumber")
        public Long criticalNumber;

        // 高危占比
        @NameInMap("CriticalRate")
        public String criticalRate;

        // 中危数量
        @NameInMap("WarningNumber")
        public Long warningNumber;

        // 中危占比
        @NameInMap("WarningRate")
        public String warningRate;

        // 正常数量
        @NameInMap("NormalNumber")
        public Long normalNumber;

        // 正常占比
        @NameInMap("NormalRate")
        public String normalRate;

        @NameInMap("AlarmStatistic")
        public java.util.List<ListInspectionTaskReportsResponseBodyInspectionTaskAlarmStatistic> alarmStatistic;

        public static ListInspectionTaskReportsResponseBodyInspectionTask build(java.util.Map<String, ?> map) throws Exception {
            ListInspectionTaskReportsResponseBodyInspectionTask self = new ListInspectionTaskReportsResponseBodyInspectionTask();
            return TeaModel.build(map, self);
        }

        public ListInspectionTaskReportsResponseBodyInspectionTask setTotalDeviceNumber(Long totalDeviceNumber) {
            this.totalDeviceNumber = totalDeviceNumber;
            return this;
        }
        public Long getTotalDeviceNumber() {
            return this.totalDeviceNumber;
        }

        public ListInspectionTaskReportsResponseBodyInspectionTask setActualDeviceNumber(Long actualDeviceNumber) {
            this.actualDeviceNumber = actualDeviceNumber;
            return this;
        }
        public Long getActualDeviceNumber() {
            return this.actualDeviceNumber;
        }

        public ListInspectionTaskReportsResponseBodyInspectionTask setDeviceRate(String deviceRate) {
            this.deviceRate = deviceRate;
            return this;
        }
        public String getDeviceRate() {
            return this.deviceRate;
        }

        public ListInspectionTaskReportsResponseBodyInspectionTask setTaskNumber(Long taskNumber) {
            this.taskNumber = taskNumber;
            return this;
        }
        public Long getTaskNumber() {
            return this.taskNumber;
        }

        public ListInspectionTaskReportsResponseBodyInspectionTask setRunningTaskNumber(Long runningTaskNumber) {
            this.runningTaskNumber = runningTaskNumber;
            return this;
        }
        public Long getRunningTaskNumber() {
            return this.runningTaskNumber;
        }

        public ListInspectionTaskReportsResponseBodyInspectionTask setRunningTaskRate(String runningTaskRate) {
            this.runningTaskRate = runningTaskRate;
            return this;
        }
        public String getRunningTaskRate() {
            return this.runningTaskRate;
        }

        public ListInspectionTaskReportsResponseBodyInspectionTask setSuccessTaskNumber(Long successTaskNumber) {
            this.successTaskNumber = successTaskNumber;
            return this;
        }
        public Long getSuccessTaskNumber() {
            return this.successTaskNumber;
        }

        public ListInspectionTaskReportsResponseBodyInspectionTask setSuccessTaskRate(String successTaskRate) {
            this.successTaskRate = successTaskRate;
            return this;
        }
        public String getSuccessTaskRate() {
            return this.successTaskRate;
        }

        public ListInspectionTaskReportsResponseBodyInspectionTask setFailureTaskNumber(Long failureTaskNumber) {
            this.failureTaskNumber = failureTaskNumber;
            return this;
        }
        public Long getFailureTaskNumber() {
            return this.failureTaskNumber;
        }

        public ListInspectionTaskReportsResponseBodyInspectionTask setFailureTaskRate(String failureTaskRate) {
            this.failureTaskRate = failureTaskRate;
            return this;
        }
        public String getFailureTaskRate() {
            return this.failureTaskRate;
        }

        public ListInspectionTaskReportsResponseBodyInspectionTask setFailureStatistic(String failureStatistic) {
            this.failureStatistic = failureStatistic;
            return this;
        }
        public String getFailureStatistic() {
            return this.failureStatistic;
        }

        public ListInspectionTaskReportsResponseBodyInspectionTask setAlarmNumber(Long alarmNumber) {
            this.alarmNumber = alarmNumber;
            return this;
        }
        public Long getAlarmNumber() {
            return this.alarmNumber;
        }

        public ListInspectionTaskReportsResponseBodyInspectionTask setCriticalNumber(Long criticalNumber) {
            this.criticalNumber = criticalNumber;
            return this;
        }
        public Long getCriticalNumber() {
            return this.criticalNumber;
        }

        public ListInspectionTaskReportsResponseBodyInspectionTask setCriticalRate(String criticalRate) {
            this.criticalRate = criticalRate;
            return this;
        }
        public String getCriticalRate() {
            return this.criticalRate;
        }

        public ListInspectionTaskReportsResponseBodyInspectionTask setWarningNumber(Long warningNumber) {
            this.warningNumber = warningNumber;
            return this;
        }
        public Long getWarningNumber() {
            return this.warningNumber;
        }

        public ListInspectionTaskReportsResponseBodyInspectionTask setWarningRate(String warningRate) {
            this.warningRate = warningRate;
            return this;
        }
        public String getWarningRate() {
            return this.warningRate;
        }

        public ListInspectionTaskReportsResponseBodyInspectionTask setNormalNumber(Long normalNumber) {
            this.normalNumber = normalNumber;
            return this;
        }
        public Long getNormalNumber() {
            return this.normalNumber;
        }

        public ListInspectionTaskReportsResponseBodyInspectionTask setNormalRate(String normalRate) {
            this.normalRate = normalRate;
            return this;
        }
        public String getNormalRate() {
            return this.normalRate;
        }

        public ListInspectionTaskReportsResponseBodyInspectionTask setAlarmStatistic(java.util.List<ListInspectionTaskReportsResponseBodyInspectionTaskAlarmStatistic> alarmStatistic) {
            this.alarmStatistic = alarmStatistic;
            return this;
        }
        public java.util.List<ListInspectionTaskReportsResponseBodyInspectionTaskAlarmStatistic> getAlarmStatistic() {
            return this.alarmStatistic;
        }

    }

}

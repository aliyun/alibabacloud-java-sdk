// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListInspectionTaskReportsResponseBody extends TeaModel {
    @NameInMap("InspectionTask")
    public java.util.List<ListInspectionTaskReportsResponseBodyInspectionTask> inspectionTask;

    @NameInMap("RequestId")
    public String requestId;

    public static ListInspectionTaskReportsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInspectionTaskReportsResponseBody self = new ListInspectionTaskReportsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInspectionTaskReportsResponseBody setInspectionTask(java.util.List<ListInspectionTaskReportsResponseBodyInspectionTask> inspectionTask) {
        this.inspectionTask = inspectionTask;
        return this;
    }
    public java.util.List<ListInspectionTaskReportsResponseBodyInspectionTask> getInspectionTask() {
        return this.inspectionTask;
    }

    public ListInspectionTaskReportsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListInspectionTaskReportsResponseBodyInspectionTaskAlarmStatistic extends TeaModel {
        @NameInMap("CriticalNumber")
        public Long criticalNumber;

        @NameInMap("InspectionItem")
        public String inspectionItem;

        @NameInMap("Model")
        public String model;

        @NameInMap("Vendor")
        public String vendor;

        @NameInMap("WarningNumber")
        public Long warningNumber;

        public static ListInspectionTaskReportsResponseBodyInspectionTaskAlarmStatistic build(java.util.Map<String, ?> map) throws Exception {
            ListInspectionTaskReportsResponseBodyInspectionTaskAlarmStatistic self = new ListInspectionTaskReportsResponseBodyInspectionTaskAlarmStatistic();
            return TeaModel.build(map, self);
        }

        public ListInspectionTaskReportsResponseBodyInspectionTaskAlarmStatistic setCriticalNumber(Long criticalNumber) {
            this.criticalNumber = criticalNumber;
            return this;
        }
        public Long getCriticalNumber() {
            return this.criticalNumber;
        }

        public ListInspectionTaskReportsResponseBodyInspectionTaskAlarmStatistic setInspectionItem(String inspectionItem) {
            this.inspectionItem = inspectionItem;
            return this;
        }
        public String getInspectionItem() {
            return this.inspectionItem;
        }

        public ListInspectionTaskReportsResponseBodyInspectionTaskAlarmStatistic setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListInspectionTaskReportsResponseBodyInspectionTaskAlarmStatistic setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
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
        @NameInMap("ActualDeviceNumber")
        public Long actualDeviceNumber;

        @NameInMap("AlarmNumber")
        public Long alarmNumber;

        @NameInMap("AlarmStatistic")
        public java.util.List<ListInspectionTaskReportsResponseBodyInspectionTaskAlarmStatistic> alarmStatistic;

        @NameInMap("CriticalNumber")
        public Long criticalNumber;

        @NameInMap("CriticalRate")
        public String criticalRate;

        @NameInMap("DeviceRate")
        public String deviceRate;

        @NameInMap("FailureStatistic")
        public String failureStatistic;

        @NameInMap("FailureTaskNumber")
        public Long failureTaskNumber;

        @NameInMap("FailureTaskRate")
        public String failureTaskRate;

        @NameInMap("NormalNumber")
        public Long normalNumber;

        @NameInMap("NormalRate")
        public String normalRate;

        @NameInMap("RunningTaskNumber")
        public Long runningTaskNumber;

        @NameInMap("RunningTaskRate")
        public String runningTaskRate;

        @NameInMap("SuccessTaskNumber")
        public Long successTaskNumber;

        @NameInMap("SuccessTaskRate")
        public String successTaskRate;

        @NameInMap("TaskNumber")
        public Long taskNumber;

        @NameInMap("TotalDeviceNumber")
        public Long totalDeviceNumber;

        @NameInMap("WarningNumber")
        public Long warningNumber;

        @NameInMap("WarningRate")
        public String warningRate;

        public static ListInspectionTaskReportsResponseBodyInspectionTask build(java.util.Map<String, ?> map) throws Exception {
            ListInspectionTaskReportsResponseBodyInspectionTask self = new ListInspectionTaskReportsResponseBodyInspectionTask();
            return TeaModel.build(map, self);
        }

        public ListInspectionTaskReportsResponseBodyInspectionTask setActualDeviceNumber(Long actualDeviceNumber) {
            this.actualDeviceNumber = actualDeviceNumber;
            return this;
        }
        public Long getActualDeviceNumber() {
            return this.actualDeviceNumber;
        }

        public ListInspectionTaskReportsResponseBodyInspectionTask setAlarmNumber(Long alarmNumber) {
            this.alarmNumber = alarmNumber;
            return this;
        }
        public Long getAlarmNumber() {
            return this.alarmNumber;
        }

        public ListInspectionTaskReportsResponseBodyInspectionTask setAlarmStatistic(java.util.List<ListInspectionTaskReportsResponseBodyInspectionTaskAlarmStatistic> alarmStatistic) {
            this.alarmStatistic = alarmStatistic;
            return this;
        }
        public java.util.List<ListInspectionTaskReportsResponseBodyInspectionTaskAlarmStatistic> getAlarmStatistic() {
            return this.alarmStatistic;
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

        public ListInspectionTaskReportsResponseBodyInspectionTask setDeviceRate(String deviceRate) {
            this.deviceRate = deviceRate;
            return this;
        }
        public String getDeviceRate() {
            return this.deviceRate;
        }

        public ListInspectionTaskReportsResponseBodyInspectionTask setFailureStatistic(String failureStatistic) {
            this.failureStatistic = failureStatistic;
            return this;
        }
        public String getFailureStatistic() {
            return this.failureStatistic;
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

        public ListInspectionTaskReportsResponseBodyInspectionTask setTaskNumber(Long taskNumber) {
            this.taskNumber = taskNumber;
            return this;
        }
        public Long getTaskNumber() {
            return this.taskNumber;
        }

        public ListInspectionTaskReportsResponseBodyInspectionTask setTotalDeviceNumber(Long totalDeviceNumber) {
            this.totalDeviceNumber = totalDeviceNumber;
            return this;
        }
        public Long getTotalDeviceNumber() {
            return this.totalDeviceNumber;
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

    }

}

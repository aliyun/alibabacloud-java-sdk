// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListWorkOrdersResponseBody extends TeaModel {
    @NameInMap("Content")
    public java.util.List<ListWorkOrdersResponseBodyContent> content;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public Integer nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListWorkOrdersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkOrdersResponseBody self = new ListWorkOrdersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkOrdersResponseBody setContent(java.util.List<ListWorkOrdersResponseBodyContent> content) {
        this.content = content;
        return this;
    }
    public java.util.List<ListWorkOrdersResponseBodyContent> getContent() {
        return this.content;
    }

    public ListWorkOrdersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWorkOrdersResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListWorkOrdersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkOrdersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListWorkOrdersResponseBodyContentWorkOrderOperationDtos extends TeaModel {
        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Operation")
        public String operation;

        @NameInMap("OperationId")
        public String operationId;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("WorkOrderId")
        public String workOrderId;

        public static ListWorkOrdersResponseBodyContentWorkOrderOperationDtos build(java.util.Map<String, ?> map) throws Exception {
            ListWorkOrdersResponseBodyContentWorkOrderOperationDtos self = new ListWorkOrdersResponseBodyContentWorkOrderOperationDtos();
            return TeaModel.build(map, self);
        }

        public ListWorkOrdersResponseBodyContentWorkOrderOperationDtos setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListWorkOrdersResponseBodyContentWorkOrderOperationDtos setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public ListWorkOrdersResponseBodyContentWorkOrderOperationDtos setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

        public ListWorkOrdersResponseBodyContentWorkOrderOperationDtos setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListWorkOrdersResponseBodyContentWorkOrderOperationDtos setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListWorkOrdersResponseBodyContentWorkOrderOperationDtos setWorkOrderId(String workOrderId) {
            this.workOrderId = workOrderId;
            return this;
        }
        public String getWorkOrderId() {
            return this.workOrderId;
        }

    }

    public static class ListWorkOrdersResponseBodyContent extends TeaModel {
        @NameInMap("AlarmHappenTime")
        public String alarmHappenTime;

        @NameInMap("AlarmRecoverTime")
        public String alarmRecoverTime;

        @NameInMap("AlarmRelated")
        public String alarmRelated;

        @NameInMap("Area")
        public String area;

        @NameInMap("CircuitId")
        public String circuitId;

        @NameInMap("CircuitName")
        public String circuitName;

        @NameInMap("CircuitType")
        public String circuitType;

        @NameInMap("DeviceAlarmInfo")
        public String deviceAlarmInfo;

        @NameInMap("DeviceIp")
        public String deviceIp;

        @NameInMap("DeviceIpA")
        public String deviceIpA;

        @NameInMap("DeviceIpB")
        public String deviceIpB;

        @NameInMap("DeviceModelA")
        public String deviceModelA;

        @NameInMap("DeviceModelB")
        public String deviceModelB;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceNameA")
        public String deviceNameA;

        @NameInMap("DeviceNameB")
        public String deviceNameB;

        @NameInMap("DevicePortA")
        public String devicePortA;

        @NameInMap("DevicePortB")
        public String devicePortB;

        @NameInMap("DeviceSnA")
        public String deviceSnA;

        @NameInMap("DeviceSnB")
        public String deviceSnB;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("DeviceVendor")
        public String deviceVendor;

        @NameInMap("DeviceVendorA")
        public String deviceVendorA;

        @NameInMap("DeviceVendorB")
        public String deviceVendorB;

        @NameInMap("EmergencyDegree")
        public String emergencyDegree;

        @NameInMap("Extra")
        public String extra;

        @NameInMap("FaultDuration")
        public String faultDuration;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("HangFileName")
        public String hangFileName;

        @NameInMap("HangFilePath")
        public String hangFilePath;

        @NameInMap("HangReason")
        public String hangReason;

        @NameInMap("ImpactBusiness")
        public String impactBusiness;

        @NameInMap("IncidentDescription")
        public String incidentDescription;

        @NameInMap("IncidentSubType")
        public String incidentSubType;

        @NameInMap("IncidentType")
        public String incidentType;

        @NameInMap("LiableMan")
        public String liableMan;

        @NameInMap("LinkMan")
        public String linkMan;

        @NameInMap("OriginalSubjectAlarm")
        public String originalSubjectAlarm;

        @NameInMap("ProcessLimited")
        public String processLimited;

        @NameInMap("ProcessMan")
        public String processMan;

        @NameInMap("ProcessManId")
        public String processManId;

        @NameInMap("ProcessResult")
        public String processResult;

        @NameInMap("SkillGroups")
        public String skillGroups;

        @NameInMap("Timeout")
        public String timeout;

        @NameInMap("WorkOrderId")
        public String workOrderId;

        @NameInMap("WorkOrderOperationDtos")
        public java.util.List<ListWorkOrdersResponseBodyContentWorkOrderOperationDtos> workOrderOperationDtos;

        @NameInMap("WorkOrderSource")
        public String workOrderSource;

        @NameInMap("WorkOrderStep")
        public String workOrderStep;

        @NameInMap("WorkOrderTitle")
        public String workOrderTitle;

        @NameInMap("WorkOrderType")
        public String workOrderType;

        public static ListWorkOrdersResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListWorkOrdersResponseBodyContent self = new ListWorkOrdersResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListWorkOrdersResponseBodyContent setAlarmHappenTime(String alarmHappenTime) {
            this.alarmHappenTime = alarmHappenTime;
            return this;
        }
        public String getAlarmHappenTime() {
            return this.alarmHappenTime;
        }

        public ListWorkOrdersResponseBodyContent setAlarmRecoverTime(String alarmRecoverTime) {
            this.alarmRecoverTime = alarmRecoverTime;
            return this;
        }
        public String getAlarmRecoverTime() {
            return this.alarmRecoverTime;
        }

        public ListWorkOrdersResponseBodyContent setAlarmRelated(String alarmRelated) {
            this.alarmRelated = alarmRelated;
            return this;
        }
        public String getAlarmRelated() {
            return this.alarmRelated;
        }

        public ListWorkOrdersResponseBodyContent setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public ListWorkOrdersResponseBodyContent setCircuitId(String circuitId) {
            this.circuitId = circuitId;
            return this;
        }
        public String getCircuitId() {
            return this.circuitId;
        }

        public ListWorkOrdersResponseBodyContent setCircuitName(String circuitName) {
            this.circuitName = circuitName;
            return this;
        }
        public String getCircuitName() {
            return this.circuitName;
        }

        public ListWorkOrdersResponseBodyContent setCircuitType(String circuitType) {
            this.circuitType = circuitType;
            return this;
        }
        public String getCircuitType() {
            return this.circuitType;
        }

        public ListWorkOrdersResponseBodyContent setDeviceAlarmInfo(String deviceAlarmInfo) {
            this.deviceAlarmInfo = deviceAlarmInfo;
            return this;
        }
        public String getDeviceAlarmInfo() {
            return this.deviceAlarmInfo;
        }

        public ListWorkOrdersResponseBodyContent setDeviceIp(String deviceIp) {
            this.deviceIp = deviceIp;
            return this;
        }
        public String getDeviceIp() {
            return this.deviceIp;
        }

        public ListWorkOrdersResponseBodyContent setDeviceIpA(String deviceIpA) {
            this.deviceIpA = deviceIpA;
            return this;
        }
        public String getDeviceIpA() {
            return this.deviceIpA;
        }

        public ListWorkOrdersResponseBodyContent setDeviceIpB(String deviceIpB) {
            this.deviceIpB = deviceIpB;
            return this;
        }
        public String getDeviceIpB() {
            return this.deviceIpB;
        }

        public ListWorkOrdersResponseBodyContent setDeviceModelA(String deviceModelA) {
            this.deviceModelA = deviceModelA;
            return this;
        }
        public String getDeviceModelA() {
            return this.deviceModelA;
        }

        public ListWorkOrdersResponseBodyContent setDeviceModelB(String deviceModelB) {
            this.deviceModelB = deviceModelB;
            return this;
        }
        public String getDeviceModelB() {
            return this.deviceModelB;
        }

        public ListWorkOrdersResponseBodyContent setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListWorkOrdersResponseBodyContent setDeviceNameA(String deviceNameA) {
            this.deviceNameA = deviceNameA;
            return this;
        }
        public String getDeviceNameA() {
            return this.deviceNameA;
        }

        public ListWorkOrdersResponseBodyContent setDeviceNameB(String deviceNameB) {
            this.deviceNameB = deviceNameB;
            return this;
        }
        public String getDeviceNameB() {
            return this.deviceNameB;
        }

        public ListWorkOrdersResponseBodyContent setDevicePortA(String devicePortA) {
            this.devicePortA = devicePortA;
            return this;
        }
        public String getDevicePortA() {
            return this.devicePortA;
        }

        public ListWorkOrdersResponseBodyContent setDevicePortB(String devicePortB) {
            this.devicePortB = devicePortB;
            return this;
        }
        public String getDevicePortB() {
            return this.devicePortB;
        }

        public ListWorkOrdersResponseBodyContent setDeviceSnA(String deviceSnA) {
            this.deviceSnA = deviceSnA;
            return this;
        }
        public String getDeviceSnA() {
            return this.deviceSnA;
        }

        public ListWorkOrdersResponseBodyContent setDeviceSnB(String deviceSnB) {
            this.deviceSnB = deviceSnB;
            return this;
        }
        public String getDeviceSnB() {
            return this.deviceSnB;
        }

        public ListWorkOrdersResponseBodyContent setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public ListWorkOrdersResponseBodyContent setDeviceVendor(String deviceVendor) {
            this.deviceVendor = deviceVendor;
            return this;
        }
        public String getDeviceVendor() {
            return this.deviceVendor;
        }

        public ListWorkOrdersResponseBodyContent setDeviceVendorA(String deviceVendorA) {
            this.deviceVendorA = deviceVendorA;
            return this;
        }
        public String getDeviceVendorA() {
            return this.deviceVendorA;
        }

        public ListWorkOrdersResponseBodyContent setDeviceVendorB(String deviceVendorB) {
            this.deviceVendorB = deviceVendorB;
            return this;
        }
        public String getDeviceVendorB() {
            return this.deviceVendorB;
        }

        public ListWorkOrdersResponseBodyContent setEmergencyDegree(String emergencyDegree) {
            this.emergencyDegree = emergencyDegree;
            return this;
        }
        public String getEmergencyDegree() {
            return this.emergencyDegree;
        }

        public ListWorkOrdersResponseBodyContent setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public ListWorkOrdersResponseBodyContent setFaultDuration(String faultDuration) {
            this.faultDuration = faultDuration;
            return this;
        }
        public String getFaultDuration() {
            return this.faultDuration;
        }

        public ListWorkOrdersResponseBodyContent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListWorkOrdersResponseBodyContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListWorkOrdersResponseBodyContent setHangFileName(String hangFileName) {
            this.hangFileName = hangFileName;
            return this;
        }
        public String getHangFileName() {
            return this.hangFileName;
        }

        public ListWorkOrdersResponseBodyContent setHangFilePath(String hangFilePath) {
            this.hangFilePath = hangFilePath;
            return this;
        }
        public String getHangFilePath() {
            return this.hangFilePath;
        }

        public ListWorkOrdersResponseBodyContent setHangReason(String hangReason) {
            this.hangReason = hangReason;
            return this;
        }
        public String getHangReason() {
            return this.hangReason;
        }

        public ListWorkOrdersResponseBodyContent setImpactBusiness(String impactBusiness) {
            this.impactBusiness = impactBusiness;
            return this;
        }
        public String getImpactBusiness() {
            return this.impactBusiness;
        }

        public ListWorkOrdersResponseBodyContent setIncidentDescription(String incidentDescription) {
            this.incidentDescription = incidentDescription;
            return this;
        }
        public String getIncidentDescription() {
            return this.incidentDescription;
        }

        public ListWorkOrdersResponseBodyContent setIncidentSubType(String incidentSubType) {
            this.incidentSubType = incidentSubType;
            return this;
        }
        public String getIncidentSubType() {
            return this.incidentSubType;
        }

        public ListWorkOrdersResponseBodyContent setIncidentType(String incidentType) {
            this.incidentType = incidentType;
            return this;
        }
        public String getIncidentType() {
            return this.incidentType;
        }

        public ListWorkOrdersResponseBodyContent setLiableMan(String liableMan) {
            this.liableMan = liableMan;
            return this;
        }
        public String getLiableMan() {
            return this.liableMan;
        }

        public ListWorkOrdersResponseBodyContent setLinkMan(String linkMan) {
            this.linkMan = linkMan;
            return this;
        }
        public String getLinkMan() {
            return this.linkMan;
        }

        public ListWorkOrdersResponseBodyContent setOriginalSubjectAlarm(String originalSubjectAlarm) {
            this.originalSubjectAlarm = originalSubjectAlarm;
            return this;
        }
        public String getOriginalSubjectAlarm() {
            return this.originalSubjectAlarm;
        }

        public ListWorkOrdersResponseBodyContent setProcessLimited(String processLimited) {
            this.processLimited = processLimited;
            return this;
        }
        public String getProcessLimited() {
            return this.processLimited;
        }

        public ListWorkOrdersResponseBodyContent setProcessMan(String processMan) {
            this.processMan = processMan;
            return this;
        }
        public String getProcessMan() {
            return this.processMan;
        }

        public ListWorkOrdersResponseBodyContent setProcessManId(String processManId) {
            this.processManId = processManId;
            return this;
        }
        public String getProcessManId() {
            return this.processManId;
        }

        public ListWorkOrdersResponseBodyContent setProcessResult(String processResult) {
            this.processResult = processResult;
            return this;
        }
        public String getProcessResult() {
            return this.processResult;
        }

        public ListWorkOrdersResponseBodyContent setSkillGroups(String skillGroups) {
            this.skillGroups = skillGroups;
            return this;
        }
        public String getSkillGroups() {
            return this.skillGroups;
        }

        public ListWorkOrdersResponseBodyContent setTimeout(String timeout) {
            this.timeout = timeout;
            return this;
        }
        public String getTimeout() {
            return this.timeout;
        }

        public ListWorkOrdersResponseBodyContent setWorkOrderId(String workOrderId) {
            this.workOrderId = workOrderId;
            return this;
        }
        public String getWorkOrderId() {
            return this.workOrderId;
        }

        public ListWorkOrdersResponseBodyContent setWorkOrderOperationDtos(java.util.List<ListWorkOrdersResponseBodyContentWorkOrderOperationDtos> workOrderOperationDtos) {
            this.workOrderOperationDtos = workOrderOperationDtos;
            return this;
        }
        public java.util.List<ListWorkOrdersResponseBodyContentWorkOrderOperationDtos> getWorkOrderOperationDtos() {
            return this.workOrderOperationDtos;
        }

        public ListWorkOrdersResponseBodyContent setWorkOrderSource(String workOrderSource) {
            this.workOrderSource = workOrderSource;
            return this;
        }
        public String getWorkOrderSource() {
            return this.workOrderSource;
        }

        public ListWorkOrdersResponseBodyContent setWorkOrderStep(String workOrderStep) {
            this.workOrderStep = workOrderStep;
            return this;
        }
        public String getWorkOrderStep() {
            return this.workOrderStep;
        }

        public ListWorkOrdersResponseBodyContent setWorkOrderTitle(String workOrderTitle) {
            this.workOrderTitle = workOrderTitle;
            return this;
        }
        public String getWorkOrderTitle() {
            return this.workOrderTitle;
        }

        public ListWorkOrdersResponseBodyContent setWorkOrderType(String workOrderType) {
            this.workOrderType = workOrderType;
            return this;
        }
        public String getWorkOrderType() {
            return this.workOrderType;
        }

    }

}

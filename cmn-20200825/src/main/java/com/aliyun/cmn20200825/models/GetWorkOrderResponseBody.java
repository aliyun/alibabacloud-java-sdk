// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetWorkOrderResponseBody extends TeaModel {
    @NameInMap("Content")
    public GetWorkOrderResponseBodyContent content;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static GetWorkOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkOrderResponseBody self = new GetWorkOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkOrderResponseBody setContent(GetWorkOrderResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public GetWorkOrderResponseBodyContent getContent() {
        return this.content;
    }

    public GetWorkOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetWorkOrderResponseBodyContentWorkOrderOperationDtos extends TeaModel {
        // 创建时间
        @NameInMap("GmtCreate")
        public String gmtCreate;

        // 操作
        @NameInMap("Operation")
        public String operation;

        // 操作编号
        @NameInMap("OperationId")
        public String operationId;

        // 操作人
        @NameInMap("Operator")
        public String operator;

        // 备注
        @NameInMap("Remark")
        public String remark;

        // 工单编号
        @NameInMap("WorkOrderId")
        public String workOrderId;

        public static GetWorkOrderResponseBodyContentWorkOrderOperationDtos build(java.util.Map<String, ?> map) throws Exception {
            GetWorkOrderResponseBodyContentWorkOrderOperationDtos self = new GetWorkOrderResponseBodyContentWorkOrderOperationDtos();
            return TeaModel.build(map, self);
        }

        public GetWorkOrderResponseBodyContentWorkOrderOperationDtos setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetWorkOrderResponseBodyContentWorkOrderOperationDtos setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public GetWorkOrderResponseBodyContentWorkOrderOperationDtos setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

        public GetWorkOrderResponseBodyContentWorkOrderOperationDtos setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetWorkOrderResponseBodyContentWorkOrderOperationDtos setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetWorkOrderResponseBodyContentWorkOrderOperationDtos setWorkOrderId(String workOrderId) {
            this.workOrderId = workOrderId;
            return this;
        }
        public String getWorkOrderId() {
            return this.workOrderId;
        }

    }

    public static class GetWorkOrderResponseBodyContent extends TeaModel {
        // 告警发生时间
        @NameInMap("AlarmHappenTime")
        public String alarmHappenTime;

        // 告警恢复时间
        @NameInMap("AlarmRecoverTime")
        public String alarmRecoverTime;

        // 关联告警项
        @NameInMap("AlarmRelated")
        public String alarmRelated;

        // 区域
        @NameInMap("Area")
        public String area;

        // 电路编码
        @NameInMap("CircuitId")
        public String circuitId;

        // 电路名
        @NameInMap("CircuitName")
        public String circuitName;

        // 电路类型
        @NameInMap("CircuitType")
        public String circuitType;

        // 设备告警信息
        @NameInMap("DeviceAlarmInfo")
        public String deviceAlarmInfo;

        // 设备IP
        @NameInMap("DeviceIp")
        public String deviceIp;

        // A-IP
        @NameInMap("DeviceIpA")
        public String deviceIpA;

        // B-IP
        @NameInMap("DeviceIpB")
        public String deviceIpB;

        // A-设备型号
        @NameInMap("DeviceModelA")
        public String deviceModelA;

        // B-设备型号
        @NameInMap("DeviceModelB")
        public String deviceModelB;

        // 设备名
        @NameInMap("DeviceName")
        public String deviceName;

        // A-设备名
        @NameInMap("DeviceNameA")
        public String deviceNameA;

        // B-设备名
        @NameInMap("DeviceNameB")
        public String deviceNameB;

        // A-端口
        @NameInMap("DevicePortA")
        public String devicePortA;

        // B-端口
        @NameInMap("DevicePortB")
        public String devicePortB;

        // A-设备SN
        @NameInMap("DeviceSnA")
        public String deviceSnA;

        // B-设备SN
        @NameInMap("DeviceSnB")
        public String deviceSnB;

        // 设备类型
        @NameInMap("DeviceType")
        public String deviceType;

        // 设备厂家
        @NameInMap("DeviceVendor")
        public String deviceVendor;

        // A-厂家
        @NameInMap("DeviceVendorA")
        public String deviceVendorA;

        // B-厂家
        @NameInMap("DeviceVendorB")
        public String deviceVendorB;

        // 紧急程度
        @NameInMap("EmergencyDegree")
        public String emergencyDegree;

        // 额外字段
        @NameInMap("Extra")
        public String extra;

        // 故障时常(时)
        @NameInMap("FaultDuration")
        public String faultDuration;

        // 创建时间
        @NameInMap("GmtCreate")
        public String gmtCreate;

        // 修改时间
        @NameInMap("GmtModified")
        public String gmtModified;

        // 文件名
        @NameInMap("HangFileName")
        public String hangFileName;

        // 文件id
        @NameInMap("HangFilePath")
        public String hangFilePath;

        // 挂起/转交原因
        @NameInMap("HangReason")
        public String hangReason;

        // 是否影响业务
        @NameInMap("ImpactBusiness")
        public String impactBusiness;

        // 问题描述
        @NameInMap("IncidentDescription")
        public String incidentDescription;

        // 故障小类
        @NameInMap("IncidentSubType")
        public String incidentSubType;

        // 故障分类
        @NameInMap("IncidentType")
        public String incidentType;

        // 责任人
        @NameInMap("LiableMan")
        public String liableMan;

        // 用户/联系人
        @NameInMap("LinkMan")
        public String linkMan;

        // 告警源主体
        @NameInMap("OriginalSubjectAlarm")
        public String originalSubjectAlarm;

        // 处理时限
        @NameInMap("ProcessLimited")
        public String processLimited;

        // 处理人
        @NameInMap("ProcessMan")
        public String processMan;

        // 处理人编号
        @NameInMap("ProcessManId")
        public String processManId;

        // 处理结果
        @NameInMap("ProcessResult")
        public String processResult;

        // 技能组
        @NameInMap("SkillGroups")
        public String skillGroups;

        // 是否超时
        @NameInMap("Timeout")
        public String timeout;

        // 工单编号
        @NameInMap("WorkOrderId")
        public String workOrderId;

        // 操作流水
        @NameInMap("WorkOrderOperationDtos")
        public java.util.List<GetWorkOrderResponseBodyContentWorkOrderOperationDtos> workOrderOperationDtos;

        // 工单来源
        @NameInMap("WorkOrderSource")
        public String workOrderSource;

        // 工单状态
        @NameInMap("WorkOrderStep")
        public String workOrderStep;

        // 工单标题
        @NameInMap("WorkOrderTitle")
        public String workOrderTitle;

        // 工单类型
        @NameInMap("WorkOrderType")
        public String workOrderType;

        public static GetWorkOrderResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            GetWorkOrderResponseBodyContent self = new GetWorkOrderResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public GetWorkOrderResponseBodyContent setAlarmHappenTime(String alarmHappenTime) {
            this.alarmHappenTime = alarmHappenTime;
            return this;
        }
        public String getAlarmHappenTime() {
            return this.alarmHappenTime;
        }

        public GetWorkOrderResponseBodyContent setAlarmRecoverTime(String alarmRecoverTime) {
            this.alarmRecoverTime = alarmRecoverTime;
            return this;
        }
        public String getAlarmRecoverTime() {
            return this.alarmRecoverTime;
        }

        public GetWorkOrderResponseBodyContent setAlarmRelated(String alarmRelated) {
            this.alarmRelated = alarmRelated;
            return this;
        }
        public String getAlarmRelated() {
            return this.alarmRelated;
        }

        public GetWorkOrderResponseBodyContent setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public GetWorkOrderResponseBodyContent setCircuitId(String circuitId) {
            this.circuitId = circuitId;
            return this;
        }
        public String getCircuitId() {
            return this.circuitId;
        }

        public GetWorkOrderResponseBodyContent setCircuitName(String circuitName) {
            this.circuitName = circuitName;
            return this;
        }
        public String getCircuitName() {
            return this.circuitName;
        }

        public GetWorkOrderResponseBodyContent setCircuitType(String circuitType) {
            this.circuitType = circuitType;
            return this;
        }
        public String getCircuitType() {
            return this.circuitType;
        }

        public GetWorkOrderResponseBodyContent setDeviceAlarmInfo(String deviceAlarmInfo) {
            this.deviceAlarmInfo = deviceAlarmInfo;
            return this;
        }
        public String getDeviceAlarmInfo() {
            return this.deviceAlarmInfo;
        }

        public GetWorkOrderResponseBodyContent setDeviceIp(String deviceIp) {
            this.deviceIp = deviceIp;
            return this;
        }
        public String getDeviceIp() {
            return this.deviceIp;
        }

        public GetWorkOrderResponseBodyContent setDeviceIpA(String deviceIpA) {
            this.deviceIpA = deviceIpA;
            return this;
        }
        public String getDeviceIpA() {
            return this.deviceIpA;
        }

        public GetWorkOrderResponseBodyContent setDeviceIpB(String deviceIpB) {
            this.deviceIpB = deviceIpB;
            return this;
        }
        public String getDeviceIpB() {
            return this.deviceIpB;
        }

        public GetWorkOrderResponseBodyContent setDeviceModelA(String deviceModelA) {
            this.deviceModelA = deviceModelA;
            return this;
        }
        public String getDeviceModelA() {
            return this.deviceModelA;
        }

        public GetWorkOrderResponseBodyContent setDeviceModelB(String deviceModelB) {
            this.deviceModelB = deviceModelB;
            return this;
        }
        public String getDeviceModelB() {
            return this.deviceModelB;
        }

        public GetWorkOrderResponseBodyContent setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public GetWorkOrderResponseBodyContent setDeviceNameA(String deviceNameA) {
            this.deviceNameA = deviceNameA;
            return this;
        }
        public String getDeviceNameA() {
            return this.deviceNameA;
        }

        public GetWorkOrderResponseBodyContent setDeviceNameB(String deviceNameB) {
            this.deviceNameB = deviceNameB;
            return this;
        }
        public String getDeviceNameB() {
            return this.deviceNameB;
        }

        public GetWorkOrderResponseBodyContent setDevicePortA(String devicePortA) {
            this.devicePortA = devicePortA;
            return this;
        }
        public String getDevicePortA() {
            return this.devicePortA;
        }

        public GetWorkOrderResponseBodyContent setDevicePortB(String devicePortB) {
            this.devicePortB = devicePortB;
            return this;
        }
        public String getDevicePortB() {
            return this.devicePortB;
        }

        public GetWorkOrderResponseBodyContent setDeviceSnA(String deviceSnA) {
            this.deviceSnA = deviceSnA;
            return this;
        }
        public String getDeviceSnA() {
            return this.deviceSnA;
        }

        public GetWorkOrderResponseBodyContent setDeviceSnB(String deviceSnB) {
            this.deviceSnB = deviceSnB;
            return this;
        }
        public String getDeviceSnB() {
            return this.deviceSnB;
        }

        public GetWorkOrderResponseBodyContent setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public GetWorkOrderResponseBodyContent setDeviceVendor(String deviceVendor) {
            this.deviceVendor = deviceVendor;
            return this;
        }
        public String getDeviceVendor() {
            return this.deviceVendor;
        }

        public GetWorkOrderResponseBodyContent setDeviceVendorA(String deviceVendorA) {
            this.deviceVendorA = deviceVendorA;
            return this;
        }
        public String getDeviceVendorA() {
            return this.deviceVendorA;
        }

        public GetWorkOrderResponseBodyContent setDeviceVendorB(String deviceVendorB) {
            this.deviceVendorB = deviceVendorB;
            return this;
        }
        public String getDeviceVendorB() {
            return this.deviceVendorB;
        }

        public GetWorkOrderResponseBodyContent setEmergencyDegree(String emergencyDegree) {
            this.emergencyDegree = emergencyDegree;
            return this;
        }
        public String getEmergencyDegree() {
            return this.emergencyDegree;
        }

        public GetWorkOrderResponseBodyContent setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public GetWorkOrderResponseBodyContent setFaultDuration(String faultDuration) {
            this.faultDuration = faultDuration;
            return this;
        }
        public String getFaultDuration() {
            return this.faultDuration;
        }

        public GetWorkOrderResponseBodyContent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetWorkOrderResponseBodyContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetWorkOrderResponseBodyContent setHangFileName(String hangFileName) {
            this.hangFileName = hangFileName;
            return this;
        }
        public String getHangFileName() {
            return this.hangFileName;
        }

        public GetWorkOrderResponseBodyContent setHangFilePath(String hangFilePath) {
            this.hangFilePath = hangFilePath;
            return this;
        }
        public String getHangFilePath() {
            return this.hangFilePath;
        }

        public GetWorkOrderResponseBodyContent setHangReason(String hangReason) {
            this.hangReason = hangReason;
            return this;
        }
        public String getHangReason() {
            return this.hangReason;
        }

        public GetWorkOrderResponseBodyContent setImpactBusiness(String impactBusiness) {
            this.impactBusiness = impactBusiness;
            return this;
        }
        public String getImpactBusiness() {
            return this.impactBusiness;
        }

        public GetWorkOrderResponseBodyContent setIncidentDescription(String incidentDescription) {
            this.incidentDescription = incidentDescription;
            return this;
        }
        public String getIncidentDescription() {
            return this.incidentDescription;
        }

        public GetWorkOrderResponseBodyContent setIncidentSubType(String incidentSubType) {
            this.incidentSubType = incidentSubType;
            return this;
        }
        public String getIncidentSubType() {
            return this.incidentSubType;
        }

        public GetWorkOrderResponseBodyContent setIncidentType(String incidentType) {
            this.incidentType = incidentType;
            return this;
        }
        public String getIncidentType() {
            return this.incidentType;
        }

        public GetWorkOrderResponseBodyContent setLiableMan(String liableMan) {
            this.liableMan = liableMan;
            return this;
        }
        public String getLiableMan() {
            return this.liableMan;
        }

        public GetWorkOrderResponseBodyContent setLinkMan(String linkMan) {
            this.linkMan = linkMan;
            return this;
        }
        public String getLinkMan() {
            return this.linkMan;
        }

        public GetWorkOrderResponseBodyContent setOriginalSubjectAlarm(String originalSubjectAlarm) {
            this.originalSubjectAlarm = originalSubjectAlarm;
            return this;
        }
        public String getOriginalSubjectAlarm() {
            return this.originalSubjectAlarm;
        }

        public GetWorkOrderResponseBodyContent setProcessLimited(String processLimited) {
            this.processLimited = processLimited;
            return this;
        }
        public String getProcessLimited() {
            return this.processLimited;
        }

        public GetWorkOrderResponseBodyContent setProcessMan(String processMan) {
            this.processMan = processMan;
            return this;
        }
        public String getProcessMan() {
            return this.processMan;
        }

        public GetWorkOrderResponseBodyContent setProcessManId(String processManId) {
            this.processManId = processManId;
            return this;
        }
        public String getProcessManId() {
            return this.processManId;
        }

        public GetWorkOrderResponseBodyContent setProcessResult(String processResult) {
            this.processResult = processResult;
            return this;
        }
        public String getProcessResult() {
            return this.processResult;
        }

        public GetWorkOrderResponseBodyContent setSkillGroups(String skillGroups) {
            this.skillGroups = skillGroups;
            return this;
        }
        public String getSkillGroups() {
            return this.skillGroups;
        }

        public GetWorkOrderResponseBodyContent setTimeout(String timeout) {
            this.timeout = timeout;
            return this;
        }
        public String getTimeout() {
            return this.timeout;
        }

        public GetWorkOrderResponseBodyContent setWorkOrderId(String workOrderId) {
            this.workOrderId = workOrderId;
            return this;
        }
        public String getWorkOrderId() {
            return this.workOrderId;
        }

        public GetWorkOrderResponseBodyContent setWorkOrderOperationDtos(java.util.List<GetWorkOrderResponseBodyContentWorkOrderOperationDtos> workOrderOperationDtos) {
            this.workOrderOperationDtos = workOrderOperationDtos;
            return this;
        }
        public java.util.List<GetWorkOrderResponseBodyContentWorkOrderOperationDtos> getWorkOrderOperationDtos() {
            return this.workOrderOperationDtos;
        }

        public GetWorkOrderResponseBodyContent setWorkOrderSource(String workOrderSource) {
            this.workOrderSource = workOrderSource;
            return this;
        }
        public String getWorkOrderSource() {
            return this.workOrderSource;
        }

        public GetWorkOrderResponseBodyContent setWorkOrderStep(String workOrderStep) {
            this.workOrderStep = workOrderStep;
            return this;
        }
        public String getWorkOrderStep() {
            return this.workOrderStep;
        }

        public GetWorkOrderResponseBodyContent setWorkOrderTitle(String workOrderTitle) {
            this.workOrderTitle = workOrderTitle;
            return this;
        }
        public String getWorkOrderTitle() {
            return this.workOrderTitle;
        }

        public GetWorkOrderResponseBodyContent setWorkOrderType(String workOrderType) {
            this.workOrderType = workOrderType;
            return this;
        }
        public String getWorkOrderType() {
            return this.workOrderType;
        }

    }

}

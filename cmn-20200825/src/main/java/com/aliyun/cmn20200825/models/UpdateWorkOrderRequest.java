// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateWorkOrderRequest extends TeaModel {
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

    @NameInMap("ClientToken")
    public String clientToken;

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

    // 文件名
    @NameInMap("HangFileName")
    public String hangFileName;

    // 文件路径
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

    @NameInMap("InstanceId")
    public String instanceId;

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

    // 工单编号
    @NameInMap("WorkOrderId")
    public String workOrderId;

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

    public static UpdateWorkOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkOrderRequest self = new UpdateWorkOrderRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkOrderRequest setAlarmHappenTime(String alarmHappenTime) {
        this.alarmHappenTime = alarmHappenTime;
        return this;
    }
    public String getAlarmHappenTime() {
        return this.alarmHappenTime;
    }

    public UpdateWorkOrderRequest setAlarmRecoverTime(String alarmRecoverTime) {
        this.alarmRecoverTime = alarmRecoverTime;
        return this;
    }
    public String getAlarmRecoverTime() {
        return this.alarmRecoverTime;
    }

    public UpdateWorkOrderRequest setAlarmRelated(String alarmRelated) {
        this.alarmRelated = alarmRelated;
        return this;
    }
    public String getAlarmRelated() {
        return this.alarmRelated;
    }

    public UpdateWorkOrderRequest setArea(String area) {
        this.area = area;
        return this;
    }
    public String getArea() {
        return this.area;
    }

    public UpdateWorkOrderRequest setCircuitId(String circuitId) {
        this.circuitId = circuitId;
        return this;
    }
    public String getCircuitId() {
        return this.circuitId;
    }

    public UpdateWorkOrderRequest setCircuitName(String circuitName) {
        this.circuitName = circuitName;
        return this;
    }
    public String getCircuitName() {
        return this.circuitName;
    }

    public UpdateWorkOrderRequest setCircuitType(String circuitType) {
        this.circuitType = circuitType;
        return this;
    }
    public String getCircuitType() {
        return this.circuitType;
    }

    public UpdateWorkOrderRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateWorkOrderRequest setDeviceIp(String deviceIp) {
        this.deviceIp = deviceIp;
        return this;
    }
    public String getDeviceIp() {
        return this.deviceIp;
    }

    public UpdateWorkOrderRequest setDeviceIpA(String deviceIpA) {
        this.deviceIpA = deviceIpA;
        return this;
    }
    public String getDeviceIpA() {
        return this.deviceIpA;
    }

    public UpdateWorkOrderRequest setDeviceIpB(String deviceIpB) {
        this.deviceIpB = deviceIpB;
        return this;
    }
    public String getDeviceIpB() {
        return this.deviceIpB;
    }

    public UpdateWorkOrderRequest setDeviceModelA(String deviceModelA) {
        this.deviceModelA = deviceModelA;
        return this;
    }
    public String getDeviceModelA() {
        return this.deviceModelA;
    }

    public UpdateWorkOrderRequest setDeviceModelB(String deviceModelB) {
        this.deviceModelB = deviceModelB;
        return this;
    }
    public String getDeviceModelB() {
        return this.deviceModelB;
    }

    public UpdateWorkOrderRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public UpdateWorkOrderRequest setDeviceNameA(String deviceNameA) {
        this.deviceNameA = deviceNameA;
        return this;
    }
    public String getDeviceNameA() {
        return this.deviceNameA;
    }

    public UpdateWorkOrderRequest setDeviceNameB(String deviceNameB) {
        this.deviceNameB = deviceNameB;
        return this;
    }
    public String getDeviceNameB() {
        return this.deviceNameB;
    }

    public UpdateWorkOrderRequest setDevicePortA(String devicePortA) {
        this.devicePortA = devicePortA;
        return this;
    }
    public String getDevicePortA() {
        return this.devicePortA;
    }

    public UpdateWorkOrderRequest setDevicePortB(String devicePortB) {
        this.devicePortB = devicePortB;
        return this;
    }
    public String getDevicePortB() {
        return this.devicePortB;
    }

    public UpdateWorkOrderRequest setDeviceSnA(String deviceSnA) {
        this.deviceSnA = deviceSnA;
        return this;
    }
    public String getDeviceSnA() {
        return this.deviceSnA;
    }

    public UpdateWorkOrderRequest setDeviceSnB(String deviceSnB) {
        this.deviceSnB = deviceSnB;
        return this;
    }
    public String getDeviceSnB() {
        return this.deviceSnB;
    }

    public UpdateWorkOrderRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public UpdateWorkOrderRequest setDeviceVendor(String deviceVendor) {
        this.deviceVendor = deviceVendor;
        return this;
    }
    public String getDeviceVendor() {
        return this.deviceVendor;
    }

    public UpdateWorkOrderRequest setDeviceVendorA(String deviceVendorA) {
        this.deviceVendorA = deviceVendorA;
        return this;
    }
    public String getDeviceVendorA() {
        return this.deviceVendorA;
    }

    public UpdateWorkOrderRequest setDeviceVendorB(String deviceVendorB) {
        this.deviceVendorB = deviceVendorB;
        return this;
    }
    public String getDeviceVendorB() {
        return this.deviceVendorB;
    }

    public UpdateWorkOrderRequest setEmergencyDegree(String emergencyDegree) {
        this.emergencyDegree = emergencyDegree;
        return this;
    }
    public String getEmergencyDegree() {
        return this.emergencyDegree;
    }

    public UpdateWorkOrderRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

    public UpdateWorkOrderRequest setHangFileName(String hangFileName) {
        this.hangFileName = hangFileName;
        return this;
    }
    public String getHangFileName() {
        return this.hangFileName;
    }

    public UpdateWorkOrderRequest setHangFilePath(String hangFilePath) {
        this.hangFilePath = hangFilePath;
        return this;
    }
    public String getHangFilePath() {
        return this.hangFilePath;
    }

    public UpdateWorkOrderRequest setHangReason(String hangReason) {
        this.hangReason = hangReason;
        return this;
    }
    public String getHangReason() {
        return this.hangReason;
    }

    public UpdateWorkOrderRequest setImpactBusiness(String impactBusiness) {
        this.impactBusiness = impactBusiness;
        return this;
    }
    public String getImpactBusiness() {
        return this.impactBusiness;
    }

    public UpdateWorkOrderRequest setIncidentDescription(String incidentDescription) {
        this.incidentDescription = incidentDescription;
        return this;
    }
    public String getIncidentDescription() {
        return this.incidentDescription;
    }

    public UpdateWorkOrderRequest setIncidentSubType(String incidentSubType) {
        this.incidentSubType = incidentSubType;
        return this;
    }
    public String getIncidentSubType() {
        return this.incidentSubType;
    }

    public UpdateWorkOrderRequest setIncidentType(String incidentType) {
        this.incidentType = incidentType;
        return this;
    }
    public String getIncidentType() {
        return this.incidentType;
    }

    public UpdateWorkOrderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateWorkOrderRequest setLiableMan(String liableMan) {
        this.liableMan = liableMan;
        return this;
    }
    public String getLiableMan() {
        return this.liableMan;
    }

    public UpdateWorkOrderRequest setLinkMan(String linkMan) {
        this.linkMan = linkMan;
        return this;
    }
    public String getLinkMan() {
        return this.linkMan;
    }

    public UpdateWorkOrderRequest setOriginalSubjectAlarm(String originalSubjectAlarm) {
        this.originalSubjectAlarm = originalSubjectAlarm;
        return this;
    }
    public String getOriginalSubjectAlarm() {
        return this.originalSubjectAlarm;
    }

    public UpdateWorkOrderRequest setProcessLimited(String processLimited) {
        this.processLimited = processLimited;
        return this;
    }
    public String getProcessLimited() {
        return this.processLimited;
    }

    public UpdateWorkOrderRequest setProcessMan(String processMan) {
        this.processMan = processMan;
        return this;
    }
    public String getProcessMan() {
        return this.processMan;
    }

    public UpdateWorkOrderRequest setProcessManId(String processManId) {
        this.processManId = processManId;
        return this;
    }
    public String getProcessManId() {
        return this.processManId;
    }

    public UpdateWorkOrderRequest setProcessResult(String processResult) {
        this.processResult = processResult;
        return this;
    }
    public String getProcessResult() {
        return this.processResult;
    }

    public UpdateWorkOrderRequest setSkillGroups(String skillGroups) {
        this.skillGroups = skillGroups;
        return this;
    }
    public String getSkillGroups() {
        return this.skillGroups;
    }

    public UpdateWorkOrderRequest setWorkOrderId(String workOrderId) {
        this.workOrderId = workOrderId;
        return this;
    }
    public String getWorkOrderId() {
        return this.workOrderId;
    }

    public UpdateWorkOrderRequest setWorkOrderSource(String workOrderSource) {
        this.workOrderSource = workOrderSource;
        return this;
    }
    public String getWorkOrderSource() {
        return this.workOrderSource;
    }

    public UpdateWorkOrderRequest setWorkOrderStep(String workOrderStep) {
        this.workOrderStep = workOrderStep;
        return this;
    }
    public String getWorkOrderStep() {
        return this.workOrderStep;
    }

    public UpdateWorkOrderRequest setWorkOrderTitle(String workOrderTitle) {
        this.workOrderTitle = workOrderTitle;
        return this;
    }
    public String getWorkOrderTitle() {
        return this.workOrderTitle;
    }

    public UpdateWorkOrderRequest setWorkOrderType(String workOrderType) {
        this.workOrderType = workOrderType;
        return this;
    }
    public String getWorkOrderType() {
        return this.workOrderType;
    }

}

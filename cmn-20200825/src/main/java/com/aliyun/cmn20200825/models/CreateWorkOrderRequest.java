// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateWorkOrderRequest extends TeaModel {
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

    // 幂等校验 token
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

    // 实例ID
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

    // 技能组
    @NameInMap("SkillGroups")
    public String skillGroups;

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

    public static CreateWorkOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkOrderRequest self = new CreateWorkOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkOrderRequest setAlarmHappenTime(String alarmHappenTime) {
        this.alarmHappenTime = alarmHappenTime;
        return this;
    }
    public String getAlarmHappenTime() {
        return this.alarmHappenTime;
    }

    public CreateWorkOrderRequest setAlarmRecoverTime(String alarmRecoverTime) {
        this.alarmRecoverTime = alarmRecoverTime;
        return this;
    }
    public String getAlarmRecoverTime() {
        return this.alarmRecoverTime;
    }

    public CreateWorkOrderRequest setAlarmRelated(String alarmRelated) {
        this.alarmRelated = alarmRelated;
        return this;
    }
    public String getAlarmRelated() {
        return this.alarmRelated;
    }

    public CreateWorkOrderRequest setArea(String area) {
        this.area = area;
        return this;
    }
    public String getArea() {
        return this.area;
    }

    public CreateWorkOrderRequest setCircuitId(String circuitId) {
        this.circuitId = circuitId;
        return this;
    }
    public String getCircuitId() {
        return this.circuitId;
    }

    public CreateWorkOrderRequest setCircuitName(String circuitName) {
        this.circuitName = circuitName;
        return this;
    }
    public String getCircuitName() {
        return this.circuitName;
    }

    public CreateWorkOrderRequest setCircuitType(String circuitType) {
        this.circuitType = circuitType;
        return this;
    }
    public String getCircuitType() {
        return this.circuitType;
    }

    public CreateWorkOrderRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateWorkOrderRequest setDeviceIp(String deviceIp) {
        this.deviceIp = deviceIp;
        return this;
    }
    public String getDeviceIp() {
        return this.deviceIp;
    }

    public CreateWorkOrderRequest setDeviceIpA(String deviceIpA) {
        this.deviceIpA = deviceIpA;
        return this;
    }
    public String getDeviceIpA() {
        return this.deviceIpA;
    }

    public CreateWorkOrderRequest setDeviceIpB(String deviceIpB) {
        this.deviceIpB = deviceIpB;
        return this;
    }
    public String getDeviceIpB() {
        return this.deviceIpB;
    }

    public CreateWorkOrderRequest setDeviceModelA(String deviceModelA) {
        this.deviceModelA = deviceModelA;
        return this;
    }
    public String getDeviceModelA() {
        return this.deviceModelA;
    }

    public CreateWorkOrderRequest setDeviceModelB(String deviceModelB) {
        this.deviceModelB = deviceModelB;
        return this;
    }
    public String getDeviceModelB() {
        return this.deviceModelB;
    }

    public CreateWorkOrderRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public CreateWorkOrderRequest setDeviceNameA(String deviceNameA) {
        this.deviceNameA = deviceNameA;
        return this;
    }
    public String getDeviceNameA() {
        return this.deviceNameA;
    }

    public CreateWorkOrderRequest setDeviceNameB(String deviceNameB) {
        this.deviceNameB = deviceNameB;
        return this;
    }
    public String getDeviceNameB() {
        return this.deviceNameB;
    }

    public CreateWorkOrderRequest setDevicePortA(String devicePortA) {
        this.devicePortA = devicePortA;
        return this;
    }
    public String getDevicePortA() {
        return this.devicePortA;
    }

    public CreateWorkOrderRequest setDevicePortB(String devicePortB) {
        this.devicePortB = devicePortB;
        return this;
    }
    public String getDevicePortB() {
        return this.devicePortB;
    }

    public CreateWorkOrderRequest setDeviceSnA(String deviceSnA) {
        this.deviceSnA = deviceSnA;
        return this;
    }
    public String getDeviceSnA() {
        return this.deviceSnA;
    }

    public CreateWorkOrderRequest setDeviceSnB(String deviceSnB) {
        this.deviceSnB = deviceSnB;
        return this;
    }
    public String getDeviceSnB() {
        return this.deviceSnB;
    }

    public CreateWorkOrderRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public CreateWorkOrderRequest setDeviceVendor(String deviceVendor) {
        this.deviceVendor = deviceVendor;
        return this;
    }
    public String getDeviceVendor() {
        return this.deviceVendor;
    }

    public CreateWorkOrderRequest setDeviceVendorA(String deviceVendorA) {
        this.deviceVendorA = deviceVendorA;
        return this;
    }
    public String getDeviceVendorA() {
        return this.deviceVendorA;
    }

    public CreateWorkOrderRequest setDeviceVendorB(String deviceVendorB) {
        this.deviceVendorB = deviceVendorB;
        return this;
    }
    public String getDeviceVendorB() {
        return this.deviceVendorB;
    }

    public CreateWorkOrderRequest setEmergencyDegree(String emergencyDegree) {
        this.emergencyDegree = emergencyDegree;
        return this;
    }
    public String getEmergencyDegree() {
        return this.emergencyDegree;
    }

    public CreateWorkOrderRequest setImpactBusiness(String impactBusiness) {
        this.impactBusiness = impactBusiness;
        return this;
    }
    public String getImpactBusiness() {
        return this.impactBusiness;
    }

    public CreateWorkOrderRequest setIncidentDescription(String incidentDescription) {
        this.incidentDescription = incidentDescription;
        return this;
    }
    public String getIncidentDescription() {
        return this.incidentDescription;
    }

    public CreateWorkOrderRequest setIncidentSubType(String incidentSubType) {
        this.incidentSubType = incidentSubType;
        return this;
    }
    public String getIncidentSubType() {
        return this.incidentSubType;
    }

    public CreateWorkOrderRequest setIncidentType(String incidentType) {
        this.incidentType = incidentType;
        return this;
    }
    public String getIncidentType() {
        return this.incidentType;
    }

    public CreateWorkOrderRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateWorkOrderRequest setLiableMan(String liableMan) {
        this.liableMan = liableMan;
        return this;
    }
    public String getLiableMan() {
        return this.liableMan;
    }

    public CreateWorkOrderRequest setLinkMan(String linkMan) {
        this.linkMan = linkMan;
        return this;
    }
    public String getLinkMan() {
        return this.linkMan;
    }

    public CreateWorkOrderRequest setOriginalSubjectAlarm(String originalSubjectAlarm) {
        this.originalSubjectAlarm = originalSubjectAlarm;
        return this;
    }
    public String getOriginalSubjectAlarm() {
        return this.originalSubjectAlarm;
    }

    public CreateWorkOrderRequest setProcessLimited(String processLimited) {
        this.processLimited = processLimited;
        return this;
    }
    public String getProcessLimited() {
        return this.processLimited;
    }

    public CreateWorkOrderRequest setProcessMan(String processMan) {
        this.processMan = processMan;
        return this;
    }
    public String getProcessMan() {
        return this.processMan;
    }

    public CreateWorkOrderRequest setProcessManId(String processManId) {
        this.processManId = processManId;
        return this;
    }
    public String getProcessManId() {
        return this.processManId;
    }

    public CreateWorkOrderRequest setSkillGroups(String skillGroups) {
        this.skillGroups = skillGroups;
        return this;
    }
    public String getSkillGroups() {
        return this.skillGroups;
    }

    public CreateWorkOrderRequest setWorkOrderSource(String workOrderSource) {
        this.workOrderSource = workOrderSource;
        return this;
    }
    public String getWorkOrderSource() {
        return this.workOrderSource;
    }

    public CreateWorkOrderRequest setWorkOrderStep(String workOrderStep) {
        this.workOrderStep = workOrderStep;
        return this;
    }
    public String getWorkOrderStep() {
        return this.workOrderStep;
    }

    public CreateWorkOrderRequest setWorkOrderTitle(String workOrderTitle) {
        this.workOrderTitle = workOrderTitle;
        return this;
    }
    public String getWorkOrderTitle() {
        return this.workOrderTitle;
    }

    public CreateWorkOrderRequest setWorkOrderType(String workOrderType) {
        this.workOrderType = workOrderType;
        return this;
    }
    public String getWorkOrderType() {
        return this.workOrderType;
    }

}

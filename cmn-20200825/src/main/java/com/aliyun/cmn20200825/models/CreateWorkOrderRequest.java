// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateWorkOrderRequest extends TeaModel {
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

    @NameInMap("ClientToken")
    public String clientToken;

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

    @NameInMap("ImpactBusiness")
    public String impactBusiness;

    @NameInMap("IncidentDescription")
    public String incidentDescription;

    @NameInMap("IncidentSubType")
    public String incidentSubType;

    @NameInMap("IncidentType")
    public String incidentType;

    @NameInMap("InstanceId")
    public String instanceId;

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

    @NameInMap("SkillGroups")
    public String skillGroups;

    @NameInMap("WorkOrderSource")
    public String workOrderSource;

    @NameInMap("WorkOrderStep")
    public String workOrderStep;

    @NameInMap("WorkOrderTitle")
    public String workOrderTitle;

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

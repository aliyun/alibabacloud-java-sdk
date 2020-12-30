// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CreateFaultRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("AgentId")
    public Long agentId;

    @NameInMap("ConnectId")
    public String connectId;

    @NameInMap("AgentOssFileName")
    public String agentOssFileName;

    @NameInMap("AgentFilePath")
    public String agentFilePath;

    @NameInMap("CustomOssFileName")
    public String customOssFileName;

    @NameInMap("CustomFilePath")
    public String customFilePath;

    @NameInMap("Description")
    public String description;

    @NameInMap("ClientIp")
    public String clientIp;

    @NameInMap("ClientPort")
    public String clientPort;

    @NameInMap("OperatingSystemVersion")
    public String operatingSystemVersion;

    @NameInMap("BrowserVersion")
    public String browserVersion;

    @NameInMap("MicrophoneList")
    public String microphoneList;

    @NameInMap("MicrophoneEquipment")
    public String microphoneEquipment;

    @NameInMap("SpeakerList")
    public String speakerList;

    @NameInMap("SpeakerEquipment")
    public String speakerEquipment;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("ServiceIp")
    public String serviceIp;

    @NameInMap("ServicePort")
    public String servicePort;

    public static CreateFaultRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFaultRequest self = new CreateFaultRequest();
        return TeaModel.build(map, self);
    }

    public CreateFaultRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateFaultRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

    public CreateFaultRequest setConnectId(String connectId) {
        this.connectId = connectId;
        return this;
    }
    public String getConnectId() {
        return this.connectId;
    }

    public CreateFaultRequest setAgentOssFileName(String agentOssFileName) {
        this.agentOssFileName = agentOssFileName;
        return this;
    }
    public String getAgentOssFileName() {
        return this.agentOssFileName;
    }

    public CreateFaultRequest setAgentFilePath(String agentFilePath) {
        this.agentFilePath = agentFilePath;
        return this;
    }
    public String getAgentFilePath() {
        return this.agentFilePath;
    }

    public CreateFaultRequest setCustomOssFileName(String customOssFileName) {
        this.customOssFileName = customOssFileName;
        return this;
    }
    public String getCustomOssFileName() {
        return this.customOssFileName;
    }

    public CreateFaultRequest setCustomFilePath(String customFilePath) {
        this.customFilePath = customFilePath;
        return this;
    }
    public String getCustomFilePath() {
        return this.customFilePath;
    }

    public CreateFaultRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateFaultRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public CreateFaultRequest setClientPort(String clientPort) {
        this.clientPort = clientPort;
        return this;
    }
    public String getClientPort() {
        return this.clientPort;
    }

    public CreateFaultRequest setOperatingSystemVersion(String operatingSystemVersion) {
        this.operatingSystemVersion = operatingSystemVersion;
        return this;
    }
    public String getOperatingSystemVersion() {
        return this.operatingSystemVersion;
    }

    public CreateFaultRequest setBrowserVersion(String browserVersion) {
        this.browserVersion = browserVersion;
        return this;
    }
    public String getBrowserVersion() {
        return this.browserVersion;
    }

    public CreateFaultRequest setMicrophoneList(String microphoneList) {
        this.microphoneList = microphoneList;
        return this;
    }
    public String getMicrophoneList() {
        return this.microphoneList;
    }

    public CreateFaultRequest setMicrophoneEquipment(String microphoneEquipment) {
        this.microphoneEquipment = microphoneEquipment;
        return this;
    }
    public String getMicrophoneEquipment() {
        return this.microphoneEquipment;
    }

    public CreateFaultRequest setSpeakerList(String speakerList) {
        this.speakerList = speakerList;
        return this;
    }
    public String getSpeakerList() {
        return this.speakerList;
    }

    public CreateFaultRequest setSpeakerEquipment(String speakerEquipment) {
        this.speakerEquipment = speakerEquipment;
        return this;
    }
    public String getSpeakerEquipment() {
        return this.speakerEquipment;
    }

    public CreateFaultRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public CreateFaultRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CreateFaultRequest setServiceIp(String serviceIp) {
        this.serviceIp = serviceIp;
        return this;
    }
    public String getServiceIp() {
        return this.serviceIp;
    }

    public CreateFaultRequest setServicePort(String servicePort) {
        this.servicePort = servicePort;
        return this;
    }
    public String getServicePort() {
        return this.servicePort;
    }

}

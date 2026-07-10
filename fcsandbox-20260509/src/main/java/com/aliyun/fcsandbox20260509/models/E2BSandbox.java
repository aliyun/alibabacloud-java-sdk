// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class E2BSandbox extends TeaModel {
    @NameInMap("accessEndpoint")
    public String accessEndpoint;

    @NameInMap("cpuCount")
    public Integer cpuCount;

    @NameInMap("diskSizeMB")
    public Integer diskSizeMB;

    @NameInMap("domain")
    public String domain;

    @NameInMap("endAt")
    public String endAt;

    @NameInMap("fcFunctionName")
    public String fcFunctionName;

    @NameInMap("fcInstanceID")
    public String fcInstanceID;

    @NameInMap("fcSessionID")
    public String fcSessionID;

    @NameInMap("memoryMB")
    public Integer memoryMB;

    @NameInMap("metadata")
    public java.util.Map<String, String> metadata;

    @NameInMap("resourceGroupID")
    public String resourceGroupID;

    @NameInMap("sandboxID")
    public String sandboxID;

    @NameInMap("startedAt")
    public String startedAt;

    @NameInMap("state")
    public String state;

    @NameInMap("teamID")
    public String teamID;

    @NameInMap("teamName")
    public String teamName;

    @NameInMap("templateID")
    public String templateID;

    @NameInMap("templateName")
    public String templateName;

    @NameInMap("userID")
    public String userID;

    public static E2BSandbox build(java.util.Map<String, ?> map) throws Exception {
        E2BSandbox self = new E2BSandbox();
        return TeaModel.build(map, self);
    }

    public E2BSandbox setAccessEndpoint(String accessEndpoint) {
        this.accessEndpoint = accessEndpoint;
        return this;
    }
    public String getAccessEndpoint() {
        return this.accessEndpoint;
    }

    public E2BSandbox setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }
    public Integer getCpuCount() {
        return this.cpuCount;
    }

    public E2BSandbox setDiskSizeMB(Integer diskSizeMB) {
        this.diskSizeMB = diskSizeMB;
        return this;
    }
    public Integer getDiskSizeMB() {
        return this.diskSizeMB;
    }

    public E2BSandbox setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public E2BSandbox setEndAt(String endAt) {
        this.endAt = endAt;
        return this;
    }
    public String getEndAt() {
        return this.endAt;
    }

    public E2BSandbox setFcFunctionName(String fcFunctionName) {
        this.fcFunctionName = fcFunctionName;
        return this;
    }
    public String getFcFunctionName() {
        return this.fcFunctionName;
    }

    public E2BSandbox setFcInstanceID(String fcInstanceID) {
        this.fcInstanceID = fcInstanceID;
        return this;
    }
    public String getFcInstanceID() {
        return this.fcInstanceID;
    }

    public E2BSandbox setFcSessionID(String fcSessionID) {
        this.fcSessionID = fcSessionID;
        return this;
    }
    public String getFcSessionID() {
        return this.fcSessionID;
    }

    public E2BSandbox setMemoryMB(Integer memoryMB) {
        this.memoryMB = memoryMB;
        return this;
    }
    public Integer getMemoryMB() {
        return this.memoryMB;
    }

    public E2BSandbox setMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, String> getMetadata() {
        return this.metadata;
    }

    public E2BSandbox setResourceGroupID(String resourceGroupID) {
        this.resourceGroupID = resourceGroupID;
        return this;
    }
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    public E2BSandbox setSandboxID(String sandboxID) {
        this.sandboxID = sandboxID;
        return this;
    }
    public String getSandboxID() {
        return this.sandboxID;
    }

    public E2BSandbox setStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }
    public String getStartedAt() {
        return this.startedAt;
    }

    public E2BSandbox setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public E2BSandbox setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

    public E2BSandbox setTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }
    public String getTeamName() {
        return this.teamName;
    }

    public E2BSandbox setTemplateID(String templateID) {
        this.templateID = templateID;
        return this;
    }
    public String getTemplateID() {
        return this.templateID;
    }

    public E2BSandbox setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public E2BSandbox setUserID(String userID) {
        this.userID = userID;
        return this;
    }
    public String getUserID() {
        return this.userID;
    }

}

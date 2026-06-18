// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class E2BSandbox extends TeaModel {
    @NameInMap("alias")
    public String alias;

    @NameInMap("allowInternetAccess")
    public Boolean allowInternetAccess;

    @NameInMap("clientID")
    public String clientID;

    @NameInMap("cpuCount")
    public Integer cpuCount;

    @NameInMap("diskSizeMB")
    public Integer diskSizeMB;

    @NameInMap("domain")
    public String domain;

    @NameInMap("endAt")
    public String endAt;

    @NameInMap("envdAccessToken")
    public String envdAccessToken;

    @NameInMap("envdVersion")
    public String envdVersion;

    @NameInMap("fcFunctionName")
    public String fcFunctionName;

    @NameInMap("fcInstanceID")
    public String fcInstanceID;

    @NameInMap("fcSessionID")
    public String fcSessionID;

    @NameInMap("lifecycle")
    public E2BLifecycle lifecycle;

    @NameInMap("memoryMB")
    public Integer memoryMB;

    @NameInMap("metadata")
    public java.util.Map<String, String> metadata;

    @NameInMap("network")
    public E2BNetwork network;

    @NameInMap("sandboxID")
    public String sandboxID;

    @NameInMap("startedAt")
    public String startedAt;

    @NameInMap("state")
    public String state;

    @NameInMap("templateId")
    public String templateId;

    @NameInMap("templateName")
    public String templateName;

    @NameInMap("volumeMounts")
    public java.util.List<E2BVolumeMount> volumeMounts;

    public static E2BSandbox build(java.util.Map<String, ?> map) throws Exception {
        E2BSandbox self = new E2BSandbox();
        return TeaModel.build(map, self);
    }

    public E2BSandbox setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public E2BSandbox setAllowInternetAccess(Boolean allowInternetAccess) {
        this.allowInternetAccess = allowInternetAccess;
        return this;
    }
    public Boolean getAllowInternetAccess() {
        return this.allowInternetAccess;
    }

    public E2BSandbox setClientID(String clientID) {
        this.clientID = clientID;
        return this;
    }
    public String getClientID() {
        return this.clientID;
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

    public E2BSandbox setEnvdAccessToken(String envdAccessToken) {
        this.envdAccessToken = envdAccessToken;
        return this;
    }
    public String getEnvdAccessToken() {
        return this.envdAccessToken;
    }

    public E2BSandbox setEnvdVersion(String envdVersion) {
        this.envdVersion = envdVersion;
        return this;
    }
    public String getEnvdVersion() {
        return this.envdVersion;
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

    public E2BSandbox setLifecycle(E2BLifecycle lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }
    public E2BLifecycle getLifecycle() {
        return this.lifecycle;
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

    public E2BSandbox setNetwork(E2BNetwork network) {
        this.network = network;
        return this;
    }
    public E2BNetwork getNetwork() {
        return this.network;
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

    public E2BSandbox setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public E2BSandbox setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public E2BSandbox setVolumeMounts(java.util.List<E2BVolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
        return this;
    }
    public java.util.List<E2BVolumeMount> getVolumeMounts() {
        return this.volumeMounts;
    }

}

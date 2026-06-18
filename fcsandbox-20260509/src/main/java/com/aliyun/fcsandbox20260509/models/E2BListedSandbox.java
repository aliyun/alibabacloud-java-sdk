// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class E2BListedSandbox extends TeaModel {
    @NameInMap("alias")
    public String alias;

    @NameInMap("clientID")
    public String clientID;

    @NameInMap("cpuCount")
    public Integer cpuCount;

    @NameInMap("diskSizeMB")
    public Integer diskSizeMB;

    @NameInMap("endAt")
    public String endAt;

    @NameInMap("envdVersion")
    public String envdVersion;

    @NameInMap("memoryMB")
    public Integer memoryMB;

    @NameInMap("metadata")
    public java.util.Map<String, String> metadata;

    @NameInMap("sandboxID")
    public String sandboxID;

    @NameInMap("startedAt")
    public String startedAt;

    @NameInMap("state")
    public String state;

    @NameInMap("templateID")
    public String templateID;

    @NameInMap("templateName")
    public String templateName;

    @NameInMap("volumeMounts")
    public java.util.List<E2BVolumeMount> volumeMounts;

    public static E2BListedSandbox build(java.util.Map<String, ?> map) throws Exception {
        E2BListedSandbox self = new E2BListedSandbox();
        return TeaModel.build(map, self);
    }

    public E2BListedSandbox setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public E2BListedSandbox setClientID(String clientID) {
        this.clientID = clientID;
        return this;
    }
    public String getClientID() {
        return this.clientID;
    }

    public E2BListedSandbox setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }
    public Integer getCpuCount() {
        return this.cpuCount;
    }

    public E2BListedSandbox setDiskSizeMB(Integer diskSizeMB) {
        this.diskSizeMB = diskSizeMB;
        return this;
    }
    public Integer getDiskSizeMB() {
        return this.diskSizeMB;
    }

    public E2BListedSandbox setEndAt(String endAt) {
        this.endAt = endAt;
        return this;
    }
    public String getEndAt() {
        return this.endAt;
    }

    public E2BListedSandbox setEnvdVersion(String envdVersion) {
        this.envdVersion = envdVersion;
        return this;
    }
    public String getEnvdVersion() {
        return this.envdVersion;
    }

    public E2BListedSandbox setMemoryMB(Integer memoryMB) {
        this.memoryMB = memoryMB;
        return this;
    }
    public Integer getMemoryMB() {
        return this.memoryMB;
    }

    public E2BListedSandbox setMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, String> getMetadata() {
        return this.metadata;
    }

    public E2BListedSandbox setSandboxID(String sandboxID) {
        this.sandboxID = sandboxID;
        return this;
    }
    public String getSandboxID() {
        return this.sandboxID;
    }

    public E2BListedSandbox setStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }
    public String getStartedAt() {
        return this.startedAt;
    }

    public E2BListedSandbox setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public E2BListedSandbox setTemplateID(String templateID) {
        this.templateID = templateID;
        return this;
    }
    public String getTemplateID() {
        return this.templateID;
    }

    public E2BListedSandbox setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public E2BListedSandbox setVolumeMounts(java.util.List<E2BVolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
        return this;
    }
    public java.util.List<E2BVolumeMount> getVolumeMounts() {
        return this.volumeMounts;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class E2BTemplateBuild extends TeaModel {
    @NameInMap("buildID")
    public String buildID;

    @NameInMap("cpuCount")
    public Integer cpuCount;

    @NameInMap("createdAt")
    public String createdAt;

    @NameInMap("diskSizeMB")
    public Integer diskSizeMB;

    @NameInMap("envdVersion")
    public String envdVersion;

    @NameInMap("finishedAt")
    public String finishedAt;

    @NameInMap("memoryMB")
    public Integer memoryMB;

    @NameInMap("status")
    public String status;

    @NameInMap("updatedAt")
    public String updatedAt;

    public static E2BTemplateBuild build(java.util.Map<String, ?> map) throws Exception {
        E2BTemplateBuild self = new E2BTemplateBuild();
        return TeaModel.build(map, self);
    }

    public E2BTemplateBuild setBuildID(String buildID) {
        this.buildID = buildID;
        return this;
    }
    public String getBuildID() {
        return this.buildID;
    }

    public E2BTemplateBuild setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }
    public Integer getCpuCount() {
        return this.cpuCount;
    }

    public E2BTemplateBuild setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public E2BTemplateBuild setDiskSizeMB(Integer diskSizeMB) {
        this.diskSizeMB = diskSizeMB;
        return this;
    }
    public Integer getDiskSizeMB() {
        return this.diskSizeMB;
    }

    public E2BTemplateBuild setEnvdVersion(String envdVersion) {
        this.envdVersion = envdVersion;
        return this;
    }
    public String getEnvdVersion() {
        return this.envdVersion;
    }

    public E2BTemplateBuild setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }
    public String getFinishedAt() {
        return this.finishedAt;
    }

    public E2BTemplateBuild setMemoryMB(Integer memoryMB) {
        this.memoryMB = memoryMB;
        return this;
    }
    public Integer getMemoryMB() {
        return this.memoryMB;
    }

    public E2BTemplateBuild setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public E2BTemplateBuild setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}

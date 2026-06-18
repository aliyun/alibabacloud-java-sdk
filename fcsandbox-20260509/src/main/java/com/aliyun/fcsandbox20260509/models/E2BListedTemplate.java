// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class E2BListedTemplate extends TeaModel {
    @NameInMap("aliases")
    public java.util.List<String> aliases;

    @NameInMap("buildStatus")
    public String buildStatus;

    @NameInMap("cpuCount")
    public Integer cpuCount;

    @NameInMap("createdAt")
    public String createdAt;

    @NameInMap("lastSpawnedAt")
    public String lastSpawnedAt;

    @NameInMap("logConfiguration")
    public LogConfiguration logConfiguration;

    @NameInMap("memoryMB")
    public Integer memoryMB;

    @NameInMap("names")
    public java.util.List<String> names;

    @NameInMap("public")
    public Boolean _public;

    @NameInMap("spawnCount")
    public String spawnCount;

    @NameInMap("statusReason")
    public String statusReason;

    @NameInMap("tags")
    public java.util.List<E2BTemplateTag> tags;

    @NameInMap("templateID")
    public String templateID;

    @NameInMap("updatedAt")
    public String updatedAt;

    public static E2BListedTemplate build(java.util.Map<String, ?> map) throws Exception {
        E2BListedTemplate self = new E2BListedTemplate();
        return TeaModel.build(map, self);
    }

    public E2BListedTemplate setAliases(java.util.List<String> aliases) {
        this.aliases = aliases;
        return this;
    }
    public java.util.List<String> getAliases() {
        return this.aliases;
    }

    public E2BListedTemplate setBuildStatus(String buildStatus) {
        this.buildStatus = buildStatus;
        return this;
    }
    public String getBuildStatus() {
        return this.buildStatus;
    }

    public E2BListedTemplate setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }
    public Integer getCpuCount() {
        return this.cpuCount;
    }

    public E2BListedTemplate setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public E2BListedTemplate setLastSpawnedAt(String lastSpawnedAt) {
        this.lastSpawnedAt = lastSpawnedAt;
        return this;
    }
    public String getLastSpawnedAt() {
        return this.lastSpawnedAt;
    }

    public E2BListedTemplate setLogConfiguration(LogConfiguration logConfiguration) {
        this.logConfiguration = logConfiguration;
        return this;
    }
    public LogConfiguration getLogConfiguration() {
        return this.logConfiguration;
    }

    public E2BListedTemplate setMemoryMB(Integer memoryMB) {
        this.memoryMB = memoryMB;
        return this;
    }
    public Integer getMemoryMB() {
        return this.memoryMB;
    }

    public E2BListedTemplate setNames(java.util.List<String> names) {
        this.names = names;
        return this;
    }
    public java.util.List<String> getNames() {
        return this.names;
    }

    public E2BListedTemplate set_public(Boolean _public) {
        this._public = _public;
        return this;
    }
    public Boolean get_public() {
        return this._public;
    }

    public E2BListedTemplate setSpawnCount(String spawnCount) {
        this.spawnCount = spawnCount;
        return this;
    }
    public String getSpawnCount() {
        return this.spawnCount;
    }

    public E2BListedTemplate setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

    public E2BListedTemplate setTags(java.util.List<E2BTemplateTag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<E2BTemplateTag> getTags() {
        return this.tags;
    }

    public E2BListedTemplate setTemplateID(String templateID) {
        this.templateID = templateID;
        return this;
    }
    public String getTemplateID() {
        return this.templateID;
    }

    public E2BListedTemplate setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

}

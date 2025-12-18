// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class InstanceInfo extends TeaModel {
    @NameInMap("createdTimeMs")
    public Long createdTimeMs;

    @NameInMap("destroyedTimeMs")
    public Long destroyedTimeMs;

    /**
     * <strong>example:</strong>
     * <p>1ef6b6ff-7f7b-485e-ab49-501ac681****</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("qualifier")
    public String qualifier;

    @NameInMap("resourceType")
    public String resourceType;

    @NameInMap("status")
    public String status;

    @NameInMap("versionId")
    public String versionId;

    public static InstanceInfo build(java.util.Map<String, ?> map) throws Exception {
        InstanceInfo self = new InstanceInfo();
        return TeaModel.build(map, self);
    }

    public InstanceInfo setCreatedTimeMs(Long createdTimeMs) {
        this.createdTimeMs = createdTimeMs;
        return this;
    }
    public Long getCreatedTimeMs() {
        return this.createdTimeMs;
    }

    public InstanceInfo setDestroyedTimeMs(Long destroyedTimeMs) {
        this.destroyedTimeMs = destroyedTimeMs;
        return this;
    }
    public Long getDestroyedTimeMs() {
        return this.destroyedTimeMs;
    }

    public InstanceInfo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public InstanceInfo setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public InstanceInfo setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public InstanceInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public InstanceInfo setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}

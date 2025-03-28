// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class EnvironmentStatus extends TeaModel {
    @NameInMap("latestEnvironmentDeploymentName")
    public String latestEnvironmentDeploymentName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("observedGeneration")
    public Long observedGeneration;

    /**
     * <strong>example:</strong>
     * <p>2021-11-19T09:34:38Z</p>
     */
    @NameInMap("observedTime")
    public String observedTime;

    @NameInMap("servicesInstances")
    public java.util.Map<String, ServiceInstance> servicesInstances;

    @NameInMap("servicesWithPendingChanges")
    public java.util.List<String> servicesWithPendingChanges;

    public static EnvironmentStatus build(java.util.Map<String, ?> map) throws Exception {
        EnvironmentStatus self = new EnvironmentStatus();
        return TeaModel.build(map, self);
    }

    public EnvironmentStatus setLatestEnvironmentDeploymentName(String latestEnvironmentDeploymentName) {
        this.latestEnvironmentDeploymentName = latestEnvironmentDeploymentName;
        return this;
    }
    public String getLatestEnvironmentDeploymentName() {
        return this.latestEnvironmentDeploymentName;
    }

    public EnvironmentStatus setObservedGeneration(Long observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }
    public Long getObservedGeneration() {
        return this.observedGeneration;
    }

    public EnvironmentStatus setObservedTime(String observedTime) {
        this.observedTime = observedTime;
        return this;
    }
    public String getObservedTime() {
        return this.observedTime;
    }

    public EnvironmentStatus setServicesInstances(java.util.Map<String, ServiceInstance> servicesInstances) {
        this.servicesInstances = servicesInstances;
        return this;
    }
    public java.util.Map<String, ServiceInstance> getServicesInstances() {
        return this.servicesInstances;
    }

    public EnvironmentStatus setServicesWithPendingChanges(java.util.List<String> servicesWithPendingChanges) {
        this.servicesWithPendingChanges = servicesWithPendingChanges;
        return this;
    }
    public java.util.List<String> getServicesWithPendingChanges() {
        return this.servicesWithPendingChanges;
    }

}

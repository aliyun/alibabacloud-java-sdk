// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ServiceDeploymentSpec extends TeaModel {
    @NameInMap("baseline")
    public ServiceBaseline baseline;

    @NameInMap("changes")
    public ServiceChanges changes;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("skipRemoveResources")
    public Boolean skipRemoveResources;

    @NameInMap("target")
    public ServiceBaseline target;

    public static ServiceDeploymentSpec build(java.util.Map<String, ?> map) throws Exception {
        ServiceDeploymentSpec self = new ServiceDeploymentSpec();
        return TeaModel.build(map, self);
    }

    public ServiceDeploymentSpec setBaseline(ServiceBaseline baseline) {
        this.baseline = baseline;
        return this;
    }
    public ServiceBaseline getBaseline() {
        return this.baseline;
    }

    public ServiceDeploymentSpec setChanges(ServiceChanges changes) {
        this.changes = changes;
        return this;
    }
    public ServiceChanges getChanges() {
        return this.changes;
    }

    public ServiceDeploymentSpec setSkipRemoveResources(Boolean skipRemoveResources) {
        this.skipRemoveResources = skipRemoveResources;
        return this;
    }
    public Boolean getSkipRemoveResources() {
        return this.skipRemoveResources;
    }

    public ServiceDeploymentSpec setTarget(ServiceBaseline target) {
        this.target = target;
        return this;
    }
    public ServiceBaseline getTarget() {
        return this.target;
    }

}

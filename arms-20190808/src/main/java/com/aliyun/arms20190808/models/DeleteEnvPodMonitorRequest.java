// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteEnvPodMonitorRequest extends TeaModel {
    /**
     * <p>Environment instance ID.</p>
     */
    @NameInMap("EnvironmentId")
    public String environmentId;

    /**
     * <p>The namespace where podMonitor is located</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>PodMonitor name.</p>
     */
    @NameInMap("PodMonitorName")
    public String podMonitorName;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteEnvPodMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnvPodMonitorRequest self = new DeleteEnvPodMonitorRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEnvPodMonitorRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public DeleteEnvPodMonitorRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DeleteEnvPodMonitorRequest setPodMonitorName(String podMonitorName) {
        this.podMonitorName = podMonitorName;
        return this;
    }
    public String getPodMonitorName() {
        return this.podMonitorName;
    }

    public DeleteEnvPodMonitorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

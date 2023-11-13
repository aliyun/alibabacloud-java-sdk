// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeEnvPodMonitorRequest extends TeaModel {
    /**
     * <p>The ID of the environment instance.</p>
     */
    @NameInMap("EnvironmentId")
    public String environmentId;

    /**
     * <p>The namespace where the PodMonitor is located.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The name of the PodMonitor.</p>
     */
    @NameInMap("PodMonitorName")
    public String podMonitorName;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeEnvPodMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnvPodMonitorRequest self = new DescribeEnvPodMonitorRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEnvPodMonitorRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public DescribeEnvPodMonitorRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeEnvPodMonitorRequest setPodMonitorName(String podMonitorName) {
        this.podMonitorName = podMonitorName;
        return this;
    }
    public String getPodMonitorName() {
        return this.podMonitorName;
    }

    public DescribeEnvPodMonitorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

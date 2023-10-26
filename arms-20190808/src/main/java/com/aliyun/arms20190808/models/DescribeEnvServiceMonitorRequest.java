// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeEnvServiceMonitorRequest extends TeaModel {
    /**
     * <p>Environment instance ID.</p>
     */
    @NameInMap("EnvironmentId")
    public String environmentId;

    /**
     * <p>The name of the namespace.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>ServiceMonitor name.</p>
     */
    @NameInMap("ServiceMonitorName")
    public String serviceMonitorName;

    public static DescribeEnvServiceMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnvServiceMonitorRequest self = new DescribeEnvServiceMonitorRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEnvServiceMonitorRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public DescribeEnvServiceMonitorRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeEnvServiceMonitorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeEnvServiceMonitorRequest setServiceMonitorName(String serviceMonitorName) {
        this.serviceMonitorName = serviceMonitorName;
        return this;
    }
    public String getServiceMonitorName() {
        return this.serviceMonitorName;
    }

}

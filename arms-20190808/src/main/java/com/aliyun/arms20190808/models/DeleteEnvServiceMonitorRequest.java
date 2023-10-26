// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteEnvServiceMonitorRequest extends TeaModel {
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
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>ServiceMonitor name.</p>
     */
    @NameInMap("ServiceMonitorName")
    public String serviceMonitorName;

    public static DeleteEnvServiceMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnvServiceMonitorRequest self = new DeleteEnvServiceMonitorRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEnvServiceMonitorRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public DeleteEnvServiceMonitorRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DeleteEnvServiceMonitorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteEnvServiceMonitorRequest setServiceMonitorName(String serviceMonitorName) {
        this.serviceMonitorName = serviceMonitorName;
        return this;
    }
    public String getServiceMonitorName() {
        return this.serviceMonitorName;
    }

}

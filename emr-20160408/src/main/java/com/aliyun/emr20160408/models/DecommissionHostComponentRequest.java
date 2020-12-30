// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DecommissionHostComponentRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("HostInstanceId")
    public String hostInstanceId;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("ComponentName")
    public String componentName;

    @NameInMap("TimeoutSeconds")
    public Long timeoutSeconds;

    public static DecommissionHostComponentRequest build(java.util.Map<String, ?> map) throws Exception {
        DecommissionHostComponentRequest self = new DecommissionHostComponentRequest();
        return TeaModel.build(map, self);
    }

    public DecommissionHostComponentRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DecommissionHostComponentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DecommissionHostComponentRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DecommissionHostComponentRequest setHostInstanceId(String hostInstanceId) {
        this.hostInstanceId = hostInstanceId;
        return this;
    }
    public String getHostInstanceId() {
        return this.hostInstanceId;
    }

    public DecommissionHostComponentRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public DecommissionHostComponentRequest setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
    }

    public DecommissionHostComponentRequest setTimeoutSeconds(Long timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }
    public Long getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ReleaseIPRequest extends TeaModel {
    @NameInMap("DeviceResourceId")
    public String deviceResourceId;

    @NameInMap("DeviceResourceIds")
    public java.util.List<String> deviceResourceIds;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IpType")
    public String ipType;

    @NameInMap("SetupProjectId")
    public String setupProjectId;

    public static ReleaseIPRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseIPRequest self = new ReleaseIPRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseIPRequest setDeviceResourceId(String deviceResourceId) {
        this.deviceResourceId = deviceResourceId;
        return this;
    }
    public String getDeviceResourceId() {
        return this.deviceResourceId;
    }

    public ReleaseIPRequest setDeviceResourceIds(java.util.List<String> deviceResourceIds) {
        this.deviceResourceIds = deviceResourceIds;
        return this;
    }
    public java.util.List<String> getDeviceResourceIds() {
        return this.deviceResourceIds;
    }

    public ReleaseIPRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ReleaseIPRequest setIpType(String ipType) {
        this.ipType = ipType;
        return this;
    }
    public String getIpType() {
        return this.ipType;
    }

    public ReleaseIPRequest setSetupProjectId(String setupProjectId) {
        this.setupProjectId = setupProjectId;
        return this;
    }
    public String getSetupProjectId() {
        return this.setupProjectId;
    }

}

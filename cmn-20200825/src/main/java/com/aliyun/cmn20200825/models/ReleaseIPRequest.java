// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ReleaseIPRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // ip地址类型
    @NameInMap("IpType")
    public String ipType;

    // 建设项目id
    @NameInMap("SetupProjectId")
    public String setupProjectId;

    // deviceResourceIdStr
    @NameInMap("DeviceResourceIds")
    public java.util.List<String> deviceResourceIds;

    // deviceResourceId
    @NameInMap("DeviceResourceId")
    public String deviceResourceId;

    public static ReleaseIPRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseIPRequest self = new ReleaseIPRequest();
        return TeaModel.build(map, self);
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

    public ReleaseIPRequest setDeviceResourceIds(java.util.List<String> deviceResourceIds) {
        this.deviceResourceIds = deviceResourceIds;
        return this;
    }
    public java.util.List<String> getDeviceResourceIds() {
        return this.deviceResourceIds;
    }

    public ReleaseIPRequest setDeviceResourceId(String deviceResourceId) {
        this.deviceResourceId = deviceResourceId;
        return this;
    }
    public String getDeviceResourceId() {
        return this.deviceResourceId;
    }

}

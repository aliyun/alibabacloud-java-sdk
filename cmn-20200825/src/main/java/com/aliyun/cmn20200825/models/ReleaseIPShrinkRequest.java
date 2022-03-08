// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ReleaseIPShrinkRequest extends TeaModel {
    // deviceResourceId
    @NameInMap("DeviceResourceId")
    public String deviceResourceId;

    // deviceResourceIdStr
    @NameInMap("DeviceResourceIds")
    public String deviceResourceIdsShrink;

    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // ip地址类型
    @NameInMap("IpType")
    public String ipType;

    // 建设项目id
    @NameInMap("SetupProjectId")
    public String setupProjectId;

    public static ReleaseIPShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseIPShrinkRequest self = new ReleaseIPShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseIPShrinkRequest setDeviceResourceId(String deviceResourceId) {
        this.deviceResourceId = deviceResourceId;
        return this;
    }
    public String getDeviceResourceId() {
        return this.deviceResourceId;
    }

    public ReleaseIPShrinkRequest setDeviceResourceIdsShrink(String deviceResourceIdsShrink) {
        this.deviceResourceIdsShrink = deviceResourceIdsShrink;
        return this;
    }
    public String getDeviceResourceIdsShrink() {
        return this.deviceResourceIdsShrink;
    }

    public ReleaseIPShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ReleaseIPShrinkRequest setIpType(String ipType) {
        this.ipType = ipType;
        return this;
    }
    public String getIpType() {
        return this.ipType;
    }

    public ReleaseIPShrinkRequest setSetupProjectId(String setupProjectId) {
        this.setupProjectId = setupProjectId;
        return this;
    }
    public String getSetupProjectId() {
        return this.setupProjectId;
    }

}

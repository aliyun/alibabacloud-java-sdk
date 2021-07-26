// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ApplyIPShrinkRequest extends TeaModel {
    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // ip地址类型
    @NameInMap("IpType")
    public String ipType;

    // 建设项目id
    @NameInMap("SetupProjectId")
    public String setupProjectId;

    // 业务类型id
    @NameInMap("BusinessTypeId")
    public String businessTypeId;

    // 设备uuid列表
    @NameInMap("DeviceResourceIds")
    public String deviceResourceIdsShrink;

    // Loopback端口
    @NameInMap("LoopbackPort")
    public String loopbackPort;

    // 位置空间
    @NameInMap("NetLocation")
    public String netLocation;

    // 业务参数
    @NameInMap("BusinessTypeParams")
    public String businessTypeParams;

    // deviceResourceId
    @NameInMap("DeviceResourceId")
    public String deviceResourceId;

    public static ApplyIPShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyIPShrinkRequest self = new ApplyIPShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ApplyIPShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ApplyIPShrinkRequest setIpType(String ipType) {
        this.ipType = ipType;
        return this;
    }
    public String getIpType() {
        return this.ipType;
    }

    public ApplyIPShrinkRequest setSetupProjectId(String setupProjectId) {
        this.setupProjectId = setupProjectId;
        return this;
    }
    public String getSetupProjectId() {
        return this.setupProjectId;
    }

    public ApplyIPShrinkRequest setBusinessTypeId(String businessTypeId) {
        this.businessTypeId = businessTypeId;
        return this;
    }
    public String getBusinessTypeId() {
        return this.businessTypeId;
    }

    public ApplyIPShrinkRequest setDeviceResourceIdsShrink(String deviceResourceIdsShrink) {
        this.deviceResourceIdsShrink = deviceResourceIdsShrink;
        return this;
    }
    public String getDeviceResourceIdsShrink() {
        return this.deviceResourceIdsShrink;
    }

    public ApplyIPShrinkRequest setLoopbackPort(String loopbackPort) {
        this.loopbackPort = loopbackPort;
        return this;
    }
    public String getLoopbackPort() {
        return this.loopbackPort;
    }

    public ApplyIPShrinkRequest setNetLocation(String netLocation) {
        this.netLocation = netLocation;
        return this;
    }
    public String getNetLocation() {
        return this.netLocation;
    }

    public ApplyIPShrinkRequest setBusinessTypeParams(String businessTypeParams) {
        this.businessTypeParams = businessTypeParams;
        return this;
    }
    public String getBusinessTypeParams() {
        return this.businessTypeParams;
    }

    public ApplyIPShrinkRequest setDeviceResourceId(String deviceResourceId) {
        this.deviceResourceId = deviceResourceId;
        return this;
    }
    public String getDeviceResourceId() {
        return this.deviceResourceId;
    }

}

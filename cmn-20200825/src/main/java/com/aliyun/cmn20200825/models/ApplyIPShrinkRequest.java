// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ApplyIPShrinkRequest extends TeaModel {
    @NameInMap("BusinessTypeId")
    public String businessTypeId;

    @NameInMap("BusinessTypeParams")
    public String businessTypeParams;

    @NameInMap("DeviceResourceId")
    public String deviceResourceId;

    @NameInMap("DeviceResourceIds")
    public String deviceResourceIdsShrink;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IpType")
    public String ipType;

    @NameInMap("LoopbackPort")
    public String loopbackPort;

    @NameInMap("NetLocation")
    public String netLocation;

    @NameInMap("SetupProjectId")
    public String setupProjectId;

    public static ApplyIPShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyIPShrinkRequest self = new ApplyIPShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ApplyIPShrinkRequest setBusinessTypeId(String businessTypeId) {
        this.businessTypeId = businessTypeId;
        return this;
    }
    public String getBusinessTypeId() {
        return this.businessTypeId;
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

    public ApplyIPShrinkRequest setDeviceResourceIdsShrink(String deviceResourceIdsShrink) {
        this.deviceResourceIdsShrink = deviceResourceIdsShrink;
        return this;
    }
    public String getDeviceResourceIdsShrink() {
        return this.deviceResourceIdsShrink;
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

    public ApplyIPShrinkRequest setSetupProjectId(String setupProjectId) {
        this.setupProjectId = setupProjectId;
        return this;
    }
    public String getSetupProjectId() {
        return this.setupProjectId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ApplyIPRequest extends TeaModel {
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
    public java.util.List<String> deviceResourceIds;

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

    public static ApplyIPRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyIPRequest self = new ApplyIPRequest();
        return TeaModel.build(map, self);
    }

    public ApplyIPRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ApplyIPRequest setIpType(String ipType) {
        this.ipType = ipType;
        return this;
    }
    public String getIpType() {
        return this.ipType;
    }

    public ApplyIPRequest setSetupProjectId(String setupProjectId) {
        this.setupProjectId = setupProjectId;
        return this;
    }
    public String getSetupProjectId() {
        return this.setupProjectId;
    }

    public ApplyIPRequest setBusinessTypeId(String businessTypeId) {
        this.businessTypeId = businessTypeId;
        return this;
    }
    public String getBusinessTypeId() {
        return this.businessTypeId;
    }

    public ApplyIPRequest setDeviceResourceIds(java.util.List<String> deviceResourceIds) {
        this.deviceResourceIds = deviceResourceIds;
        return this;
    }
    public java.util.List<String> getDeviceResourceIds() {
        return this.deviceResourceIds;
    }

    public ApplyIPRequest setLoopbackPort(String loopbackPort) {
        this.loopbackPort = loopbackPort;
        return this;
    }
    public String getLoopbackPort() {
        return this.loopbackPort;
    }

    public ApplyIPRequest setNetLocation(String netLocation) {
        this.netLocation = netLocation;
        return this;
    }
    public String getNetLocation() {
        return this.netLocation;
    }

    public ApplyIPRequest setBusinessTypeParams(String businessTypeParams) {
        this.businessTypeParams = businessTypeParams;
        return this;
    }
    public String getBusinessTypeParams() {
        return this.businessTypeParams;
    }

    public ApplyIPRequest setDeviceResourceId(String deviceResourceId) {
        this.deviceResourceId = deviceResourceId;
        return this;
    }
    public String getDeviceResourceId() {
        return this.deviceResourceId;
    }

}

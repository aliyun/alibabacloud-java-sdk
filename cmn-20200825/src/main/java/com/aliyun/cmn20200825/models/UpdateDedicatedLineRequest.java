// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateDedicatedLineRequest extends TeaModel {
    // 实例 ID。
    @NameInMap("DedicatedLineId")
    public String dedicatedLineId;

    // 运营商
    @NameInMap("Isp")
    public String isp;

    // 宽带（Mbps）
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    // 专线IP
    @NameInMap("DedicatedLineIp")
    public String dedicatedLineIp;

    // 专线网关
    @NameInMap("DedicatedLineGateway")
    public String dedicatedLineGateway;

    // 专线角色
    @NameInMap("DedicatedLineRole")
    public String dedicatedLineRole;

    // 关联设备ID
    @NameInMap("DeviceId")
    public String deviceId;

    // 关联设备端口名称
    @NameInMap("DevicePort")
    public String devicePort;

    public static UpdateDedicatedLineRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDedicatedLineRequest self = new UpdateDedicatedLineRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDedicatedLineRequest setDedicatedLineId(String dedicatedLineId) {
        this.dedicatedLineId = dedicatedLineId;
        return this;
    }
    public String getDedicatedLineId() {
        return this.dedicatedLineId;
    }

    public UpdateDedicatedLineRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public UpdateDedicatedLineRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public UpdateDedicatedLineRequest setDedicatedLineIp(String dedicatedLineIp) {
        this.dedicatedLineIp = dedicatedLineIp;
        return this;
    }
    public String getDedicatedLineIp() {
        return this.dedicatedLineIp;
    }

    public UpdateDedicatedLineRequest setDedicatedLineGateway(String dedicatedLineGateway) {
        this.dedicatedLineGateway = dedicatedLineGateway;
        return this;
    }
    public String getDedicatedLineGateway() {
        return this.dedicatedLineGateway;
    }

    public UpdateDedicatedLineRequest setDedicatedLineRole(String dedicatedLineRole) {
        this.dedicatedLineRole = dedicatedLineRole;
        return this;
    }
    public String getDedicatedLineRole() {
        return this.dedicatedLineRole;
    }

    public UpdateDedicatedLineRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public UpdateDedicatedLineRequest setDevicePort(String devicePort) {
        this.devicePort = devicePort;
        return this;
    }
    public String getDevicePort() {
        return this.devicePort;
    }

}

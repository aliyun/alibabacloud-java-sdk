// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DedicatedLine extends TeaModel {
    // 宽带（Mbps）
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    // 关联设备ID
    @NameInMap("DeviceId")
    public String deviceId;

    // 关联设备端口
    @NameInMap("DevicePort")
    public String devicePort;

    // 运营商
    @NameInMap("Isp")
    public String isp;

    // 专线网关
    @NameInMap("LineGateway")
    public String lineGateway;

    // 物理空间专线ID
    @NameInMap("LineId")
    public String lineId;

    // 专线IP
    @NameInMap("LineIp")
    public String lineIp;

    // 专线角色
    @NameInMap("LineRole")
    public String lineRole;

    public static DedicatedLine build(java.util.Map<String, ?> map) throws Exception {
        DedicatedLine self = new DedicatedLine();
        return TeaModel.build(map, self);
    }

    public DedicatedLine setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public DedicatedLine setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public DedicatedLine setDevicePort(String devicePort) {
        this.devicePort = devicePort;
        return this;
    }
    public String getDevicePort() {
        return this.devicePort;
    }

    public DedicatedLine setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public DedicatedLine setLineGateway(String lineGateway) {
        this.lineGateway = lineGateway;
        return this;
    }
    public String getLineGateway() {
        return this.lineGateway;
    }

    public DedicatedLine setLineId(String lineId) {
        this.lineId = lineId;
        return this;
    }
    public String getLineId() {
        return this.lineId;
    }

    public DedicatedLine setLineIp(String lineIp) {
        this.lineIp = lineIp;
        return this;
    }
    public String getLineIp() {
        return this.lineIp;
    }

    public DedicatedLine setLineRole(String lineRole) {
        this.lineRole = lineRole;
        return this;
    }
    public String getLineRole() {
        return this.lineRole;
    }

}

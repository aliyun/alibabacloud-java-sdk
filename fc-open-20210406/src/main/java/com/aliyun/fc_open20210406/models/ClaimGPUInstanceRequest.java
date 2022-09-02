// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ClaimGPUInstanceRequest extends TeaModel {
    @NameInMap("diskPerformanceLevel")
    public String diskPerformanceLevel;

    @NameInMap("diskSizeGigabytes")
    public String diskSizeGigabytes;

    @NameInMap("imageId")
    public String imageId;

    @NameInMap("instanceType")
    public String instanceType;

    @NameInMap("internetBandwidthOut")
    public String internetBandwidthOut;

    @NameInMap("password")
    public String password;

    @NameInMap("sourceCidrIp")
    public String sourceCidrIp;

    @NameInMap("tcpPortRange")
    public java.util.List<String> tcpPortRange;

    @NameInMap("udpPortRange")
    public java.util.List<String> udpPortRange;

    public static ClaimGPUInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ClaimGPUInstanceRequest self = new ClaimGPUInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ClaimGPUInstanceRequest setDiskPerformanceLevel(String diskPerformanceLevel) {
        this.diskPerformanceLevel = diskPerformanceLevel;
        return this;
    }
    public String getDiskPerformanceLevel() {
        return this.diskPerformanceLevel;
    }

    public ClaimGPUInstanceRequest setDiskSizeGigabytes(String diskSizeGigabytes) {
        this.diskSizeGigabytes = diskSizeGigabytes;
        return this;
    }
    public String getDiskSizeGigabytes() {
        return this.diskSizeGigabytes;
    }

    public ClaimGPUInstanceRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ClaimGPUInstanceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ClaimGPUInstanceRequest setInternetBandwidthOut(String internetBandwidthOut) {
        this.internetBandwidthOut = internetBandwidthOut;
        return this;
    }
    public String getInternetBandwidthOut() {
        return this.internetBandwidthOut;
    }

    public ClaimGPUInstanceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ClaimGPUInstanceRequest setSourceCidrIp(String sourceCidrIp) {
        this.sourceCidrIp = sourceCidrIp;
        return this;
    }
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    public ClaimGPUInstanceRequest setTcpPortRange(java.util.List<String> tcpPortRange) {
        this.tcpPortRange = tcpPortRange;
        return this;
    }
    public java.util.List<String> getTcpPortRange() {
        return this.tcpPortRange;
    }

    public ClaimGPUInstanceRequest setUdpPortRange(java.util.List<String> udpPortRange) {
        this.udpPortRange = udpPortRange;
        return this;
    }
    public java.util.List<String> getUdpPortRange() {
        return this.udpPortRange;
    }

}

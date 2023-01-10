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

    @NameInMap("role")
    public String role;

    @NameInMap("sgId")
    public String sgId;

    @NameInMap("sourceCidrIp")
    public String sourceCidrIp;

    @NameInMap("tcpPortRange")
    public java.util.List<String> tcpPortRange;

    @NameInMap("udpPortRange")
    public java.util.List<String> udpPortRange;

    @NameInMap("vpcId")
    public String vpcId;

    @NameInMap("vswId")
    public String vswId;

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

    public ClaimGPUInstanceRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public ClaimGPUInstanceRequest setSgId(String sgId) {
        this.sgId = sgId;
        return this;
    }
    public String getSgId() {
        return this.sgId;
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

    public ClaimGPUInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public ClaimGPUInstanceRequest setVswId(String vswId) {
        this.vswId = vswId;
        return this;
    }
    public String getVswId() {
        return this.vswId;
    }

}

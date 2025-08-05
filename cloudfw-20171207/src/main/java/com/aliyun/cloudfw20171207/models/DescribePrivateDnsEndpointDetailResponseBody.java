// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePrivateDnsEndpointDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pd-12345</p>
     */
    @NameInMap("AccessInstanceId")
    public String accessInstanceId;

    @NameInMap("AccessInstanceName")
    public String accessInstanceName;

    /**
     * <strong>example:</strong>
     * <p>119898001566xxxx</p>
     */
    @NameInMap("AliUid")
    public Long aliUid;

    /**
     * <strong>example:</strong>
     * <p>ep-1nmi412c28c374****</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    @NameInMap("FirewallType")
    public java.util.List<String> firewallType;

    /**
     * <strong>example:</strong>
     * <p>1715075765</p>
     */
    @NameInMap("GmtCreate")
    public Long gmtCreate;

    /**
     * <strong>example:</strong>
     * <p>tcp</p>
     */
    @NameInMap("IpProtocol")
    public String ipProtocol;

    /**
     * <strong>example:</strong>
     * <p>258039427902****</p>
     */
    @NameInMap("MemberUid")
    public Long memberUid;

    /**
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <strong>example:</strong>
     * <p>1.1.1.1</p>
     */
    @NameInMap("PrimaryDns")
    public String primaryDns;

    /**
     * <strong>example:</strong>
     * <p>vsw-8vbno9zxz8j9qiot****</p>
     */
    @NameInMap("PrimaryVSwitchId")
    public String primaryVSwitchId;

    /**
     * <strong>example:</strong>
     * <p>10.1.1.1</p>
     */
    @NameInMap("PrimaryVSwitchIp")
    public String primaryVSwitchIp;

    /**
     * <strong>example:</strong>
     * <p>cn-shenzhen-d</p>
     */
    @NameInMap("PrimaryZoneId")
    public String primaryZoneId;

    /**
     * <strong>example:</strong>
     * <p>Custom</p>
     */
    @NameInMap("PrivateDnsType")
    public String privateDnsType;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <strong>example:</strong>
     * <p>4E7F94C7-781F-5192-86CF-DB0850****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1.1.1.2</p>
     */
    @NameInMap("StandbyDns")
    public String standbyDns;

    /**
     * <strong>example:</strong>
     * <p>vsw-8vb6jk75wfcwnuq****</p>
     */
    @NameInMap("StandbyVSwitchId")
    public String standbyVSwitchId;

    /**
     * <strong>example:</strong>
     * <p>10.1.1.2</p>
     */
    @NameInMap("StandbyVSwitchIp")
    public String standbyVSwitchIp;

    /**
     * <strong>example:</strong>
     * <p>cn-shenzhen-e</p>
     */
    @NameInMap("StandbyZoneId")
    public String standbyZoneId;

    /**
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>132</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>vpc-uf6b5lyul0x******</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DescribePrivateDnsEndpointDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePrivateDnsEndpointDetailResponseBody self = new DescribePrivateDnsEndpointDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePrivateDnsEndpointDetailResponseBody setAccessInstanceId(String accessInstanceId) {
        this.accessInstanceId = accessInstanceId;
        return this;
    }
    public String getAccessInstanceId() {
        return this.accessInstanceId;
    }

    public DescribePrivateDnsEndpointDetailResponseBody setAccessInstanceName(String accessInstanceName) {
        this.accessInstanceName = accessInstanceName;
        return this;
    }
    public String getAccessInstanceName() {
        return this.accessInstanceName;
    }

    public DescribePrivateDnsEndpointDetailResponseBody setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DescribePrivateDnsEndpointDetailResponseBody setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

    public DescribePrivateDnsEndpointDetailResponseBody setFirewallType(java.util.List<String> firewallType) {
        this.firewallType = firewallType;
        return this;
    }
    public java.util.List<String> getFirewallType() {
        return this.firewallType;
    }

    public DescribePrivateDnsEndpointDetailResponseBody setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public DescribePrivateDnsEndpointDetailResponseBody setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public DescribePrivateDnsEndpointDetailResponseBody setMemberUid(Long memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public Long getMemberUid() {
        return this.memberUid;
    }

    public DescribePrivateDnsEndpointDetailResponseBody setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public DescribePrivateDnsEndpointDetailResponseBody setPrimaryDns(String primaryDns) {
        this.primaryDns = primaryDns;
        return this;
    }
    public String getPrimaryDns() {
        return this.primaryDns;
    }

    public DescribePrivateDnsEndpointDetailResponseBody setPrimaryVSwitchId(String primaryVSwitchId) {
        this.primaryVSwitchId = primaryVSwitchId;
        return this;
    }
    public String getPrimaryVSwitchId() {
        return this.primaryVSwitchId;
    }

    public DescribePrivateDnsEndpointDetailResponseBody setPrimaryVSwitchIp(String primaryVSwitchIp) {
        this.primaryVSwitchIp = primaryVSwitchIp;
        return this;
    }
    public String getPrimaryVSwitchIp() {
        return this.primaryVSwitchIp;
    }

    public DescribePrivateDnsEndpointDetailResponseBody setPrimaryZoneId(String primaryZoneId) {
        this.primaryZoneId = primaryZoneId;
        return this;
    }
    public String getPrimaryZoneId() {
        return this.primaryZoneId;
    }

    public DescribePrivateDnsEndpointDetailResponseBody setPrivateDnsType(String privateDnsType) {
        this.privateDnsType = privateDnsType;
        return this;
    }
    public String getPrivateDnsType() {
        return this.privateDnsType;
    }

    public DescribePrivateDnsEndpointDetailResponseBody setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public DescribePrivateDnsEndpointDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePrivateDnsEndpointDetailResponseBody setStandbyDns(String standbyDns) {
        this.standbyDns = standbyDns;
        return this;
    }
    public String getStandbyDns() {
        return this.standbyDns;
    }

    public DescribePrivateDnsEndpointDetailResponseBody setStandbyVSwitchId(String standbyVSwitchId) {
        this.standbyVSwitchId = standbyVSwitchId;
        return this;
    }
    public String getStandbyVSwitchId() {
        return this.standbyVSwitchId;
    }

    public DescribePrivateDnsEndpointDetailResponseBody setStandbyVSwitchIp(String standbyVSwitchIp) {
        this.standbyVSwitchIp = standbyVSwitchIp;
        return this;
    }
    public String getStandbyVSwitchIp() {
        return this.standbyVSwitchIp;
    }

    public DescribePrivateDnsEndpointDetailResponseBody setStandbyZoneId(String standbyZoneId) {
        this.standbyZoneId = standbyZoneId;
        return this;
    }
    public String getStandbyZoneId() {
        return this.standbyZoneId;
    }

    public DescribePrivateDnsEndpointDetailResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribePrivateDnsEndpointDetailResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribePrivateDnsEndpointDetailResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}

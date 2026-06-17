// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeUserBuyVersionResponseBody extends TeaModel {
    /**
     * <p>The quota for ACK cluster connectors.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("AckClusterConnectorQuota")
    public Long ackClusterConnectorQuota;

    /**
     * <p>The ID of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>119898001566xxxx</p>
     */
    @NameInMap("AliUid")
    public Long aliUid;

    /**
     * <p>The default bandwidth of the edition.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("DefaultBandwidth")
    public Long defaultBandwidth;

    /**
     * <p>The expiration time of the Cloud Firewall instance.</p>
     * <blockquote>
     * <p>The value is a UNIX timestamp in milliseconds.</p>
     * </blockquote>
     * <blockquote>
     * <p>This parameter does not apply to pay-as-you-go editions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1726934400000</p>
     */
    @NameInMap("Expire")
    public Long expire;

    /**
     * <p>The extended bandwidth.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("ExtensionBandwidth")
    public Long extensionBandwidth;

    /**
     * <p>The number of general-purpose instances.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("GeneralInstance")
    public Long generalInstance;

    /**
     * <p>The ID of the Cloud Firewall instance.</p>
     * <blockquote>
     * <p>This parameter does not apply to trial editions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vipcloudfw-cn-xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The operational status of the Cloud Firewall instance. Valid values:</p>
     * <ul>
     * <li><p><strong>normal</strong>: The instance is running as expected.</p>
     * </li>
     * <li><p><strong>init</strong>: The instance is being initialized.</p>
     * </li>
     * <li><p><strong>deleting</strong>: The instance is being deleted.</p>
     * </li>
     * <li><p><strong>abnormal</strong>: The instance is in an abnormal state.</p>
     * </li>
     * <li><p><strong>free</strong>: No valid instance is available.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("InstanceStatus")
    public String instanceStatus;

    /**
     * <p>The purchased traffic processing capability for the Internet firewall.</p>
     * 
     * <strong>example:</strong>
     * <p>3000</p>
     */
    @NameInMap("InternetBandwidth")
    public Long internetBandwidth;

    /**
     * <p>The number of public IP addresses that can be protected.</p>
     * <blockquote>
     * <p>This parameter applies only to subscription instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>63</p>
     */
    @NameInMap("IpNumber")
    public Long ipNumber;

    /**
     * <p>Indicates whether log delivery is enabled. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enabled</p>
     * </li>
     * <li><p><strong>false</strong>: Disabled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("LogStatus")
    public Boolean logStatus;

    /**
     * <p>The purchased log storage capacity.</p>
     * <blockquote>
     * <p>This parameter applies only to subscription instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3000</p>
     */
    @NameInMap("LogStorage")
    public Long logStorage;

    /**
     * <p>The major version.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MajorVersion")
    public Long majorVersion;

    /**
     * <p>Indicates whether elastic billing for excess traffic is enabled. Valid values:</p>
     * <ul>
     * <li><p><strong>1000000</strong>: Enabled</p>
     * </li>
     * <li><p><strong>0</strong>: Disabled</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter applies only to subscription instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MaxOverflow")
    public Long maxOverflow;

    /**
     * <p>The purchased traffic processing capability for the NAT firewall.</p>
     * 
     * <strong>example:</strong>
     * <p>3000</p>
     */
    @NameInMap("NatBandwidth")
    public Long natBandwidth;

    /**
     * <p>The quota for private DNS connectors.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PrivateDnsConnectorQuota")
    public Long privateDnsConnectorQuota;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F71B03EE-xxxxx-91D79CC6AA1A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether data leakage prevention is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sdl")
    public Long sdl;

    /**
     * <p>The time when the Cloud Firewall instance was enabled.</p>
     * <blockquote>
     * <p>The value is a UNIX timestamp in milliseconds.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1692504764000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The temporary bandwidth.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("TemporaryBandwidth")
    public Long temporaryBandwidth;

    /**
     * <p>Indicates whether threat intelligence is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ThreatIntelligence")
    public Long threatIntelligence;

    /**
     * <p>The status of the Cloud Firewall instance. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The instance is valid.</p>
     * </li>
     * <li><p><strong>false</strong>: The instance is invalid.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UserStatus")
    public Boolean userStatus;

    /**
     * <p>The edition of the Cloud Firewall instance. Valid values:</p>
     * <ul>
     * <li><p><strong>2</strong>: Premium Edition</p>
     * </li>
     * <li><p><strong>3</strong>: Enterprise Edition</p>
     * </li>
     * <li><p><strong>4</strong>: Ultimate Edition</p>
     * </li>
     * <li><p><strong>10</strong>: Pay-as-you-go</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Version")
    public Integer version;

    /**
     * <p>The purchased traffic processing capability for the VPC firewall.</p>
     * 
     * <strong>example:</strong>
     * <p>3000</p>
     */
    @NameInMap("VpcBandwidth")
    public Long vpcBandwidth;

    /**
     * <p>The number of purchased VPC firewalls.</p>
     * <blockquote>
     * <p>This parameter applies only to subscription instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>21</p>
     */
    @NameInMap("VpcNumber")
    public Long vpcNumber;

    public static DescribeUserBuyVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserBuyVersionResponseBody self = new DescribeUserBuyVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserBuyVersionResponseBody setAckClusterConnectorQuota(Long ackClusterConnectorQuota) {
        this.ackClusterConnectorQuota = ackClusterConnectorQuota;
        return this;
    }
    public Long getAckClusterConnectorQuota() {
        return this.ackClusterConnectorQuota;
    }

    public DescribeUserBuyVersionResponseBody setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DescribeUserBuyVersionResponseBody setDefaultBandwidth(Long defaultBandwidth) {
        this.defaultBandwidth = defaultBandwidth;
        return this;
    }
    public Long getDefaultBandwidth() {
        return this.defaultBandwidth;
    }

    public DescribeUserBuyVersionResponseBody setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
    }

    public DescribeUserBuyVersionResponseBody setExtensionBandwidth(Long extensionBandwidth) {
        this.extensionBandwidth = extensionBandwidth;
        return this;
    }
    public Long getExtensionBandwidth() {
        return this.extensionBandwidth;
    }

    public DescribeUserBuyVersionResponseBody setGeneralInstance(Long generalInstance) {
        this.generalInstance = generalInstance;
        return this;
    }
    public Long getGeneralInstance() {
        return this.generalInstance;
    }

    public DescribeUserBuyVersionResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeUserBuyVersionResponseBody setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public DescribeUserBuyVersionResponseBody setInternetBandwidth(Long internetBandwidth) {
        this.internetBandwidth = internetBandwidth;
        return this;
    }
    public Long getInternetBandwidth() {
        return this.internetBandwidth;
    }

    public DescribeUserBuyVersionResponseBody setIpNumber(Long ipNumber) {
        this.ipNumber = ipNumber;
        return this;
    }
    public Long getIpNumber() {
        return this.ipNumber;
    }

    public DescribeUserBuyVersionResponseBody setLogStatus(Boolean logStatus) {
        this.logStatus = logStatus;
        return this;
    }
    public Boolean getLogStatus() {
        return this.logStatus;
    }

    public DescribeUserBuyVersionResponseBody setLogStorage(Long logStorage) {
        this.logStorage = logStorage;
        return this;
    }
    public Long getLogStorage() {
        return this.logStorage;
    }

    public DescribeUserBuyVersionResponseBody setMajorVersion(Long majorVersion) {
        this.majorVersion = majorVersion;
        return this;
    }
    public Long getMajorVersion() {
        return this.majorVersion;
    }

    public DescribeUserBuyVersionResponseBody setMaxOverflow(Long maxOverflow) {
        this.maxOverflow = maxOverflow;
        return this;
    }
    public Long getMaxOverflow() {
        return this.maxOverflow;
    }

    public DescribeUserBuyVersionResponseBody setNatBandwidth(Long natBandwidth) {
        this.natBandwidth = natBandwidth;
        return this;
    }
    public Long getNatBandwidth() {
        return this.natBandwidth;
    }

    public DescribeUserBuyVersionResponseBody setPrivateDnsConnectorQuota(Long privateDnsConnectorQuota) {
        this.privateDnsConnectorQuota = privateDnsConnectorQuota;
        return this;
    }
    public Long getPrivateDnsConnectorQuota() {
        return this.privateDnsConnectorQuota;
    }

    public DescribeUserBuyVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserBuyVersionResponseBody setSdl(Long sdl) {
        this.sdl = sdl;
        return this;
    }
    public Long getSdl() {
        return this.sdl;
    }

    public DescribeUserBuyVersionResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeUserBuyVersionResponseBody setTemporaryBandwidth(Long temporaryBandwidth) {
        this.temporaryBandwidth = temporaryBandwidth;
        return this;
    }
    public Long getTemporaryBandwidth() {
        return this.temporaryBandwidth;
    }

    public DescribeUserBuyVersionResponseBody setThreatIntelligence(Long threatIntelligence) {
        this.threatIntelligence = threatIntelligence;
        return this;
    }
    public Long getThreatIntelligence() {
        return this.threatIntelligence;
    }

    public DescribeUserBuyVersionResponseBody setUserStatus(Boolean userStatus) {
        this.userStatus = userStatus;
        return this;
    }
    public Boolean getUserStatus() {
        return this.userStatus;
    }

    public DescribeUserBuyVersionResponseBody setVersion(Integer version) {
        this.version = version;
        return this;
    }
    public Integer getVersion() {
        return this.version;
    }

    public DescribeUserBuyVersionResponseBody setVpcBandwidth(Long vpcBandwidth) {
        this.vpcBandwidth = vpcBandwidth;
        return this;
    }
    public Long getVpcBandwidth() {
        return this.vpcBandwidth;
    }

    public DescribeUserBuyVersionResponseBody setVpcNumber(Long vpcNumber) {
        this.vpcNumber = vpcNumber;
        return this;
    }
    public Long getVpcNumber() {
        return this.vpcNumber;
    }

}

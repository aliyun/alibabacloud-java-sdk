// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeUserBuyVersionResponseBody extends TeaModel {
    /**
     * <p>The ACK cluster connector quota.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("AckClusterConnectorQuota")
    public Long ackClusterConnectorQuota;

    /**
     * <p>The AliUid of the Cloud Firewall account.</p>
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
     * <p>The value is a millisecond-level UNIX timestamp.</p>
     * </blockquote>
     * <blockquote>
     * <p>This field is meaningless when you use the pay-as-you-go edition.</p>
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
     * <p>The general-purpose instance quota.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("GeneralInstance")
    public Long generalInstance;

    /**
     * <p>The ID of the purchased Cloud Firewall instance.</p>
     * <blockquote>
     * <p>This field is meaningless when you use the trial version.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vipcloudfw-cn-xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The provisioning status of the Cloud Firewall instance. Valid values:</p>
     * <ul>
     * <li><p><strong>normal</strong>: The instance is running normally.</p>
     * </li>
     * <li><p><strong>init</strong>: The instance is being initialized.</p>
     * </li>
     * <li><p><strong>deleting</strong>: The instance is being deleted. </p>
     * </li>
     * <li><p><strong>abnormal</strong>: The instance is abnormal.</p>
     * </li>
     * <li><p><strong>free</strong>: No valid instance exists.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("InstanceStatus")
    public String instanceStatus;

    /**
     * <p>The purchased traffic processing capacity of the Internet firewall.</p>
     * 
     * <strong>example:</strong>
     * <p>3000</p>
     */
    @NameInMap("InternetBandwidth")
    public Long internetBandwidth;

    /**
     * <p>The purchased quota for the Internet border protection.</p>
     * <blockquote>
     * <p>This field takes effect only for subscription users.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>63</p>
     */
    @NameInMap("IpNumber")
    public Long ipNumber;

    /**
     * <p>The enabling status of log delivery. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enabled.</li>
     * <li><strong>false</strong>: Disabled.</li>
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
     * <p>This field takes effect only for subscription users.</p>
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
     * <p>Indicates whether burstable elastic billing is enabled. Valid values:</p>
     * <ul>
     * <li><strong>1000000</strong>: Enabled.</li>
     * <li><strong>0</strong>: Disabled.</li>
     * </ul>
     * <blockquote>
     * <p>This field takes effect only for subscription users.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MaxOverflow")
    public Long maxOverflow;

    /**
     * <p>The purchased traffic processing capacity of NAT firewalls.</p>
     * 
     * <strong>example:</strong>
     * <p>3000</p>
     */
    @NameInMap("NatBandwidth")
    public Long natBandwidth;

    /**
     * <p>The private DNS connector quota.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PrivateDnsConnectorQuota")
    public Long privateDnsConnectorQuota;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F71B03EE-xxxxx-91D79CC6AA1A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The enabling status of sensitive data leak detection. In the Resource field, true indicates enabled and false indicates disabled. In the API response, 1 indicates enabled and 0 indicates disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Sdl")
    public Long sdl;

    /**
     * <p>The activation time of the Cloud Firewall instance.</p>
     * <blockquote>
     * <p>The value is a millisecond-level UNIX timestamp.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1692504764000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The temporary upgrade bandwidth.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("TemporaryBandwidth")
    public Long temporaryBandwidth;

    /**
     * <p>The enabling status of threat intelligence.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ThreatIntelligence")
    public Long threatIntelligence;

    /**
     * <p>The status of the Cloud Firewall instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Valid.</li>
     * <li><strong>false</strong>: Invalid.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UserStatus")
    public Boolean userStatus;

    /**
     * <p>The version of the Cloud Firewall instance. Valid values:</p>
     * <ul>
     * <li><strong>2</strong>: Premium Edition</li>
     * <li><strong>3</strong>: Enterprise Edition</li>
     * <li><strong>4</strong>: Ultimate Edition</li>
     * <li><strong>10</strong>: Pay-as-you-go Edition</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Version")
    public Integer version;

    /**
     * <p>The purchased traffic processing capacity of VPC firewalls.</p>
     * 
     * <strong>example:</strong>
     * <p>3000</p>
     */
    @NameInMap("VpcBandwidth")
    public Long vpcBandwidth;

    /**
     * <p>The purchased quota for VPC firewalls.</p>
     * <blockquote>
     * <p>This field takes effect only for subscription users.</p>
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

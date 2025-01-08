// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeUserBuyVersionResponseBody extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account that is used to purchase Cloud Firewall.</p>
     * 
     * <strong>example:</strong>
     * <p>119898001566xxxx</p>
     */
    @NameInMap("AliUid")
    public Long aliUid;

    /**
     * <p>The time when Cloud Firewall expires.</p>
     * <blockquote>
     * <p> The value is a timestamp in milliseconds.</p>
     * </blockquote>
     * <blockquote>
     * <p> If you use Cloud Firewall that uses the pay-as-you-go billing method, ignore this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1726934400000</p>
     */
    @NameInMap("Expire")
    public Long expire;

    /**
     * <p>The instance ID of Cloud Firewall.</p>
     * <blockquote>
     * <p> If you use a trial of Cloud Firewall, ignore this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vipcloudfw-cn-xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The status of Cloud Firewall. Valid values:</p>
     * <ul>
     * <li><strong>normal</strong>: Cloud Firewall is running as expected.</li>
     * <li><strong>init</strong>: Cloud Firewall is being initialized.</li>
     * <li><strong>deleting</strong>: Cloud Firewall is being deleted.</li>
     * <li><strong>abnormal</strong>: An exception occurs in Cloud Firewall.</li>
     * <li><strong>free</strong>: Cloud Firewall is invalid.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("InstanceStatus")
    public String instanceStatus;

    @NameInMap("InternetBandwidth")
    public Long internetBandwidth;

    /**
     * <p>The number of public IP addresses that can be protected.</p>
     * <blockquote>
     * <p> This parameter takes effect only for Cloud Firewall that uses the subscription billing method.</p>
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
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("LogStatus")
    public Boolean logStatus;

    /**
     * <p>The log storage capacity.</p>
     * <blockquote>
     * <p> This parameter takes effect only for Cloud Firewall that uses the subscription billing method.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3000</p>
     */
    @NameInMap("LogStorage")
    public Long logStorage;

    /**
     * <p>The status of the burstable protected traffic feature. Valid values:</p>
     * <ul>
     * <li><strong>1000000</strong>: enabled.</li>
     * <li><strong>0</strong>: disabled.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect only for Cloud Firewall that uses the subscription billing method.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MaxOverflow")
    public Long maxOverflow;

    @NameInMap("NatBandwidth")
    public Long natBandwidth;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F71B03EE-xxxxx-91D79CC6AA1A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The time when Cloud Firewall was activated.</p>
     * <blockquote>
     * <p> The value is a timestamp in milliseconds.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1692504764000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>Indicates whether Cloud Firewall is valid. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UserStatus")
    public Boolean userStatus;

    /**
     * <p>The edition of Cloud Firewall. Valid values:</p>
     * <ul>
     * <li><strong>2</strong>: Premium Edition.</li>
     * <li><strong>3</strong>: Enterprise Edition.</li>
     * <li><strong>4</strong>: Ultimate Edition.</li>
     * <li><strong>10</strong>: Cloud Firewall that uses the pay-as-you-go billing method.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Version")
    public Integer version;

    @NameInMap("VpcBandwidth")
    public Long vpcBandwidth;

    /**
     * <p>The number of virtual private clouds (VPCs) that can be protected.</p>
     * <blockquote>
     * <p> This parameter takes effect only for Cloud Firewall that uses the subscription billing method.</p>
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

    public DescribeUserBuyVersionResponseBody setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DescribeUserBuyVersionResponseBody setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
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

    public DescribeUserBuyVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserBuyVersionResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
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

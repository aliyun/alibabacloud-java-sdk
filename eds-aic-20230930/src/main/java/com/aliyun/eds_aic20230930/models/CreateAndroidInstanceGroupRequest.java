// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateAndroidInstanceGroupRequest extends TeaModel {
    /**
     * <p>The number of instance groups. Default value: 1. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>Specifies whether to enable automatic payment. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    @NameInMap("BandwidthPackageType")
    public String bandwidthPackageType;

    /**
     * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the list of regions where cloud phone instances can be purchased.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    @NameInMap("ChannelCookie")
    public String channelCookie;

    /**
     * <p>The billing type.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request and prevent repeated submissions. The value cannot exceed 100 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>asadbuvwiabdbvchj****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <blockquote>
     * <p>This parameter is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("EnableIpv6")
    public Boolean enableIpv6;

    /**
     * <p>Specifies whether to enable GPU acceleration.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("GpuAcceleration")
    public Boolean gpuAcceleration;

    /**
     * <p>The image ID. You can call <a href="~~DescribeImageList~~">DescribeImageList</a> to query the list of cloud phone images.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>imgc-06zyt9m93zwax****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The instance group name.</p>
     * <blockquote>
     * <p>The instance group name cannot exceed 30 characters in length. It must start with an uppercase letter, lowercase letter, or Chinese character. It cannot start with <code>http://</code> or <code>https://</code>. It can contain Chinese characters, letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Cloud phoneA</p>
     */
    @NameInMap("InstanceGroupName")
    public String instanceGroupName;

    /**
     * <p>The instance group specification. You can call <a href="~~DescribeSpec~~">DescribeSpec</a> to query the specifications available for cloud phone instances.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acp.basic.small</p>
     */
    @NameInMap("InstanceGroupSpec")
    public String instanceGroupSpec;

    @NameInMap("InstanceVersion")
    public String instanceVersion;

    /**
     * <blockquote>
     * <p>This parameter is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Ipv6Bandwidth")
    public Integer ipv6Bandwidth;

    /**
     * <p>The key pair ID. If you specify a valid key pair ID when creating an instance group, the key pair is bound to all instances that are successfully created, without the need to call the bindng operation again.</p>
     * <blockquote>
     * <p>Binding a key pair during scale-out is not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>kp-7o9xywwfutc1l****</p>
     */
    @NameInMap("KeyPairId")
    public String keyPairId;

    @NameInMap("NetworkInfo")
    public CreateAndroidInstanceGroupRequestNetworkInfo networkInfo;

    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The number of instances in the instance group. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NumberOfInstances")
    public Integer numberOfInstances;

    /**
     * <p>The network ID.</p>
     * <ul>
     * <li><p>To create a shared network instance: the network ID is optional. Specify the network ID of the <strong>Shared Network</strong> type on the <a href="https://wya.wuying.aliyun.com/network">Cloud Phone console &gt; Network</a> page. If no shared network exists in the console, you can leave this parameter empty. A shared network is automatically created when the instance group is created.</p>
     * </li>
     * <li><p>To create a VPC network instance: the network ID is required. Specify the network ID of the <strong>VPC Network</strong> type on the <a href="https://wya.wuying.aliyun.com/network">Cloud Phone console &gt; Network</a> page. If no VPC network exists in the console, create a network first.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-745976****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <strong>example:</strong>
     * <p>wya.wuying.aliyun.com/instanceGroup</p>
     */
    @NameInMap("PaidCallBackUrl")
    public String paidCallBackUrl;

    /**
     * <p>The subscription duration of the resource. The unit is specified by PeriodUnit.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The policy ID. You can call <a href="~~ListPolicyGroups~~">ListPolicyGroups</a> to query the list of policies.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-b7bxrrwxkijjh****</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    @NameInMap("PromotionId")
    public String promotionId;

    @NameInMap("SaleMode")
    public String saleMode;

    @NameInMap("StreamMode")
    public Integer streamMode;

    /**
     * <p>The tags of the resource.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateAndroidInstanceGroupRequestTag> tag;

    /**
     * <p>The vSwitch ID. You can call <a href="https://help.aliyun.com/document_detail/448774.html">DescribeVSwitches</a> to query the list of vSwitches.</p>
     * <ul>
     * <li><p>To create a shared network instance: leave this parameter empty.</p>
     * </li>
     * <li><p>To create a VPC network instance: the vSwitch ID is required. The specified vSwitch is used to create the instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf61uvzhz8ejaw776****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static CreateAndroidInstanceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAndroidInstanceGroupRequest self = new CreateAndroidInstanceGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateAndroidInstanceGroupRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public CreateAndroidInstanceGroupRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateAndroidInstanceGroupRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateAndroidInstanceGroupRequest setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public CreateAndroidInstanceGroupRequest setBandwidthPackageType(String bandwidthPackageType) {
        this.bandwidthPackageType = bandwidthPackageType;
        return this;
    }
    public String getBandwidthPackageType() {
        return this.bandwidthPackageType;
    }

    public CreateAndroidInstanceGroupRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public CreateAndroidInstanceGroupRequest setChannelCookie(String channelCookie) {
        this.channelCookie = channelCookie;
        return this;
    }
    public String getChannelCookie() {
        return this.channelCookie;
    }

    public CreateAndroidInstanceGroupRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateAndroidInstanceGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAndroidInstanceGroupRequest setEnableIpv6(Boolean enableIpv6) {
        this.enableIpv6 = enableIpv6;
        return this;
    }
    public Boolean getEnableIpv6() {
        return this.enableIpv6;
    }

    public CreateAndroidInstanceGroupRequest setGpuAcceleration(Boolean gpuAcceleration) {
        this.gpuAcceleration = gpuAcceleration;
        return this;
    }
    public Boolean getGpuAcceleration() {
        return this.gpuAcceleration;
    }

    public CreateAndroidInstanceGroupRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateAndroidInstanceGroupRequest setInstanceGroupName(String instanceGroupName) {
        this.instanceGroupName = instanceGroupName;
        return this;
    }
    public String getInstanceGroupName() {
        return this.instanceGroupName;
    }

    public CreateAndroidInstanceGroupRequest setInstanceGroupSpec(String instanceGroupSpec) {
        this.instanceGroupSpec = instanceGroupSpec;
        return this;
    }
    public String getInstanceGroupSpec() {
        return this.instanceGroupSpec;
    }

    public CreateAndroidInstanceGroupRequest setInstanceVersion(String instanceVersion) {
        this.instanceVersion = instanceVersion;
        return this;
    }
    public String getInstanceVersion() {
        return this.instanceVersion;
    }

    public CreateAndroidInstanceGroupRequest setIpv6Bandwidth(Integer ipv6Bandwidth) {
        this.ipv6Bandwidth = ipv6Bandwidth;
        return this;
    }
    public Integer getIpv6Bandwidth() {
        return this.ipv6Bandwidth;
    }

    public CreateAndroidInstanceGroupRequest setKeyPairId(String keyPairId) {
        this.keyPairId = keyPairId;
        return this;
    }
    public String getKeyPairId() {
        return this.keyPairId;
    }

    public CreateAndroidInstanceGroupRequest setNetworkInfo(CreateAndroidInstanceGroupRequestNetworkInfo networkInfo) {
        this.networkInfo = networkInfo;
        return this;
    }
    public CreateAndroidInstanceGroupRequestNetworkInfo getNetworkInfo() {
        return this.networkInfo;
    }

    public CreateAndroidInstanceGroupRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateAndroidInstanceGroupRequest setNumberOfInstances(Integer numberOfInstances) {
        this.numberOfInstances = numberOfInstances;
        return this;
    }
    public Integer getNumberOfInstances() {
        return this.numberOfInstances;
    }

    public CreateAndroidInstanceGroupRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public CreateAndroidInstanceGroupRequest setPaidCallBackUrl(String paidCallBackUrl) {
        this.paidCallBackUrl = paidCallBackUrl;
        return this;
    }
    public String getPaidCallBackUrl() {
        return this.paidCallBackUrl;
    }

    public CreateAndroidInstanceGroupRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateAndroidInstanceGroupRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateAndroidInstanceGroupRequest setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public CreateAndroidInstanceGroupRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public CreateAndroidInstanceGroupRequest setSaleMode(String saleMode) {
        this.saleMode = saleMode;
        return this;
    }
    public String getSaleMode() {
        return this.saleMode;
    }

    public CreateAndroidInstanceGroupRequest setStreamMode(Integer streamMode) {
        this.streamMode = streamMode;
        return this;
    }
    public Integer getStreamMode() {
        return this.streamMode;
    }

    public CreateAndroidInstanceGroupRequest setTag(java.util.List<CreateAndroidInstanceGroupRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateAndroidInstanceGroupRequestTag> getTag() {
        return this.tag;
    }

    public CreateAndroidInstanceGroupRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static class CreateAndroidInstanceGroupRequestNetworkInfo extends TeaModel {
        @NameInMap("AutoPay")
        public Boolean autoPay;

        @NameInMap("AutoRenew")
        public Boolean autoRenew;

        @NameInMap("BandwidthPackageName")
        public String bandwidthPackageName;

        @NameInMap("CidrBlock")
        public String cidrBlock;

        @NameInMap("InternetChargeType")
        public String internetChargeType;

        @NameInMap("IpRatio")
        public Integer ipRatio;

        @NameInMap("Isp")
        public String isp;

        @NameInMap("LimitedBandwidth")
        public Integer limitedBandwidth;

        @NameInMap("PaidCallbackUrl")
        public String paidCallbackUrl;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("Period")
        public Integer period;

        @NameInMap("PeriodUnit")
        public String periodUnit;

        @NameInMap("PromotionId")
        public String promotionId;

        @NameInMap("VisibleType")
        public String visibleType;

        public static CreateAndroidInstanceGroupRequestNetworkInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateAndroidInstanceGroupRequestNetworkInfo self = new CreateAndroidInstanceGroupRequestNetworkInfo();
            return TeaModel.build(map, self);
        }

        public CreateAndroidInstanceGroupRequestNetworkInfo setAutoPay(Boolean autoPay) {
            this.autoPay = autoPay;
            return this;
        }
        public Boolean getAutoPay() {
            return this.autoPay;
        }

        public CreateAndroidInstanceGroupRequestNetworkInfo setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public CreateAndroidInstanceGroupRequestNetworkInfo setBandwidthPackageName(String bandwidthPackageName) {
            this.bandwidthPackageName = bandwidthPackageName;
            return this;
        }
        public String getBandwidthPackageName() {
            return this.bandwidthPackageName;
        }

        public CreateAndroidInstanceGroupRequestNetworkInfo setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public CreateAndroidInstanceGroupRequestNetworkInfo setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public CreateAndroidInstanceGroupRequestNetworkInfo setIpRatio(Integer ipRatio) {
            this.ipRatio = ipRatio;
            return this;
        }
        public Integer getIpRatio() {
            return this.ipRatio;
        }

        public CreateAndroidInstanceGroupRequestNetworkInfo setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public CreateAndroidInstanceGroupRequestNetworkInfo setLimitedBandwidth(Integer limitedBandwidth) {
            this.limitedBandwidth = limitedBandwidth;
            return this;
        }
        public Integer getLimitedBandwidth() {
            return this.limitedBandwidth;
        }

        public CreateAndroidInstanceGroupRequestNetworkInfo setPaidCallbackUrl(String paidCallbackUrl) {
            this.paidCallbackUrl = paidCallbackUrl;
            return this;
        }
        public String getPaidCallbackUrl() {
            return this.paidCallbackUrl;
        }

        public CreateAndroidInstanceGroupRequestNetworkInfo setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public CreateAndroidInstanceGroupRequestNetworkInfo setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public CreateAndroidInstanceGroupRequestNetworkInfo setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public CreateAndroidInstanceGroupRequestNetworkInfo setPromotionId(String promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public String getPromotionId() {
            return this.promotionId;
        }

        public CreateAndroidInstanceGroupRequestNetworkInfo setVisibleType(String visibleType) {
            this.visibleType = visibleType;
            return this;
        }
        public String getVisibleType() {
            return this.visibleType;
        }

    }

    public static class CreateAndroidInstanceGroupRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateAndroidInstanceGroupRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateAndroidInstanceGroupRequestTag self = new CreateAndroidInstanceGroupRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateAndroidInstanceGroupRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAndroidInstanceGroupRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

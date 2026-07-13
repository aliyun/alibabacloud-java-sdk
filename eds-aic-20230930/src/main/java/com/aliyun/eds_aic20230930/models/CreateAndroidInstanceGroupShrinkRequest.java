// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateAndroidInstanceGroupShrinkRequest extends TeaModel {
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
    public String networkInfoShrink;

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
    public java.util.List<CreateAndroidInstanceGroupShrinkRequestTag> tag;

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

    public static CreateAndroidInstanceGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAndroidInstanceGroupShrinkRequest self = new CreateAndroidInstanceGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAndroidInstanceGroupShrinkRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public CreateAndroidInstanceGroupShrinkRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateAndroidInstanceGroupShrinkRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateAndroidInstanceGroupShrinkRequest setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public CreateAndroidInstanceGroupShrinkRequest setBandwidthPackageType(String bandwidthPackageType) {
        this.bandwidthPackageType = bandwidthPackageType;
        return this;
    }
    public String getBandwidthPackageType() {
        return this.bandwidthPackageType;
    }

    public CreateAndroidInstanceGroupShrinkRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public CreateAndroidInstanceGroupShrinkRequest setChannelCookie(String channelCookie) {
        this.channelCookie = channelCookie;
        return this;
    }
    public String getChannelCookie() {
        return this.channelCookie;
    }

    public CreateAndroidInstanceGroupShrinkRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateAndroidInstanceGroupShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAndroidInstanceGroupShrinkRequest setEnableIpv6(Boolean enableIpv6) {
        this.enableIpv6 = enableIpv6;
        return this;
    }
    public Boolean getEnableIpv6() {
        return this.enableIpv6;
    }

    public CreateAndroidInstanceGroupShrinkRequest setGpuAcceleration(Boolean gpuAcceleration) {
        this.gpuAcceleration = gpuAcceleration;
        return this;
    }
    public Boolean getGpuAcceleration() {
        return this.gpuAcceleration;
    }

    public CreateAndroidInstanceGroupShrinkRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateAndroidInstanceGroupShrinkRequest setInstanceGroupName(String instanceGroupName) {
        this.instanceGroupName = instanceGroupName;
        return this;
    }
    public String getInstanceGroupName() {
        return this.instanceGroupName;
    }

    public CreateAndroidInstanceGroupShrinkRequest setInstanceGroupSpec(String instanceGroupSpec) {
        this.instanceGroupSpec = instanceGroupSpec;
        return this;
    }
    public String getInstanceGroupSpec() {
        return this.instanceGroupSpec;
    }

    public CreateAndroidInstanceGroupShrinkRequest setInstanceVersion(String instanceVersion) {
        this.instanceVersion = instanceVersion;
        return this;
    }
    public String getInstanceVersion() {
        return this.instanceVersion;
    }

    public CreateAndroidInstanceGroupShrinkRequest setIpv6Bandwidth(Integer ipv6Bandwidth) {
        this.ipv6Bandwidth = ipv6Bandwidth;
        return this;
    }
    public Integer getIpv6Bandwidth() {
        return this.ipv6Bandwidth;
    }

    public CreateAndroidInstanceGroupShrinkRequest setKeyPairId(String keyPairId) {
        this.keyPairId = keyPairId;
        return this;
    }
    public String getKeyPairId() {
        return this.keyPairId;
    }

    public CreateAndroidInstanceGroupShrinkRequest setNetworkInfoShrink(String networkInfoShrink) {
        this.networkInfoShrink = networkInfoShrink;
        return this;
    }
    public String getNetworkInfoShrink() {
        return this.networkInfoShrink;
    }

    public CreateAndroidInstanceGroupShrinkRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateAndroidInstanceGroupShrinkRequest setNumberOfInstances(Integer numberOfInstances) {
        this.numberOfInstances = numberOfInstances;
        return this;
    }
    public Integer getNumberOfInstances() {
        return this.numberOfInstances;
    }

    public CreateAndroidInstanceGroupShrinkRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public CreateAndroidInstanceGroupShrinkRequest setPaidCallBackUrl(String paidCallBackUrl) {
        this.paidCallBackUrl = paidCallBackUrl;
        return this;
    }
    public String getPaidCallBackUrl() {
        return this.paidCallBackUrl;
    }

    public CreateAndroidInstanceGroupShrinkRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateAndroidInstanceGroupShrinkRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateAndroidInstanceGroupShrinkRequest setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public CreateAndroidInstanceGroupShrinkRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public CreateAndroidInstanceGroupShrinkRequest setSaleMode(String saleMode) {
        this.saleMode = saleMode;
        return this;
    }
    public String getSaleMode() {
        return this.saleMode;
    }

    public CreateAndroidInstanceGroupShrinkRequest setStreamMode(Integer streamMode) {
        this.streamMode = streamMode;
        return this;
    }
    public Integer getStreamMode() {
        return this.streamMode;
    }

    public CreateAndroidInstanceGroupShrinkRequest setTag(java.util.List<CreateAndroidInstanceGroupShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateAndroidInstanceGroupShrinkRequestTag> getTag() {
        return this.tag;
    }

    public CreateAndroidInstanceGroupShrinkRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static class CreateAndroidInstanceGroupShrinkRequestTag extends TeaModel {
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

        public static CreateAndroidInstanceGroupShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateAndroidInstanceGroupShrinkRequestTag self = new CreateAndroidInstanceGroupShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateAndroidInstanceGroupShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAndroidInstanceGroupShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

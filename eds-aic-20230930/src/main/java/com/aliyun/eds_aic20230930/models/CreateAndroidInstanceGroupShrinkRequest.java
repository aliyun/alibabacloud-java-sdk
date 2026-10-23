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

    /**
     * <p>The bandwidth plan ID.</p>
     * 
     * <strong>example:</strong>
     * <p>np-791ncq8qcuoop9hta</p>
     */
    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    /**
     * <p>The bandwidth type.</p>
     * 
     * <strong>example:</strong>
     * <p>cbwp_ecd</p>
     */
    @NameInMap("BandwidthPackageType")
    public String bandwidthPackageType;

    /**
     * <p>The region ID. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the list of regions where cloud phones are available.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The channel cookie, which is passed through to the sales system when an order is placed.</p>
     * 
     * <strong>example:</strong>
     * <p>channel-cookie-ig</p>
     */
    @NameInMap("ChannelCookie")
    public String channelCookie;

    /**
     * <p>The billing method.</p>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate requests. The token can be up to 100 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>asadbuvwiabdbvchj****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <blockquote>
     * <p>This parameter is not available to the public.</p>
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
     * <p>The image ID. You can call the <a href="~~DescribeImageList~~">DescribeImageList</a> operation to query the image list for cloud phones.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>imgc-06zyt9m93zwax****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The name of the instance group.</p>
     * <blockquote>
     * <p>The name can be up to 30 characters in length. It must start with a letter or a Chinese character, and cannot start with <code>http://</code> or <code>https://</code>. It can contain only Chinese characters, letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Cloud Phone A</p>
     */
    @NameInMap("InstanceGroupName")
    public String instanceGroupName;

    /**
     * <p>The specifications of the instance group. You can call the <a href="~~DescribeSpec~~">DescribeSpec</a> operation to query the available specifications for cloud phones.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acp.basic.small</p>
     */
    @NameInMap("InstanceGroupSpec")
    public String instanceGroupSpec;

    /**
     * <p>The instance version. A value of basic indicates a Wuying cloud phone instance, and a value of EnterpriseAi indicates a JVS Mobile instance.</p>
     * 
     * <strong>example:</strong>
     * <p>EnterpriseAi</p>
     */
    @NameInMap("InstanceVersion")
    public String instanceVersion;

    /**
     * <blockquote>
     * <p>This parameter is not available to the public.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Ipv6Bandwidth")
    public Integer ipv6Bandwidth;

    /**
     * <p>The key pair ID. When creating an instance group, if you specify a valid key pair ID, the key pair is bound to all successfully created instances, and you do not need to call the binding API operation again.</p>
     * <blockquote>
     * <p>Binding key pairs during scale-out is not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>kp-7o9xywwfutc1l****</p>
     */
    @NameInMap("KeyPairId")
    public String keyPairId;

    /**
     * <p>The network and bandwidth plan configurations of the instance group.</p>
     */
    @NameInMap("NetworkInfo")
    public String networkInfoShrink;

    /**
     * <p>The network type of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>network_pro_ecd</p>
     */
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
     * <li><p>To create a shared network instance: The network ID is optional. Enter the network ID of the <strong>Shared Network</strong> type on the <a href="https://wya.wuying.aliyun.com/network">Cloud Phone Console &gt; Network</a> page. If no shared network is available in the console, you can leave this parameter empty, and automatic creation of a shared network is triggered when the instance group is created.</p>
     * </li>
     * <li><p>To create a VPC network instance: The network ID is required. Enter the network ID of the <strong>VPC Network</strong> type on the <a href="https://wya.wuying.aliyun.com/network">Cloud Phone Console &gt; Network</a> page. If no VPC network is available in the console, you must create a network first.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-745976****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The redirect URL for the payment success page.</p>
     * 
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
     * <p>The policy ID. You can call the <a href="~~ListPolicyGroups~~">ListPolicyGroups</a> operation to query the policy list.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-b7bxrrwxkijjh****</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    /**
     * <p>The promotion activity ID.</p>
     * 
     * <strong>example:</strong>
     * <p>50003308011****</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The sales mode.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance</p>
     */
    @NameInMap("SaleMode")
    public String saleMode;

    /**
     * <p>The streaming mode of the instances in the instance group. If this parameter is not specified, the default mode is preemptive mode.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("StreamMode")
    public Integer streamMode;

    /**
     * <p>The tags of the resource.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateAndroidInstanceGroupShrinkRequestTag> tag;

    /**
     * <p>The vSwitch ID. You can call the <a href="https://help.aliyun.com/document_detail/448774.html">DescribeVSwitches</a> operation to query the vSwitch list.</p>
     * <ul>
     * <li><p>To create a shared network instance: Leave this parameter empty.</p>
     * </li>
     * <li><p>To create a VPC network instance: The vSwitch ID is required. This vSwitch is used to create the instance.</p>
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

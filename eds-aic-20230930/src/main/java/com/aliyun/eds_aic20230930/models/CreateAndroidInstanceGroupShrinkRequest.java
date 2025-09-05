// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateAndroidInstanceGroupShrinkRequest extends TeaModel {
    /**
     * <p>The number of instance groups. Default value: 1. Maximum value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>Specifies whether to enable automatic payment. Default value: false.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: enables automatic payment. Make sure that your Alibaba Cloud account has sufficient balance.</li>
     * <li>false: disables automatic payment. You must manually complete the payment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal. Default value: false.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: automatically renew resource upon expiration.</li>
     * <li>false: manually renew resources upon expiration.</li>
     * </ul>
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
     * <p>The ID of the region. You can call the DescribeRegions operation to query the regions where Cloud Phone is supported.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>cn-shenzhen: China (Shenzhen).</li>
     * <li>cn-beijing: China (Beijing).</li>
     * <li>cn-shanghai: China (Shanghai).</li>
     * <li>cn-hongkong: China (Hong Kong).</li>
     * <li>ap-southeast-1: Singapore.</li>
     * <li>cn-hangzhou: China (Hangzhou).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The billing method.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>PostPaid: pay-as-you-go.</li>
     * <li>PrePaid: subscription.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. The value cannot exceed 100 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>asadbuvwiabdbvchjsbj</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <blockquote>
     * <p> This parameter is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("EnableIpv6")
    public Boolean enableIpv6;

    /**
     * <p>Specifies whether to enable GPU acceleration.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: enables GPU acceleration.</li>
     * <li>false (default): disables GPU acceleration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("GpuAcceleration")
    public Boolean gpuAcceleration;

    /**
     * <p>The ID of the image. You can call the <a href="https://help.aliyun.com/document_detail/2807324.html">DescribeImageList</a> operation to query images.</p>
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
     * <p> The name can be up to 30 characters in length. It can contain letters, digits, colons (:), underscores (_), periods (.), or hyphens (-). It must start with letters but cannot start with <code>http://</code> or <code>https://</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>defaultInstanceGroup</p>
     */
    @NameInMap("InstanceGroupName")
    public String instanceGroupName;

    /**
     * <p>The specifications of the instance group. You can call the <a href="https://help.aliyun.com/document_detail/2807299.html">DescribeSpec</a> operation to query the available specifications.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>acp.perf.large: Performance (8 vCPUs, 16 GiB of memory, and 32 GiB of storage.</li>
     * <li>acp.basic.small: Lightweight (2 vCPUs, 4 GiB of memory, and 32 GiB of storage).</li>
     * <li>acp.std.large: Standard (4 vCPUs, 8 GiB of memory, and 32 GiB of storage).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acp.basic.small</p>
     */
    @NameInMap("InstanceGroupSpec")
    public String instanceGroupSpec;

    /**
     * <blockquote>
     * <p> This parameter is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Ipv6Bandwidth")
    public Integer ipv6Bandwidth;

    /**
     * <p>The ID of the key pair. When you create an instance group and specify a valid key pair ID, all cloud phone instances within the group will automatically be bound to that key pair upon creation. This eliminates the need to manually bind key pairs to individual cloud phone instances.</p>
     * <blockquote>
     * <p> Binding key pairs to cloud phone instances is currently not supported during instance group resizing.</p>
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
     * <p>The number of cloud phones in the instance group. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NumberOfInstances")
    public Integer numberOfInstances;

    /**
     * <p>The ID of the network.</p>
     * <ul>
     * <li>This parameter is required if you assign a shared network to cloud phones. You can go to the <a href="https://wya.wuying.aliyun.com/network">Network</a> page of the Cloud Phone console to retrieve the ID of a <strong>shared network</strong>. If no shared network is available in the Cloud Phone console, you can leave this parameter empty. The system automatically creates one when you create an instance group.</li>
     * <li>This parameter is required if you assign a virtual private cloud (VPC) to cloud phones. You can go to the <a href="https://wya.wuying.aliyun.com/network">Network</a> page of the Cloud Phone console to retrieve the ID of a <strong>VPC</strong>. If no VPC is available in the Cloud Phone console, you must first create one.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-745976****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The subscription duration. The unit is specified by PeriodUnit.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Month</li>
     * <li>Year</li>
     * <li>Hour (Note that this unit is supported only by pay-as-you-go.)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The ID of the policy. You can call the <a href="https://help.aliyun.com/document_detail/2807352.html">ListPolicyGroups</a> operation to query policies.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-b7bxrrwxkijjh****</p>
     */
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The tags</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateAndroidInstanceGroupShrinkRequestTag> tag;

    /**
     * <p>The ID of the vSwitch. You can call the <a href="https://help.aliyun.com/document_detail/448774.html">DescribeVSwitches</a> operation to query vSwitches.</p>
     * <ul>
     * <li>This parameter is not required if you assign a shared network to cloud phones.</li>
     * <li>This parameter is required if you assign a VPC to cloud phones. The vSwitch specified by this parameter is used to create cloud phones.</li>
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

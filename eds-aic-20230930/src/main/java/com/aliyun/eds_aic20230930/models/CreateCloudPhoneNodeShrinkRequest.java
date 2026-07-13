// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateCloudPhoneNodeShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The ID of the Internet Shared Bandwidth instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cbwp-uf6g3hgg*******8s3lxiob3</p>
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
     * <p>The region ID.</p>
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
     * <p>The billing type. Only subscription is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The number of cloud phone matrices to purchase.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public String count;

    /**
     * <p>The display settings.</p>
     */
    @NameInMap("DisplayConfig")
    public String displayConfigShrink;

    /**
     * <p>The downstream bandwidth throttling. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("DownBandwidthLimit")
    public Integer downBandwidthLimit;

    /**
     * <p>The image ID.</p>
     * 
     * <strong>example:</strong>
     * <p>imgc-075cllfeuazh0****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The instance type.</p>
     * <blockquote>
     * <p>To purchase more instance types, <a href="https://smartservice.console.aliyun.com/service/pre-sales-chat?spm=5176.6d6ecb63.0.0.729adda2VqVQx7">contact pre-sales support</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ac.max</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("IsSingleImgDisk")
    public Boolean isSingleImgDisk;

    /**
     * <p>The office network ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-5mwr9azebliva****</p>
     */
    @NameInMap("NetworkId")
    public String networkId;

    /**
     * <p>The network mapping information of the instance.</p>
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
     * <p>The name of the cloud phone matrix.</p>
     * 
     * <strong>example:</strong>
     * <p>node_name</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    @NameInMap("PaidCallBackUrl")
    public String paidCallBackUrl;

    /**
     * <p>The subscription duration. The unit is specified by PeriodUnit.</p>
     * <ul>
     * <li>If PeriodUnit is set to <strong>year</strong>, the value can only be 1.</li>
     * <li>If PeriodUnit is set to <strong>month</strong>, valid values are 1, 2, 3, and 6.</li>
     * </ul>
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
     * <p>The number of cloud phone instances to create in a single matrix.</p>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("PhoneCount")
    public Integer phoneCount;

    /**
     * <p>The size of the independent device storage. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PhoneDataVolume")
    public Integer phoneDataVolume;

    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The height of the resolution. Unit: pixels.</p>
     * 
     * <strong>example:</strong>
     * <p>1280</p>
     */
    @NameInMap("ResolutionHeight")
    public Integer resolutionHeight;

    /**
     * <p>The width of the resolution. Unit: pixels.</p>
     * 
     * <strong>example:</strong>
     * <p>720</p>
     */
    @NameInMap("ResolutionWidth")
    public Integer resolutionWidth;

    /**
     * <p>The size of the shared device storage. Unit: GiB.</p>
     * <blockquote>
     * <p>The minimum value of the shared device storage must be greater than the number of instances in the matrix multiplied by 10 GiB.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ServerShareDataVolume")
    public Integer serverShareDataVolume;

    /**
     * <p>The specifications of the cloud phone matrix.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpm.gx7.10xlarge</p>
     */
    @NameInMap("ServerType")
    public String serverType;

    /**
     * <p>The streaming mode for instances in the cloud phone matrix. If this parameter is not specified, the default value is preemptive mode.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("StreamMode")
    public Integer streamMode;

    @NameInMap("SwapSize")
    public Integer swapSize;

    /**
     * <p>The tags of the resource.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateCloudPhoneNodeShrinkRequestTag> tag;

    /**
     * <p>The upstream bandwidth throttling. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("UpBandwidthLimit")
    public Integer upBandwidthLimit;

    /**
     * <p>Specifies whether to use a template during creation. Set this parameter to <code>Random</code> to use a random template from the template list. Alternatively, specify a template ID to use that template.</p>
     * 
     * <strong>example:</strong>
     * <p>Random</p>
     */
    @NameInMap("UseTemplate")
    public String useTemplate;

    /**
     * <p>The vSwitch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-2zeekryyc1q3sm72l****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static CreateCloudPhoneNodeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudPhoneNodeShrinkRequest self = new CreateCloudPhoneNodeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCloudPhoneNodeShrinkRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateCloudPhoneNodeShrinkRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateCloudPhoneNodeShrinkRequest setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public CreateCloudPhoneNodeShrinkRequest setBandwidthPackageType(String bandwidthPackageType) {
        this.bandwidthPackageType = bandwidthPackageType;
        return this;
    }
    public String getBandwidthPackageType() {
        return this.bandwidthPackageType;
    }

    public CreateCloudPhoneNodeShrinkRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public CreateCloudPhoneNodeShrinkRequest setChannelCookie(String channelCookie) {
        this.channelCookie = channelCookie;
        return this;
    }
    public String getChannelCookie() {
        return this.channelCookie;
    }

    public CreateCloudPhoneNodeShrinkRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateCloudPhoneNodeShrinkRequest setCount(String count) {
        this.count = count;
        return this;
    }
    public String getCount() {
        return this.count;
    }

    public CreateCloudPhoneNodeShrinkRequest setDisplayConfigShrink(String displayConfigShrink) {
        this.displayConfigShrink = displayConfigShrink;
        return this;
    }
    public String getDisplayConfigShrink() {
        return this.displayConfigShrink;
    }

    public CreateCloudPhoneNodeShrinkRequest setDownBandwidthLimit(Integer downBandwidthLimit) {
        this.downBandwidthLimit = downBandwidthLimit;
        return this;
    }
    public Integer getDownBandwidthLimit() {
        return this.downBandwidthLimit;
    }

    public CreateCloudPhoneNodeShrinkRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateCloudPhoneNodeShrinkRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateCloudPhoneNodeShrinkRequest setIsSingleImgDisk(Boolean isSingleImgDisk) {
        this.isSingleImgDisk = isSingleImgDisk;
        return this;
    }
    public Boolean getIsSingleImgDisk() {
        return this.isSingleImgDisk;
    }

    public CreateCloudPhoneNodeShrinkRequest setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

    public CreateCloudPhoneNodeShrinkRequest setNetworkInfoShrink(String networkInfoShrink) {
        this.networkInfoShrink = networkInfoShrink;
        return this;
    }
    public String getNetworkInfoShrink() {
        return this.networkInfoShrink;
    }

    public CreateCloudPhoneNodeShrinkRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateCloudPhoneNodeShrinkRequest setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public CreateCloudPhoneNodeShrinkRequest setPaidCallBackUrl(String paidCallBackUrl) {
        this.paidCallBackUrl = paidCallBackUrl;
        return this;
    }
    public String getPaidCallBackUrl() {
        return this.paidCallBackUrl;
    }

    public CreateCloudPhoneNodeShrinkRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateCloudPhoneNodeShrinkRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateCloudPhoneNodeShrinkRequest setPhoneCount(Integer phoneCount) {
        this.phoneCount = phoneCount;
        return this;
    }
    public Integer getPhoneCount() {
        return this.phoneCount;
    }

    public CreateCloudPhoneNodeShrinkRequest setPhoneDataVolume(Integer phoneDataVolume) {
        this.phoneDataVolume = phoneDataVolume;
        return this;
    }
    public Integer getPhoneDataVolume() {
        return this.phoneDataVolume;
    }

    public CreateCloudPhoneNodeShrinkRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public CreateCloudPhoneNodeShrinkRequest setResolutionHeight(Integer resolutionHeight) {
        this.resolutionHeight = resolutionHeight;
        return this;
    }
    public Integer getResolutionHeight() {
        return this.resolutionHeight;
    }

    public CreateCloudPhoneNodeShrinkRequest setResolutionWidth(Integer resolutionWidth) {
        this.resolutionWidth = resolutionWidth;
        return this;
    }
    public Integer getResolutionWidth() {
        return this.resolutionWidth;
    }

    public CreateCloudPhoneNodeShrinkRequest setServerShareDataVolume(Integer serverShareDataVolume) {
        this.serverShareDataVolume = serverShareDataVolume;
        return this;
    }
    public Integer getServerShareDataVolume() {
        return this.serverShareDataVolume;
    }

    public CreateCloudPhoneNodeShrinkRequest setServerType(String serverType) {
        this.serverType = serverType;
        return this;
    }
    public String getServerType() {
        return this.serverType;
    }

    public CreateCloudPhoneNodeShrinkRequest setStreamMode(Integer streamMode) {
        this.streamMode = streamMode;
        return this;
    }
    public Integer getStreamMode() {
        return this.streamMode;
    }

    public CreateCloudPhoneNodeShrinkRequest setSwapSize(Integer swapSize) {
        this.swapSize = swapSize;
        return this;
    }
    public Integer getSwapSize() {
        return this.swapSize;
    }

    public CreateCloudPhoneNodeShrinkRequest setTag(java.util.List<CreateCloudPhoneNodeShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateCloudPhoneNodeShrinkRequestTag> getTag() {
        return this.tag;
    }

    public CreateCloudPhoneNodeShrinkRequest setUpBandwidthLimit(Integer upBandwidthLimit) {
        this.upBandwidthLimit = upBandwidthLimit;
        return this;
    }
    public Integer getUpBandwidthLimit() {
        return this.upBandwidthLimit;
    }

    public CreateCloudPhoneNodeShrinkRequest setUseTemplate(String useTemplate) {
        this.useTemplate = useTemplate;
        return this;
    }
    public String getUseTemplate() {
        return this.useTemplate;
    }

    public CreateCloudPhoneNodeShrinkRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static class CreateCloudPhoneNodeShrinkRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>keyname</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>valuename</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateCloudPhoneNodeShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateCloudPhoneNodeShrinkRequestTag self = new CreateCloudPhoneNodeShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateCloudPhoneNodeShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateCloudPhoneNodeShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

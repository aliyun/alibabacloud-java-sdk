// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateCloudPhoneNodeRequest extends TeaModel {
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
     * <p>The ID of the Shared Bandwidth instance.</p>
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

    /**
     * <p>The billing method. Only the subscription billing method is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The number of Cloud Phone matrices to purchase.</p>
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
    public CreateCloudPhoneNodeRequestDisplayConfig displayConfig;

    /**
     * <p>The downstream bandwidth limit, in Mbit/s.</p>
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
     * <p>The network settings for the instance.</p>
     */
    @NameInMap("NetworkInfo")
    public CreateCloudPhoneNodeRequestNetworkInfo networkInfo;

    /**
     * <p>The network type of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>network_pro_ecd</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The name of the Cloud Phone matrix.</p>
     * 
     * <strong>example:</strong>
     * <p>node_name</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    @NameInMap("PaidCallBackUrl")
    public String paidCallBackUrl;

    /**
     * <p>The subscription duration. The unit is specified by the <code>PeriodUnit</code> parameter.</p>
     * <ul>
     * <li><p>If <code>PeriodUnit</code> is set to <strong>Year</strong>, this parameter can only be set to 1.</p>
     * </li>
     * <li><p>If <code>PeriodUnit</code> is set to <strong>Month</strong>, valid values are 1, 2, 3, and 6.</p>
     * </li>
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
     * <p>The number of Cloud Phone instances to create in a single Cloud Phone matrix.</p>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("PhoneCount")
    public Integer phoneCount;

    /**
     * <p>The size of the independent internal storage, in GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PhoneDataVolume")
    public Integer phoneDataVolume;

    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The vertical resolution, in pixels.</p>
     * 
     * <strong>example:</strong>
     * <p>1280</p>
     */
    @NameInMap("ResolutionHeight")
    public Integer resolutionHeight;

    /**
     * <p>The horizontal resolution, in pixels.</p>
     * 
     * <strong>example:</strong>
     * <p>720</p>
     */
    @NameInMap("ResolutionWidth")
    public Integer resolutionWidth;

    /**
     * <p>The size of the shared internal storage, in GiB.</p>
     * <blockquote>
     * <p>The size must exceed 10 GiB per instance in the matrix.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ServerShareDataVolume")
    public Integer serverShareDataVolume;

    /**
     * <p>The server type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpm.gx7.10xlarge</p>
     */
    @NameInMap("ServerType")
    public String serverType;

    /**
     * <p>The streaming mode for instances in the Cloud Phone matrix. Defaults to preemption mode.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("StreamMode")
    public Integer streamMode;

    @NameInMap("SwapSize")
    public Integer swapSize;

    /**
     * <p>The resource tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateCloudPhoneNodeRequestTag> tag;

    /**
     * <p>The upstream bandwidth limit, in Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("UpBandwidthLimit")
    public Integer upBandwidthLimit;

    /**
     * <p>The template for instance creation. Set this parameter to <code>Random</code> to use a random template, or specify a template ID to use a specific template.</p>
     * 
     * <strong>example:</strong>
     * <p>Random</p>
     */
    @NameInMap("UseTemplate")
    public String useTemplate;

    /**
     * <p>The VSwitch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-2zeekryyc1q3sm72l****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static CreateCloudPhoneNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudPhoneNodeRequest self = new CreateCloudPhoneNodeRequest();
        return TeaModel.build(map, self);
    }

    public CreateCloudPhoneNodeRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateCloudPhoneNodeRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateCloudPhoneNodeRequest setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public CreateCloudPhoneNodeRequest setBandwidthPackageType(String bandwidthPackageType) {
        this.bandwidthPackageType = bandwidthPackageType;
        return this;
    }
    public String getBandwidthPackageType() {
        return this.bandwidthPackageType;
    }

    public CreateCloudPhoneNodeRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public CreateCloudPhoneNodeRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateCloudPhoneNodeRequest setCount(String count) {
        this.count = count;
        return this;
    }
    public String getCount() {
        return this.count;
    }

    public CreateCloudPhoneNodeRequest setDisplayConfig(CreateCloudPhoneNodeRequestDisplayConfig displayConfig) {
        this.displayConfig = displayConfig;
        return this;
    }
    public CreateCloudPhoneNodeRequestDisplayConfig getDisplayConfig() {
        return this.displayConfig;
    }

    public CreateCloudPhoneNodeRequest setDownBandwidthLimit(Integer downBandwidthLimit) {
        this.downBandwidthLimit = downBandwidthLimit;
        return this;
    }
    public Integer getDownBandwidthLimit() {
        return this.downBandwidthLimit;
    }

    public CreateCloudPhoneNodeRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateCloudPhoneNodeRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateCloudPhoneNodeRequest setIsSingleImgDisk(Boolean isSingleImgDisk) {
        this.isSingleImgDisk = isSingleImgDisk;
        return this;
    }
    public Boolean getIsSingleImgDisk() {
        return this.isSingleImgDisk;
    }

    public CreateCloudPhoneNodeRequest setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

    public CreateCloudPhoneNodeRequest setNetworkInfo(CreateCloudPhoneNodeRequestNetworkInfo networkInfo) {
        this.networkInfo = networkInfo;
        return this;
    }
    public CreateCloudPhoneNodeRequestNetworkInfo getNetworkInfo() {
        return this.networkInfo;
    }

    public CreateCloudPhoneNodeRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateCloudPhoneNodeRequest setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public CreateCloudPhoneNodeRequest setPaidCallBackUrl(String paidCallBackUrl) {
        this.paidCallBackUrl = paidCallBackUrl;
        return this;
    }
    public String getPaidCallBackUrl() {
        return this.paidCallBackUrl;
    }

    public CreateCloudPhoneNodeRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateCloudPhoneNodeRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateCloudPhoneNodeRequest setPhoneCount(Integer phoneCount) {
        this.phoneCount = phoneCount;
        return this;
    }
    public Integer getPhoneCount() {
        return this.phoneCount;
    }

    public CreateCloudPhoneNodeRequest setPhoneDataVolume(Integer phoneDataVolume) {
        this.phoneDataVolume = phoneDataVolume;
        return this;
    }
    public Integer getPhoneDataVolume() {
        return this.phoneDataVolume;
    }

    public CreateCloudPhoneNodeRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public CreateCloudPhoneNodeRequest setResolutionHeight(Integer resolutionHeight) {
        this.resolutionHeight = resolutionHeight;
        return this;
    }
    public Integer getResolutionHeight() {
        return this.resolutionHeight;
    }

    public CreateCloudPhoneNodeRequest setResolutionWidth(Integer resolutionWidth) {
        this.resolutionWidth = resolutionWidth;
        return this;
    }
    public Integer getResolutionWidth() {
        return this.resolutionWidth;
    }

    public CreateCloudPhoneNodeRequest setServerShareDataVolume(Integer serverShareDataVolume) {
        this.serverShareDataVolume = serverShareDataVolume;
        return this;
    }
    public Integer getServerShareDataVolume() {
        return this.serverShareDataVolume;
    }

    public CreateCloudPhoneNodeRequest setServerType(String serverType) {
        this.serverType = serverType;
        return this;
    }
    public String getServerType() {
        return this.serverType;
    }

    public CreateCloudPhoneNodeRequest setStreamMode(Integer streamMode) {
        this.streamMode = streamMode;
        return this;
    }
    public Integer getStreamMode() {
        return this.streamMode;
    }

    public CreateCloudPhoneNodeRequest setSwapSize(Integer swapSize) {
        this.swapSize = swapSize;
        return this;
    }
    public Integer getSwapSize() {
        return this.swapSize;
    }

    public CreateCloudPhoneNodeRequest setTag(java.util.List<CreateCloudPhoneNodeRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateCloudPhoneNodeRequestTag> getTag() {
        return this.tag;
    }

    public CreateCloudPhoneNodeRequest setUpBandwidthLimit(Integer upBandwidthLimit) {
        this.upBandwidthLimit = upBandwidthLimit;
        return this;
    }
    public Integer getUpBandwidthLimit() {
        return this.upBandwidthLimit;
    }

    public CreateCloudPhoneNodeRequest setUseTemplate(String useTemplate) {
        this.useTemplate = useTemplate;
        return this;
    }
    public String getUseTemplate() {
        return this.useTemplate;
    }

    public CreateCloudPhoneNodeRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static class CreateCloudPhoneNodeRequestDisplayConfig extends TeaModel {
        /**
         * <p>The dots per inch (DPI). Valid values: 72 to 600.</p>
         * 
         * <strong>example:</strong>
         * <p>240</p>
         */
        @NameInMap("Dpi")
        public Integer dpi;

        /**
         * <blockquote>
         * <p>This parameter is not yet publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Fps")
        public Integer fps;

        /**
         * <p>Specifies whether to lock the resolution.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("LockResolution")
        public String lockResolution;

        public static CreateCloudPhoneNodeRequestDisplayConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateCloudPhoneNodeRequestDisplayConfig self = new CreateCloudPhoneNodeRequestDisplayConfig();
            return TeaModel.build(map, self);
        }

        public CreateCloudPhoneNodeRequestDisplayConfig setDpi(Integer dpi) {
            this.dpi = dpi;
            return this;
        }
        public Integer getDpi() {
            return this.dpi;
        }

        public CreateCloudPhoneNodeRequestDisplayConfig setFps(Integer fps) {
            this.fps = fps;
            return this;
        }
        public Integer getFps() {
            return this.fps;
        }

        public CreateCloudPhoneNodeRequestDisplayConfig setLockResolution(String lockResolution) {
            this.lockResolution = lockResolution;
            return this;
        }
        public String getLockResolution() {
            return this.lockResolution;
        }

    }

    public static class CreateCloudPhoneNodeRequestNetworkInfo extends TeaModel {
        /**
         * <p>The name of the bandwidth package.</p>
         * 
         * <strong>example:</strong>
         * <p>inst-bandwidth-pkg-1</p>
         */
        @NameInMap("BandwidthPackageName")
        public String bandwidthPackageName;

        /**
         * <p>The private CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>10.10.13.0/24</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <p>The billing method for the bandwidth package. Valid values:</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li><p><strong>PayByBandwidth</strong> (default): pay-by-bandwidth.</p>
         * </li>
         * <li><p><strong>PayBy95</strong>: pay-by-95th-percentile. Note: This billing method is not supported for IPv6 public bandwidth by default. To enable it, contact your account manager.</p>
         * </li>
         * </ul>
         * <p>\-</p>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <p><strong>PayByBandwidth</strong> (default): pay-by-bandwidth.</p>
         * 
         * <strong>example:</strong>
         * <p>PayByBandwidth</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>The number of Cloud Phone instances that share one elastic IP address (EIP).</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("IpRatio")
        public Integer ipRatio;

        /**
         * <p>The line type.</p>
         * 
         * <strong>example:</strong>
         * <p>ChinaTelecom</p>
         */
        @NameInMap("Isp")
        public String isp;

        /**
         * <p>The maximum bandwidth of the bandwidth package, in Mbit/s. This value limits the aggregate bandwidth of all instances that use the package.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("LimitedBandwidth")
        public Integer limitedBandwidth;

        @NameInMap("PaidCallbackUrl")
        public String paidCallbackUrl;

        /**
         * <p>The billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The visibility scope.</p>
         * 
         * <strong>example:</strong>
         * <p>CPS</p>
         */
        @NameInMap("VisibleType")
        public String visibleType;

        public static CreateCloudPhoneNodeRequestNetworkInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateCloudPhoneNodeRequestNetworkInfo self = new CreateCloudPhoneNodeRequestNetworkInfo();
            return TeaModel.build(map, self);
        }

        public CreateCloudPhoneNodeRequestNetworkInfo setBandwidthPackageName(String bandwidthPackageName) {
            this.bandwidthPackageName = bandwidthPackageName;
            return this;
        }
        public String getBandwidthPackageName() {
            return this.bandwidthPackageName;
        }

        public CreateCloudPhoneNodeRequestNetworkInfo setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public CreateCloudPhoneNodeRequestNetworkInfo setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public CreateCloudPhoneNodeRequestNetworkInfo setIpRatio(Integer ipRatio) {
            this.ipRatio = ipRatio;
            return this;
        }
        public Integer getIpRatio() {
            return this.ipRatio;
        }

        public CreateCloudPhoneNodeRequestNetworkInfo setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public CreateCloudPhoneNodeRequestNetworkInfo setLimitedBandwidth(Integer limitedBandwidth) {
            this.limitedBandwidth = limitedBandwidth;
            return this;
        }
        public Integer getLimitedBandwidth() {
            return this.limitedBandwidth;
        }

        public CreateCloudPhoneNodeRequestNetworkInfo setPaidCallbackUrl(String paidCallbackUrl) {
            this.paidCallbackUrl = paidCallbackUrl;
            return this;
        }
        public String getPaidCallbackUrl() {
            return this.paidCallbackUrl;
        }

        public CreateCloudPhoneNodeRequestNetworkInfo setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public CreateCloudPhoneNodeRequestNetworkInfo setVisibleType(String visibleType) {
            this.visibleType = visibleType;
            return this;
        }
        public String getVisibleType() {
            return this.visibleType;
        }

    }

    public static class CreateCloudPhoneNodeRequestTag extends TeaModel {
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

        public static CreateCloudPhoneNodeRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateCloudPhoneNodeRequestTag self = new CreateCloudPhoneNodeRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateCloudPhoneNodeRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateCloudPhoneNodeRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

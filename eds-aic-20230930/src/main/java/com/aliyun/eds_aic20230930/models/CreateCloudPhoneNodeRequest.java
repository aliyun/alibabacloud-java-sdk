// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateCloudPhoneNodeRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the auto-payment feature.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>False (default): You must manually complete the payment in the Alibaba Cloud Expenses and Costs console.</li>
     * <li>true: enables the auto-payment feature.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable the auto-renewal feature.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: enables the auto-renewal feature. In this case, the system automatically renews instances upon expiration.</li>
     * <li>false (default): disables the auto-renewal feature. In this case, you need to manually renew instances upon expiration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

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
     * <p>The number of cloud phone matrixes you want to purchase.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public String count;

    @NameInMap("DisplayConfig")
    public CreateCloudPhoneNodeRequestDisplayConfig displayConfig;

    /**
     * <p>The image ID.</p>
     * 
     * <strong>example:</strong>
     * <p>imgc-075cllfeuazh0****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The instance specification.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>ac.max: By default, this specification allows up to 25 instances. You can adjust this number by using PhoneCount (Value range: 4 to 40).</li>
     * <li>ac.plus: By default, this specification allows up to 40 instances. You can adjust this number by using PhoneCount (Value range: 4 to 40).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ac.max</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The office network ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-5mwr9azebliva****</p>
     */
    @NameInMap("NetworkId")
    public String networkId;

    /**
     * <p>The name of the cloud phone matrix.</p>
     * 
     * <strong>example:</strong>
     * <p>node_name</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    /**
     * <p>The subscription duration. The unit is specified by <code>PeriodUnit</code>. Valid values:</p>
     * <ul>
     * <li>When <code>PeriodUnit</code> is set to <strong>year</strong>: 1.</li>
     * <li>When <code>PeriodUnit</code> is set to <strong>month</strong>: 1, 2, 3, and 6.</li>
     * </ul>
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
     * <li>Month (default)</li>
     * <li>Year</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The number of instances per cloud phone matrix.</p>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("PhoneCount")
    public Integer phoneCount;

    /**
     * <p>The resolution height. Unit: pixel.</p>
     * 
     * <strong>example:</strong>
     * <p>1280</p>
     */
    @NameInMap("ResolutionHeight")
    public Integer resolutionHeight;

    /**
     * <p>The resolution width. Unit: pixel.</p>
     * 
     * <strong>example:</strong>
     * <p>720</p>
     */
    @NameInMap("ResolutionWidth")
    public Integer resolutionWidth;

    /**
     * <p>The shared storage size Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ServerShareDataVolume")
    public Integer serverShareDataVolume;

    /**
     * <p>The matrix specification.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>cpm.gn6.gx1</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cpm.gn6.gx1</p>
     */
    @NameInMap("ServerType")
    public String serverType;

    /**
     * <p>The resource tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateCloudPhoneNodeRequestTag> tag;

    /**
     * <p>The vSwitch ID.</p>
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

    public CreateCloudPhoneNodeRequest setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

    public CreateCloudPhoneNodeRequest setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
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

    public CreateCloudPhoneNodeRequest setTag(java.util.List<CreateCloudPhoneNodeRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateCloudPhoneNodeRequestTag> getTag() {
        return this.tag;
    }

    public CreateCloudPhoneNodeRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static class CreateCloudPhoneNodeRequestDisplayConfig extends TeaModel {
        @NameInMap("Dpi")
        public Integer dpi;

        @NameInMap("Fps")
        public Integer fps;

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

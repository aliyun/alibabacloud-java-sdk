// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateCloudPhoneNodeShrinkRequest extends TeaModel {
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
    public String displayConfigShrink;

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
    public java.util.List<CreateCloudPhoneNodeShrinkRequestTag> tag;

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

    public CreateCloudPhoneNodeShrinkRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
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

    public CreateCloudPhoneNodeShrinkRequest setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

    public CreateCloudPhoneNodeShrinkRequest setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
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

    public CreateCloudPhoneNodeShrinkRequest setTag(java.util.List<CreateCloudPhoneNodeShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateCloudPhoneNodeShrinkRequestTag> getTag() {
        return this.tag;
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

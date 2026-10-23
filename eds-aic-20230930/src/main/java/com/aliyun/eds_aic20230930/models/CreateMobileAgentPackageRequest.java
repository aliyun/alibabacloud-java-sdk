// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class CreateMobileAgentPackageRequest extends TeaModel {
    /**
     * <p>The number of resource plans.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Amount")
    public String amount;

    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Automatic payment. You must ensure that your account balance is sufficient.</li>
     * <li><strong>false</strong> (default): Generates an order without deducting fees.</li>
     * </ul>
     * <blockquote>
     * <p>If your payment method has an insufficient balance, you can set this parameter to false. An unpaid order will be generated, and you can log on to the WUYING Cloud Phone console to pay the order.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal for the instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong> (default): No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The bandwidth package ID, which is used to associate an existing bandwidth package when creating an instance. The value must be prefixed with np- and followed by lowercase letters and digits. The bandwidth package must be an AI premium bandwidth package (CBWP_ECD) that belongs to the current account. If this parameter is left empty, the default bandwidth package allocation logic applies.</p>
     * 
     * <strong>example:</strong>
     * <p>np-791ncq8qcuoop9hta</p>
     */
    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    /**
     * <p>The region where the instance resides. Only cn-hangzhou is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    @NameInMap("ChannelCookie")
    public String channelCookie;

    /**
     * <p>The credit amount.</p>
     * 
     * <strong>example:</strong>
     * <p>10000.0</p>
     */
    @NameInMap("CreditAmount")
    public String creditAmount;

    /**
     * <p>The credit limit configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CreditConfig")
    public String creditConfig;

    /**
     * <p>The image ID.</p>
     * 
     * <strong>example:</strong>
     * <p>imgc-075cllfeuazh0****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The name of the node instance.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudPhone</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The specification of the resource plan.</p>
     * 
     * <strong>example:</strong>
     * <p>advanced</p>
     */
    @NameInMap("MobileAgentPackageSpec")
    public String mobileAgentPackageSpec;

    @NameInMap("PackageSpecId")
    public Long packageSpecId;

    /**
     * <p>The redirect URL for the payment success page.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://aim.wuying.aliyun.com/nodes">https://aim.wuying.aliyun.com/nodes</a></p>
     */
    @NameInMap("PaidCallbackUrl")
    public String paidCallbackUrl;

    /**
     * <p>The subscription duration of the resource. The unit is specified by PeriodUnit.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration. Valid values:</p>
     * <ul>
     * <li><strong>Month</strong>: Months.</li>
     * <li><strong>Year</strong>: Years.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The promotion ID.</p>
     * 
     * <strong>example:</strong>
     * <p>50003308011****</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateMobileAgentPackageRequestTag> tag;

    public static CreateMobileAgentPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMobileAgentPackageRequest self = new CreateMobileAgentPackageRequest();
        return TeaModel.build(map, self);
    }

    public CreateMobileAgentPackageRequest setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public CreateMobileAgentPackageRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateMobileAgentPackageRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateMobileAgentPackageRequest setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public CreateMobileAgentPackageRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public CreateMobileAgentPackageRequest setChannelCookie(String channelCookie) {
        this.channelCookie = channelCookie;
        return this;
    }
    public String getChannelCookie() {
        return this.channelCookie;
    }

    public CreateMobileAgentPackageRequest setCreditAmount(String creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }
    public String getCreditAmount() {
        return this.creditAmount;
    }

    public CreateMobileAgentPackageRequest setCreditConfig(String creditConfig) {
        this.creditConfig = creditConfig;
        return this;
    }
    public String getCreditConfig() {
        return this.creditConfig;
    }

    public CreateMobileAgentPackageRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateMobileAgentPackageRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateMobileAgentPackageRequest setMobileAgentPackageSpec(String mobileAgentPackageSpec) {
        this.mobileAgentPackageSpec = mobileAgentPackageSpec;
        return this;
    }
    public String getMobileAgentPackageSpec() {
        return this.mobileAgentPackageSpec;
    }

    public CreateMobileAgentPackageRequest setPackageSpecId(Long packageSpecId) {
        this.packageSpecId = packageSpecId;
        return this;
    }
    public Long getPackageSpecId() {
        return this.packageSpecId;
    }

    public CreateMobileAgentPackageRequest setPaidCallbackUrl(String paidCallbackUrl) {
        this.paidCallbackUrl = paidCallbackUrl;
        return this;
    }
    public String getPaidCallbackUrl() {
        return this.paidCallbackUrl;
    }

    public CreateMobileAgentPackageRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateMobileAgentPackageRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateMobileAgentPackageRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

    public CreateMobileAgentPackageRequest setTag(java.util.List<CreateMobileAgentPackageRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateMobileAgentPackageRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateMobileAgentPackageRequestTag extends TeaModel {
        /**
         * <p>The tag key. This parameter cannot be empty.</p>
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

        public static CreateMobileAgentPackageRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateMobileAgentPackageRequestTag self = new CreateMobileAgentPackageRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateMobileAgentPackageRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateMobileAgentPackageRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenBandwidthPackageRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: yes.</p>
     * </li>
     * <li><p><strong>false</strong> (default): no.</p>
     * </li>
     * </ul>
     * <p>If you disable automatic payment, you must go to the Order Hub in the console to complete the payment after you call this operation. Otherwise, the instance cannot be created.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("AutoRenewDuration")
    public Integer autoRenewDuration;

    /**
     * <p>The maximum bandwidth of the bandwidth plan. Unit: Mbps. Valid values: <strong>2</strong> to <strong>10000</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The billing method of the bandwidth plan. Set the value to <strong>PREPAY</strong>. This value specifies the subscription billing method.</p>
     * 
     * <strong>example:</strong>
     * <p>PREPAY</p>
     */
    @NameInMap("BandwidthPackageChargeType")
    public String bandwidthPackageChargeType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>Make sure that the client token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the bandwidth plan.</p>
     * <p>The description can be empty or 1 to 256 characters in length. It cannot start with http\:// or https\://.</p>
     * 
     * <strong>example:</strong>
     * <p>namedesc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The area where the network instance is deployed. Valid values:</p>
     * <ul>
     * <li><p><strong>China</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>North-America</strong>: North America.</p>
     * </li>
     * <li><p><strong>Asia-Pacific</strong>: Asia-Pacific.</p>
     * </li>
     * <li><p><strong>Europe</strong>: Europe.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>China</p>
     */
    @NameInMap("GeographicRegionAId")
    public String geographicRegionAId;

    /**
     * <p>The other area where the network instance is deployed. Valid values:</p>
     * <ul>
     * <li><p><strong>China</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>North-America</strong>: North America.</p>
     * </li>
     * <li><p><strong>Asia-Pacific</strong>: Asia-Pacific.</p>
     * </li>
     * <li><p><strong>Europe</strong>: Europe.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>China</p>
     */
    @NameInMap("GeographicRegionBId")
    public String geographicRegionBId;

    /**
     * <p>The name of the bandwidth plan.</p>
     * <p>The name can be empty or 1 to 128 characters in length. It cannot start with http\:// or https\://.</p>
     * 
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The subscription duration of the bandwidth plan. Default value: 1.</p>
     * <ul>
     * <li><p>If you set <strong>PricingCycle</strong> to <strong>Month</strong>, valid values for <strong>Period</strong> are <strong>1</strong> to <strong>3</strong> and <strong>6</strong>.</p>
     * </li>
     * <li><p>If you set <strong>PricingCycle</strong> to <strong>Year</strong>, valid values for <strong>Period</strong> are <strong>1</strong> to <strong>3</strong>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required if you set <strong>BandwidthPackageChargeType</strong> to <strong>PREPAY</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The billing cycle of the bandwidth plan. Valid values:</p>
     * <ul>
     * <li><p><strong>Month</strong> (default): The bandwidth plan is billed by month.</p>
     * </li>
     * <li><p><strong>Year</strong>: The bandwidth plan is billed by year.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags.</p>
     * <p>You can specify up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateCenBandwidthPackageRequestTag> tag;

    public static CreateCenBandwidthPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCenBandwidthPackageRequest self = new CreateCenBandwidthPackageRequest();
        return TeaModel.build(map, self);
    }

    public CreateCenBandwidthPackageRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateCenBandwidthPackageRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateCenBandwidthPackageRequest setAutoRenewDuration(Integer autoRenewDuration) {
        this.autoRenewDuration = autoRenewDuration;
        return this;
    }
    public Integer getAutoRenewDuration() {
        return this.autoRenewDuration;
    }

    public CreateCenBandwidthPackageRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public CreateCenBandwidthPackageRequest setBandwidthPackageChargeType(String bandwidthPackageChargeType) {
        this.bandwidthPackageChargeType = bandwidthPackageChargeType;
        return this;
    }
    public String getBandwidthPackageChargeType() {
        return this.bandwidthPackageChargeType;
    }

    public CreateCenBandwidthPackageRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCenBandwidthPackageRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCenBandwidthPackageRequest setGeographicRegionAId(String geographicRegionAId) {
        this.geographicRegionAId = geographicRegionAId;
        return this;
    }
    public String getGeographicRegionAId() {
        return this.geographicRegionAId;
    }

    public CreateCenBandwidthPackageRequest setGeographicRegionBId(String geographicRegionBId) {
        this.geographicRegionBId = geographicRegionBId;
        return this;
    }
    public String getGeographicRegionBId() {
        return this.geographicRegionBId;
    }

    public CreateCenBandwidthPackageRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCenBandwidthPackageRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateCenBandwidthPackageRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateCenBandwidthPackageRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateCenBandwidthPackageRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateCenBandwidthPackageRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateCenBandwidthPackageRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateCenBandwidthPackageRequest setTag(java.util.List<CreateCenBandwidthPackageRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateCenBandwidthPackageRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateCenBandwidthPackageRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <p>The tag key cannot be an empty string. The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can specify up to 20 tag keys.</p>
         * 
         * <strong>example:</strong>
         * <p>tagtest</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <p>The tag value can be an empty string or a string of up to 128 characters. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>Each tag key corresponds to a tag value. You can specify up to 20 tag values.</p>
         * 
         * <strong>example:</strong>
         * <p>tagtest</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateCenBandwidthPackageRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateCenBandwidthPackageRequestTag self = new CreateCenBandwidthPackageRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateCenBandwidthPackageRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateCenBandwidthPackageRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}

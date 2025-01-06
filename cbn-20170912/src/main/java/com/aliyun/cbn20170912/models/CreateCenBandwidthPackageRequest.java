// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenBandwidthPackageRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically complete the payment of the bandwidth plan. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong> (default): no</li>
     * </ul>
     * <p>If you set the parameter to false, go to Billing Management to complete the payment after you call this operation. The instance is created only after you complete the payment.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable the auto-renewal feature. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables auto-renewal.</li>
     * <li><strong>false</strong> (default): disables auto-renewal.</li>
     * </ul>
     * <blockquote>
     * <p>Only subscription bandwidth plans support auto-renewal.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal duration. Unit: months. Valid values: <strong>0</strong> to <strong>2147483647</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRenewDuration")
    public Integer autoRenewDuration;

    /**
     * <p>The maximum bandwidth value of the bandwidth plan. Unit: Mbit/s. Valid values: <strong>2</strong> to <strong>10000</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The billing method of the bandwidth plan. Set the value to <strong>PREPAY</strong>, which indicates that the billing method is pay-as-you-go.</p>
     * 
     * <strong>example:</strong>
     * <p>PREPAY</p>
     */
    @NameInMap("BandwidthPackageChargeType")
    public String bandwidthPackageChargeType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the bandwidth plan.</p>
     * 
     * <strong>example:</strong>
     * <p>namedesc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The area where the network instance is deployed. Valid values:</p>
     * <ul>
     * <li><strong>China</strong>: Chinese mainland</li>
     * <li><strong>North-America</strong>: North America</li>
     * <li><strong>Asia-Pacific</strong>: Asia Pacific</li>
     * <li><strong>Europe</strong>: Europe</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>China</p>
     */
    @NameInMap("GeographicRegionAId")
    public String geographicRegionAId;

    /**
     * <p>The area where the other network instance is deployed. Valid values: Valid values:</p>
     * <ul>
     * <li><strong>China</strong>: Chinese mainland</li>
     * <li><strong>North-America</strong>: North America</li>
     * <li><strong>Asia-Pacific</strong>: Asia Pacific</li>
     * <li><strong>Europe</strong>: Europe</li>
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
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter and cannot start with <code>http://</code> or <code>https://</code>.</p>
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
     * <li>If <strong>PricingCycle</strong> is set to <strong>Month</strong>, set <strong>Period</strong> to a value from <strong>1</strong> to <strong>3</strong> or <strong>6</strong>.</li>
     * <li>If <strong>PricingCycle</strong> is set to <strong>Year</strong>, set <strong>Period</strong> to a value from <strong>1</strong> to <strong>3</strong>.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when <strong>BandwidthPackageChargeType</strong> is set to <strong>PREPAY</strong>.</p>
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
     * <li><strong>Month</strong> (default): billed on a monthly basis.</li>
     * <li><strong>Year</strong>: billed on an annual basis.</li>
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
     * <p>The information about the tags.</p>
     * <p>You can specify at most 20 tags in each call.</p>
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
         * <p>The tag keys cannot be an empty string. The tag key can be up to 64 characters in length, and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can specify at most 20 tag keys.</p>
         * 
         * <strong>example:</strong>
         * <p>tagtest</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <p>The tag value can be 0 to 128 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>Each tag key must have a unique tag value. You can specify at most 20 tag values in each call.</p>
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

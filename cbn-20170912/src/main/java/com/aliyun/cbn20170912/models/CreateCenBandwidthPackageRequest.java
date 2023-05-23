// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenBandwidthPackageRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically complete the payment of the bandwidth plan. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false** (default): no</p>
     * <br>
     * <p>If you set the parameter to false, go to Billing Management to complete the payment after you call this operation. The instance is created only after you complete the payment.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable the auto-renewal feature. Valid values:</p>
     * <br>
     * <p>*   **true**: enables auto-renewal.</p>
     * <p>*   **false** (default): disables auto-renewal.</p>
     * <br>
     * <p>> Only subscription bandwidth plans support auto-renewal.</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal duration. Unit: months. Valid values: **0** to **2147483647**. Default value: **1**.</p>
     */
    @NameInMap("AutoRenewDuration")
    public Integer autoRenewDuration;

    /**
     * <p>The maximum bandwidth value of the bandwidth plan. Unit: Mbit/s. Valid values: **2** to **10000**.</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The billing method of the bandwidth plan. Set the value to **PREPAY**, which indicates that the billing method is pay-as-you-go.</p>
     */
    @NameInMap("BandwidthPackageChargeType")
    public String bandwidthPackageChargeType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the bandwidth plan.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The area where the network instance is deployed. Valid values:</p>
     * <br>
     * <p>*   **China**: Chinese mainland</p>
     * <p>*   **North-America**: North America</p>
     * <p>*   **Asia-Pacific**: Asia Pacific</p>
     * <p>*   **Europe**: Europe</p>
     * <p>*   **Australia**: Australia</p>
     */
    @NameInMap("GeographicRegionAId")
    public String geographicRegionAId;

    /**
     * <p>The area where the other network instance is deployed. Valid values: Valid values:</p>
     * <br>
     * <p>*   **China**: Chinese mainland</p>
     * <p>*   **North-America**: North America</p>
     * <p>*   **Asia-Pacific**: Asia Pacific</p>
     * <p>*   **Europe**: Europe</p>
     * <p>*   **Australia**: Australia</p>
     */
    @NameInMap("GeographicRegionBId")
    public String geographicRegionBId;

    /**
     * <p>The name of the bandwidth plan.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The subscription duration of the bandwidth plan. Default value: 1.</p>
     * <br>
     * <p>*   If **PricingCycle** is set to **Month**, set **Period** to a value from **1** to **3** or **6**.</p>
     * <p>*   If **PricingCycle** is set to **Year**, set **Period** to a value from **1** to **3**.</p>
     * <br>
     * <p>> This parameter is required when **BandwidthPackageChargeType** is set to **PREPAY**.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The billing cycle of the bandwidth plan. Valid values:</p>
     * <br>
     * <p>*   **Month** (default): billed on a monthly basis.</p>
     * <p>*   **Year**: billed on an annual basis.</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The information about the tags.</p>
     * <br>
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
         * <br>
         * <p>The tag keys cannot be an empty string. The tag key can be up to 64 characters in length, and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         * <br>
         * <p>You can specify at most 20 tag keys.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <br>
         * <p>The tag value can be 0 to 128 characters in length, and cannot start with `aliyun` or `acs:`. It cannot contain `http://` or `https://`.</p>
         * <br>
         * <p>Each tag key must have a unique tag value. You can specify at most 20 tag values in each call.</p>
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

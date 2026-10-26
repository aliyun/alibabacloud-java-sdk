// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RenewElasticityAssurancesRequest extends TeaModel {
    @NameInMap("PrivatePoolOptions")
    public RenewElasticityAssurancesRequestPrivatePoolOptions privatePoolOptions;

    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li>true: yes.</li>
     * <li>false: no.</li>
     * </ul>
     * <p>Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal. Valid values:</p>
     * <ul>
     * <li><p>true: enables auto-renewal.</p>
     * </li>
     * <li><p>false: disables auto-renewal.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal duration in months. Valid values: 1, 2, 3, 6, 12, 24, and 36.</p>
     * <ul>
     * <li><p>If PeriodUnit is set to Month, the default value is 1.</p>
     * </li>
     * <li><p>If PeriodUnit is set to Year, the default value is 12.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when AutoRenew is set to true.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    /**
     * <p>Ensures the idempotence of the request. You can generate a value from your client to ensure that the value is unique across different requests. ClientToken supports only ASCII characters and can be up to 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The renewal duration. The unit is specified by the PeriodUnit parameter. Valid values:</p>
     * <ul>
     * <li><p>If PeriodUnit is set to Weekly, valid values are 1, 2, and 3.</p>
     * </li>
     * <li><p>If PeriodUnit is set to Month, valid values are 1, 2, 3, 4, 5, 6, 7, 8, and 9.</p>
     * </li>
     * <li><p>If PeriodUnit is set to Year, valid values are 1, 2, 3, 4, and 5.</p>
     * </li>
     * </ul>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the renewal duration. Valid values:</p>
     * <ul>
     * <li><p>Weekly: week.</p>
     * </li>
     * <li><p>Month: month.</p>
     * </li>
     * <li><p>Year: year.</p>
     * </li>
     * </ul>
     * <p>Default value: Year.</p>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The region ID of the elasticity assurance. You can call <a href="https://help.aliyun.com/document_detail/2680071.html">DescribeRegions</a> to query the latest Alibaba Cloud region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static RenewElasticityAssurancesRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewElasticityAssurancesRequest self = new RenewElasticityAssurancesRequest();
        return TeaModel.build(map, self);
    }

    public RenewElasticityAssurancesRequest setPrivatePoolOptions(RenewElasticityAssurancesRequestPrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public RenewElasticityAssurancesRequestPrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public RenewElasticityAssurancesRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public RenewElasticityAssurancesRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public RenewElasticityAssurancesRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public RenewElasticityAssurancesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RenewElasticityAssurancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RenewElasticityAssurancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RenewElasticityAssurancesRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public RenewElasticityAssurancesRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public RenewElasticityAssurancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RenewElasticityAssurancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RenewElasticityAssurancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class RenewElasticityAssurancesRequestPrivatePoolOptions extends TeaModel {
        /**
         * <p>The list of elasticity assurance IDs. This parameter is required. If this parameter is not specified, the API returns MissingParameter.PrivatePoolOptions.Id.</p>
         * <p><strong>Limits</strong>: You can renew up to 20 elasticity assurances at a time.</p>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/2679748.html">DescribeElasticityAssurances</a> to query the purchased elasticity assurances.</p>
         */
        @NameInMap("Id")
        public java.util.List<String> id;

        public static RenewElasticityAssurancesRequestPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            RenewElasticityAssurancesRequestPrivatePoolOptions self = new RenewElasticityAssurancesRequestPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public RenewElasticityAssurancesRequestPrivatePoolOptions setId(java.util.List<String> id) {
            this.id = id;
            return this;
        }
        public java.util.List<String> getId() {
            return this.id;
        }

    }

}

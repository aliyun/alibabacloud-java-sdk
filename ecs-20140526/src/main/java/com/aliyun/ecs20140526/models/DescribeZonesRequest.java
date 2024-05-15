// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeZonesRequest extends TeaModel {
    /**
     * <p>The natural language that is used to filter responses. For more information, see [RFC 7231](https://tools.ietf.org/html/rfc7231). Valid values:</p>
     * <br>
     * <p>*   zh-CN</p>
     * <p>*   en-US</p>
     * <p>*   ja</p>
     * <br>
     * <p>Default value: zh-CN.</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The billing method of resources. For more information, see [Billing overview](https://help.aliyun.com/document_detail/25398.html). Valid values:</p>
     * <br>
     * <p>*   PrePaid: subscription</p>
     * <p>*   PostPaid: pay-as-you-go</p>
     * <br>
     * <p>Default value: PostPaid.</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The bidding policy for pay-as-you-go instances. You can specify this parameter when the `InstanceChargeType` parameter is set to PostPaid. For more information, see [Preemptible instances](https://help.aliyun.com/document_detail/52088.html). Valid values:</p>
     * <br>
     * <p>*   NoSpot: The instances are regular pay-as-you-go instances.</p>
     * <p>*   SpotWithPriceLimit: The instances are preemptible instances with user-defined maximum hourly prices.</p>
     * <p>*   SpotAsPriceGo: The instances are preemptible instances for which the market price at the time of purchase is automatically used as the bid price. The market price can be up to the pay-as-you-go price.</p>
     * <br>
     * <p>Default value: NoSpot.</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>Specifies whether to display detailed information.</p>
     * <br>
     * <p>*   true: displays detailed information.</p>
     * <p>*   false: does not display detailed information.</p>
     * <br>
     * <p>Default value: true.</p>
     */
    @NameInMap("Verbose")
    public Boolean verbose;

    public static DescribeZonesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeZonesRequest self = new DescribeZonesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeZonesRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DescribeZonesRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public DescribeZonesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeZonesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeZonesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeZonesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeZonesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeZonesRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public DescribeZonesRequest setVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }
    public Boolean getVerbose() {
        return this.verbose;
    }

}

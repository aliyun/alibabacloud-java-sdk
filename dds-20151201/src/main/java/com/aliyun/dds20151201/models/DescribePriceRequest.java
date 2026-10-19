// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribePriceRequest extends TeaModel {
    /**
     * <p>The additional parameter for business information.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AccountPassword&quot;:&quot;Pw123456&quot;,&quot;DBInstanceDescription&quot;:&quot;test&quot;}</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The commodity code. Valid values:</p>
     * <ul>
     * <li><strong>dds</strong>: pay-as-you-go replica set instance</li>
     * <li><strong>badds</strong>: subscription replica set instance</li>
     * <li><strong>dds_sharding</strong>: pay-as-you-go sharded cluster instance</li>
     * <li><strong>badds_sharding</strong>: subscription sharded cluster instance</li>
     * <li><strong>badds_sharding_intl</strong>: subscription sharded cluster instance on the international site</li>
     * <li><strong>dds_sharding_intl</strong>: pay-as-you-go sharded cluster instance on the international site</li>
     * <li><strong>badds_sharding_jp</strong>: subscription sharded cluster instance on the Japan site</li>
     * <li><strong>badds_intl</strong>: subscription replica set instance on the international site</li>
     * <li><strong>dds_intl</strong>: pay-as-you-go replica set instance on the international site</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>badds</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>Specifies whether to use a coupon. Valid values:</p>
     * <ul>
     * <li><strong>default</strong> or <strong>null</strong> (default): Use a coupon.</li>
     * <li><strong>youhuiquan_promotion_option_id_for_blank</strong>: Do not use a coupon.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>The JSON-formatted string that contains multiple pieces of information about instances. For metric descriptions and more JSON format examples, see <a href="https://help.aliyun.com/document_detail/197291.html">DBInstances metric description for the DescribePrice operation</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[ { &quot;DBInstanceId&quot;:&quot;dds-bp1b6e54e7cc****&quot;, &quot;RegionId&quot;:&quot;cn-hangzhou&quot;, &quot;ZoneId&quot;:&quot;cn-hangzhou-h&quot;, &quot;Engine&quot;:&quot;MongoDB&quot;, &quot;EngineVersion&quot;:&quot; 5.0&quot;, &quot;DBInstanceClass&quot;:&quot;mdb.shard.2x.xlarge.d&quot;, &quot;DBInstanceStorage&quot;:30, &quot;ChargeType&quot;:&quot;PrePaid&quot;, &quot;Period&quot;:1, &quot;StorageType&quot;:&quot;cloud_essd1&quot; } ]</p>
     */
    @NameInMap("DBInstances")
    public String DBInstances;

    /**
     * <p>Specifies whether to return order parameters. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): Do not return order parameters.</li>
     * <li><strong>true</strong>: Return order parameters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OrderParamOut")
    public String orderParamOut;

    /**
     * <p>The order type. Valid values:</p>
     * <ul>
     * <li><strong>BUY</strong>: Create an instance.</li>
     * <li><strong>UPGRADE</strong>: Upgrade instance configurations.</li>
     * <li><strong>RENEW</strong>: Renew an instance.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BUY</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The product code. Default value: <strong>dds</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>dds</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query the region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID. For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/151181.html">View the basic information of a resource group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmyiu4ekp****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceRequest self = new DescribePriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribePriceRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public DescribePriceRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public DescribePriceRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public DescribePriceRequest setDBInstances(String DBInstances) {
        this.DBInstances = DBInstances;
        return this;
    }
    public String getDBInstances() {
        return this.DBInstances;
    }

    public DescribePriceRequest setOrderParamOut(String orderParamOut) {
        this.orderParamOut = orderParamOut;
        return this;
    }
    public String getOrderParamOut() {
        return this.orderParamOut;
    }

    public DescribePriceRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public DescribePriceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribePriceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribePriceRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribePriceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribePriceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribePriceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribePriceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribePriceRequest extends TeaModel {
    /**
     * <p>The business information. This is an additional parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AccountPassword&quot;:&quot;Pw123456&quot;,&quot;DBInstanceDescription&quot;:&quot;test&quot;}</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The commodity code of the instance. Valid values:</p>
     * <ul>
     * <li><p><strong>dds</strong>: pay-as-you-go ReplicaSet instance.</p>
     * </li>
     * <li><p><strong>badds</strong>: subscription ReplicaSet instance.</p>
     * </li>
     * <li><p><strong>dds_sharding</strong>: pay-as-you-go sharded cluster instance.</p>
     * </li>
     * <li><p><strong>badds_sharding</strong>: subscription sharded cluster instance.</p>
     * </li>
     * <li><p><strong>badds_sharding_intl</strong>: subscription sharded cluster instance on the Alibaba Cloud International Website (www\.alibabacloud.com).</p>
     * </li>
     * <li><p><strong>dds_sharding_intl</strong>: pay-as-you-go sharded cluster instance on the Alibaba Cloud International Website (www\.alibabacloud.com).</p>
     * </li>
     * <li><p><strong>badds_sharding_jp</strong>: subscription sharded cluster instance on the Alibaba Cloud Japan Website.</p>
     * </li>
     * <li><p><strong>badds_intl</strong>: subscription ReplicaSet instance on the Alibaba Cloud International Website (www\.alibabacloud.com).</p>
     * </li>
     * <li><p><strong>dds_intl</strong>: pay-as-you-go ReplicaSet instance on the Alibaba Cloud International Website (www\.alibabacloud.com).</p>
     * </li>
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
     * <li><p><strong>default</strong> or <strong>null</strong> (default): A coupon is used.</p>
     * </li>
     * <li><p><strong>youhuiquan_promotion_option_id_for_blank</strong>: A coupon is not used.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>A JSON string that contains information about the instance. For more information about the parameters and JSON examples, see <a href="https://help.aliyun.com/document_detail/197291.html">DBInstances parameter of the DescribePrice operation</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[ { &quot;DBInstanceId&quot;:&quot;dds-bp1b6e54e7cc****&quot;, &quot;RegionId&quot;:&quot;cn-hangzhou&quot;, &quot;ZoneId&quot;:&quot;cn-hangzhou-h&quot;, &quot;Engine&quot;:&quot;MongoDB&quot;, &quot;EngineVersion&quot;:&quot; 5.0&quot;, &quot;DBInstanceClass&quot;:&quot;mdb.shard.2x.xlarge.d&quot;, &quot;DBInstanceStorage&quot;:30, &quot;ChargeType&quot;:&quot;PrePaid&quot;, &quot;Period&quot;:1, &quot;StorageType&quot;:&quot;cloud_essd1&quot; } ]</p>
     */
    @NameInMap("DBInstances")
    public String DBInstances;

    /**
     * <p>Specifies whether to return the order parameters. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong> (default): The order parameters are not returned.</p>
     * </li>
     * <li><p><strong>true</strong>: The order parameters are returned.</p>
     * </li>
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
     * <li><p><strong>BUY</strong>: Creates an instance.</p>
     * </li>
     * <li><p><strong>UPGRADE</strong>: Changes the configuration of an instance.</p>
     * </li>
     * <li><p><strong>RENEW</strong>: Renews an instance.</p>
     * </li>
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
     * <p>The product code. The default value is <strong>dds</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>dds</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The region ID. Call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query the region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID. For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/151181.html">View basic information of a resource group</a>.</p>
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

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
     * <p>The code of the instance. Valid values:</p>
     * <ul>
     * <li><strong>dds</strong>: a replica set instance that uses the pay-as-you-go billing method</li>
     * <li><strong>badds</strong>: a replica set instance that uses the subscription billing method</li>
     * <li><strong>dds_sharding</strong>: a sharded cluster instance that uses the pay-as-you-go billing method</li>
     * <li><strong>badds_sharding</strong>: a sharded cluster instance that uses the subscription billing method</li>
     * <li><strong>badds_sharding_intl</strong>: a sharded cluster instance that uses the subscription billing method and is available on the International site (alibabacloud.com)</li>
     * <li><strong>dds_sharding_intl</strong>: a sharded cluster instance that uses the pay-as-you-go billing method and is available on the International site (alibabacloud.com)</li>
     * <li><strong>badds_sharding_jp</strong>: a sharded cluster instance that uses the subscription billing method and is available on the Japan site (jp.alibabacloud.com)</li>
     * <li><strong>badds_intl</strong>: a replica set instance that uses the subscription billing method and is available on the International site (alibabacloud.com)</li>
     * <li><strong>dds_intl</strong>: a replica set instance that uses the pay-as-you-go billing method and is available on the International site (alibabacloud.com)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>badds</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>Specifies whether to use coupons. Default value: null. Valid values:</p>
     * <ul>
     * <li><strong>default</strong> or <strong>null</strong>: uses coupons.</li>
     * <li><strong>youhuiquan_promotion_option_id_for_blank</strong>: does not use coupons.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>youhuiquan_promotion_option_id_for_blank</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>A JSON string that contains the details of the instance. For more information about the parameter and sample JSON formats, see <a href="https://help.aliyun.com/document_detail/197291.html">DescribePrice</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[ { &quot;DBInstanceId&quot;:&quot;dds-bp1b6e54e7cc****&quot;, &quot;RegionId&quot;:&quot;cn-hangzhou&quot;, &quot;ZoneId&quot;:&quot;cn-hangzhou-h&quot;, &quot;Engine&quot;:&quot;MongoDB&quot;, &quot;EngineVersion&quot;:&quot; 5.0&quot;, &quot;DBInstanceClass&quot;:&quot;mdb.shard.2x.xlarge.d&quot;, &quot;DBInstanceStorage&quot;:30, &quot;ChargeType&quot;:&quot;PrePaid&quot;, &quot;Period&quot;:1, &quot;StorageType&quot;:&quot;cloud_essd1&quot; } ]</p>
     */
    @NameInMap("DBInstances")
    public String DBInstances;

    /**
     * <p>Specifies whether to return the OrderParams parameter. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default)</li>
     * <li><strong>true</strong></li>
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
     * <li><strong>BUY</strong></li>
     * <li><strong>UPGRADE</strong></li>
     * <li><strong>RENEW</strong></li>
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
     * <p>The code of the service. Default value: <strong>dds</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>dds</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group. For more information, see <a href="https://help.aliyun.com/document_detail/151181.html">View basic information of a resource group</a>.</p>
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

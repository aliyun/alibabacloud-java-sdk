// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeCommodityRequest extends TeaModel {
    /**
     * <p>The commodity code.</p>
     * <p>Valid values on the China site (aliyun.com):</p>
     * <ul>
     * <li><p><strong>ga_gapluspre_public_cn</strong>: GA instance.</p>
     * </li>
     * <li><p><strong>ga_plusbwppre_public_cn</strong>: basic bandwidth plan.</p>
     * </li>
     * </ul>
     * <p>Valid values on the international site (alibabacloud.com):</p>
     * <ul>
     * <li><p><strong>ga_pluspre_public_intl</strong>: GA instance.</p>
     * </li>
     * <li><p><strong>ga_bwppreintl_public_intl:</strong> basic bandwidth plan.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ga_gapluspre_public_cn</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The type of the order. Valid values:</p>
     * <ul>
     * <li><p><strong>BUY</strong>: purchase order.</p>
     * </li>
     * <li><p><strong>RENEW</strong>: renewal order.</p>
     * </li>
     * <li><p><strong>UPGRADE</strong>: upgrade order.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BUY</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The ID of the region where the Global Accelerator (GA) instance is deployed. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeCommodityRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommodityRequest self = new DescribeCommodityRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCommodityRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public DescribeCommodityRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public DescribeCommodityRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

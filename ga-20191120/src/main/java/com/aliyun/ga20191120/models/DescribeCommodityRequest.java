// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeCommodityRequest extends TeaModel {
    /**
     * <p>The commodity code.</p>
     * <br>
     * <p>Valid values on the China site (aliyun.com):</p>
     * <br>
     * <p>*   **ga_gapluspre_public_cn**: GA instance.</p>
     * <p>*   **ga_plusbwppre_public_cn**: basic bandwidth plan.</p>
     * <br>
     * <p>Valid values on the international site (alibabacloud.com):</p>
     * <br>
     * <p>*   **ga_pluspre_public_intl**: GA instance.</p>
     * <p>*   **ga_bwppreintl_public_intl:** basic bandwidth plan.</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    /**
     * <p>The type of the order. Valid values:</p>
     * <br>
     * <p>*   **BUY**: purchase order.</p>
     * <p>*   **RENEW**: renewal order.</p>
     * <p>*   **UPGRADE**: upgrade order.</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    /**
     * <p>The ID of the region where the Global Accelerator (GA) instance is deployed. Set the value to **cn-hangzhou**.</p>
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

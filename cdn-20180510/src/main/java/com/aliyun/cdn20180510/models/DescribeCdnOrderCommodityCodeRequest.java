// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnOrderCommodityCodeRequest extends TeaModel {
    /**
     * <p>The original commodity code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeCdnOrderCommodityCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnOrderCommodityCodeRequest self = new DescribeCdnOrderCommodityCodeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnOrderCommodityCodeRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public DescribeCdnOrderCommodityCodeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCdnOrderCommodityCodeRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}

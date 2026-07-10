// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DeleteBlackListStrategyRequest extends TeaModel {
    /**
     * <p>The rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>38</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The product name. Valid values:</p>
     * <ul>
     * <li><strong>id2meta</strong>: ID card two-element verification.</li>
     * <li><strong>mobile3Meta</strong>: Mobile number element verification.</li>
     * <li><strong>bankcardMeta</strong>: Bank card element verification.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>id2meta</p>
     */
    @NameInMap("ProductName")
    public String productName;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteBlackListStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBlackListStrategyRequest self = new DeleteBlackListStrategyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBlackListStrategyRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteBlackListStrategyRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public DeleteBlackListStrategyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}

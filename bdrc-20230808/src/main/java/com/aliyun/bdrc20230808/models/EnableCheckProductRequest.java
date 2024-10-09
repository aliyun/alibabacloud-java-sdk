// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class EnableCheckProductRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ProductType")
    public String productType;

    public static EnableCheckProductRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableCheckProductRequest self = new EnableCheckProductRequest();
        return TeaModel.build(map, self);
    }

    public EnableCheckProductRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}

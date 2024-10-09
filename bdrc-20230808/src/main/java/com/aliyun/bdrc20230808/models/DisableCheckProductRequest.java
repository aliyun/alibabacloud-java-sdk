// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class DisableCheckProductRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("ProductType")
    public String productType;

    public static DisableCheckProductRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableCheckProductRequest self = new DisableCheckProductRequest();
        return TeaModel.build(map, self);
    }

    public DisableCheckProductRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}

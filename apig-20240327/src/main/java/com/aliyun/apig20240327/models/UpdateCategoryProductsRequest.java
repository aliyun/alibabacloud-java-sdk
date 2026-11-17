// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateCategoryProductsRequest extends TeaModel {
    /**
     * <p>The direction of this batch operation. It specifies whether to add the API products in productIds to the category or remove these API products from the category. The set of valid values is not declared in the API definition.</p>
     * 
     * <strong>example:</strong>
     * <p>action-xxxxxxxx</p>
     */
    @NameInMap("action")
    public String action;

    /**
     * <p>The list of API product IDs to process. Each element is a primary ID of the Product resource.</p>
     */
    @NameInMap("productIds")
    public java.util.List<String> productIds;

    public static UpdateCategoryProductsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCategoryProductsRequest self = new UpdateCategoryProductsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCategoryProductsRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public UpdateCategoryProductsRequest setProductIds(java.util.List<String> productIds) {
        this.productIds = productIds;
        return this;
    }
    public java.util.List<String> getProductIds() {
        return this.productIds;
    }

}

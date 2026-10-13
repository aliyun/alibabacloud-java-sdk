// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateProductCategoryRequest extends TeaModel {
    /**
     * <p>The description of the product category. The description can be up to 500 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Product category that includes AI-related capabilities</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The icon of the product category. The icon consists of two fields: icon type (type) and icon information (value).</p>
     */
    @NameInMap("icon")
    public HiMarketIcon icon;

    /**
     * <p>The name of the product category. The name can be up to 100 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ai-capabilities</p>
     */
    @NameInMap("name")
    public String name;

    public static UpdateProductCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductCategoryRequest self = new UpdateProductCategoryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProductCategoryRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateProductCategoryRequest setIcon(HiMarketIcon icon) {
        this.icon = icon;
        return this;
    }
    public HiMarketIcon getIcon() {
        return this.icon;
    }

    public UpdateProductCategoryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}

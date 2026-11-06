// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateProductCategoryRequest extends TeaModel {
    /**
     * <p>The description of the product category. Maximum length: 500 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>Product category for AI-related capabilities</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The icon of the product category, which consists of the icon type and icon information fields.</p>
     */
    @NameInMap("icon")
    public HiMarketIcon icon;

    /**
     * <p>The name of the product category. Maximum length: 100 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>ai-capabilities</p>
     */
    @NameInMap("name")
    public String name;

    public static CreateProductCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProductCategoryRequest self = new CreateProductCategoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateProductCategoryRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateProductCategoryRequest setIcon(HiMarketIcon icon) {
        this.icon = icon;
        return this;
    }
    public HiMarketIcon getIcon() {
        return this.icon;
    }

    public CreateProductCategoryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class CategoryMatchRequest extends TeaModel {
    /**
     * <p>The product description.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Silk, Spring New Arrival</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The product attributes that describe the characteristics of the product, such as material. Provide the attribute names and values.</p>
     * 
     * <strong>example:</strong>
     * <p>Material:Polyester,Target Audience:General,Brand:AMASON PET</p>
     */
    @NameInMap("ItemSpec")
    public String itemSpec;

    /**
     * <p>The SKU title of the product.</p>
     * 
     * <strong>example:</strong>
     * <p>0:0:Color:Black(without locator);0:1:Color:Smart Locator(without collar);0:2:Color:Range Locator(without collar);0:3:Color:Blue(without locator);0:4:Color:Orange(without locator);0:5:Color:Pink(without locator);0:6:Color:Red(without locator);0:7:Color:Yellow(without locator);0:8:Color:Purple(without locator)</p>
     */
    @NameInMap("Sku")
    public String sku;

    /**
     * <p>The product category on the source platform.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Clothing</p>
     */
    @NameInMap("SourceCategory")
    public String sourceCategory;

    /**
     * <p>The source platform from which products are sourced.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1688</p>
     */
    @NameInMap("SourcePlatform")
    public String sourcePlatform;

    /**
     * <p>The target listing platform. Currently, only temu is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>temu</p>
     */
    @NameInMap("TargetPlatform")
    public String targetPlatform;

    /**
     * <p>The product title.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Women\&quot;s Spring New Arrival Clothing</p>
     */
    @NameInMap("Title")
    public String title;

    public static CategoryMatchRequest build(java.util.Map<String, ?> map) throws Exception {
        CategoryMatchRequest self = new CategoryMatchRequest();
        return TeaModel.build(map, self);
    }

    public CategoryMatchRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CategoryMatchRequest setItemSpec(String itemSpec) {
        this.itemSpec = itemSpec;
        return this;
    }
    public String getItemSpec() {
        return this.itemSpec;
    }

    public CategoryMatchRequest setSku(String sku) {
        this.sku = sku;
        return this;
    }
    public String getSku() {
        return this.sku;
    }

    public CategoryMatchRequest setSourceCategory(String sourceCategory) {
        this.sourceCategory = sourceCategory;
        return this;
    }
    public String getSourceCategory() {
        return this.sourceCategory;
    }

    public CategoryMatchRequest setSourcePlatform(String sourcePlatform) {
        this.sourcePlatform = sourcePlatform;
        return this;
    }
    public String getSourcePlatform() {
        return this.sourcePlatform;
    }

    public CategoryMatchRequest setTargetPlatform(String targetPlatform) {
        this.targetPlatform = targetPlatform;
        return this;
    }
    public String getTargetPlatform() {
        return this.targetPlatform;
    }

    public CategoryMatchRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class CategoryMatchRequest extends TeaModel {
    /**
     * <p>The product details.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Silk, new spring arrival</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The product attributes and feature descriptions, such as the material of the product. Enter the product attribute name and attribute value.</p>
     * 
     * <strong>example:</strong>
     * <p>Material:Polyester,Target user:Universal,Brand:AMASON PET</p>
     */
    @NameInMap("ItemSpec")
    public String itemSpec;

    /**
     * <p>The product SKU title.</p>
     * 
     * <strong>example:</strong>
     * <p>0:0:Color:Black (without tracker);0:1:Color:Smart tracking (without collar);0:2:Color:Range tracking (without collar);0:3:Color:Blue (without tracker);0:4:Color:Orange (without tracker);0:5:Color:Pink (without tracker);0:6:Color:Red (without tracker);0:7:Color:Yellow (without tracker);0:8:Color:Purple (without tracker)</p>
     */
    @NameInMap("Sku")
    public String sku;

    /**
     * <p>The product category.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Clothing</p>
     */
    @NameInMap("SourceCategory")
    public String sourceCategory;

    /**
     * <p>The source platform.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1688</p>
     */
    @NameInMap("SourcePlatform")
    public String sourcePlatform;

    /**
     * <p>The target platform. Currently, only TEMU is supported.</p>
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
     * <p>Women\&quot;s new spring clothing</p>
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

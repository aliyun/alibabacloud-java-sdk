// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class CategoryMatchRequest extends TeaModel {
    /**
     * <p>The product details.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>真丝，春季新款</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The product attributes that describe the characteristics of the product, such as material. Specify the attribute names and attribute values.</p>
     * 
     * <strong>example:</strong>
     * <p>材质:涤纶,适用对象:通用,品牌:艾马逊AMASON PET</p>
     */
    @NameInMap("ItemSpec")
    public String itemSpec;

    /**
     * <p>The SKU title of the product.</p>
     * 
     * <strong>example:</strong>
     * <p>0:0:颜色:黑(不含定位器);0:1:颜色:智能定位(不含项圈);0:2:颜色:范围定位(不含项圈);0:3:颜色:蓝(不含定位器);0:4:颜色:橙(不含定位器);0:5:颜色:粉(不含定位器);0:6:颜色:红(不含定位器);0:7:颜色:黄(不含定位器);0:8:颜色:紫(不含定位器)</p>
     */
    @NameInMap("Sku")
    public String sku;

    /**
     * <p>The product category on the source platform.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>衣服</p>
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
     * <p>女士春季新款衣服</p>
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

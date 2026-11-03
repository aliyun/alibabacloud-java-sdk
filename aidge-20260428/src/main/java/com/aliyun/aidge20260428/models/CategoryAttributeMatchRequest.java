// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class CategoryAttributeMatchRequest extends TeaModel {
    /**
     * <p>The product details.</p>
     * 
     * <strong>example:</strong>
     * <p>Silk, spring new arrival</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The URLs of the product images. Up to 10 images are supported.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://frametour-assets.oss-cn-shanghai.aliyuncs.com/user-faces/viid_face/dd0dd06c-9351-4e5f-bc70-24166a754d7f.jpg">https://frametour-assets.oss-cn-shanghai.aliyuncs.com/user-faces/viid_face/dd0dd06c-9351-4e5f-bc70-24166a754d7f.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public java.util.List<String> imageUrl;

    /**
     * <p>The product attributes and feature descriptions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>For example, the material of the product. Enter the product attribute name and attribute content</p>
     */
    @NameInMap("ItemSpec")
    public String itemSpec;

    /**
     * <p>The product SKU title.</p>
     * <p>This parameter is required.</p>
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
     * <p>Women\&quot;s spring new arrival clothing</p>
     */
    @NameInMap("Title")
    public String title;

    public static CategoryAttributeMatchRequest build(java.util.Map<String, ?> map) throws Exception {
        CategoryAttributeMatchRequest self = new CategoryAttributeMatchRequest();
        return TeaModel.build(map, self);
    }

    public CategoryAttributeMatchRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CategoryAttributeMatchRequest setImageUrl(java.util.List<String> imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public java.util.List<String> getImageUrl() {
        return this.imageUrl;
    }

    public CategoryAttributeMatchRequest setItemSpec(String itemSpec) {
        this.itemSpec = itemSpec;
        return this;
    }
    public String getItemSpec() {
        return this.itemSpec;
    }

    public CategoryAttributeMatchRequest setSku(String sku) {
        this.sku = sku;
        return this;
    }
    public String getSku() {
        return this.sku;
    }

    public CategoryAttributeMatchRequest setSourceCategory(String sourceCategory) {
        this.sourceCategory = sourceCategory;
        return this;
    }
    public String getSourceCategory() {
        return this.sourceCategory;
    }

    public CategoryAttributeMatchRequest setSourcePlatform(String sourcePlatform) {
        this.sourcePlatform = sourcePlatform;
        return this;
    }
    public String getSourcePlatform() {
        return this.sourcePlatform;
    }

    public CategoryAttributeMatchRequest setTargetPlatform(String targetPlatform) {
        this.targetPlatform = targetPlatform;
        return this;
    }
    public String getTargetPlatform() {
        return this.targetPlatform;
    }

    public CategoryAttributeMatchRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}

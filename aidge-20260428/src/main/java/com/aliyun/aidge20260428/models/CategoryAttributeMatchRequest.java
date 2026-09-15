// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class CategoryAttributeMatchRequest extends TeaModel {
    /**
     * <p>The product details.</p>
     * 
     * <strong>example:</strong>
     * <p>Silk, new spring style</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The product image URLs. A maximum of 10 images are supported.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://frametour-assets.oss-cn-shanghai.aliyuncs.com/user-faces/viid_face/dd0dd06c-9351-4e5f-bc70-24166a754d7f.jpg">https://frametour-assets.oss-cn-shanghai.aliyuncs.com/user-faces/viid_face/dd0dd06c-9351-4e5f-bc70-24166a754d7f.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public java.util.List<String> imageUrl;

    /**
     * <p>The product attributes that describe the product characteristics.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>For example, the material of the product. Enter the attribute name and attribute value</p>
     */
    @NameInMap("ItemSpec")
    public String itemSpec;

    /**
     * <p>The product SKU title.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0:0:Color:Black (without locator);0:1:Color:Smart Locator (without collar);0:2:Color:Range Locator (without collar);0:3:Color:Blue (without locator);0:4:Color:Orange (without locator);0:5:Color:Pink (without locator);0:6:Color:Red (without locator);0:7:Color:Yellow (without locator);0:8:Color:Purple (without locator)</p>
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
     * <p>The source platform from which the product originates.</p>
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
     * <p>Women\&quot;s New Spring Clothing</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class GenerateProductContentRequest extends TeaModel {
    /**
     * <p>Takes effect only when contentType is set to bulletPoint. Valid values: 1 to 5. Default value in generate mode: 1. In rewrite mode, if manually specified, the value must match the number of non-empty paragraphs in sourceText. This parameter is ignored for other copy types.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("BulletPointCount")
    public Integer bulletPointCount;

    /**
     * <p>The copy type. Valid values: title, highlight, keywords, bulletPoint, and description. When a platform is specified, you must select a type supported by the platform.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <p>Specifies whether to enable translation. Default value: false. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("EnableTranslation")
    public Boolean enableTranslation;

    /**
     * <p>The maximum number of characters for the final output text. If specified, the value must be an integer greater than or equal to 30. If a platform is specified and this parameter is not provided, the configured upper limit for the content type on the platform is used. Example: 60.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxLength")
    public Integer maxLength;

    /**
     * <p>The minimum number of characters for the final output text. If specified, the value must be an integer greater than or equal to 10. If a platform is specified and this parameter is not provided, the configured lower limit for the content type on the platform is used.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("MinLength")
    public Integer minLength;

    /**
     * <p>The operation type. Valid values:</p>
     * <ul>
     * <li>generate: Generates copy.</li>
     * <li>rewrite: Rewrites copy.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>generate</p>
     */
    @NameInMap("Operation")
    public String operation;

    /**
     * <p>The target platform. Valid values: amazon, temu, tiktok, shopify, Wildberries, and tmall. If this parameter is not provided, the request is processed as a general scenario. Enum values are case-sensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>amazon</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <p>The product attribute information. Default value: empty. The length must be 0 to 500 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;brand&quot;:&quot;Supor&quot;,&quot;material&quot;:&quot;304 stainless steel&quot;}</p>
     */
    @NameInMap("ProductAttributes")
    public String productAttributes;

    /**
     * <p>The product category. Default value: an empty string. The length must be 0 to 100 characters. This parameter helps understand the category during generation and eliminates ambiguity during rewriting.</p>
     * 
     * <strong>example:</strong>
     * <p>Kitchen utensils</p>
     */
    @NameInMap("ProductCategory")
    public String productCategory;

    /**
     * <p>The source language. Valid values: zh and en. Automatic language detection is not supported. Supported source languages: Chinese (zh) and English (en).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    /**
     * <p>The product information or copy to be rewritten. The length must be 20 to 3,000 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Stainless steel 28 cm 3-tier large-capacity steamer for home kitchens</p>
     */
    @NameInMap("SourceText")
    public String sourceText;

    /**
     * <p>Required when enableTranslation is set to true. For valid values, see the multilingual processing section. If translation is disabled, this parameter is optional. If provided, it must be the same as the source language. Supported target languages: Chinese (zh), English (en), Russian (ru), German (de), French (fr), Korean (ko), Italian (it), Thai (th), Arabic (ar), Turkish (tr), Hebrew (he), Ukrainian (uk), Polish (pl), Japanese (ja), Dutch (nl), Portuguese (pt), Spanish (es), Malay (ms), Bulgarian (bg), Indonesian (id), and Vietnamese (vi).</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("TargetLanguage")
    public String targetLanguage;

    public static GenerateProductContentRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateProductContentRequest self = new GenerateProductContentRequest();
        return TeaModel.build(map, self);
    }

    public GenerateProductContentRequest setBulletPointCount(Integer bulletPointCount) {
        this.bulletPointCount = bulletPointCount;
        return this;
    }
    public Integer getBulletPointCount() {
        return this.bulletPointCount;
    }

    public GenerateProductContentRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public GenerateProductContentRequest setEnableTranslation(Boolean enableTranslation) {
        this.enableTranslation = enableTranslation;
        return this;
    }
    public Boolean getEnableTranslation() {
        return this.enableTranslation;
    }

    public GenerateProductContentRequest setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
        return this;
    }
    public Integer getMaxLength() {
        return this.maxLength;
    }

    public GenerateProductContentRequest setMinLength(Integer minLength) {
        this.minLength = minLength;
        return this;
    }
    public Integer getMinLength() {
        return this.minLength;
    }

    public GenerateProductContentRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public GenerateProductContentRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public GenerateProductContentRequest setProductAttributes(String productAttributes) {
        this.productAttributes = productAttributes;
        return this;
    }
    public String getProductAttributes() {
        return this.productAttributes;
    }

    public GenerateProductContentRequest setProductCategory(String productCategory) {
        this.productCategory = productCategory;
        return this;
    }
    public String getProductCategory() {
        return this.productCategory;
    }

    public GenerateProductContentRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public GenerateProductContentRequest setSourceText(String sourceText) {
        this.sourceText = sourceText;
        return this;
    }
    public String getSourceText() {
        return this.sourceText;
    }

    public GenerateProductContentRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

}

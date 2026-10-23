// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class GenerateProductContentRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("BulletPointCount")
    public Integer bulletPointCount;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("ContentType")
    public String contentType;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("EnableTranslation")
    public Boolean enableTranslation;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxLength")
    public Integer maxLength;

    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("MinLength")
    public Integer minLength;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>generate</p>
     */
    @NameInMap("Operation")
    public String operation;

    /**
     * <strong>example:</strong>
     * <p>amazon</p>
     */
    @NameInMap("Platform")
    public String platform;

    /**
     * <strong>example:</strong>
     * <p>{&quot;brand&quot;:&quot;苏泊尔&quot;,&quot;material&quot;:&quot;304不锈钢&quot;}</p>
     */
    @NameInMap("ProductAttributes")
    public String productAttributes;

    /**
     * <strong>example:</strong>
     * <p>厨房用具</p>
     */
    @NameInMap("ProductCategory")
    public String productCategory;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>不锈钢蒸锅28cm三层大容量家用厨房必备蒸煮两用锅具</p>
     */
    @NameInMap("SourceText")
    public String sourceText;

    /**
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

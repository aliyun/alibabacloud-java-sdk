// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageTranslationPlusAsyncRequest extends TeaModel {
    /**
     * <p>The business order ID of the caller. This ID is recorded when the request is accepted and returned as is when you query the asynchronous task result.</p>
     * 
     * <strong>example:</strong>
     * <p>order-20260928-001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The intervention glossary ID. You must create the intervention glossary separately and provide its ID in the input parameters. If the provided intervention glossary ID is empty, the translation results are not modified.</p>
     * 
     * <strong>example:</strong>
     * <p>glossary_1</p>
     */
    @NameInMap("Glossary")
    public String glossary;

    /**
     * <ul>
     * <li>Image URL: The image must be accessible over the Internet.    </li>
     * <li>Format: PNG, JPEG, JPG, BMP, or WEBP.    </li>
     * <li>Resolution: The width and height cannot exceed 4,000 pixels.   </li>
     * <li>File size: The original file size cannot exceed 10 MB.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/image.jpg">https://example.com/image.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>Specifies whether to translate the text on the image subject. This helps you protect information and prevent embedded information, such as the product name, from being translated. In the example image, the text in the red box represents the text on the subject, and the text in the blue box represents the text not on the subject.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludingProductArea")
    public Boolean includingProductArea;

    /**
     * <p>The source language code. The value auto is supported for automatic detection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    /**
     * <p>The target language code. We recommend that you use the 12 minor language pairs listed above.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("TargetLanguage")
    public String targetLanguage;

    /**
     * <p>Specifies whether to translate the brand name in the image. This prevents the brand name from being translated. Default value: false. In the example image, \&quot;懒角落\&quot; represents the brand name.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("TranslatingBrandInTheProduct")
    public Boolean translatingBrandInTheProduct;

    /**
     * <p>Specifies whether to return layout information such as the position, font, and color of the text. This can be used to obtain data when you integrate the image editor for secondary editing. You can call the image translation result data query API operation to obtain the complete parameter information.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseImageEditor")
    public Boolean useImageEditor;

    public static ImageTranslationPlusAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageTranslationPlusAsyncRequest self = new ImageTranslationPlusAsyncRequest();
        return TeaModel.build(map, self);
    }

    public ImageTranslationPlusAsyncRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ImageTranslationPlusAsyncRequest setGlossary(String glossary) {
        this.glossary = glossary;
        return this;
    }
    public String getGlossary() {
        return this.glossary;
    }

    public ImageTranslationPlusAsyncRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public ImageTranslationPlusAsyncRequest setIncludingProductArea(Boolean includingProductArea) {
        this.includingProductArea = includingProductArea;
        return this;
    }
    public Boolean getIncludingProductArea() {
        return this.includingProductArea;
    }

    public ImageTranslationPlusAsyncRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public ImageTranslationPlusAsyncRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public ImageTranslationPlusAsyncRequest setTranslatingBrandInTheProduct(Boolean translatingBrandInTheProduct) {
        this.translatingBrandInTheProduct = translatingBrandInTheProduct;
        return this;
    }
    public Boolean getTranslatingBrandInTheProduct() {
        return this.translatingBrandInTheProduct;
    }

    public ImageTranslationPlusAsyncRequest setUseImageEditor(Boolean useImageEditor) {
        this.useImageEditor = useImageEditor;
        return this;
    }
    public Boolean getUseImageEditor() {
        return this.useImageEditor;
    }

}

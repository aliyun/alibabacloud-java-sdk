// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageTranslationPlusAsyncRequest extends TeaModel {
    /**
     * <p>The business order number of the caller. This number is recorded when the request is accepted and returned as-is when you query the asynchronous task results.</p>
     * 
     * <strong>example:</strong>
     * <p>order-20260928-001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The ID of the intervention glossary. You must create the intervention glossary separately and provide its ID in the input parameters. If the provided intervention glossary ID is empty, the translation results are not modified.</p>
     * 
     * <strong>example:</strong>
     * <p>glossary_1</p>
     */
    @NameInMap("Glossary")
    public String glossary;

    /**
     * <ul>
     * <li>Image URL: The URL must be publicly accessible.    </li>
     * <li>Format: PNG, JPEG, JPG, BMP, or WebP.    </li>
     * <li>Resolution: The width and height do not exceed 4,000 pixels.   </li>
     * <li>File size: The size of the original file is less than or equal to 10 MB.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/image.jpg">https://example.com/image.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>Specifies whether to translate the text on the product subject in the image. This helps you protect information and prevents embedded information such as product names from being translated. In the sample image, the text in the red box represents the text on the subject, and the text in the blue box represents the text not on the subject.</p>
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
     * <p>Specifies whether to translate the brand names in the image. This helps you protect the brand name information from being translated. Default value: false, which indicates that brand names are not translated. In the sample image, &quot;Lazy Corner&quot; represents the brand name.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("TranslatingBrandInTheProduct")
    public Boolean translatingBrandInTheProduct;

    /**
     * <p>Specifies whether to return layout information such as the position, font, and color of the text. This information can be used to obtain data when you integrate the image editor for secondary editing. You can call the API operation for querying image translation results to obtain the complete parameter information.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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

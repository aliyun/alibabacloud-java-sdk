// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageTranslationStandardRequest extends TeaModel {
    /**
     * <p>The glossary ID. Optional. Create a glossary in the console and provide its ID. If the glossary ID is empty, the translation results are not modified.</p>
     * 
     * <strong>example:</strong>
     * <p>glossary_1</p>
     */
    @NameInMap("Glossary")
    public String glossary;

    /**
     * <ul>
     * <li>Image URL: Must be publicly accessible.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://images-na.ssl-images-amazon.com/images/I/41bKsNBDcwL.jpg">https://images-na.ssl-images-amazon.com/images/I/41bKsNBDcwL.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>Specifies whether to translate text on the main subject of the image. Optional. Default value: false. This helps you protect information by avoiding translation of embedded information such as product names.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludingProductArea")
    public Boolean includingProductArea;

    /**
     * <p>The source language code. Required. For supported language pairs, see the supported language pair list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    /**
     * <p>The target language code. Required. For supported language pairs, see the supported language pair list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ko</p>
     */
    @NameInMap("TargetLanguage")
    public String targetLanguage;

    /**
     * <p>Specifies whether to translate brand names on the image. Optional. Default value: false. This helps you protect brand name information from being translated.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("TranslatingBrandInTheProduct")
    public Boolean translatingBrandInTheProduct;

    /**
     * <p>Specifies whether to return layer information such as text position, font, and color. When set to true, layer information is returned for integration with image editors for secondary editing. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseImageEditor")
    public Boolean useImageEditor;

    public static ImageTranslationStandardRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageTranslationStandardRequest self = new ImageTranslationStandardRequest();
        return TeaModel.build(map, self);
    }

    public ImageTranslationStandardRequest setGlossary(String glossary) {
        this.glossary = glossary;
        return this;
    }
    public String getGlossary() {
        return this.glossary;
    }

    public ImageTranslationStandardRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public ImageTranslationStandardRequest setIncludingProductArea(Boolean includingProductArea) {
        this.includingProductArea = includingProductArea;
        return this;
    }
    public Boolean getIncludingProductArea() {
        return this.includingProductArea;
    }

    public ImageTranslationStandardRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public ImageTranslationStandardRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public ImageTranslationStandardRequest setTranslatingBrandInTheProduct(Boolean translatingBrandInTheProduct) {
        this.translatingBrandInTheProduct = translatingBrandInTheProduct;
        return this;
    }
    public Boolean getTranslatingBrandInTheProduct() {
        return this.translatingBrandInTheProduct;
    }

    public ImageTranslationStandardRequest setUseImageEditor(Boolean useImageEditor) {
        this.useImageEditor = useImageEditor;
        return this;
    }
    public Boolean getUseImageEditor() {
        return this.useImageEditor;
    }

}

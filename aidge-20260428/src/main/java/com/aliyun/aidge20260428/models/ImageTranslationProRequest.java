// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ImageTranslationProRequest extends TeaModel {
    /**
     * <p>Specifies whether to use asynchronous mode. Default value: false (synchronous mode). When set to true, the API immediately returns a TaskId, and you must use the query translation result API to obtain the final result.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Async")
    public Boolean async;

    /**
     * <p>The intervention glossary ID. Optional. You must create the glossary separately in the console and provide its ID. If the glossary ID is empty, the translation results are not modified.</p>
     * 
     * <strong>example:</strong>
     * <p>glossary_1</p>
     */
    @NameInMap("Glossary")
    public String glossary;

    /**
     * <p>The URL of the original image. Required.</p>
     * <p>Image requirements:</p>
     * <ul>
     * <li>Image URL: Must be publicly accessible.</li>
     * <li>Format: png, jpeg, jpg, bmp, or webp.</li>
     * <li>Pixels: Width and height must not exceed 4000 each.</li>
     * <li>File size: Original file ≤ 10 MB.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/imgextra/i3/O1CN01HTDhDi28Fd85ZYs7H_!!6000000007903-0-tps-800-800.jpg">https://img.alicdn.com/imgextra/i3/O1CN01HTDhDi28Fd85ZYs7H_!!6000000007903-0-tps-800-800.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>Specifies whether to translate text on the image subject. Optional. Default value: false. This helps you protect information and avoid translating embedded information such as product names.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludingProductArea")
    public Boolean includingProductArea;

    /**
     * <p>The source language code. Required. For supported language directions, see <a href="https://www.alibabacloud.com/help/en/document_detail/3041883.html">Language Direction Mapping Table</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    /**
     * <p>The target language code. Required. For supported language directions, see <a href="https://www.alibabacloud.com/help/en/document_detail/3041883.html">Language Direction Mapping Table</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ko</p>
     */
    @NameInMap("TargetLanguage")
    public String targetLanguage;

    /**
     * <p>Specifies whether to translate brand names on images. Optional. Default value: false. This helps you protect brand name information from being translated.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("TranslatingBrandInTheProduct")
    public Boolean translatingBrandInTheProduct;

    /**
     * <p>Specifies whether to return layout information such as text position, font, and color. When set to true, layer information is returned for secondary editing with an image editor. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseImageEditor")
    public Boolean useImageEditor;

    public static ImageTranslationProRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageTranslationProRequest self = new ImageTranslationProRequest();
        return TeaModel.build(map, self);
    }

    public ImageTranslationProRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public ImageTranslationProRequest setGlossary(String glossary) {
        this.glossary = glossary;
        return this;
    }
    public String getGlossary() {
        return this.glossary;
    }

    public ImageTranslationProRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public ImageTranslationProRequest setIncludingProductArea(Boolean includingProductArea) {
        this.includingProductArea = includingProductArea;
        return this;
    }
    public Boolean getIncludingProductArea() {
        return this.includingProductArea;
    }

    public ImageTranslationProRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public ImageTranslationProRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public ImageTranslationProRequest setTranslatingBrandInTheProduct(Boolean translatingBrandInTheProduct) {
        this.translatingBrandInTheProduct = translatingBrandInTheProduct;
        return this;
    }
    public Boolean getTranslatingBrandInTheProduct() {
        return this.translatingBrandInTheProduct;
    }

    public ImageTranslationProRequest setUseImageEditor(Boolean useImageEditor) {
        this.useImageEditor = useImageEditor;
        return this;
    }
    public Boolean getUseImageEditor() {
        return this.useImageEditor;
    }

}

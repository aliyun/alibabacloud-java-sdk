// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class VisionFlowShrinkRequest extends TeaModel {
    /**
     * <p>The AI capabilities to be processed. Multiple values are supported. Valid values: 1 (Intelligent element recognition), 2 (Intelligent cutout), 3 (Intelligent erasure), 4 (Image translation Pro), 5 (Intelligent cropping), and 6 (High-definition upscaling).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[1,2,3,4]</p>
     */
    @NameInMap("Ability")
    public String abilityShrink;

    /**
     * <p>The background type of the returned image. Valid values: WHITE_BACKGROUND (White background image) and TRANSPARENT (Transparent background image). Required when the intelligent cutout capability is selected.</p>
     * 
     * <strong>example:</strong>
     * <p>WHITE_BACKGROUND</p>
     */
    @NameInMap("BackGroundType")
    public String backGroundType;

    /**
     * <p>The ID of the intervention glossary. Optional. You must create the glossary in the console and provide its ID. If this parameter is left empty, the translation results are not modified.</p>
     * 
     * <strong>example:</strong>
     * <p>glossary_1</p>
     */
    @NameInMap("Glossary")
    public String glossary;

    /**
     * <p>The URL of the image to be processed. Required. The resolution must be greater than 256×256, the long side must not exceed 1920 pixels, and the short side must not exceed 1080 pixels. The size must not exceed 5 MB. Supported formats include PNG, JPEG, JPG, BMP, and WEBP.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg">https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>Specifies whether to translate text on the image subject. Optional. Default value: false. This parameter helps protect embedded information such as product names from being translated.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludingProductArea")
    public Boolean includingProductArea;

    /**
     * <p>Specifies whether to include images with the specified elements in subsequent processing. A value of true indicates that images with the elements are included in subsequent processing. A value of false indicates that images with the elements are not included. Required when the intelligent element recognition capability is selected.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsFilter")
    public Boolean isFilter;

    /**
     * <p>The specific erasure area in Run-Length Encoding (RLE) format. Optional. If this parameter is specified, it takes precedence and the ObjectRemoveElements and NonobjectRemoveElements parameters are ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>474556 160 475356 160</p>
     */
    @NameInMap("Mask")
    public String mask;

    /**
     * <p>The elements to detect on the non-subject area of the image. Multiple values are supported. Valid values: 1 (Watermark), 2 (Logo), 3 (Text), and 4 (Text block). When the intelligent element recognition capability is selected, at least one of this parameter and ObjectDetectElements must be specified.</p>
     * 
     * <strong>example:</strong>
     * <p>[1,2,3]</p>
     */
    @NameInMap("NonobjectDetectElements")
    public String nonobjectDetectElementsShrink;

    /**
     * <p>The elements to remove from the non-subject area of the image. Multiple values are supported. Valid values: 1 (Transparent text block), 2 (Specific name), 3 (Text), and 4 (Cluttered text). When the intelligent erasure capability is selected, at least one of this parameter and ObjectRemoveElements must be specified.</p>
     * 
     * <strong>example:</strong>
     * <p>[1,2,4]</p>
     */
    @NameInMap("NonobjectRemoveElements")
    public String nonobjectRemoveElementsShrink;

    /**
     * <p>The elements to detect on the image subject. Multiple values are supported. Valid values: 1 (Watermark), 2 (Logo), 3 (Text), and 4 (Text block). When the intelligent element recognition capability is selected, at least one of this parameter and NonobjectDetectElements must be specified.</p>
     * 
     * <strong>example:</strong>
     * <p>[1,2,3,4]</p>
     */
    @NameInMap("ObjectDetectElements")
    public String objectDetectElementsShrink;

    /**
     * <p>The elements to remove from the image subject. Multiple values are supported. Valid values: 1 (Transparent text block), 2 (Specific name), 3 (Text), and 4 (Cluttered text). When the intelligent erasure capability is selected, at least one of this parameter and NonobjectRemoveElements must be specified.</p>
     * 
     * <strong>example:</strong>
     * <p>[1,2,4]</p>
     */
    @NameInMap("ObjectRemoveElements")
    public String objectRemoveElementsShrink;

    /**
     * <p>The source language code. Optional. For supported language pairs, see the list of supported translation languages.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    /**
     * <p>The expected height of the cropped image, in pixels. Valid values: 100 to 5000. Required when the intelligent cropping capability is selected.</p>
     * 
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("TargetHeight")
    public Integer targetHeight;

    /**
     * <p>The target language code. Optional. For supported language pairs, see the list of supported translation languages.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("TargetLanguage")
    public String targetLanguage;

    /**
     * <p>The expected width of the cropped image, in pixels. Valid values: 100 to 5000. Required when the intelligent cropping capability is selected.</p>
     * 
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("TargetWidth")
    public Integer targetWidth;

    /**
     * <p>Specifies whether to translate brand names in the image. Optional. Default value: false. This parameter helps protect brand name information from being translated.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("TranslatingBrandInTheProduct")
    public Boolean translatingBrandInTheProduct;

    /**
     * <p>The image upscaling factor. Optional. Default value: 2. Valid values: 2 to 4. Required when the high-definition upscaling capability is selected.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("UpscaleFactor")
    public Integer upscaleFactor;

    public static VisionFlowShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        VisionFlowShrinkRequest self = new VisionFlowShrinkRequest();
        return TeaModel.build(map, self);
    }

    public VisionFlowShrinkRequest setAbilityShrink(String abilityShrink) {
        this.abilityShrink = abilityShrink;
        return this;
    }
    public String getAbilityShrink() {
        return this.abilityShrink;
    }

    public VisionFlowShrinkRequest setBackGroundType(String backGroundType) {
        this.backGroundType = backGroundType;
        return this;
    }
    public String getBackGroundType() {
        return this.backGroundType;
    }

    public VisionFlowShrinkRequest setGlossary(String glossary) {
        this.glossary = glossary;
        return this;
    }
    public String getGlossary() {
        return this.glossary;
    }

    public VisionFlowShrinkRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public VisionFlowShrinkRequest setIncludingProductArea(Boolean includingProductArea) {
        this.includingProductArea = includingProductArea;
        return this;
    }
    public Boolean getIncludingProductArea() {
        return this.includingProductArea;
    }

    public VisionFlowShrinkRequest setIsFilter(Boolean isFilter) {
        this.isFilter = isFilter;
        return this;
    }
    public Boolean getIsFilter() {
        return this.isFilter;
    }

    public VisionFlowShrinkRequest setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

    public VisionFlowShrinkRequest setNonobjectDetectElementsShrink(String nonobjectDetectElementsShrink) {
        this.nonobjectDetectElementsShrink = nonobjectDetectElementsShrink;
        return this;
    }
    public String getNonobjectDetectElementsShrink() {
        return this.nonobjectDetectElementsShrink;
    }

    public VisionFlowShrinkRequest setNonobjectRemoveElementsShrink(String nonobjectRemoveElementsShrink) {
        this.nonobjectRemoveElementsShrink = nonobjectRemoveElementsShrink;
        return this;
    }
    public String getNonobjectRemoveElementsShrink() {
        return this.nonobjectRemoveElementsShrink;
    }

    public VisionFlowShrinkRequest setObjectDetectElementsShrink(String objectDetectElementsShrink) {
        this.objectDetectElementsShrink = objectDetectElementsShrink;
        return this;
    }
    public String getObjectDetectElementsShrink() {
        return this.objectDetectElementsShrink;
    }

    public VisionFlowShrinkRequest setObjectRemoveElementsShrink(String objectRemoveElementsShrink) {
        this.objectRemoveElementsShrink = objectRemoveElementsShrink;
        return this;
    }
    public String getObjectRemoveElementsShrink() {
        return this.objectRemoveElementsShrink;
    }

    public VisionFlowShrinkRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public VisionFlowShrinkRequest setTargetHeight(Integer targetHeight) {
        this.targetHeight = targetHeight;
        return this;
    }
    public Integer getTargetHeight() {
        return this.targetHeight;
    }

    public VisionFlowShrinkRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public VisionFlowShrinkRequest setTargetWidth(Integer targetWidth) {
        this.targetWidth = targetWidth;
        return this;
    }
    public Integer getTargetWidth() {
        return this.targetWidth;
    }

    public VisionFlowShrinkRequest setTranslatingBrandInTheProduct(Boolean translatingBrandInTheProduct) {
        this.translatingBrandInTheProduct = translatingBrandInTheProduct;
        return this;
    }
    public Boolean getTranslatingBrandInTheProduct() {
        return this.translatingBrandInTheProduct;
    }

    public VisionFlowShrinkRequest setUpscaleFactor(Integer upscaleFactor) {
        this.upscaleFactor = upscaleFactor;
        return this;
    }
    public Integer getUpscaleFactor() {
        return this.upscaleFactor;
    }

}

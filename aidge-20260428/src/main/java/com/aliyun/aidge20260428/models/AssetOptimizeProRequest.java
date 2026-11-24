// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class AssetOptimizeProRequest extends TeaModel {
    /**
     * <p>The list of column names to be recognized in the size chart. Optional.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Bust&quot;,&quot;Waist&quot;,&quot;Hip&quot;]</p>
     */
    @NameInMap("ColumnNameList")
    public java.util.List<String> columnNameList;

    /**
     * <p>The ID of the intervention glossary. Optional. You must create the glossary in the console and provide its ID. If this parameter is left empty, the translation results are not modified.</p>
     * 
     * <strong>example:</strong>
     * <p>glossary_1</p>
     */
    @NameInMap("Glossary")
    public String glossary;

    /**
     * <p>Specifies whether to translate the text on the main subject of the image. This helps protect embedded information such as product names from being translated. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludingProductArea")
    public Boolean includingProductArea;

    /**
     * <p>The output language format for the size chart. If this parameter is left empty, the original language is used. Set this parameter to en for English output or cn for Chinese output.</p>
     * 
     * <strong>example:</strong>
     * <p>cn</p>
     */
    @NameInMap("LanguageModel")
    public String languageModel;

    /**
     * <p>Specifies whether translation is required. Valid values: true and false. If this parameter is set to true, SourceLanguage and TargetLanguage are required.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedTrans")
    public Boolean needTrans;

    /**
     * <p>The product URL. Required. Only 1688 product links are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://detail.1688.com/offer/771024907536.html">https://detail.1688.com/offer/771024907536.html</a></p>
     */
    @NameInMap("ProductUrl")
    public String productUrl;

    /**
     * <p>The source language code. Optional. For supported language pairs, refer to the list of supported translation language pairs. Required if NeedTrans is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    /**
     * <p>The source platform. Only 1688 is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1688</p>
     */
    @NameInMap("SourcePlatform")
    public String sourcePlatform;

    /**
     * <p>The target language code. Optional. For supported language pairs, refer to the list of supported translation language pairs. Required if NeedTrans is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("TargetLanguage")
    public String targetLanguage;

    /**
     * <p>The target platform for listing. Only TEMU is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>temu</p>
     */
    @NameInMap("TargetPlatform")
    public String targetPlatform;

    /**
     * <p>The confidence threshold for size chart detection. Default value: 0.4. If this parameter is set to 0, all images are considered size charts. If this parameter is set to 1, no images are considered size charts.</p>
     * 
     * <strong>example:</strong>
     * <p>0.4</p>
     */
    @NameInMap("Threshold")
    public Double threshold;

    /**
     * <p>Specifies whether to translate the brand name in the image. Optional. Default value: false. This helps protect brand name information from being translated.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("TranslatingBrandInTheProduct")
    public Boolean translatingBrandInTheProduct;

    public static AssetOptimizeProRequest build(java.util.Map<String, ?> map) throws Exception {
        AssetOptimizeProRequest self = new AssetOptimizeProRequest();
        return TeaModel.build(map, self);
    }

    public AssetOptimizeProRequest setColumnNameList(java.util.List<String> columnNameList) {
        this.columnNameList = columnNameList;
        return this;
    }
    public java.util.List<String> getColumnNameList() {
        return this.columnNameList;
    }

    public AssetOptimizeProRequest setGlossary(String glossary) {
        this.glossary = glossary;
        return this;
    }
    public String getGlossary() {
        return this.glossary;
    }

    public AssetOptimizeProRequest setIncludingProductArea(Boolean includingProductArea) {
        this.includingProductArea = includingProductArea;
        return this;
    }
    public Boolean getIncludingProductArea() {
        return this.includingProductArea;
    }

    public AssetOptimizeProRequest setLanguageModel(String languageModel) {
        this.languageModel = languageModel;
        return this;
    }
    public String getLanguageModel() {
        return this.languageModel;
    }

    public AssetOptimizeProRequest setNeedTrans(Boolean needTrans) {
        this.needTrans = needTrans;
        return this;
    }
    public Boolean getNeedTrans() {
        return this.needTrans;
    }

    public AssetOptimizeProRequest setProductUrl(String productUrl) {
        this.productUrl = productUrl;
        return this;
    }
    public String getProductUrl() {
        return this.productUrl;
    }

    public AssetOptimizeProRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public AssetOptimizeProRequest setSourcePlatform(String sourcePlatform) {
        this.sourcePlatform = sourcePlatform;
        return this;
    }
    public String getSourcePlatform() {
        return this.sourcePlatform;
    }

    public AssetOptimizeProRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public AssetOptimizeProRequest setTargetPlatform(String targetPlatform) {
        this.targetPlatform = targetPlatform;
        return this;
    }
    public String getTargetPlatform() {
        return this.targetPlatform;
    }

    public AssetOptimizeProRequest setThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }
    public Double getThreshold() {
        return this.threshold;
    }

    public AssetOptimizeProRequest setTranslatingBrandInTheProduct(Boolean translatingBrandInTheProduct) {
        this.translatingBrandInTheProduct = translatingBrandInTheProduct;
        return this;
    }
    public Boolean getTranslatingBrandInTheProduct() {
        return this.translatingBrandInTheProduct;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class AssetOptimizeProRequest extends TeaModel {
    /**
     * <p>The list of column names to recognize in size chart images. Optional.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;胸围&quot;,&quot;腰围&quot;,&quot;臀围&quot;]</p>
     */
    @NameInMap("ColumnNameList")
    public java.util.List<String> columnNameList;

    /**
     * <p>The glossary ID. Optional. Create a glossary in the console and provide its ID. If left empty, translation results are not modified by any glossary.</p>
     * 
     * <strong>example:</strong>
     * <p>glossary_1</p>
     */
    @NameInMap("Glossary")
    public String glossary;

    /**
     * <p>Specifies whether to translate text on the product subject area of images. Setting this to false helps protect embedded information such as product names from being translated. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludingProductArea")
    public Boolean includingProductArea;

    /**
     * <p>The output language format for size chart images. If not specified, the original format is used. Set to en for English output or cn for Chinese output.</p>
     * 
     * <strong>example:</strong>
     * <p>cn</p>
     */
    @NameInMap("LanguageModel")
    public String languageModel;

    /**
     * <p>Specifies whether translation is required (true/false). If set to true, SourceLanguage and TargetLanguage are required.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedTrans")
    public Boolean needTrans;

    /**
     * <p>The product URL. This parameter is required. Only 1688 product links are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://detail.1688.com/offer/771024907536.html">https://detail.1688.com/offer/771024907536.html</a></p>
     */
    @NameInMap("ProductUrl")
    public String productUrl;

    /**
     * <p>The source language code. Optional. For supported language pairs, refer to the supported translation language list. This parameter is required if NeedTrans is set to true.</p>
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
     * <p>The target language code. Optional. For supported language pairs, refer to the supported translation language list. This parameter is required if NeedTrans is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("TargetLanguage")
    public String targetLanguage;

    /**
     * <p>The target listing platform. Only temu is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>temu</p>
     */
    @NameInMap("TargetPlatform")
    public String targetPlatform;

    /**
     * <p>The confidence threshold for size chart detection. Default value: 0.4. A value of 0 treats all images as size charts. A value of 1 treats no images as size charts.</p>
     * 
     * <strong>example:</strong>
     * <p>0.4</p>
     */
    @NameInMap("Threshold")
    public Double threshold;

    /**
     * <p>Specifies whether to translate brand names on images. Optional. Default value: false. Setting this to false helps protect brand name information from being translated.</p>
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

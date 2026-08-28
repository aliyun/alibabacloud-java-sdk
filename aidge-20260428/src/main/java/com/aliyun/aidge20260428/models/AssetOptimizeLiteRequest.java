// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class AssetOptimizeLiteRequest extends TeaModel {
    /**
     * <p>The custom glossary for term intervention.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Glossary")
    public String glossary;

    /**
     * <p>Specifies whether product area translation is included.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludingProductArea")
    public Boolean includingProductArea;

    /**
     * <p>Specifies whether translation is needed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedTrans")
    public Boolean needTrans;

    /**
     * <p>The product URL.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://detail.1688.com/offer/631960323816.html">https://detail.1688.com/offer/631960323816.html</a></p>
     */
    @NameInMap("ProductUrl")
    public String productUrl;

    /**
     * <p>The source language code, such as zh.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    /**
     * <p>The source platform, such as 1688.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1688</p>
     */
    @NameInMap("SourcePlatform")
    public String sourcePlatform;

    /**
     * <p>The target language code, such as en.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("TargetLanguage")
    public String targetLanguage;

    /**
     * <p>The target platform, such as temu.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>temu</p>
     */
    @NameInMap("TargetPlatform")
    public String targetPlatform;

    /**
     * <p>Specifies whether to translate brand names in images. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("TranslatingBrandInTheProduct")
    public Boolean translatingBrandInTheProduct;

    public static AssetOptimizeLiteRequest build(java.util.Map<String, ?> map) throws Exception {
        AssetOptimizeLiteRequest self = new AssetOptimizeLiteRequest();
        return TeaModel.build(map, self);
    }

    public AssetOptimizeLiteRequest setGlossary(String glossary) {
        this.glossary = glossary;
        return this;
    }
    public String getGlossary() {
        return this.glossary;
    }

    public AssetOptimizeLiteRequest setIncludingProductArea(Boolean includingProductArea) {
        this.includingProductArea = includingProductArea;
        return this;
    }
    public Boolean getIncludingProductArea() {
        return this.includingProductArea;
    }

    public AssetOptimizeLiteRequest setNeedTrans(Boolean needTrans) {
        this.needTrans = needTrans;
        return this;
    }
    public Boolean getNeedTrans() {
        return this.needTrans;
    }

    public AssetOptimizeLiteRequest setProductUrl(String productUrl) {
        this.productUrl = productUrl;
        return this;
    }
    public String getProductUrl() {
        return this.productUrl;
    }

    public AssetOptimizeLiteRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public AssetOptimizeLiteRequest setSourcePlatform(String sourcePlatform) {
        this.sourcePlatform = sourcePlatform;
        return this;
    }
    public String getSourcePlatform() {
        return this.sourcePlatform;
    }

    public AssetOptimizeLiteRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public AssetOptimizeLiteRequest setTargetPlatform(String targetPlatform) {
        this.targetPlatform = targetPlatform;
        return this;
    }
    public String getTargetPlatform() {
        return this.targetPlatform;
    }

    public AssetOptimizeLiteRequest setTranslatingBrandInTheProduct(Boolean translatingBrandInTheProduct) {
        this.translatingBrandInTheProduct = translatingBrandInTheProduct;
        return this;
    }
    public Boolean getTranslatingBrandInTheProduct() {
        return this.translatingBrandInTheProduct;
    }

}

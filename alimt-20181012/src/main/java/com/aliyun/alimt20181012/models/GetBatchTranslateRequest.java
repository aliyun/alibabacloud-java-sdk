// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetBatchTranslateRequest extends TeaModel {
    @NameInMap("ApiType")
    public String apiType;

    @NameInMap("FormatType")
    public String formatType;

    @NameInMap("Scene")
    public String scene;

    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    @NameInMap("SourceText")
    public String sourceText;

    @NameInMap("TargetLanguage")
    public String targetLanguage;

    public static GetBatchTranslateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBatchTranslateRequest self = new GetBatchTranslateRequest();
        return TeaModel.build(map, self);
    }

    public GetBatchTranslateRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public GetBatchTranslateRequest setFormatType(String formatType) {
        this.formatType = formatType;
        return this;
    }
    public String getFormatType() {
        return this.formatType;
    }

    public GetBatchTranslateRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public GetBatchTranslateRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public GetBatchTranslateRequest setSourceText(String sourceText) {
        this.sourceText = sourceText;
        return this;
    }
    public String getSourceText() {
        return this.sourceText;
    }

    public GetBatchTranslateRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

}

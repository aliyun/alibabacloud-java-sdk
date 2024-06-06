// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class CreateAsyncTranslateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApiType")
    public String apiType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FormatType")
    public String formatType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Scene")
    public String scene;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceText")
    public String sourceText;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetLanguage")
    public String targetLanguage;

    public static CreateAsyncTranslateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAsyncTranslateRequest self = new CreateAsyncTranslateRequest();
        return TeaModel.build(map, self);
    }

    public CreateAsyncTranslateRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public CreateAsyncTranslateRequest setFormatType(String formatType) {
        this.formatType = formatType;
        return this;
    }
    public String getFormatType() {
        return this.formatType;
    }

    public CreateAsyncTranslateRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public CreateAsyncTranslateRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public CreateAsyncTranslateRequest setSourceText(String sourceText) {
        this.sourceText = sourceText;
        return this;
    }
    public String getSourceText() {
        return this.sourceText;
    }

    public CreateAsyncTranslateRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

}

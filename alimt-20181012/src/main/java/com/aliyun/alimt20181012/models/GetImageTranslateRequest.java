// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetImageTranslateRequest extends TeaModel {
    @NameInMap("Url")
    public String url;

    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    @NameInMap("TargetLanguage")
    public String targetLanguage;

    @NameInMap("Extra")
    public String extra;

    public static GetImageTranslateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImageTranslateRequest self = new GetImageTranslateRequest();
        return TeaModel.build(map, self);
    }

    public GetImageTranslateRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public GetImageTranslateRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public GetImageTranslateRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public GetImageTranslateRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

}

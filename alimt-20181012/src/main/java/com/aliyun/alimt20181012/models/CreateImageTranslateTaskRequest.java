// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class CreateImageTranslateTaskRequest extends TeaModel {
    @NameInMap("UrlList")
    public String urlList;

    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    @NameInMap("TargetLanguage")
    public String targetLanguage;

    @NameInMap("Extra")
    public String extra;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateImageTranslateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageTranslateTaskRequest self = new CreateImageTranslateTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageTranslateTaskRequest setUrlList(String urlList) {
        this.urlList = urlList;
        return this;
    }
    public String getUrlList() {
        return this.urlList;
    }

    public CreateImageTranslateTaskRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public CreateImageTranslateTaskRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public CreateImageTranslateTaskRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

    public CreateImageTranslateTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}

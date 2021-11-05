// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class TranslateImageRequest extends TeaModel {
    @NameInMap("Ext")
    public String ext;

    @NameInMap("Field")
    public String field;

    @NameInMap("ImageBase64")
    public String imageBase64;

    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    @NameInMap("TargetLanguage")
    public String targetLanguage;

    public static TranslateImageRequest build(java.util.Map<String, ?> map) throws Exception {
        TranslateImageRequest self = new TranslateImageRequest();
        return TeaModel.build(map, self);
    }

    public TranslateImageRequest setExt(String ext) {
        this.ext = ext;
        return this;
    }
    public String getExt() {
        return this.ext;
    }

    public TranslateImageRequest setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public TranslateImageRequest setImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
        return this;
    }
    public String getImageBase64() {
        return this.imageBase64;
    }

    public TranslateImageRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public TranslateImageRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public TranslateImageRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

}

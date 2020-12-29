// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetTitleGenerateRequest extends TeaModel {
    @NameInMap("Title")
    public String title;

    @NameInMap("Language")
    public String language;

    @NameInMap("Platform")
    public String platform;

    @NameInMap("CategoryId")
    public String categoryId;

    @NameInMap("HotWords")
    public String hotWords;

    @NameInMap("Attributes")
    public String attributes;

    @NameInMap("Extra")
    public String extra;

    public static GetTitleGenerateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTitleGenerateRequest self = new GetTitleGenerateRequest();
        return TeaModel.build(map, self);
    }

    public GetTitleGenerateRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public GetTitleGenerateRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetTitleGenerateRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public GetTitleGenerateRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public GetTitleGenerateRequest setHotWords(String hotWords) {
        this.hotWords = hotWords;
        return this;
    }
    public String getHotWords() {
        return this.hotWords;
    }

    public GetTitleGenerateRequest setAttributes(String attributes) {
        this.attributes = attributes;
        return this;
    }
    public String getAttributes() {
        return this.attributes;
    }

    public GetTitleGenerateRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

}

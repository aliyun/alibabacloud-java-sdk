// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SubtitleStream extends TeaModel {
    // Index
    @NameInMap("Index")
    public Long index;

    // Language
    @NameInMap("Language")
    public String language;

    // Content
    @NameInMap("Content")
    public String content;

    public static SubtitleStream build(java.util.Map<String, ?> map) throws Exception {
        SubtitleStream self = new SubtitleStream();
        return TeaModel.build(map, self);
    }

    public SubtitleStream setIndex(Long index) {
        this.index = index;
        return this;
    }
    public Long getIndex() {
        return this.index;
    }

    public SubtitleStream setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public SubtitleStream setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}

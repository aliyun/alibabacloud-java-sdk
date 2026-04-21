// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class MedicalAnswerRaDoc extends TeaModel {
    @NameInMap("content")
    public String content;

    @NameInMap("rawUrl")
    public String rawUrl;

    @NameInMap("title")
    public String title;

    @NameInMap("type")
    public String type;

    public static MedicalAnswerRaDoc build(java.util.Map<String, ?> map) throws Exception {
        MedicalAnswerRaDoc self = new MedicalAnswerRaDoc();
        return TeaModel.build(map, self);
    }

    public MedicalAnswerRaDoc setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public MedicalAnswerRaDoc setRawUrl(String rawUrl) {
        this.rawUrl = rawUrl;
        return this;
    }
    public String getRawUrl() {
        return this.rawUrl;
    }

    public MedicalAnswerRaDoc setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public MedicalAnswerRaDoc setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

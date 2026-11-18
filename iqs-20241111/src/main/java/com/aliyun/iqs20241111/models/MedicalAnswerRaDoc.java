// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class MedicalAnswerRaDoc extends TeaModel {
    /**
     * <p>The content summary of the reference source. Summaries can be returned for medical web pages and drug instructions.</p>
     * 
     * <strong>example:</strong>
     * <p>Stomach pain can be caused by various factors, including gastrointestinal spasms, inflammation, urinary tract stones, and menstrual pain. It can be relieved by applying a warm compress to the abdomen or treated by taking pain-relieving medication</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>The URL of the reference source. This can be an empty string for sources such as papers, clinical guidelines, and books.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.example.com/article/4CD364Mm8hh.html">https://www.example.com/article/4CD364Mm8hh.html</a></p>
     */
    @NameInMap("rawUrl")
    public String rawUrl;

    /**
     * <p>The title of the reference source.</p>
     * 
     * <strong>example:</strong>
     * <p>How to quickly and easily relieve stomach pain</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>The type of the reference source, such as medical web pages, medical books, papers, or clinical guidelines.</p>
     * 
     * <strong>example:</strong>
     * <p>med_web_source</p>
     */
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

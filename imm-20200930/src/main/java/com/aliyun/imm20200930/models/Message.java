// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Message extends TeaModel {
    /**
     * <p>Assistant type.</p>
     * 
     * <strong>example:</strong>
     * <p>doc/translate</p>
     */
    @NameInMap("AssistantType")
    public String assistantType;

    /**
     * <p>The content of the question.</p>
     * 
     * <strong>example:</strong>
     * <p>Hello, which park is closest to me?</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The time when the message was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-14T10:10:52.83948013+08:00</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The dataset that the answer references to.</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The language of the answer.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-Hans</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>Indicates whether the message is a regenerated answer.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Regenerate")
    public Boolean regenerate;

    /**
     * <p>The answer.</p>
     * 
     * <strong>example:</strong>
     * <p>Hello, I\&quot;m your assistant.</p>
     */
    @NameInMap("Reply")
    public String reply;

    /**
     * <p>Rate</p>
     * 
     * <strong>example:</strong>
     * <p>0.99</p>
     */
    @NameInMap("Score")
    public Double score;

    /**
     * <p>The URI of the source file from which the answer was generated.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/sample.docx</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    /**
     * <p>The compliance check results. Valid values: pass block</p>
     * 
     * <strong>example:</strong>
     * <p>pass</p>
     */
    @NameInMap("Suggestion")
    public String suggestion;

    /**
     * <p>The tone of the answer.</p>
     * 
     * <strong>example:</strong>
     * <p>professional</p>
     */
    @NameInMap("Tone")
    public String tone;

    /**
     * <p>The topic in the question.</p>
     * 
     * <strong>example:</strong>
     * <p>The value varies based on the value of the AssistantType parameter.</p>
     */
    @NameInMap("Topic")
    public String topic;

    public static Message build(java.util.Map<String, ?> map) throws Exception {
        Message self = new Message();
        return TeaModel.build(map, self);
    }

    public Message setAssistantType(String assistantType) {
        this.assistantType = assistantType;
        return this;
    }
    public String getAssistantType() {
        return this.assistantType;
    }

    public Message setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public Message setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public Message setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public Message setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public Message setRegenerate(Boolean regenerate) {
        this.regenerate = regenerate;
        return this;
    }
    public Boolean getRegenerate() {
        return this.regenerate;
    }

    public Message setReply(String reply) {
        this.reply = reply;
        return this;
    }
    public String getReply() {
        return this.reply;
    }

    public Message setScore(Double score) {
        this.score = score;
        return this;
    }
    public Double getScore() {
        return this.score;
    }

    public Message setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public Message setSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }
    public String getSuggestion() {
        return this.suggestion;
    }

    public Message setTone(String tone) {
        this.tone = tone;
        return this;
    }
    public String getTone() {
        return this.tone;
    }

    public Message setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}

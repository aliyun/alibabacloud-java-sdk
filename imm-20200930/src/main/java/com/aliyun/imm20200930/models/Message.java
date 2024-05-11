// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Message extends TeaModel {
    @NameInMap("AssistantType")
    public String assistantType;

    @NameInMap("Content")
    public String content;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("Language")
    public String language;

    @NameInMap("Regenerate")
    public Boolean regenerate;

    @NameInMap("Reply")
    public String reply;

    @NameInMap("Score")
    public Double score;

    @NameInMap("SourceURI")
    public String sourceURI;

    @NameInMap("Suggestion")
    public String suggestion;

    @NameInMap("Tone")
    public String tone;

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

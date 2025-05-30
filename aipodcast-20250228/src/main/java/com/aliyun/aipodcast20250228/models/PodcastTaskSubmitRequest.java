// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aipodcast20250228.models;

import com.aliyun.tea.*;

public class PodcastTaskSubmitRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("counts")
    public Integer counts;

    @NameInMap("fileUrls")
    public java.util.List<String> fileUrls;

    @NameInMap("sourceLang")
    public String sourceLang;

    @NameInMap("text")
    public String text;

    @NameInMap("topic")
    public String topic;

    @NameInMap("voices")
    public java.util.List<String> voices;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-ep8ba0dr6seiddxx</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static PodcastTaskSubmitRequest build(java.util.Map<String, ?> map) throws Exception {
        PodcastTaskSubmitRequest self = new PodcastTaskSubmitRequest();
        return TeaModel.build(map, self);
    }

    public PodcastTaskSubmitRequest setCounts(Integer counts) {
        this.counts = counts;
        return this;
    }
    public Integer getCounts() {
        return this.counts;
    }

    public PodcastTaskSubmitRequest setFileUrls(java.util.List<String> fileUrls) {
        this.fileUrls = fileUrls;
        return this;
    }
    public java.util.List<String> getFileUrls() {
        return this.fileUrls;
    }

    public PodcastTaskSubmitRequest setSourceLang(String sourceLang) {
        this.sourceLang = sourceLang;
        return this;
    }
    public String getSourceLang() {
        return this.sourceLang;
    }

    public PodcastTaskSubmitRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public PodcastTaskSubmitRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public PodcastTaskSubmitRequest setVoices(java.util.List<String> voices) {
        this.voices = voices;
        return this;
    }
    public java.util.List<String> getVoices() {
        return this.voices;
    }

    public PodcastTaskSubmitRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

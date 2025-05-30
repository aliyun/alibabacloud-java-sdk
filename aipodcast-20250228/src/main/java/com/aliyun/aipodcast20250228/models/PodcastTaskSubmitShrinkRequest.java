// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aipodcast20250228.models;

import com.aliyun.tea.*;

public class PodcastTaskSubmitShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("counts")
    public Integer counts;

    @NameInMap("fileUrls")
    public String fileUrlsShrink;

    @NameInMap("sourceLang")
    public String sourceLang;

    @NameInMap("text")
    public String text;

    @NameInMap("topic")
    public String topic;

    @NameInMap("voices")
    public String voicesShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-ep8ba0dr6seiddxx</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static PodcastTaskSubmitShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PodcastTaskSubmitShrinkRequest self = new PodcastTaskSubmitShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PodcastTaskSubmitShrinkRequest setCounts(Integer counts) {
        this.counts = counts;
        return this;
    }
    public Integer getCounts() {
        return this.counts;
    }

    public PodcastTaskSubmitShrinkRequest setFileUrlsShrink(String fileUrlsShrink) {
        this.fileUrlsShrink = fileUrlsShrink;
        return this;
    }
    public String getFileUrlsShrink() {
        return this.fileUrlsShrink;
    }

    public PodcastTaskSubmitShrinkRequest setSourceLang(String sourceLang) {
        this.sourceLang = sourceLang;
        return this;
    }
    public String getSourceLang() {
        return this.sourceLang;
    }

    public PodcastTaskSubmitShrinkRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public PodcastTaskSubmitShrinkRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public PodcastTaskSubmitShrinkRequest setVoicesShrink(String voicesShrink) {
        this.voicesShrink = voicesShrink;
        return this;
    }
    public String getVoicesShrink() {
        return this.voicesShrink;
    }

    public PodcastTaskSubmitShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}

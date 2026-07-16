// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class VideoInsightsCaptionConfig extends TeaModel {
    /**
     * <p>Specifies whether to enable video captioning.</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The person reference configuration.</p>
     */
    @NameInMap("PersonReference")
    public PersonReferenceConfig personReference;

    /**
     * <p>The custom prompt for video captioning.</p>
     * 
     * <strong>example:</strong>
     * <p>请用一句话描述这个视频</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    public static VideoInsightsCaptionConfig build(java.util.Map<String, ?> map) throws Exception {
        VideoInsightsCaptionConfig self = new VideoInsightsCaptionConfig();
        return TeaModel.build(map, self);
    }

    public VideoInsightsCaptionConfig setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public VideoInsightsCaptionConfig setPersonReference(PersonReferenceConfig personReference) {
        this.personReference = personReference;
        return this;
    }
    public PersonReferenceConfig getPersonReference() {
        return this.personReference;
    }

    public VideoInsightsCaptionConfig setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class VideoInsightsCaptionConfig extends TeaModel {
    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("PersonReference")
    public PersonReferenceConfig personReference;

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

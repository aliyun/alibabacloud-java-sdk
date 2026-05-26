// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class VideoInsightsCaptionConfig extends TeaModel {
    @NameInMap("PersonReference")
    public PersonReferenceConfig personReference;

    public static VideoInsightsCaptionConfig build(java.util.Map<String, ?> map) throws Exception {
        VideoInsightsCaptionConfig self = new VideoInsightsCaptionConfig();
        return TeaModel.build(map, self);
    }

    public VideoInsightsCaptionConfig setPersonReference(PersonReferenceConfig personReference) {
        this.personReference = personReference;
        return this;
    }
    public PersonReferenceConfig getPersonReference() {
        return this.personReference;
    }

}

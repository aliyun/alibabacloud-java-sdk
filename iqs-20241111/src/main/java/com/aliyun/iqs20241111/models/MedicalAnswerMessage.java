// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class MedicalAnswerMessage extends TeaModel {
    @NameInMap("content")
    public String content;

    @NameInMap("metaData")
    public MedicalAnswerMetaData metaData;

    public static MedicalAnswerMessage build(java.util.Map<String, ?> map) throws Exception {
        MedicalAnswerMessage self = new MedicalAnswerMessage();
        return TeaModel.build(map, self);
    }

    public MedicalAnswerMessage setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public MedicalAnswerMessage setMetaData(MedicalAnswerMetaData metaData) {
        this.metaData = metaData;
        return this;
    }
    public MedicalAnswerMetaData getMetaData() {
        return this.metaData;
    }

}

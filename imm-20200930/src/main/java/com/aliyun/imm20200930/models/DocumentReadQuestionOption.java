// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DocumentReadQuestionOption extends TeaModel {
    @NameInMap("Count")
    public Integer count;

    @NameInMap("Extract")
    public Boolean extract;

    public static DocumentReadQuestionOption build(java.util.Map<String, ?> map) throws Exception {
        DocumentReadQuestionOption self = new DocumentReadQuestionOption();
        return TeaModel.build(map, self);
    }

    public DocumentReadQuestionOption setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DocumentReadQuestionOption setExtract(Boolean extract) {
        this.extract = extract;
        return this;
    }
    public Boolean getExtract() {
        return this.extract;
    }

}

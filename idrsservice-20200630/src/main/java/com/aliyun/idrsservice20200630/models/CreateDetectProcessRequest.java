// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateDetectProcessRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Draft")
    public String draft;

    @NameInMap("Content")
    public String content;

    public static CreateDetectProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDetectProcessRequest self = new CreateDetectProcessRequest();
        return TeaModel.build(map, self);
    }

    public CreateDetectProcessRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDetectProcessRequest setDraft(String draft) {
        this.draft = draft;
        return this;
    }
    public String getDraft() {
        return this.draft;
    }

    public CreateDetectProcessRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateDetectProcessRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("Draft")
    public String draft;

    @NameInMap("Name")
    public String name;

    @NameInMap("Type")
    public String type;

    public static CreateDetectProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDetectProcessRequest self = new CreateDetectProcessRequest();
        return TeaModel.build(map, self);
    }

    public CreateDetectProcessRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateDetectProcessRequest setDraft(String draft) {
        this.draft = draft;
        return this;
    }
    public String getDraft() {
        return this.draft;
    }

    public CreateDetectProcessRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDetectProcessRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

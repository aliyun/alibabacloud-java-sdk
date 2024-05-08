// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class UpdateDetectProcessRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("Draft")
    public String draft;

    /**
     * <p>ID</p>
     */
    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    public static UpdateDetectProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDetectProcessRequest self = new UpdateDetectProcessRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDetectProcessRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateDetectProcessRequest setDraft(String draft) {
        this.draft = draft;
        return this;
    }
    public String getDraft() {
        return this.draft;
    }

    public UpdateDetectProcessRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateDetectProcessRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}

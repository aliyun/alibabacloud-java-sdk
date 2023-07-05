// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreatePipelineRequest extends TeaModel {
    @NameInMap("content")
    public String content;

    @NameInMap("name")
    public String name;

    public static CreatePipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineRequest self = new CreatePipelineRequest();
        return TeaModel.build(map, self);
    }

    public CreatePipelineRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreatePipelineRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}

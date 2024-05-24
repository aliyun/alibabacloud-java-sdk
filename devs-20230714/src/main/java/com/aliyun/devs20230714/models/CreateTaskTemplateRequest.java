// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class CreateTaskTemplateRequest extends TeaModel {
    @NameInMap("body")
    public TaskTemplate body;

    public static CreateTaskTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskTemplateRequest self = new CreateTaskTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateTaskTemplateRequest setBody(TaskTemplate body) {
        this.body = body;
        return this;
    }
    public TaskTemplate getBody() {
        return this.body;
    }

}

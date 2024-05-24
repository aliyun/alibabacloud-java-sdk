// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class CreateTaskRequest extends TeaModel {
    @NameInMap("body")
    public Task body;

    public static CreateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskRequest self = new CreateTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateTaskRequest setBody(Task body) {
        this.body = body;
        return this;
    }
    public Task getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateTextTaskRequest extends TeaModel {
    @NameInMap("body")
    public TextTaskCreateCmd body;

    public static CreateTextTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTextTaskRequest self = new CreateTextTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateTextTaskRequest setBody(TextTaskCreateCmd body) {
        this.body = body;
        return this;
    }
    public TextTaskCreateCmd getBody() {
        return this.body;
    }

}

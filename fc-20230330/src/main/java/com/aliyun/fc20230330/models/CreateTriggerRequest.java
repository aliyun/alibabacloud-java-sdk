// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CreateTriggerRequest extends TeaModel {
    @NameInMap("body")
    public CreateTriggerInput body;

    public static CreateTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTriggerRequest self = new CreateTriggerRequest();
        return TeaModel.build(map, self);
    }

    public CreateTriggerRequest setBody(CreateTriggerInput body) {
        this.body = body;
        return this;
    }
    public CreateTriggerInput getBody() {
        return this.body;
    }

}

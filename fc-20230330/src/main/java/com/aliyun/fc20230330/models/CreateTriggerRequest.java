// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CreateTriggerRequest extends TeaModel {
    @NameInMap("request")
    public CreateTriggerInput request;

    public static CreateTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTriggerRequest self = new CreateTriggerRequest();
        return TeaModel.build(map, self);
    }

    public CreateTriggerRequest setRequest(CreateTriggerInput request) {
        this.request = request;
        return this;
    }
    public CreateTriggerInput getRequest() {
        return this.request;
    }

}

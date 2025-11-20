// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateModelServiceRequest extends TeaModel {
    @NameInMap("body")
    public CreateModelServiceInput body;

    public static CreateModelServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateModelServiceRequest self = new CreateModelServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateModelServiceRequest setBody(CreateModelServiceInput body) {
        this.body = body;
        return this;
    }
    public CreateModelServiceInput getBody() {
        return this.body;
    }

}

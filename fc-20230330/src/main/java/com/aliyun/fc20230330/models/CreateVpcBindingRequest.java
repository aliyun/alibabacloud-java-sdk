// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CreateVpcBindingRequest extends TeaModel {
    @NameInMap("body")
    public CreateVpcBindingInput body;

    public static CreateVpcBindingRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcBindingRequest self = new CreateVpcBindingRequest();
        return TeaModel.build(map, self);
    }

    public CreateVpcBindingRequest setBody(CreateVpcBindingInput body) {
        this.body = body;
        return this;
    }
    public CreateVpcBindingInput getBody() {
        return this.body;
    }

}

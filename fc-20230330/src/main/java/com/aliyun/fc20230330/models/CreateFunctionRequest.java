// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CreateFunctionRequest extends TeaModel {
    @NameInMap("request")
    public CreateFunctionInput request;

    public static CreateFunctionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFunctionRequest self = new CreateFunctionRequest();
        return TeaModel.build(map, self);
    }

    public CreateFunctionRequest setRequest(CreateFunctionInput request) {
        this.request = request;
        return this;
    }
    public CreateFunctionInput getRequest() {
        return this.request;
    }

}

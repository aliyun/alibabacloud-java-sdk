// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CreateFunctionRequest extends TeaModel {
    /**
     * <p>The information about function configurations.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public CreateFunctionInput body;

    public static CreateFunctionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFunctionRequest self = new CreateFunctionRequest();
        return TeaModel.build(map, self);
    }

    public CreateFunctionRequest setBody(CreateFunctionInput body) {
        this.body = body;
        return this;
    }
    public CreateFunctionInput getBody() {
        return this.body;
    }

}

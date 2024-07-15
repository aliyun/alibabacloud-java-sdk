// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class UpdateFunctionRequest extends TeaModel {
    /**
     * <p>The function information</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public UpdateFunctionInput body;

    public static UpdateFunctionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFunctionRequest self = new UpdateFunctionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFunctionRequest setBody(UpdateFunctionInput body) {
        this.body = body;
        return this;
    }
    public UpdateFunctionInput getBody() {
        return this.body;
    }

}

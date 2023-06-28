// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class UpdateFunctionRequest extends TeaModel {
    @NameInMap("request")
    public UpdateFunctionInput request;

    public static UpdateFunctionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFunctionRequest self = new UpdateFunctionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFunctionRequest setRequest(UpdateFunctionInput request) {
        this.request = request;
        return this;
    }
    public UpdateFunctionInput getRequest() {
        return this.request;
    }

}

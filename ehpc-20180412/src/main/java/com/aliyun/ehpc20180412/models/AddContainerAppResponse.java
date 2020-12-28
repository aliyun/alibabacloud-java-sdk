// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class AddContainerAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddContainerAppResponseBody body;

    public static AddContainerAppResponse build(java.util.Map<String, ?> map) throws Exception {
        AddContainerAppResponse self = new AddContainerAppResponse();
        return TeaModel.build(map, self);
    }

    public AddContainerAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddContainerAppResponse setBody(AddContainerAppResponseBody body) {
        this.body = body;
        return this;
    }
    public AddContainerAppResponseBody getBody() {
        return this.body;
    }

}

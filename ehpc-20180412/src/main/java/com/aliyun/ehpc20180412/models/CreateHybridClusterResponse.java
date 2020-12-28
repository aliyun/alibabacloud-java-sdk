// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class CreateHybridClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateHybridClusterResponseBody body;

    public static CreateHybridClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHybridClusterResponse self = new CreateHybridClusterResponse();
        return TeaModel.build(map, self);
    }

    public CreateHybridClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHybridClusterResponse setBody(CreateHybridClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHybridClusterResponseBody getBody() {
        return this.body;
    }

}

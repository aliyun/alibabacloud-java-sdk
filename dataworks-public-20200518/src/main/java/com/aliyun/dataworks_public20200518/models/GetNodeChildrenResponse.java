// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetNodeChildrenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetNodeChildrenResponseBody body;

    public static GetNodeChildrenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNodeChildrenResponse self = new GetNodeChildrenResponse();
        return TeaModel.build(map, self);
    }

    public GetNodeChildrenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNodeChildrenResponse setBody(GetNodeChildrenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNodeChildrenResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetNodeParentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetNodeParentsResponseBody body;

    public static GetNodeParentsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNodeParentsResponse self = new GetNodeParentsResponse();
        return TeaModel.build(map, self);
    }

    public GetNodeParentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNodeParentsResponse setBody(GetNodeParentsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNodeParentsResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetNodeTypeListInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetNodeTypeListInfoResponseBody body;

    public static GetNodeTypeListInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNodeTypeListInfoResponse self = new GetNodeTypeListInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetNodeTypeListInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNodeTypeListInfoResponse setBody(GetNodeTypeListInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNodeTypeListInfoResponseBody getBody() {
        return this.body;
    }

}

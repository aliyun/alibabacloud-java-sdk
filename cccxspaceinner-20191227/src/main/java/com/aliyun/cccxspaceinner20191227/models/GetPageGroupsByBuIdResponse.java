// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class GetPageGroupsByBuIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPageGroupsByBuIdResponseBody body;

    public static GetPageGroupsByBuIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPageGroupsByBuIdResponse self = new GetPageGroupsByBuIdResponse();
        return TeaModel.build(map, self);
    }

    public GetPageGroupsByBuIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPageGroupsByBuIdResponse setBody(GetPageGroupsByBuIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPageGroupsByBuIdResponseBody getBody() {
        return this.body;
    }

}

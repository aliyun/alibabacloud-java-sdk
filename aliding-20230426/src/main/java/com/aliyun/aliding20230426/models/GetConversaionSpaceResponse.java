// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetConversaionSpaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetConversaionSpaceResponseBody body;

    public static GetConversaionSpaceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConversaionSpaceResponse self = new GetConversaionSpaceResponse();
        return TeaModel.build(map, self);
    }

    public GetConversaionSpaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConversaionSpaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConversaionSpaceResponse setBody(GetConversaionSpaceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConversaionSpaceResponseBody getBody() {
        return this.body;
    }

}

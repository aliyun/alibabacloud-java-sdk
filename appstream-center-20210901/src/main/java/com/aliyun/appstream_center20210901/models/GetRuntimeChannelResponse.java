// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetRuntimeChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRuntimeChannelResponseBody body;

    public static GetRuntimeChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRuntimeChannelResponse self = new GetRuntimeChannelResponse();
        return TeaModel.build(map, self);
    }

    public GetRuntimeChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRuntimeChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRuntimeChannelResponse setBody(GetRuntimeChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRuntimeChannelResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetNodeTypeListInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetNodeTypeListInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNodeTypeListInfoResponse setBody(GetNodeTypeListInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNodeTypeListInfoResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDirectoryTreeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDirectoryTreeResponseBody body;

    public static GetDirectoryTreeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDirectoryTreeResponse self = new GetDirectoryTreeResponse();
        return TeaModel.build(map, self);
    }

    public GetDirectoryTreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDirectoryTreeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDirectoryTreeResponse setBody(GetDirectoryTreeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDirectoryTreeResponseBody getBody() {
        return this.body;
    }

}

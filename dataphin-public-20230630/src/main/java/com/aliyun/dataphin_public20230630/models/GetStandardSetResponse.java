// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetStandardSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStandardSetResponseBody body;

    public static GetStandardSetResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStandardSetResponse self = new GetStandardSetResponse();
        return TeaModel.build(map, self);
    }

    public GetStandardSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStandardSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStandardSetResponse setBody(GetStandardSetResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStandardSetResponseBody getBody() {
        return this.body;
    }

}

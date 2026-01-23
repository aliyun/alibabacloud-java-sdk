// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetStandardLookupTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStandardLookupTableResponseBody body;

    public static GetStandardLookupTableResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStandardLookupTableResponse self = new GetStandardLookupTableResponse();
        return TeaModel.build(map, self);
    }

    public GetStandardLookupTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStandardLookupTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStandardLookupTableResponse setBody(GetStandardLookupTableResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStandardLookupTableResponseBody getBody() {
        return this.body;
    }

}

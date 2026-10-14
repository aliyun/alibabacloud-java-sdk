// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetAgenticTableColumnResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgenticTableColumnResponseBody body;

    public static GetAgenticTableColumnResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgenticTableColumnResponse self = new GetAgenticTableColumnResponse();
        return TeaModel.build(map, self);
    }

    public GetAgenticTableColumnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgenticTableColumnResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgenticTableColumnResponse setBody(GetAgenticTableColumnResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgenticTableColumnResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimProjectShareModelListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetBimProjectShareModelListResponseBody body;

    public static GetBimProjectShareModelListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBimProjectShareModelListResponse self = new GetBimProjectShareModelListResponse();
        return TeaModel.build(map, self);
    }

    public GetBimProjectShareModelListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBimProjectShareModelListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBimProjectShareModelListResponse setBody(GetBimProjectShareModelListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBimProjectShareModelListResponseBody getBody() {
        return this.body;
    }

}

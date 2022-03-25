// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimProjectListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetBimProjectListResponseBody body;

    public static GetBimProjectListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBimProjectListResponse self = new GetBimProjectListResponse();
        return TeaModel.build(map, self);
    }

    public GetBimProjectListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBimProjectListResponse setBody(GetBimProjectListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBimProjectListResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetProjectWhiteListsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProjectWhiteListsResponseBody body;

    public static GetProjectWhiteListsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProjectWhiteListsResponse self = new GetProjectWhiteListsResponse();
        return TeaModel.build(map, self);
    }

    public GetProjectWhiteListsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProjectWhiteListsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProjectWhiteListsResponse setBody(GetProjectWhiteListsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProjectWhiteListsResponseBody getBody() {
        return this.body;
    }

}

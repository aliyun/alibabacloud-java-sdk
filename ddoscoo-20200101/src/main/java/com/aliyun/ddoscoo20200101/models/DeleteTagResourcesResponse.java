// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteTagResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTagResourcesResponseBody body;

    public static DeleteTagResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTagResourcesResponse self = new DeleteTagResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTagResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTagResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTagResourcesResponse setBody(DeleteTagResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTagResourcesResponseBody getBody() {
        return this.body;
    }

}

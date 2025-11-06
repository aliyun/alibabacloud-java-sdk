// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMdsCubeTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMdsCubeTemplatesResponseBody body;

    public static ListMdsCubeTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMdsCubeTemplatesResponse self = new ListMdsCubeTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListMdsCubeTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMdsCubeTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMdsCubeTemplatesResponse setBody(ListMdsCubeTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMdsCubeTemplatesResponseBody getBody() {
        return this.body;
    }

}

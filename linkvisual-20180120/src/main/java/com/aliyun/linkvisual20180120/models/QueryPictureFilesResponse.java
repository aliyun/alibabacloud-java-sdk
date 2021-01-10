// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryPictureFilesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryPictureFilesResponseBody body;

    public static QueryPictureFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPictureFilesResponse self = new QueryPictureFilesResponse();
        return TeaModel.build(map, self);
    }

    public QueryPictureFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPictureFilesResponse setBody(QueryPictureFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPictureFilesResponseBody getBody() {
        return this.body;
    }

}

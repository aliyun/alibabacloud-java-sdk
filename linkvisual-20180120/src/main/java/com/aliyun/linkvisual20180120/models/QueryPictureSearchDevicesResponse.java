// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryPictureSearchDevicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryPictureSearchDevicesResponseBody body;

    public static QueryPictureSearchDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPictureSearchDevicesResponse self = new QueryPictureSearchDevicesResponse();
        return TeaModel.build(map, self);
    }

    public QueryPictureSearchDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPictureSearchDevicesResponse setBody(QueryPictureSearchDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPictureSearchDevicesResponseBody getBody() {
        return this.body;
    }

}

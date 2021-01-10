// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePictureLifeCycleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDevicePictureLifeCycleResponseBody body;

    public static QueryDevicePictureLifeCycleResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePictureLifeCycleResponse self = new QueryDevicePictureLifeCycleResponse();
        return TeaModel.build(map, self);
    }

    public QueryDevicePictureLifeCycleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDevicePictureLifeCycleResponse setBody(QueryDevicePictureLifeCycleResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDevicePictureLifeCycleResponseBody getBody() {
        return this.body;
    }

}

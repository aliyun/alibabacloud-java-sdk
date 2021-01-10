// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePictureFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDevicePictureFileResponseBody body;

    public static QueryDevicePictureFileResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePictureFileResponse self = new QueryDevicePictureFileResponse();
        return TeaModel.build(map, self);
    }

    public QueryDevicePictureFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDevicePictureFileResponse setBody(QueryDevicePictureFileResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDevicePictureFileResponseBody getBody() {
        return this.body;
    }

}

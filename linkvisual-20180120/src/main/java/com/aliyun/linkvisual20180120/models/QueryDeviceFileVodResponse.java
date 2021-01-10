// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceFileVodResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDeviceFileVodResponseBody body;

    public static QueryDeviceFileVodResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceFileVodResponse self = new QueryDeviceFileVodResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceFileVodResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceFileVodResponse setBody(QueryDeviceFileVodResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceFileVodResponseBody getBody() {
        return this.body;
    }

}

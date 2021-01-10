// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceVodUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDeviceVodUrlResponseBody body;

    public static QueryDeviceVodUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceVodUrlResponse self = new QueryDeviceVodUrlResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceVodUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceVodUrlResponse setBody(QueryDeviceVodUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceVodUrlResponseBody getBody() {
        return this.body;
    }

}

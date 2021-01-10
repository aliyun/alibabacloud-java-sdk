// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceEventPictureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDeviceEventPictureResponseBody body;

    public static QueryDeviceEventPictureResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceEventPictureResponse self = new QueryDeviceEventPictureResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceEventPictureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceEventPictureResponse setBody(QueryDeviceEventPictureResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceEventPictureResponseBody getBody() {
        return this.body;
    }

}

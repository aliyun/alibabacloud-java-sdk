// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListConfigTrackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListConfigTrackResponseBody body;

    public static ListConfigTrackResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConfigTrackResponse self = new ListConfigTrackResponse();
        return TeaModel.build(map, self);
    }

    public ListConfigTrackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConfigTrackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListConfigTrackResponse setBody(ListConfigTrackResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConfigTrackResponseBody getBody() {
        return this.body;
    }

}

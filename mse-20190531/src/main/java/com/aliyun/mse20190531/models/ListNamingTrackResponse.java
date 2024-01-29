// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListNamingTrackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNamingTrackResponseBody body;

    public static ListNamingTrackResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNamingTrackResponse self = new ListNamingTrackResponse();
        return TeaModel.build(map, self);
    }

    public ListNamingTrackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNamingTrackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNamingTrackResponse setBody(ListNamingTrackResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNamingTrackResponseBody getBody() {
        return this.body;
    }

}

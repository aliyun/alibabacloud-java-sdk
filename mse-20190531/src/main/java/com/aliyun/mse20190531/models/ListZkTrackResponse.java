// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListZkTrackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListZkTrackResponseBody body;

    public static ListZkTrackResponse build(java.util.Map<String, ?> map) throws Exception {
        ListZkTrackResponse self = new ListZkTrackResponse();
        return TeaModel.build(map, self);
    }

    public ListZkTrackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListZkTrackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListZkTrackResponse setBody(ListZkTrackResponseBody body) {
        this.body = body;
        return this;
    }
    public ListZkTrackResponseBody getBody() {
        return this.body;
    }

}

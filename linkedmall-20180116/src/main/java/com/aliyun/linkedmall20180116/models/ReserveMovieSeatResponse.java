// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ReserveMovieSeatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReserveMovieSeatResponseBody body;

    public static ReserveMovieSeatResponse build(java.util.Map<String, ?> map) throws Exception {
        ReserveMovieSeatResponse self = new ReserveMovieSeatResponse();
        return TeaModel.build(map, self);
    }

    public ReserveMovieSeatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReserveMovieSeatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReserveMovieSeatResponse setBody(ReserveMovieSeatResponseBody body) {
        this.body = body;
        return this;
    }
    public ReserveMovieSeatResponseBody getBody() {
        return this.body;
    }

}

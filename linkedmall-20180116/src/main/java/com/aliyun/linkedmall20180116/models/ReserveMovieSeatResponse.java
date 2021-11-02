// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ReserveMovieSeatResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ReserveMovieSeatResponse setBody(ReserveMovieSeatResponseBody body) {
        this.body = body;
        return this;
    }
    public ReserveMovieSeatResponseBody getBody() {
        return this.body;
    }

}

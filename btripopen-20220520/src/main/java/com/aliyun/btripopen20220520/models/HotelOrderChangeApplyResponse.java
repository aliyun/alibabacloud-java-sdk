// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelOrderChangeApplyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HotelOrderChangeApplyResponseBody body;

    public static HotelOrderChangeApplyResponse build(java.util.Map<String, ?> map) throws Exception {
        HotelOrderChangeApplyResponse self = new HotelOrderChangeApplyResponse();
        return TeaModel.build(map, self);
    }

    public HotelOrderChangeApplyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HotelOrderChangeApplyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HotelOrderChangeApplyResponse setBody(HotelOrderChangeApplyResponseBody body) {
        this.body = body;
        return this;
    }
    public HotelOrderChangeApplyResponseBody getBody() {
        return this.body;
    }

}

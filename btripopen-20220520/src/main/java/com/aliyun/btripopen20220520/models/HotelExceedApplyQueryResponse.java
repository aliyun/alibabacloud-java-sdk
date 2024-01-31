// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelExceedApplyQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HotelExceedApplyQueryResponseBody body;

    public static HotelExceedApplyQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        HotelExceedApplyQueryResponse self = new HotelExceedApplyQueryResponse();
        return TeaModel.build(map, self);
    }

    public HotelExceedApplyQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HotelExceedApplyQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HotelExceedApplyQueryResponse setBody(HotelExceedApplyQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public HotelExceedApplyQueryResponseBody getBody() {
        return this.body;
    }

}

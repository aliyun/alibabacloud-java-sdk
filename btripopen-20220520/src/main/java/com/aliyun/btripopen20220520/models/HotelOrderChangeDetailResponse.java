// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelOrderChangeDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HotelOrderChangeDetailResponseBody body;

    public static HotelOrderChangeDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        HotelOrderChangeDetailResponse self = new HotelOrderChangeDetailResponse();
        return TeaModel.build(map, self);
    }

    public HotelOrderChangeDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HotelOrderChangeDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HotelOrderChangeDetailResponse setBody(HotelOrderChangeDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public HotelOrderChangeDetailResponseBody getBody() {
        return this.body;
    }

}

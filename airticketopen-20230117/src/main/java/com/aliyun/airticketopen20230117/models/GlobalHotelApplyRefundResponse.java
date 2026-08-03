// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class GlobalHotelApplyRefundResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GlobalHotelApplyRefundResponseBody body;

    public static GlobalHotelApplyRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        GlobalHotelApplyRefundResponse self = new GlobalHotelApplyRefundResponse();
        return TeaModel.build(map, self);
    }

    public GlobalHotelApplyRefundResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GlobalHotelApplyRefundResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GlobalHotelApplyRefundResponse setBody(GlobalHotelApplyRefundResponseBody body) {
        this.body = body;
        return this;
    }
    public GlobalHotelApplyRefundResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class CheckAndDoVoipCallForHotelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckAndDoVoipCallForHotelResponseBody body;

    public static CheckAndDoVoipCallForHotelResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckAndDoVoipCallForHotelResponse self = new CheckAndDoVoipCallForHotelResponse();
        return TeaModel.build(map, self);
    }

    public CheckAndDoVoipCallForHotelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckAndDoVoipCallForHotelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckAndDoVoipCallForHotelResponse setBody(CheckAndDoVoipCallForHotelResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckAndDoVoipCallForHotelResponseBody getBody() {
        return this.body;
    }

}

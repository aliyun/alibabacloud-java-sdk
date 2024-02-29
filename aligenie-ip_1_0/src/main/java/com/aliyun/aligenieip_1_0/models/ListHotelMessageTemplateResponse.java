// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ListHotelMessageTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHotelMessageTemplateResponseBody body;

    public static ListHotelMessageTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHotelMessageTemplateResponse self = new ListHotelMessageTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ListHotelMessageTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHotelMessageTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHotelMessageTemplateResponse setBody(ListHotelMessageTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHotelMessageTemplateResponseBody getBody() {
        return this.body;
    }

}

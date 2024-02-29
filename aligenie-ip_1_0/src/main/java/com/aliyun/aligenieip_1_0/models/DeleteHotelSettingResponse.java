// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class DeleteHotelSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHotelSettingResponseBody body;

    public static DeleteHotelSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHotelSettingResponse self = new DeleteHotelSettingResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHotelSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHotelSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHotelSettingResponse setBody(DeleteHotelSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHotelSettingResponseBody getBody() {
        return this.body;
    }

}

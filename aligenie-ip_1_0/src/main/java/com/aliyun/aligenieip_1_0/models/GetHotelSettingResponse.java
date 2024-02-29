// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHotelSettingResponseBody body;

    public static GetHotelSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHotelSettingResponse self = new GetHotelSettingResponse();
        return TeaModel.build(map, self);
    }

    public GetHotelSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHotelSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHotelSettingResponse setBody(GetHotelSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHotelSettingResponseBody getBody() {
        return this.body;
    }

}

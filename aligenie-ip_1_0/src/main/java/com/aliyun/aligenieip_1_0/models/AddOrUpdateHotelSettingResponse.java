// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class AddOrUpdateHotelSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddOrUpdateHotelSettingResponseBody body;

    public static AddOrUpdateHotelSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        AddOrUpdateHotelSettingResponse self = new AddOrUpdateHotelSettingResponse();
        return TeaModel.build(map, self);
    }

    public AddOrUpdateHotelSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddOrUpdateHotelSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddOrUpdateHotelSettingResponse setBody(AddOrUpdateHotelSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public AddOrUpdateHotelSettingResponseBody getBody() {
        return this.body;
    }

}

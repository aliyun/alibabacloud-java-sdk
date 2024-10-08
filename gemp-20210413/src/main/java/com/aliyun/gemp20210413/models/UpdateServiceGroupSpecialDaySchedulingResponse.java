// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateServiceGroupSpecialDaySchedulingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateServiceGroupSpecialDaySchedulingResponseBody body;

    public static UpdateServiceGroupSpecialDaySchedulingResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceGroupSpecialDaySchedulingResponse self = new UpdateServiceGroupSpecialDaySchedulingResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServiceGroupSpecialDaySchedulingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServiceGroupSpecialDaySchedulingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateServiceGroupSpecialDaySchedulingResponse setBody(UpdateServiceGroupSpecialDaySchedulingResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServiceGroupSpecialDaySchedulingResponseBody getBody() {
        return this.body;
    }

}

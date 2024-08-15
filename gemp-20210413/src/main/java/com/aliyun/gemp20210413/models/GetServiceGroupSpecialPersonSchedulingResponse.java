// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetServiceGroupSpecialPersonSchedulingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServiceGroupSpecialPersonSchedulingResponseBody body;

    public static GetServiceGroupSpecialPersonSchedulingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceGroupSpecialPersonSchedulingResponse self = new GetServiceGroupSpecialPersonSchedulingResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceGroupSpecialPersonSchedulingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceGroupSpecialPersonSchedulingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceGroupSpecialPersonSchedulingResponse setBody(GetServiceGroupSpecialPersonSchedulingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceGroupSpecialPersonSchedulingResponseBody getBody() {
        return this.body;
    }

}

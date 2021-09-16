// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetServiceGroupSchedulingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetServiceGroupSchedulingResponseBody body;

    public static GetServiceGroupSchedulingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceGroupSchedulingResponse self = new GetServiceGroupSchedulingResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceGroupSchedulingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceGroupSchedulingResponse setBody(GetServiceGroupSchedulingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceGroupSchedulingResponseBody getBody() {
        return this.body;
    }

}

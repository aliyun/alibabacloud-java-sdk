// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetServiceGroupSpecialPersonSchedulingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetServiceGroupSpecialPersonSchedulingResponse setBody(GetServiceGroupSpecialPersonSchedulingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceGroupSpecialPersonSchedulingResponseBody getBody() {
        return this.body;
    }

}

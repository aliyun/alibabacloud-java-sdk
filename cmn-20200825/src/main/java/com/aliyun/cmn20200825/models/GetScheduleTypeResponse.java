// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetScheduleTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetScheduleTypeResponseBody body;

    public static GetScheduleTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScheduleTypeResponse self = new GetScheduleTypeResponse();
        return TeaModel.build(map, self);
    }

    public GetScheduleTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScheduleTypeResponse setBody(GetScheduleTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScheduleTypeResponseBody getBody() {
        return this.body;
    }

}

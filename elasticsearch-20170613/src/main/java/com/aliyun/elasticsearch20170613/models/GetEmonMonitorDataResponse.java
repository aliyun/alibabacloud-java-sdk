// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetEmonMonitorDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetEmonMonitorDataResponseBody body;

    public static GetEmonMonitorDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEmonMonitorDataResponse self = new GetEmonMonitorDataResponse();
        return TeaModel.build(map, self);
    }

    public GetEmonMonitorDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEmonMonitorDataResponse setBody(GetEmonMonitorDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEmonMonitorDataResponseBody getBody() {
        return this.body;
    }

}

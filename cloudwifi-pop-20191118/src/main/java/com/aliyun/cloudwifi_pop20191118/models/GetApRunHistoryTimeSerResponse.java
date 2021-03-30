// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetApRunHistoryTimeSerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetApRunHistoryTimeSerResponseBody body;

    public static GetApRunHistoryTimeSerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApRunHistoryTimeSerResponse self = new GetApRunHistoryTimeSerResponse();
        return TeaModel.build(map, self);
    }

    public GetApRunHistoryTimeSerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApRunHistoryTimeSerResponse setBody(GetApRunHistoryTimeSerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApRunHistoryTimeSerResponseBody getBody() {
        return this.body;
    }

}

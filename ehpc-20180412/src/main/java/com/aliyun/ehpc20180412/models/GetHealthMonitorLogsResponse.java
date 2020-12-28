// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetHealthMonitorLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHealthMonitorLogsResponseBody body;

    public static GetHealthMonitorLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHealthMonitorLogsResponse self = new GetHealthMonitorLogsResponse();
        return TeaModel.build(map, self);
    }

    public GetHealthMonitorLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHealthMonitorLogsResponse setBody(GetHealthMonitorLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHealthMonitorLogsResponseBody getBody() {
        return this.body;
    }

}

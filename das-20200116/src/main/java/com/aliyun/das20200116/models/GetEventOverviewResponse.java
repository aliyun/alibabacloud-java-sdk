// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetEventOverviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetEventOverviewResponseBody body;

    public static GetEventOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEventOverviewResponse self = new GetEventOverviewResponse();
        return TeaModel.build(map, self);
    }

    public GetEventOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEventOverviewResponse setBody(GetEventOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEventOverviewResponseBody getBody() {
        return this.body;
    }

}

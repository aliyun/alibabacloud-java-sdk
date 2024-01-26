// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetSyntheticTaskMonitorsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSyntheticTaskMonitorsResponseBody body;

    public static GetSyntheticTaskMonitorsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSyntheticTaskMonitorsResponse self = new GetSyntheticTaskMonitorsResponse();
        return TeaModel.build(map, self);
    }

    public GetSyntheticTaskMonitorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSyntheticTaskMonitorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSyntheticTaskMonitorsResponse setBody(GetSyntheticTaskMonitorsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSyntheticTaskMonitorsResponseBody getBody() {
        return this.body;
    }

}

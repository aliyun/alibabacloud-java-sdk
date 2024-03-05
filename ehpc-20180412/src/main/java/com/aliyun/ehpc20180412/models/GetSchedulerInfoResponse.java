// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetSchedulerInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSchedulerInfoResponseBody body;

    public static GetSchedulerInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSchedulerInfoResponse self = new GetSchedulerInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetSchedulerInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSchedulerInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSchedulerInfoResponse setBody(GetSchedulerInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSchedulerInfoResponseBody getBody() {
        return this.body;
    }

}

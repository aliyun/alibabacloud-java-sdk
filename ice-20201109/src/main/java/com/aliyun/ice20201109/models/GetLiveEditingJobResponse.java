// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLiveEditingJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLiveEditingJobResponseBody body;

    public static GetLiveEditingJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLiveEditingJobResponse self = new GetLiveEditingJobResponse();
        return TeaModel.build(map, self);
    }

    public GetLiveEditingJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLiveEditingJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLiveEditingJobResponse setBody(GetLiveEditingJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLiveEditingJobResponseBody getBody() {
        return this.body;
    }

}

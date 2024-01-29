// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLiveRecordJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLiveRecordJobResponseBody body;

    public static GetLiveRecordJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLiveRecordJobResponse self = new GetLiveRecordJobResponse();
        return TeaModel.build(map, self);
    }

    public GetLiveRecordJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLiveRecordJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLiveRecordJobResponse setBody(GetLiveRecordJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLiveRecordJobResponseBody getBody() {
        return this.body;
    }

}

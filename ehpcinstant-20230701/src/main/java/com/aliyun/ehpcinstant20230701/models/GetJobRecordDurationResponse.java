// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class GetJobRecordDurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetJobRecordDurationResponseBody body;

    public static GetJobRecordDurationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobRecordDurationResponse self = new GetJobRecordDurationResponse();
        return TeaModel.build(map, self);
    }

    public GetJobRecordDurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobRecordDurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetJobRecordDurationResponse setBody(GetJobRecordDurationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobRecordDurationResponseBody getBody() {
        return this.body;
    }

}

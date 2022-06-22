// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelOperationLogListOpLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelOperationLogListOpLogsResponseBody body;

    public static SentinelOperationLogListOpLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelOperationLogListOpLogsResponse self = new SentinelOperationLogListOpLogsResponse();
        return TeaModel.build(map, self);
    }

    public SentinelOperationLogListOpLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelOperationLogListOpLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelOperationLogListOpLogsResponse setBody(SentinelOperationLogListOpLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelOperationLogListOpLogsResponseBody getBody() {
        return this.body;
    }

}

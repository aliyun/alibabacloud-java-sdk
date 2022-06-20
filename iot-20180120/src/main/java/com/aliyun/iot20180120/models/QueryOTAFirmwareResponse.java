// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryOTAFirmwareResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryOTAFirmwareResponseBody body;

    public static QueryOTAFirmwareResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOTAFirmwareResponse self = new QueryOTAFirmwareResponse();
        return TeaModel.build(map, self);
    }

    public QueryOTAFirmwareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOTAFirmwareResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOTAFirmwareResponse setBody(QueryOTAFirmwareResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOTAFirmwareResponseBody getBody() {
        return this.body;
    }

}

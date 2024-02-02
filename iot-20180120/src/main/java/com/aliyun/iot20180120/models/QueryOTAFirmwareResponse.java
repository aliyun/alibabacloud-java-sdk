// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryOTAFirmwareResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

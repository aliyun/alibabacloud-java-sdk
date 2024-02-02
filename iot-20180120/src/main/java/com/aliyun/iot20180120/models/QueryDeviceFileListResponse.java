// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceFileListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDeviceFileListResponseBody body;

    public static QueryDeviceFileListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceFileListResponse self = new QueryDeviceFileListResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceFileListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceFileListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDeviceFileListResponse setBody(QueryDeviceFileListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceFileListResponseBody getBody() {
        return this.body;
    }

}

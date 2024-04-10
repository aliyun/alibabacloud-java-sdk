// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListScanMaliciousFileByTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListScanMaliciousFileByTaskResponseBody body;

    public static ListScanMaliciousFileByTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScanMaliciousFileByTaskResponse self = new ListScanMaliciousFileByTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListScanMaliciousFileByTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListScanMaliciousFileByTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListScanMaliciousFileByTaskResponse setBody(ListScanMaliciousFileByTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScanMaliciousFileByTaskResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class ListScanTasksByTargetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListScanTasksByTargetResponseBody body;

    public static ListScanTasksByTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScanTasksByTargetResponse self = new ListScanTasksByTargetResponse();
        return TeaModel.build(map, self);
    }

    public ListScanTasksByTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListScanTasksByTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListScanTasksByTargetResponse setBody(ListScanTasksByTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScanTasksByTargetResponseBody getBody() {
        return this.body;
    }

}

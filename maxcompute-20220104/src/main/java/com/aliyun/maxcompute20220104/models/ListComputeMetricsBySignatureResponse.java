// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListComputeMetricsBySignatureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListComputeMetricsBySignatureResponseBody body;

    public static ListComputeMetricsBySignatureResponse build(java.util.Map<String, ?> map) throws Exception {
        ListComputeMetricsBySignatureResponse self = new ListComputeMetricsBySignatureResponse();
        return TeaModel.build(map, self);
    }

    public ListComputeMetricsBySignatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListComputeMetricsBySignatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListComputeMetricsBySignatureResponse setBody(ListComputeMetricsBySignatureResponseBody body) {
        this.body = body;
        return this;
    }
    public ListComputeMetricsBySignatureResponseBody getBody() {
        return this.body;
    }

}

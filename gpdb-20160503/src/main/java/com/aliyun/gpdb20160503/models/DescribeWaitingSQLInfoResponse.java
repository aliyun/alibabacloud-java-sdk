// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeWaitingSQLInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWaitingSQLInfoResponseBody body;

    public static DescribeWaitingSQLInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWaitingSQLInfoResponse self = new DescribeWaitingSQLInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWaitingSQLInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWaitingSQLInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWaitingSQLInfoResponse setBody(DescribeWaitingSQLInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWaitingSQLInfoResponseBody getBody() {
        return this.body;
    }

}

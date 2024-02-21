// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeCloudbenchTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudbenchTaskResponseBody body;

    public static DescribeCloudbenchTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudbenchTaskResponse self = new DescribeCloudbenchTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudbenchTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudbenchTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudbenchTaskResponse setBody(DescribeCloudbenchTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudbenchTaskResponseBody getBody() {
        return this.body;
    }

}

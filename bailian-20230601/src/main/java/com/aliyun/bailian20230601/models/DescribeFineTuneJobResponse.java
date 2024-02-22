// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class DescribeFineTuneJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFineTuneJobResponseBody body;

    public static DescribeFineTuneJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFineTuneJobResponse self = new DescribeFineTuneJobResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFineTuneJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFineTuneJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFineTuneJobResponse setBody(DescribeFineTuneJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFineTuneJobResponseBody getBody() {
        return this.body;
    }

}

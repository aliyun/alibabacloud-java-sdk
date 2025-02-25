// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeMachineSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMachineSpecResponseBody body;

    public static DescribeMachineSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMachineSpecResponse self = new DescribeMachineSpecResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMachineSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMachineSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMachineSpecResponse setBody(DescribeMachineSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMachineSpecResponseBody getBody() {
        return this.body;
    }

}

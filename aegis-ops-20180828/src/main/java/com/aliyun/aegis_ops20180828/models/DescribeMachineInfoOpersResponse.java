// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeMachineInfoOpersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMachineInfoOpersResponseBody body;

    public static DescribeMachineInfoOpersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMachineInfoOpersResponse self = new DescribeMachineInfoOpersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMachineInfoOpersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMachineInfoOpersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMachineInfoOpersResponse setBody(DescribeMachineInfoOpersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMachineInfoOpersResponseBody getBody() {
        return this.body;
    }

}

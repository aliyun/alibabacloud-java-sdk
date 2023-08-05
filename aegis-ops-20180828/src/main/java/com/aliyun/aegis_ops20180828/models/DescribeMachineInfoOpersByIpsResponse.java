// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeMachineInfoOpersByIpsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMachineInfoOpersByIpsResponseBody body;

    public static DescribeMachineInfoOpersByIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMachineInfoOpersByIpsResponse self = new DescribeMachineInfoOpersByIpsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMachineInfoOpersByIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMachineInfoOpersByIpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMachineInfoOpersByIpsResponse setBody(DescribeMachineInfoOpersByIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMachineInfoOpersByIpsResponseBody getBody() {
        return this.body;
    }

}

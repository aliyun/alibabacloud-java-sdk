// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class DescribeMobileOperatorAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMobileOperatorAttributeResponseBody body;

    public static DescribeMobileOperatorAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMobileOperatorAttributeResponse self = new DescribeMobileOperatorAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMobileOperatorAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMobileOperatorAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMobileOperatorAttributeResponse setBody(DescribeMobileOperatorAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMobileOperatorAttributeResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeFcServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFcServiceResponseBody body;

    public static DescribeFcServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFcServiceResponse self = new DescribeFcServiceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFcServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFcServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFcServiceResponse setBody(DescribeFcServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFcServiceResponseBody getBody() {
        return this.body;
    }

}

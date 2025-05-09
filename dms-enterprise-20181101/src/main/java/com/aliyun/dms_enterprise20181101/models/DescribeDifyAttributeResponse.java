// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DescribeDifyAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDifyAttributeResponseBody body;

    public static DescribeDifyAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDifyAttributeResponse self = new DescribeDifyAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDifyAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDifyAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDifyAttributeResponse setBody(DescribeDifyAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDifyAttributeResponseBody getBody() {
        return this.body;
    }

}

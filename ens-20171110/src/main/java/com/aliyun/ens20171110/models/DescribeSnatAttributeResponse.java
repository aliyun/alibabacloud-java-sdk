// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSnatAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSnatAttributeResponseBody body;

    public static DescribeSnatAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnatAttributeResponse self = new DescribeSnatAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSnatAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSnatAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSnatAttributeResponse setBody(DescribeSnatAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSnatAttributeResponseBody getBody() {
        return this.body;
    }

}

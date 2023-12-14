// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeProdCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeProdCountResponseBody body;

    public static DescribeProdCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProdCountResponse self = new DescribeProdCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProdCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProdCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProdCountResponse setBody(DescribeProdCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProdCountResponseBody getBody() {
        return this.body;
    }

}

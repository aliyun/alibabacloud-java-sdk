// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class DescribeMPCoSResourceInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMPCoSResourceInfoResponseBody body;

    public static DescribeMPCoSResourceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMPCoSResourceInfoResponse self = new DescribeMPCoSResourceInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMPCoSResourceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMPCoSResourceInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMPCoSResourceInfoResponse setBody(DescribeMPCoSResourceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMPCoSResourceInfoResponseBody getBody() {
        return this.body;
    }

}

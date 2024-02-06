// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSelfImagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSelfImagesResponseBody body;

    public static DescribeSelfImagesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSelfImagesResponse self = new DescribeSelfImagesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSelfImagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSelfImagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSelfImagesResponse setBody(DescribeSelfImagesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSelfImagesResponseBody getBody() {
        return this.body;
    }

}

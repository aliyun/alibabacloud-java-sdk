// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeFotaPendingDesktopsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFotaPendingDesktopsResponseBody body;

    public static DescribeFotaPendingDesktopsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFotaPendingDesktopsResponse self = new DescribeFotaPendingDesktopsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFotaPendingDesktopsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFotaPendingDesktopsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFotaPendingDesktopsResponse setBody(DescribeFotaPendingDesktopsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFotaPendingDesktopsResponseBody getBody() {
        return this.body;
    }

}

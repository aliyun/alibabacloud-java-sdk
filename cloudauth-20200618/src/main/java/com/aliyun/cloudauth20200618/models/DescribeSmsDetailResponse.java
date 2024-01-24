// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20200618.models;

import com.aliyun.tea.*;

public class DescribeSmsDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSmsDetailResponseBody body;

    public static DescribeSmsDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmsDetailResponse self = new DescribeSmsDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSmsDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSmsDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSmsDetailResponse setBody(DescribeSmsDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSmsDetailResponseBody getBody() {
        return this.body;
    }

}

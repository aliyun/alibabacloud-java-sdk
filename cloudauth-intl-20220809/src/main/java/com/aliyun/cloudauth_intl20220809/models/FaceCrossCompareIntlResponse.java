// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FaceCrossCompareIntlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FaceCrossCompareIntlResponseBody body;

    public static FaceCrossCompareIntlResponse build(java.util.Map<String, ?> map) throws Exception {
        FaceCrossCompareIntlResponse self = new FaceCrossCompareIntlResponse();
        return TeaModel.build(map, self);
    }

    public FaceCrossCompareIntlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FaceCrossCompareIntlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FaceCrossCompareIntlResponse setBody(FaceCrossCompareIntlResponseBody body) {
        this.body = body;
        return this;
    }
    public FaceCrossCompareIntlResponseBody getBody() {
        return this.body;
    }

}

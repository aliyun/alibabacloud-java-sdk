// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeSiteTopDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSiteTopDataResponseBody body;

    public static DescribeSiteTopDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteTopDataResponse self = new DescribeSiteTopDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSiteTopDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSiteTopDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSiteTopDataResponse setBody(DescribeSiteTopDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSiteTopDataResponseBody getBody() {
        return this.body;
    }

}

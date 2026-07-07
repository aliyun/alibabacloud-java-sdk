// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeSiteWafTopDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSiteWafTopDataResponseBody body;

    public static DescribeSiteWafTopDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteWafTopDataResponse self = new DescribeSiteWafTopDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSiteWafTopDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSiteWafTopDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSiteWafTopDataResponse setBody(DescribeSiteWafTopDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSiteWafTopDataResponseBody getBody() {
        return this.body;
    }

}

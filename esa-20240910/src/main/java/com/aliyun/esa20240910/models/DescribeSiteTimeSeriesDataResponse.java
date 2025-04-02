// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeSiteTimeSeriesDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSiteTimeSeriesDataResponseBody body;

    public static DescribeSiteTimeSeriesDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteTimeSeriesDataResponse self = new DescribeSiteTimeSeriesDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSiteTimeSeriesDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSiteTimeSeriesDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSiteTimeSeriesDataResponse setBody(DescribeSiteTimeSeriesDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSiteTimeSeriesDataResponseBody getBody() {
        return this.body;
    }

}

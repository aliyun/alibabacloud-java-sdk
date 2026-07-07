// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeSiteWafTimeSeriesDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSiteWafTimeSeriesDataResponseBody body;

    public static DescribeSiteWafTimeSeriesDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteWafTimeSeriesDataResponse self = new DescribeSiteWafTimeSeriesDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSiteWafTimeSeriesDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSiteWafTimeSeriesDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSiteWafTimeSeriesDataResponse setBody(DescribeSiteWafTimeSeriesDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSiteWafTimeSeriesDataResponseBody getBody() {
        return this.body;
    }

}

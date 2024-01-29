// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribePdnsThreatStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePdnsThreatStatisticsResponseBody body;

    public static DescribePdnsThreatStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePdnsThreatStatisticsResponse self = new DescribePdnsThreatStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePdnsThreatStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePdnsThreatStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePdnsThreatStatisticsResponse setBody(DescribePdnsThreatStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePdnsThreatStatisticsResponseBody getBody() {
        return this.body;
    }

}

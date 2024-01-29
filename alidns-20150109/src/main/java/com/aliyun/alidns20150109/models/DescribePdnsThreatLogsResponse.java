// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribePdnsThreatLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePdnsThreatLogsResponseBody body;

    public static DescribePdnsThreatLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePdnsThreatLogsResponse self = new DescribePdnsThreatLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePdnsThreatLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePdnsThreatLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePdnsThreatLogsResponse setBody(DescribePdnsThreatLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePdnsThreatLogsResponseBody getBody() {
        return this.body;
    }

}

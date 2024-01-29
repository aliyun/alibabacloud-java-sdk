// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribePdnsThreatStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePdnsThreatStatisticResponseBody body;

    public static DescribePdnsThreatStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePdnsThreatStatisticResponse self = new DescribePdnsThreatStatisticResponse();
        return TeaModel.build(map, self);
    }

    public DescribePdnsThreatStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePdnsThreatStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePdnsThreatStatisticResponse setBody(DescribePdnsThreatStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePdnsThreatStatisticResponseBody getBody() {
        return this.body;
    }

}

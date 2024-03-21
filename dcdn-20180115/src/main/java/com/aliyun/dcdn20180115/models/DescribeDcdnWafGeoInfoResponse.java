// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafGeoInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDcdnWafGeoInfoResponseBody body;

    public static DescribeDcdnWafGeoInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafGeoInfoResponse self = new DescribeDcdnWafGeoInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafGeoInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDcdnWafGeoInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDcdnWafGeoInfoResponse setBody(DescribeDcdnWafGeoInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDcdnWafGeoInfoResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainDetailDataByLayerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainDetailDataByLayerResponseBody body;

    public static DescribeDomainDetailDataByLayerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainDetailDataByLayerResponse self = new DescribeDomainDetailDataByLayerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainDetailDataByLayerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainDetailDataByLayerResponse setBody(DescribeDomainDetailDataByLayerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainDetailDataByLayerResponseBody getBody() {
        return this.body;
    }

}

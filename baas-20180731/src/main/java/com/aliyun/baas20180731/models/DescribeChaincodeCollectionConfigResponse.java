// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeChaincodeCollectionConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeChaincodeCollectionConfigResponseBody body;

    public static DescribeChaincodeCollectionConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeChaincodeCollectionConfigResponse self = new DescribeChaincodeCollectionConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeChaincodeCollectionConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeChaincodeCollectionConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeChaincodeCollectionConfigResponse setBody(DescribeChaincodeCollectionConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeChaincodeCollectionConfigResponseBody getBody() {
        return this.body;
    }

}

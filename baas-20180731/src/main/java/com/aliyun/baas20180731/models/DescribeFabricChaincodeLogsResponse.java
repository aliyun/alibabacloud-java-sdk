// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeFabricChaincodeLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFabricChaincodeLogsResponseBody body;

    public static DescribeFabricChaincodeLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricChaincodeLogsResponse self = new DescribeFabricChaincodeLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFabricChaincodeLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFabricChaincodeLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFabricChaincodeLogsResponse setBody(DescribeFabricChaincodeLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFabricChaincodeLogsResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeChaincodeDefinitionTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeChaincodeDefinitionTaskResponseBody body;

    public static DescribeChaincodeDefinitionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeChaincodeDefinitionTaskResponse self = new DescribeChaincodeDefinitionTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeChaincodeDefinitionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeChaincodeDefinitionTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeChaincodeDefinitionTaskResponse setBody(DescribeChaincodeDefinitionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeChaincodeDefinitionTaskResponseBody getBody() {
        return this.body;
    }

}

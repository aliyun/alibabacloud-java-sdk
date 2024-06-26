// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateSmartContractJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSmartContractJobResponseBody body;

    public static CreateSmartContractJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSmartContractJobResponse self = new CreateSmartContractJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateSmartContractJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSmartContractJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSmartContractJobResponse setBody(CreateSmartContractJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSmartContractJobResponseBody getBody() {
        return this.body;
    }

}

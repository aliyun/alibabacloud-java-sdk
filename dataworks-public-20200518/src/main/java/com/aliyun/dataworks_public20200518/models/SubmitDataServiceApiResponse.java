// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SubmitDataServiceApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitDataServiceApiResponseBody body;

    public static SubmitDataServiceApiResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitDataServiceApiResponse self = new SubmitDataServiceApiResponse();
        return TeaModel.build(map, self);
    }

    public SubmitDataServiceApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitDataServiceApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitDataServiceApiResponse setBody(SubmitDataServiceApiResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitDataServiceApiResponseBody getBody() {
        return this.body;
    }

}

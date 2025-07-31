// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ApplyDataServiceApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyDataServiceApiResponseBody body;

    public static ApplyDataServiceApiResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyDataServiceApiResponse self = new ApplyDataServiceApiResponse();
        return TeaModel.build(map, self);
    }

    public ApplyDataServiceApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyDataServiceApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyDataServiceApiResponse setBody(ApplyDataServiceApiResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyDataServiceApiResponseBody getBody() {
        return this.body;
    }

}

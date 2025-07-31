// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ApplyDataServiceAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyDataServiceAppResponseBody body;

    public static ApplyDataServiceAppResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyDataServiceAppResponse self = new ApplyDataServiceAppResponse();
        return TeaModel.build(map, self);
    }

    public ApplyDataServiceAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyDataServiceAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyDataServiceAppResponse setBody(ApplyDataServiceAppResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyDataServiceAppResponseBody getBody() {
        return this.body;
    }

}

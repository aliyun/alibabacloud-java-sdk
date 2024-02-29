// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataServiceApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataServiceApiResponseBody body;

    public static GetDataServiceApiResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceApiResponse self = new GetDataServiceApiResponse();
        return TeaModel.build(map, self);
    }

    public GetDataServiceApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataServiceApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataServiceApiResponse setBody(GetDataServiceApiResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataServiceApiResponseBody getBody() {
        return this.body;
    }

}

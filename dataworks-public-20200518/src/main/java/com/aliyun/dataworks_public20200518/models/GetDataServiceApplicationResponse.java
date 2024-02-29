// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataServiceApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataServiceApplicationResponseBody body;

    public static GetDataServiceApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceApplicationResponse self = new GetDataServiceApplicationResponse();
        return TeaModel.build(map, self);
    }

    public GetDataServiceApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataServiceApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataServiceApplicationResponse setBody(GetDataServiceApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataServiceApplicationResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataServiceAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataServiceAppResponseBody body;

    public static GetDataServiceAppResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceAppResponse self = new GetDataServiceAppResponse();
        return TeaModel.build(map, self);
    }

    public GetDataServiceAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataServiceAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataServiceAppResponse setBody(GetDataServiceAppResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataServiceAppResponseBody getBody() {
        return this.body;
    }

}

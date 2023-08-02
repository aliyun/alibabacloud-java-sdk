// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class GetDataServiceApiContextResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDataServiceApiContextResponseBody body;

    public static GetDataServiceApiContextResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceApiContextResponse self = new GetDataServiceApiContextResponse();
        return TeaModel.build(map, self);
    }

    public GetDataServiceApiContextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataServiceApiContextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataServiceApiContextResponse setBody(GetDataServiceApiContextResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataServiceApiContextResponseBody getBody() {
        return this.body;
    }

}

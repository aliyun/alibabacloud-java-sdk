// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataServiceApiCallTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataServiceApiCallTrendResponseBody body;

    public static GetDataServiceApiCallTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceApiCallTrendResponse self = new GetDataServiceApiCallTrendResponse();
        return TeaModel.build(map, self);
    }

    public GetDataServiceApiCallTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataServiceApiCallTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataServiceApiCallTrendResponse setBody(GetDataServiceApiCallTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataServiceApiCallTrendResponseBody getBody() {
        return this.body;
    }

}

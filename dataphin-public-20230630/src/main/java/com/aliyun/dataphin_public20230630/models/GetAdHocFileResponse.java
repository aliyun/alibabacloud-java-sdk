// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetAdHocFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAdHocFileResponseBody body;

    public static GetAdHocFileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAdHocFileResponse self = new GetAdHocFileResponse();
        return TeaModel.build(map, self);
    }

    public GetAdHocFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAdHocFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAdHocFileResponse setBody(GetAdHocFileResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAdHocFileResponseBody getBody() {
        return this.body;
    }

}

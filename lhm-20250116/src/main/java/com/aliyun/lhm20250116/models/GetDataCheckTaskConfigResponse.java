// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetDataCheckTaskConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataCheckTaskConfigResponseBody body;

    public static GetDataCheckTaskConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataCheckTaskConfigResponse self = new GetDataCheckTaskConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetDataCheckTaskConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataCheckTaskConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataCheckTaskConfigResponse setBody(GetDataCheckTaskConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataCheckTaskConfigResponseBody getBody() {
        return this.body;
    }

}

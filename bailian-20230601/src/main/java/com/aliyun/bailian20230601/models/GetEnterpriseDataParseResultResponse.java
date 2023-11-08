// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class GetEnterpriseDataParseResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetEnterpriseDataParseResultResponseBody body;

    public static GetEnterpriseDataParseResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEnterpriseDataParseResultResponse self = new GetEnterpriseDataParseResultResponse();
        return TeaModel.build(map, self);
    }

    public GetEnterpriseDataParseResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEnterpriseDataParseResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEnterpriseDataParseResultResponse setBody(GetEnterpriseDataParseResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEnterpriseDataParseResultResponseBody getBody() {
        return this.body;
    }

}

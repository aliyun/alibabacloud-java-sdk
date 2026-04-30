// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTableInstructionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTableInstructionsResponseBody body;

    public static GetTableInstructionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTableInstructionsResponse self = new GetTableInstructionsResponse();
        return TeaModel.build(map, self);
    }

    public GetTableInstructionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTableInstructionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTableInstructionsResponse setBody(GetTableInstructionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTableInstructionsResponseBody getBody() {
        return this.body;
    }

}

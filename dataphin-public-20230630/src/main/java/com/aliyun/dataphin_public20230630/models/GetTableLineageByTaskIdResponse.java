// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetTableLineageByTaskIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTableLineageByTaskIdResponseBody body;

    public static GetTableLineageByTaskIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTableLineageByTaskIdResponse self = new GetTableLineageByTaskIdResponse();
        return TeaModel.build(map, self);
    }

    public GetTableLineageByTaskIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTableLineageByTaskIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTableLineageByTaskIdResponse setBody(GetTableLineageByTaskIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTableLineageByTaskIdResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetTableColumnLineageByTaskIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTableColumnLineageByTaskIdResponseBody body;

    public static GetTableColumnLineageByTaskIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTableColumnLineageByTaskIdResponse self = new GetTableColumnLineageByTaskIdResponse();
        return TeaModel.build(map, self);
    }

    public GetTableColumnLineageByTaskIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTableColumnLineageByTaskIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTableColumnLineageByTaskIdResponse setBody(GetTableColumnLineageByTaskIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTableColumnLineageByTaskIdResponseBody getBody() {
        return this.body;
    }

}

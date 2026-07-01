// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetOperationRecordByIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOperationRecordByIdResponseBody body;

    public static GetOperationRecordByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOperationRecordByIdResponse self = new GetOperationRecordByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetOperationRecordByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOperationRecordByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOperationRecordByIdResponse setBody(GetOperationRecordByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOperationRecordByIdResponseBody getBody() {
        return this.body;
    }

}

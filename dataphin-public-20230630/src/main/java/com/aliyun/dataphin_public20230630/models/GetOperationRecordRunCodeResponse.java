// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetOperationRecordRunCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOperationRecordRunCodeResponseBody body;

    public static GetOperationRecordRunCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOperationRecordRunCodeResponse self = new GetOperationRecordRunCodeResponse();
        return TeaModel.build(map, self);
    }

    public GetOperationRecordRunCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOperationRecordRunCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOperationRecordRunCodeResponse setBody(GetOperationRecordRunCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOperationRecordRunCodeResponseBody getBody() {
        return this.body;
    }

}

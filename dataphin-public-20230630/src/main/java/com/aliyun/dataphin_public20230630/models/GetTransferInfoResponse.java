// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetTransferInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTransferInfoResponseBody body;

    public static GetTransferInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTransferInfoResponse self = new GetTransferInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetTransferInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTransferInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTransferInfoResponse setBody(GetTransferInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTransferInfoResponseBody getBody() {
        return this.body;
    }

}

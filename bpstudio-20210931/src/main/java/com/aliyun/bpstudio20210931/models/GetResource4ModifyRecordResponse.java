// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetResource4ModifyRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResource4ModifyRecordResponseBody body;

    public static GetResource4ModifyRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResource4ModifyRecordResponse self = new GetResource4ModifyRecordResponse();
        return TeaModel.build(map, self);
    }

    public GetResource4ModifyRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResource4ModifyRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResource4ModifyRecordResponse setBody(GetResource4ModifyRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResource4ModifyRecordResponseBody getBody() {
        return this.body;
    }

}

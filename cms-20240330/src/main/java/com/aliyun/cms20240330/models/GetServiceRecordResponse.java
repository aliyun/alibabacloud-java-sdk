// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetServiceRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServiceRecordResponseBody body;

    public static GetServiceRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceRecordResponse self = new GetServiceRecordResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceRecordResponse setBody(GetServiceRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceRecordResponseBody getBody() {
        return this.body;
    }

}

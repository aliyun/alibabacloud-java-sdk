// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetDataCheckTaskListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataCheckTaskListResponseBody body;

    public static GetDataCheckTaskListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataCheckTaskListResponse self = new GetDataCheckTaskListResponse();
        return TeaModel.build(map, self);
    }

    public GetDataCheckTaskListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataCheckTaskListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataCheckTaskListResponse setBody(GetDataCheckTaskListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataCheckTaskListResponseBody getBody() {
        return this.body;
    }

}

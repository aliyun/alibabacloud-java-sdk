// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetOtaTaskByTaskIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOtaTaskByTaskIdResponseBody body;

    public static GetOtaTaskByTaskIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOtaTaskByTaskIdResponse self = new GetOtaTaskByTaskIdResponse();
        return TeaModel.build(map, self);
    }

    public GetOtaTaskByTaskIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOtaTaskByTaskIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOtaTaskByTaskIdResponse setBody(GetOtaTaskByTaskIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOtaTaskByTaskIdResponseBody getBody() {
        return this.body;
    }

}

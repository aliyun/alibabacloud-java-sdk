// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.customerservice20231228.models;

import com.aliyun.tea.*;

public class GetYunQiTaskByRecordIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetYunQiTaskByRecordIdResponseBody body;

    public static GetYunQiTaskByRecordIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetYunQiTaskByRecordIdResponse self = new GetYunQiTaskByRecordIdResponse();
        return TeaModel.build(map, self);
    }

    public GetYunQiTaskByRecordIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetYunQiTaskByRecordIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetYunQiTaskByRecordIdResponse setBody(GetYunQiTaskByRecordIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetYunQiTaskByRecordIdResponseBody getBody() {
        return this.body;
    }

}

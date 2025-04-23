// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class OperateJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateJobResponseBody body;

    public static OperateJobResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateJobResponse self = new OperateJobResponse();
        return TeaModel.build(map, self);
    }

    public OperateJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateJobResponse setBody(OperateJobResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateJobResponseBody getBody() {
        return this.body;
    }

}

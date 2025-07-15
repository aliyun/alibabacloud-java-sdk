// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveMpuTaskSeiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetLiveMpuTaskSeiResponseBody body;

    public static SetLiveMpuTaskSeiResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLiveMpuTaskSeiResponse self = new SetLiveMpuTaskSeiResponse();
        return TeaModel.build(map, self);
    }

    public SetLiveMpuTaskSeiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetLiveMpuTaskSeiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetLiveMpuTaskSeiResponse setBody(SetLiveMpuTaskSeiResponseBody body) {
        this.body = body;
        return this;
    }
    public SetLiveMpuTaskSeiResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyStreamingJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyStreamingJobResponseBody body;

    public static ModifyStreamingJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyStreamingJobResponse self = new ModifyStreamingJobResponse();
        return TeaModel.build(map, self);
    }

    public ModifyStreamingJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyStreamingJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyStreamingJobResponse setBody(ModifyStreamingJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyStreamingJobResponseBody getBody() {
        return this.body;
    }

}

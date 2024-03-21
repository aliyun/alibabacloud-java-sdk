// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UploadStagingRoutineCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadStagingRoutineCodeResponseBody body;

    public static UploadStagingRoutineCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadStagingRoutineCodeResponse self = new UploadStagingRoutineCodeResponse();
        return TeaModel.build(map, self);
    }

    public UploadStagingRoutineCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadStagingRoutineCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadStagingRoutineCodeResponse setBody(UploadStagingRoutineCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadStagingRoutineCodeResponseBody getBody() {
        return this.body;
    }

}

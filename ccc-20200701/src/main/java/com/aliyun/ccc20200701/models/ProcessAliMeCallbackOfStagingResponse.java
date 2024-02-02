// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ProcessAliMeCallbackOfStagingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ProcessAliMeCallbackOfStagingResponseBody body;

    public static ProcessAliMeCallbackOfStagingResponse build(java.util.Map<String, ?> map) throws Exception {
        ProcessAliMeCallbackOfStagingResponse self = new ProcessAliMeCallbackOfStagingResponse();
        return TeaModel.build(map, self);
    }

    public ProcessAliMeCallbackOfStagingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProcessAliMeCallbackOfStagingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ProcessAliMeCallbackOfStagingResponse setBody(ProcessAliMeCallbackOfStagingResponseBody body) {
        this.body = body;
        return this;
    }
    public ProcessAliMeCallbackOfStagingResponseBody getBody() {
        return this.body;
    }

}

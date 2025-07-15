// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteRtcAsrTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRtcAsrTaskResponseBody body;

    public static DeleteRtcAsrTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRtcAsrTaskResponse self = new DeleteRtcAsrTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRtcAsrTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRtcAsrTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRtcAsrTaskResponse setBody(DeleteRtcAsrTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRtcAsrTaskResponseBody getBody() {
        return this.body;
    }

}

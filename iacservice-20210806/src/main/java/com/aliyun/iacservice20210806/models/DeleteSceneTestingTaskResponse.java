// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DeleteSceneTestingTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSceneTestingTaskResponseBody body;

    public static DeleteSceneTestingTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSceneTestingTaskResponse self = new DeleteSceneTestingTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSceneTestingTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSceneTestingTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSceneTestingTaskResponse setBody(DeleteSceneTestingTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSceneTestingTaskResponseBody getBody() {
        return this.body;
    }

}

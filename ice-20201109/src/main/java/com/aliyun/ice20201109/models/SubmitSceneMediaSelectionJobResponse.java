// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSceneMediaSelectionJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitSceneMediaSelectionJobResponseBody body;

    public static SubmitSceneMediaSelectionJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSceneMediaSelectionJobResponse self = new SubmitSceneMediaSelectionJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSceneMediaSelectionJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitSceneMediaSelectionJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitSceneMediaSelectionJobResponse setBody(SubmitSceneMediaSelectionJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitSceneMediaSelectionJobResponseBody getBody() {
        return this.body;
    }

}

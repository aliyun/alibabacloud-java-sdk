// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DeleteCloudPhoneNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCloudPhoneNodesResponseBody body;

    public static DeleteCloudPhoneNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudPhoneNodesResponse self = new DeleteCloudPhoneNodesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCloudPhoneNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCloudPhoneNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCloudPhoneNodesResponse setBody(DeleteCloudPhoneNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCloudPhoneNodesResponseBody getBody() {
        return this.body;
    }

}

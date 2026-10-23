// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RebootCloudPhoneNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RebootCloudPhoneNodesResponseBody body;

    public static RebootCloudPhoneNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        RebootCloudPhoneNodesResponse self = new RebootCloudPhoneNodesResponse();
        return TeaModel.build(map, self);
    }

    public RebootCloudPhoneNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebootCloudPhoneNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RebootCloudPhoneNodesResponse setBody(RebootCloudPhoneNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public RebootCloudPhoneNodesResponseBody getBody() {
        return this.body;
    }

}

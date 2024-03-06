// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateKmsInstanceBindVpcResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateKmsInstanceBindVpcResponseBody body;

    public static UpdateKmsInstanceBindVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateKmsInstanceBindVpcResponse self = new UpdateKmsInstanceBindVpcResponse();
        return TeaModel.build(map, self);
    }

    public UpdateKmsInstanceBindVpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateKmsInstanceBindVpcResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateKmsInstanceBindVpcResponse setBody(UpdateKmsInstanceBindVpcResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateKmsInstanceBindVpcResponseBody getBody() {
        return this.body;
    }

}

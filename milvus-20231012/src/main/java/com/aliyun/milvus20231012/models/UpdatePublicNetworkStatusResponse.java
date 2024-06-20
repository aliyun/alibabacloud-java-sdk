// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class UpdatePublicNetworkStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePublicNetworkStatusResponseBody body;

    public static UpdatePublicNetworkStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePublicNetworkStatusResponse self = new UpdatePublicNetworkStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePublicNetworkStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePublicNetworkStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePublicNetworkStatusResponse setBody(UpdatePublicNetworkStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePublicNetworkStatusResponseBody getBody() {
        return this.body;
    }

}

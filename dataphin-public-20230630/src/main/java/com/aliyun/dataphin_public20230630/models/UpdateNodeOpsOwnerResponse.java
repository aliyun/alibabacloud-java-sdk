// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class UpdateNodeOpsOwnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateNodeOpsOwnerResponseBody body;

    public static UpdateNodeOpsOwnerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodeOpsOwnerResponse self = new UpdateNodeOpsOwnerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNodeOpsOwnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNodeOpsOwnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateNodeOpsOwnerResponse setBody(UpdateNodeOpsOwnerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNodeOpsOwnerResponseBody getBody() {
        return this.body;
    }

}

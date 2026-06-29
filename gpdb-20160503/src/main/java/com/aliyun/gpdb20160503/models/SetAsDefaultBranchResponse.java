// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class SetAsDefaultBranchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetAsDefaultBranchResponseBody body;

    public static SetAsDefaultBranchResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAsDefaultBranchResponse self = new SetAsDefaultBranchResponse();
        return TeaModel.build(map, self);
    }

    public SetAsDefaultBranchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAsDefaultBranchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetAsDefaultBranchResponse setBody(SetAsDefaultBranchResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAsDefaultBranchResponseBody getBody() {
        return this.body;
    }

}

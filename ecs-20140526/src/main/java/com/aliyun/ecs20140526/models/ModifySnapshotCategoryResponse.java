// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifySnapshotCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySnapshotCategoryResponseBody body;

    public static ModifySnapshotCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySnapshotCategoryResponse self = new ModifySnapshotCategoryResponse();
        return TeaModel.build(map, self);
    }

    public ModifySnapshotCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySnapshotCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySnapshotCategoryResponse setBody(ModifySnapshotCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySnapshotCategoryResponseBody getBody() {
        return this.body;
    }

}

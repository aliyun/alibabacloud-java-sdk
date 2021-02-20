// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DeleteUserAttackSurfaceRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteUserAttackSurfaceRecordsResponseBody body;

    public static DeleteUserAttackSurfaceRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserAttackSurfaceRecordsResponse self = new DeleteUserAttackSurfaceRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserAttackSurfaceRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserAttackSurfaceRecordsResponse setBody(DeleteUserAttackSurfaceRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserAttackSurfaceRecordsResponseBody getBody() {
        return this.body;
    }

}

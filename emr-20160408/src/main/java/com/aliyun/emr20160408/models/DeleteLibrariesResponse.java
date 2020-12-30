// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DeleteLibrariesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLibrariesResponseBody body;

    public static DeleteLibrariesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLibrariesResponse self = new DeleteLibrariesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLibrariesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLibrariesResponse setBody(DeleteLibrariesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLibrariesResponseBody getBody() {
        return this.body;
    }

}

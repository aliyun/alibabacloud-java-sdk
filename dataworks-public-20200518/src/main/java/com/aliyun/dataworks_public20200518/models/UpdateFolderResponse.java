// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateFolderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateFolderResponseBody body;

    public static UpdateFolderResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFolderResponse self = new UpdateFolderResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFolderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFolderResponse setBody(UpdateFolderResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFolderResponseBody getBody() {
        return this.body;
    }

}

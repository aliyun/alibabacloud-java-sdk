// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DeleteContainerAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteContainerAppsResponseBody body;

    public static DeleteContainerAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteContainerAppsResponse self = new DeleteContainerAppsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteContainerAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteContainerAppsResponse setBody(DeleteContainerAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteContainerAppsResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDataServiceFolderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDataServiceFolderResponseBody body;

    public static CreateDataServiceFolderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataServiceFolderResponse self = new CreateDataServiceFolderResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataServiceFolderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataServiceFolderResponse setBody(CreateDataServiceFolderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataServiceFolderResponseBody getBody() {
        return this.body;
    }

}

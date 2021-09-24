// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GenerateDISyncTaskConfigForCreatingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateDISyncTaskConfigForCreatingResponseBody body;

    public static GenerateDISyncTaskConfigForCreatingResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateDISyncTaskConfigForCreatingResponse self = new GenerateDISyncTaskConfigForCreatingResponse();
        return TeaModel.build(map, self);
    }

    public GenerateDISyncTaskConfigForCreatingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateDISyncTaskConfigForCreatingResponse setBody(GenerateDISyncTaskConfigForCreatingResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateDISyncTaskConfigForCreatingResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GenerateDISyncTaskConfigForUpdatingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateDISyncTaskConfigForUpdatingResponseBody body;

    public static GenerateDISyncTaskConfigForUpdatingResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateDISyncTaskConfigForUpdatingResponse self = new GenerateDISyncTaskConfigForUpdatingResponse();
        return TeaModel.build(map, self);
    }

    public GenerateDISyncTaskConfigForUpdatingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateDISyncTaskConfigForUpdatingResponse setBody(GenerateDISyncTaskConfigForUpdatingResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateDISyncTaskConfigForUpdatingResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GenerateDISyncTaskConfigForCreatingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GenerateDISyncTaskConfigForCreatingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateDISyncTaskConfigForCreatingResponse setBody(GenerateDISyncTaskConfigForCreatingResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateDISyncTaskConfigForCreatingResponseBody getBody() {
        return this.body;
    }

}

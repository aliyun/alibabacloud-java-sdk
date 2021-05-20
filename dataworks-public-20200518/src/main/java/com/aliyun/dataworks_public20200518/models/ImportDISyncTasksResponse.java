// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ImportDISyncTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ImportDISyncTasksResponseBody body;

    public static ImportDISyncTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportDISyncTasksResponse self = new ImportDISyncTasksResponse();
        return TeaModel.build(map, self);
    }

    public ImportDISyncTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportDISyncTasksResponse setBody(ImportDISyncTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportDISyncTasksResponseBody getBody() {
        return this.body;
    }

}

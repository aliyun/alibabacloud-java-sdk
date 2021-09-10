// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ExportDISyncTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExportDISyncTasksResponseBody body;

    public static ExportDISyncTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportDISyncTasksResponse self = new ExportDISyncTasksResponse();
        return TeaModel.build(map, self);
    }

    public ExportDISyncTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportDISyncTasksResponse setBody(ExportDISyncTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportDISyncTasksResponseBody getBody() {
        return this.body;
    }

}

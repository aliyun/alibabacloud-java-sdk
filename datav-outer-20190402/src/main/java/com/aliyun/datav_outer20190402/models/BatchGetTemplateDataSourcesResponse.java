// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class BatchGetTemplateDataSourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchGetTemplateDataSourcesResponseBody body;

    public static BatchGetTemplateDataSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetTemplateDataSourcesResponse self = new BatchGetTemplateDataSourcesResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetTemplateDataSourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGetTemplateDataSourcesResponse setBody(BatchGetTemplateDataSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetTemplateDataSourcesResponseBody getBody() {
        return this.body;
    }

}

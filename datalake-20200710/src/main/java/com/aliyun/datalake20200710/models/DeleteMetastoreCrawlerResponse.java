// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DeleteMetastoreCrawlerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMetastoreCrawlerResponseBody body;

    public static DeleteMetastoreCrawlerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetastoreCrawlerResponse self = new DeleteMetastoreCrawlerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMetastoreCrawlerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMetastoreCrawlerResponse setBody(DeleteMetastoreCrawlerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMetastoreCrawlerResponseBody getBody() {
        return this.body;
    }

}

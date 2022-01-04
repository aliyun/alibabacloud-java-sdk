// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CreateMetastoreCrawlerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMetastoreCrawlerResponseBody body;

    public static CreateMetastoreCrawlerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMetastoreCrawlerResponse self = new CreateMetastoreCrawlerResponse();
        return TeaModel.build(map, self);
    }

    public CreateMetastoreCrawlerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMetastoreCrawlerResponse setBody(CreateMetastoreCrawlerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMetastoreCrawlerResponseBody getBody() {
        return this.body;
    }

}

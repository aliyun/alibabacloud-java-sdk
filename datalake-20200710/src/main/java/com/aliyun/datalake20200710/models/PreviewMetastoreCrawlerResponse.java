// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class PreviewMetastoreCrawlerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PreviewMetastoreCrawlerResponseBody body;

    public static PreviewMetastoreCrawlerResponse build(java.util.Map<String, ?> map) throws Exception {
        PreviewMetastoreCrawlerResponse self = new PreviewMetastoreCrawlerResponse();
        return TeaModel.build(map, self);
    }

    public PreviewMetastoreCrawlerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreviewMetastoreCrawlerResponse setBody(PreviewMetastoreCrawlerResponseBody body) {
        this.body = body;
        return this;
    }
    public PreviewMetastoreCrawlerResponseBody getBody() {
        return this.body;
    }

}

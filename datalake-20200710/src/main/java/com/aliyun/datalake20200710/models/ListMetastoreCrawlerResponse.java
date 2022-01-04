// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListMetastoreCrawlerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMetastoreCrawlerResponseBody body;

    public static ListMetastoreCrawlerResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMetastoreCrawlerResponse self = new ListMetastoreCrawlerResponse();
        return TeaModel.build(map, self);
    }

    public ListMetastoreCrawlerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMetastoreCrawlerResponse setBody(ListMetastoreCrawlerResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMetastoreCrawlerResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListMetastoreCrawlerCreatorsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMetastoreCrawlerCreatorsResponseBody body;

    public static ListMetastoreCrawlerCreatorsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMetastoreCrawlerCreatorsResponse self = new ListMetastoreCrawlerCreatorsResponse();
        return TeaModel.build(map, self);
    }

    public ListMetastoreCrawlerCreatorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMetastoreCrawlerCreatorsResponse setBody(ListMetastoreCrawlerCreatorsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMetastoreCrawlerCreatorsResponseBody getBody() {
        return this.body;
    }

}

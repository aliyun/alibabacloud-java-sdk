// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListPublishRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPublishRecordsResponseBody body;

    public static ListPublishRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPublishRecordsResponse self = new ListPublishRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListPublishRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPublishRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPublishRecordsResponse setBody(ListPublishRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPublishRecordsResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListLiveMessageGroupByPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLiveMessageGroupByPageResponseBody body;

    public static ListLiveMessageGroupByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLiveMessageGroupByPageResponse self = new ListLiveMessageGroupByPageResponse();
        return TeaModel.build(map, self);
    }

    public ListLiveMessageGroupByPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLiveMessageGroupByPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLiveMessageGroupByPageResponse setBody(ListLiveMessageGroupByPageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLiveMessageGroupByPageResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class ListUserProduceOperateLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserProduceOperateLogsResponseBody body;

    public static ListUserProduceOperateLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserProduceOperateLogsResponse self = new ListUserProduceOperateLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserProduceOperateLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserProduceOperateLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserProduceOperateLogsResponse setBody(ListUserProduceOperateLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserProduceOperateLogsResponseBody getBody() {
        return this.body;
    }

}

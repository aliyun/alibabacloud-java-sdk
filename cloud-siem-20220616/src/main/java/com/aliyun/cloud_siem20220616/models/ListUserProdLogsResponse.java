// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListUserProdLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserProdLogsResponseBody body;

    public static ListUserProdLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserProdLogsResponse self = new ListUserProdLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserProdLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserProdLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserProdLogsResponse setBody(ListUserProdLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserProdLogsResponseBody getBody() {
        return this.body;
    }

}

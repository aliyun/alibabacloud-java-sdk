// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListBaselineStatusesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBaselineStatusesResponseBody body;

    public static ListBaselineStatusesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBaselineStatusesResponse self = new ListBaselineStatusesResponse();
        return TeaModel.build(map, self);
    }

    public ListBaselineStatusesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBaselineStatusesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBaselineStatusesResponse setBody(ListBaselineStatusesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBaselineStatusesResponseBody getBody() {
        return this.body;
    }

}

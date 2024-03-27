// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListStandardGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListStandardGroupsResponseBody body;

    public static ListStandardGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStandardGroupsResponse self = new ListStandardGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListStandardGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStandardGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListStandardGroupsResponse setBody(ListStandardGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStandardGroupsResponseBody getBody() {
        return this.body;
    }

}

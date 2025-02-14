// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListVodPackagingGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVodPackagingGroupsResponseBody body;

    public static ListVodPackagingGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVodPackagingGroupsResponse self = new ListVodPackagingGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListVodPackagingGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVodPackagingGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVodPackagingGroupsResponse setBody(ListVodPackagingGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVodPackagingGroupsResponseBody getBody() {
        return this.body;
    }

}

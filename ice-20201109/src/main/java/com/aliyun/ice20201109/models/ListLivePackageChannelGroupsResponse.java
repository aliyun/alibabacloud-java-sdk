// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLivePackageChannelGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLivePackageChannelGroupsResponseBody body;

    public static ListLivePackageChannelGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLivePackageChannelGroupsResponse self = new ListLivePackageChannelGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListLivePackageChannelGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLivePackageChannelGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLivePackageChannelGroupsResponse setBody(ListLivePackageChannelGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLivePackageChannelGroupsResponseBody getBody() {
        return this.body;
    }

}

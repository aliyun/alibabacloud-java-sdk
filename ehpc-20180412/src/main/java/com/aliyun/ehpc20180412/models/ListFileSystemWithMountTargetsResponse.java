// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListFileSystemWithMountTargetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFileSystemWithMountTargetsResponseBody body;

    public static ListFileSystemWithMountTargetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFileSystemWithMountTargetsResponse self = new ListFileSystemWithMountTargetsResponse();
        return TeaModel.build(map, self);
    }

    public ListFileSystemWithMountTargetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFileSystemWithMountTargetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFileSystemWithMountTargetsResponse setBody(ListFileSystemWithMountTargetsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFileSystemWithMountTargetsResponseBody getBody() {
        return this.body;
    }

}

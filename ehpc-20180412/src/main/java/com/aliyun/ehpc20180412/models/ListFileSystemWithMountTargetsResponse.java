// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListFileSystemWithMountTargetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListFileSystemWithMountTargetsResponse setBody(ListFileSystemWithMountTargetsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFileSystemWithMountTargetsResponseBody getBody() {
        return this.body;
    }

}

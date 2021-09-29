// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class ListApgroupDescendantResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListApgroupDescendantResponseBody body;

    public static ListApgroupDescendantResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApgroupDescendantResponse self = new ListApgroupDescendantResponse();
        return TeaModel.build(map, self);
    }

    public ListApgroupDescendantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApgroupDescendantResponse setBody(ListApgroupDescendantResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApgroupDescendantResponseBody getBody() {
        return this.body;
    }

}

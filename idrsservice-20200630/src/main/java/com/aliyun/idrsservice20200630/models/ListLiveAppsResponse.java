// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListLiveAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLiveAppsResponseBody body;

    public static ListLiveAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLiveAppsResponse self = new ListLiveAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListLiveAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLiveAppsResponse setBody(ListLiveAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLiveAppsResponseBody getBody() {
        return this.body;
    }

}

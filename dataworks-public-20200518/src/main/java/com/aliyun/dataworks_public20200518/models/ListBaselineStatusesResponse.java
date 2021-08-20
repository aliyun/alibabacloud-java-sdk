// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListBaselineStatusesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListBaselineStatusesResponse setBody(ListBaselineStatusesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBaselineStatusesResponseBody getBody() {
        return this.body;
    }

}

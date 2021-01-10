// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ListItemActivitiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListItemActivitiesResponseBody body;

    public static ListItemActivitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListItemActivitiesResponse self = new ListItemActivitiesResponse();
        return TeaModel.build(map, self);
    }

    public ListItemActivitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListItemActivitiesResponse setBody(ListItemActivitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListItemActivitiesResponseBody getBody() {
        return this.body;
    }

}

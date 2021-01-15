// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListNotificationHistoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListNotificationHistoriesResponseBody body;

    public static ListNotificationHistoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNotificationHistoriesResponse self = new ListNotificationHistoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListNotificationHistoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNotificationHistoriesResponse setBody(ListNotificationHistoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNotificationHistoriesResponseBody getBody() {
        return this.body;
    }

}

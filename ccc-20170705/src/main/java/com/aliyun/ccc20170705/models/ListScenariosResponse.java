// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListScenariosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListScenariosResponseBody body;

    public static ListScenariosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScenariosResponse self = new ListScenariosResponse();
        return TeaModel.build(map, self);
    }

    public ListScenariosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListScenariosResponse setBody(ListScenariosResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScenariosResponseBody getBody() {
        return this.body;
    }

}

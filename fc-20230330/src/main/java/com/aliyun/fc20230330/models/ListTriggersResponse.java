// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListTriggersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTriggersOutput body;

    public static ListTriggersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTriggersResponse self = new ListTriggersResponse();
        return TeaModel.build(map, self);
    }

    public ListTriggersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTriggersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTriggersResponse setBody(ListTriggersOutput body) {
        this.body = body;
        return this;
    }
    public ListTriggersOutput getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListScenariosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListScenariosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListScenariosResponse setBody(ListScenariosResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScenariosResponseBody getBody() {
        return this.body;
    }

}

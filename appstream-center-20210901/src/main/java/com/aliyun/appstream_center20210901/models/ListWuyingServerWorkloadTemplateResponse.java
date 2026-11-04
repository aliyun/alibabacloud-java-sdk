// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListWuyingServerWorkloadTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWuyingServerWorkloadTemplateResponseBody body;

    public static ListWuyingServerWorkloadTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWuyingServerWorkloadTemplateResponse self = new ListWuyingServerWorkloadTemplateResponse();
        return TeaModel.build(map, self);
    }

    public ListWuyingServerWorkloadTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWuyingServerWorkloadTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWuyingServerWorkloadTemplateResponse setBody(ListWuyingServerWorkloadTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWuyingServerWorkloadTemplateResponseBody getBody() {
        return this.body;
    }

}

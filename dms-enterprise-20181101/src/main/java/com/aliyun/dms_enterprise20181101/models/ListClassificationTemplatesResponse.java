// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListClassificationTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClassificationTemplatesResponseBody body;

    public static ListClassificationTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClassificationTemplatesResponse self = new ListClassificationTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListClassificationTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClassificationTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClassificationTemplatesResponse setBody(ListClassificationTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClassificationTemplatesResponseBody getBody() {
        return this.body;
    }

}

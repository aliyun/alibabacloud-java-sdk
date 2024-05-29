// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class ListTextsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TextQueryResult body;

    public static ListTextsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTextsResponse self = new ListTextsResponse();
        return TeaModel.build(map, self);
    }

    public ListTextsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTextsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTextsResponse setBody(TextQueryResult body) {
        this.body = body;
        return this;
    }
    public TextQueryResult getBody() {
        return this.body;
    }

}

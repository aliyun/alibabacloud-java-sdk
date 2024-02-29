// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListTableThemeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTableThemeResponseBody body;

    public static ListTableThemeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTableThemeResponse self = new ListTableThemeResponse();
        return TeaModel.build(map, self);
    }

    public ListTableThemeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTableThemeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTableThemeResponse setBody(ListTableThemeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTableThemeResponseBody getBody() {
        return this.body;
    }

}

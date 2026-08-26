// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataAgentThemeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataAgentThemeResponseBody body;

    public static ListDataAgentThemeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataAgentThemeResponse self = new ListDataAgentThemeResponse();
        return TeaModel.build(map, self);
    }

    public ListDataAgentThemeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataAgentThemeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataAgentThemeResponse setBody(ListDataAgentThemeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataAgentThemeResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListTableThemeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListTableThemeResponse setBody(ListTableThemeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTableThemeResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class ListTemplateByIdsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTemplateByIdsResponseBody body;

    public static ListTemplateByIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateByIdsResponse self = new ListTemplateByIdsResponse();
        return TeaModel.build(map, self);
    }

    public ListTemplateByIdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTemplateByIdsResponse setBody(ListTemplateByIdsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTemplateByIdsResponseBody getBody() {
        return this.body;
    }

}

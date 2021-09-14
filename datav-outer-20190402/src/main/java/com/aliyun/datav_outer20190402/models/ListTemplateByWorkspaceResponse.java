// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class ListTemplateByWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTemplateByWorkspaceResponseBody body;

    public static ListTemplateByWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateByWorkspaceResponse self = new ListTemplateByWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public ListTemplateByWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTemplateByWorkspaceResponse setBody(ListTemplateByWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTemplateByWorkspaceResponseBody getBody() {
        return this.body;
    }

}

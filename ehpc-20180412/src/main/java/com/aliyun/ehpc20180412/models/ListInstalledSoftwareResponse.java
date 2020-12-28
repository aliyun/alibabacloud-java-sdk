// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListInstalledSoftwareResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListInstalledSoftwareResponseBody body;

    public static ListInstalledSoftwareResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstalledSoftwareResponse self = new ListInstalledSoftwareResponse();
        return TeaModel.build(map, self);
    }

    public ListInstalledSoftwareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstalledSoftwareResponse setBody(ListInstalledSoftwareResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstalledSoftwareResponseBody getBody() {
        return this.body;
    }

}

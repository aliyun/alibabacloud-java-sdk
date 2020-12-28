// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListVolumesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListVolumesResponseBody body;

    public static ListVolumesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVolumesResponse self = new ListVolumesResponse();
        return TeaModel.build(map, self);
    }

    public ListVolumesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVolumesResponse setBody(ListVolumesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVolumesResponseBody getBody() {
        return this.body;
    }

}

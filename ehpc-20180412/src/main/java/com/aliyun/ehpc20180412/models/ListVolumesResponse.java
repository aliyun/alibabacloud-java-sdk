// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListVolumesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListVolumesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVolumesResponse setBody(ListVolumesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVolumesResponseBody getBody() {
        return this.body;
    }

}

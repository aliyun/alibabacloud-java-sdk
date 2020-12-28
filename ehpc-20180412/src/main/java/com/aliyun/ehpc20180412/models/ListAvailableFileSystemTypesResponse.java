// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListAvailableFileSystemTypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAvailableFileSystemTypesResponseBody body;

    public static ListAvailableFileSystemTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableFileSystemTypesResponse self = new ListAvailableFileSystemTypesResponse();
        return TeaModel.build(map, self);
    }

    public ListAvailableFileSystemTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAvailableFileSystemTypesResponse setBody(ListAvailableFileSystemTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAvailableFileSystemTypesResponseBody getBody() {
        return this.body;
    }

}

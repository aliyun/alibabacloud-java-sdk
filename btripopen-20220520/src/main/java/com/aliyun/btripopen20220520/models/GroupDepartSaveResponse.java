// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class GroupDepartSaveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GroupDepartSaveResponseBody body;

    public static GroupDepartSaveResponse build(java.util.Map<String, ?> map) throws Exception {
        GroupDepartSaveResponse self = new GroupDepartSaveResponse();
        return TeaModel.build(map, self);
    }

    public GroupDepartSaveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GroupDepartSaveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GroupDepartSaveResponse setBody(GroupDepartSaveResponseBody body) {
        this.body = body;
        return this;
    }
    public GroupDepartSaveResponseBody getBody() {
        return this.body;
    }

}

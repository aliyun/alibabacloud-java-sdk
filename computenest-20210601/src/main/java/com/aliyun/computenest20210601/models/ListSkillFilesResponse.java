// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListSkillFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSkillFilesResponseBody body;

    public static ListSkillFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSkillFilesResponse self = new ListSkillFilesResponse();
        return TeaModel.build(map, self);
    }

    public ListSkillFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSkillFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSkillFilesResponse setBody(ListSkillFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSkillFilesResponseBody getBody() {
        return this.body;
    }

}

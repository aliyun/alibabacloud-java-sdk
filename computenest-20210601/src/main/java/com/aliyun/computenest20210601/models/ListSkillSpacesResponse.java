// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListSkillSpacesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSkillSpacesResponseBody body;

    public static ListSkillSpacesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSkillSpacesResponse self = new ListSkillSpacesResponse();
        return TeaModel.build(map, self);
    }

    public ListSkillSpacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSkillSpacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSkillSpacesResponse setBody(ListSkillSpacesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSkillSpacesResponseBody getBody() {
        return this.body;
    }

}

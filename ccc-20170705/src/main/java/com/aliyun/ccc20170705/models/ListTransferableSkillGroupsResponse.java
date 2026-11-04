// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListTransferableSkillGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTransferableSkillGroupsResponseBody body;

    public static ListTransferableSkillGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTransferableSkillGroupsResponse self = new ListTransferableSkillGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListTransferableSkillGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTransferableSkillGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTransferableSkillGroupsResponse setBody(ListTransferableSkillGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTransferableSkillGroupsResponseBody getBody() {
        return this.body;
    }

}

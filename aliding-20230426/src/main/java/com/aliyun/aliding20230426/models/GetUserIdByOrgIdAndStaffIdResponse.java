// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetUserIdByOrgIdAndStaffIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserIdByOrgIdAndStaffIdResponseBody body;

    public static GetUserIdByOrgIdAndStaffIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserIdByOrgIdAndStaffIdResponse self = new GetUserIdByOrgIdAndStaffIdResponse();
        return TeaModel.build(map, self);
    }

    public GetUserIdByOrgIdAndStaffIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserIdByOrgIdAndStaffIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserIdByOrgIdAndStaffIdResponse setBody(GetUserIdByOrgIdAndStaffIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserIdByOrgIdAndStaffIdResponseBody getBody() {
        return this.body;
    }

}

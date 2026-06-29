// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class GetOrganizationMemberSeatStatsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOrganizationMemberSeatStatsResponseBody body;

    public static GetOrganizationMemberSeatStatsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOrganizationMemberSeatStatsResponse self = new GetOrganizationMemberSeatStatsResponse();
        return TeaModel.build(map, self);
    }

    public GetOrganizationMemberSeatStatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOrganizationMemberSeatStatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOrganizationMemberSeatStatsResponse setBody(GetOrganizationMemberSeatStatsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOrganizationMemberSeatStatsResponseBody getBody() {
        return this.body;
    }

}

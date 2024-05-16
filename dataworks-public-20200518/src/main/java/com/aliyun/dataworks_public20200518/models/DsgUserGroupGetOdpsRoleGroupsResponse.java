// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgUserGroupGetOdpsRoleGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DsgUserGroupGetOdpsRoleGroupsResponseBody body;

    public static DsgUserGroupGetOdpsRoleGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DsgUserGroupGetOdpsRoleGroupsResponse self = new DsgUserGroupGetOdpsRoleGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DsgUserGroupGetOdpsRoleGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DsgUserGroupGetOdpsRoleGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DsgUserGroupGetOdpsRoleGroupsResponse setBody(DsgUserGroupGetOdpsRoleGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DsgUserGroupGetOdpsRoleGroupsResponseBody getBody() {
        return this.body;
    }

}

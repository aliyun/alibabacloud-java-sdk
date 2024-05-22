// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class GrantRoleToUsersResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static GrantRoleToUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GrantRoleToUsersResponseBody self = new GrantRoleToUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public GrantRoleToUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

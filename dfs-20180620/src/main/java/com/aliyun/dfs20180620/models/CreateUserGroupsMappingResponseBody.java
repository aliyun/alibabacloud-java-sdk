// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class CreateUserGroupsMappingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateUserGroupsMappingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUserGroupsMappingResponseBody self = new CreateUserGroupsMappingResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUserGroupsMappingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

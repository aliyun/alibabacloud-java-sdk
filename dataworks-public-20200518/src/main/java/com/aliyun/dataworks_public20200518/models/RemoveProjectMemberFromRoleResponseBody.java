// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RemoveProjectMemberFromRoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveProjectMemberFromRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveProjectMemberFromRoleResponseBody self = new RemoveProjectMemberFromRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveProjectMemberFromRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

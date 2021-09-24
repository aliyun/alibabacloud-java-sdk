// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class AddProjectMemberToRoleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AddProjectMemberToRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddProjectMemberToRoleResponse self = new AddProjectMemberToRoleResponse();
        return TeaModel.build(map, self);
    }

    public AddProjectMemberToRoleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

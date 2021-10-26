// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateFcServiceLinkedRoleResponseBody extends TeaModel {
    @NameInMap("RoleArn")
    public String roleArn;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateFcServiceLinkedRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFcServiceLinkedRoleResponseBody self = new CreateFcServiceLinkedRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFcServiceLinkedRoleResponseBody setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public CreateFcServiceLinkedRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CheckFcServiceLinkedRoleResponseBody extends TeaModel {
    @NameInMap("RoleArn")
    public String roleArn;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckFcServiceLinkedRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckFcServiceLinkedRoleResponseBody self = new CheckFcServiceLinkedRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckFcServiceLinkedRoleResponseBody setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public CheckFcServiceLinkedRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}

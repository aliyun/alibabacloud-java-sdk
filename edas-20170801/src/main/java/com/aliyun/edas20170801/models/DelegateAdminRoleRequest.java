// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DelegateAdminRoleRequest extends TeaModel {
    @NameInMap("TargetUserId")
    public String targetUserId;

    public static DelegateAdminRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        DelegateAdminRoleRequest self = new DelegateAdminRoleRequest();
        return TeaModel.build(map, self);
    }

    public DelegateAdminRoleRequest setTargetUserId(String targetUserId) {
        this.targetUserId = targetUserId;
        return this;
    }
    public String getTargetUserId() {
        return this.targetUserId;
    }

}

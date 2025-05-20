// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class BatchGrantPermissionsRequest extends TeaModel {
    @NameInMap("permissions")
    public java.util.List<Permission> permissions;

    public static BatchGrantPermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchGrantPermissionsRequest self = new BatchGrantPermissionsRequest();
        return TeaModel.build(map, self);
    }

    public BatchGrantPermissionsRequest setPermissions(java.util.List<Permission> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<Permission> getPermissions() {
        return this.permissions;
    }

}

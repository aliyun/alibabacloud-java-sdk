// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateOperationPermissionRequest extends TeaModel {
    @NameInMap("PermissionType")
    public Integer permissionType;

    @NameInMap("SwitchFrontOperaUid")
    public String switchFrontOperaUid;

    @NameInMap("Uid")
    public Long uid;

    public static UpdateOperationPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOperationPermissionRequest self = new UpdateOperationPermissionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOperationPermissionRequest setPermissionType(Integer permissionType) {
        this.permissionType = permissionType;
        return this;
    }
    public Integer getPermissionType() {
        return this.permissionType;
    }

    public UpdateOperationPermissionRequest setSwitchFrontOperaUid(String switchFrontOperaUid) {
        this.switchFrontOperaUid = switchFrontOperaUid;
        return this;
    }
    public String getSwitchFrontOperaUid() {
        return this.switchFrontOperaUid;
    }

    public UpdateOperationPermissionRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}

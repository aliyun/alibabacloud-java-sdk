// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteFaceUserGroupAndDeviceGroupRelationRequest extends TeaModel {
    @NameInMap("ControlId")
    public String controlId;

    @NameInMap("IsolationId")
    public String isolationId;

    public static DeleteFaceUserGroupAndDeviceGroupRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceUserGroupAndDeviceGroupRelationRequest self = new DeleteFaceUserGroupAndDeviceGroupRelationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFaceUserGroupAndDeviceGroupRelationRequest setControlId(String controlId) {
        this.controlId = controlId;
        return this;
    }
    public String getControlId() {
        return this.controlId;
    }

    public DeleteFaceUserGroupAndDeviceGroupRelationRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

}

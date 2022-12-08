// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdateFaceUserGroupAndDeviceGroupRelationRequest extends TeaModel {
    @NameInMap("ControlId")
    public String controlId;

    @NameInMap("IsolationId")
    public String isolationId;

    @NameInMap("Relation")
    public String relation;

    public static UpdateFaceUserGroupAndDeviceGroupRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFaceUserGroupAndDeviceGroupRelationRequest self = new UpdateFaceUserGroupAndDeviceGroupRelationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFaceUserGroupAndDeviceGroupRelationRequest setControlId(String controlId) {
        this.controlId = controlId;
        return this;
    }
    public String getControlId() {
        return this.controlId;
    }

    public UpdateFaceUserGroupAndDeviceGroupRelationRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public UpdateFaceUserGroupAndDeviceGroupRelationRequest setRelation(String relation) {
        this.relation = relation;
        return this;
    }
    public String getRelation() {
        return this.relation;
    }

}

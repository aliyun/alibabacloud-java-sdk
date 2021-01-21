// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceUserGroupAndDeviceGroupRelationRequest extends TeaModel {
    @NameInMap("IsolationId")
    @Validation(required = true)
    public String isolationId;

    @NameInMap("ControlId")
    @Validation(required = true)
    public String controlId;

    public static QueryFaceUserGroupAndDeviceGroupRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceUserGroupAndDeviceGroupRelationRequest self = new QueryFaceUserGroupAndDeviceGroupRelationRequest();
        return TeaModel.build(map, self);
    }

    public QueryFaceUserGroupAndDeviceGroupRelationRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public QueryFaceUserGroupAndDeviceGroupRelationRequest setControlId(String controlId) {
        this.controlId = controlId;
        return this;
    }
    public String getControlId() {
        return this.controlId;
    }

}

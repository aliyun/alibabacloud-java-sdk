// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceUserGroupAndDeviceGroupRelationRequest extends TeaModel {
    @NameInMap("ControlId")
    public String controlId;

    @NameInMap("IsolationId")
    public String isolationId;

    public static QueryFaceUserGroupAndDeviceGroupRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceUserGroupAndDeviceGroupRelationRequest self = new QueryFaceUserGroupAndDeviceGroupRelationRequest();
        return TeaModel.build(map, self);
    }

    public QueryFaceUserGroupAndDeviceGroupRelationRequest setControlId(String controlId) {
        this.controlId = controlId;
        return this;
    }
    public String getControlId() {
        return this.controlId;
    }

    public QueryFaceUserGroupAndDeviceGroupRelationRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

}

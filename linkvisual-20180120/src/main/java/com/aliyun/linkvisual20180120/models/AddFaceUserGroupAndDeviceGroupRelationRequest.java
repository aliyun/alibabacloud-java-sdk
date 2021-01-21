// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddFaceUserGroupAndDeviceGroupRelationRequest extends TeaModel {
    @NameInMap("IsolationId")
    @Validation(required = true)
    public String isolationId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("UserGroupId")
    @Validation(required = true)
    public String userGroupId;

    @NameInMap("DeviceGroupId")
    @Validation(required = true)
    public String deviceGroupId;

    @NameInMap("Relation")
    @Validation(required = true)
    public String relation;

    public static AddFaceUserGroupAndDeviceGroupRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFaceUserGroupAndDeviceGroupRelationRequest self = new AddFaceUserGroupAndDeviceGroupRelationRequest();
        return TeaModel.build(map, self);
    }

    public AddFaceUserGroupAndDeviceGroupRelationRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public AddFaceUserGroupAndDeviceGroupRelationRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public AddFaceUserGroupAndDeviceGroupRelationRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public AddFaceUserGroupAndDeviceGroupRelationRequest setDeviceGroupId(String deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
        return this;
    }
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

    public AddFaceUserGroupAndDeviceGroupRelationRequest setRelation(String relation) {
        this.relation = relation;
        return this;
    }
    public String getRelation() {
        return this.relation;
    }

}

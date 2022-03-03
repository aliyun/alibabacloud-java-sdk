// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateDeviceGroupRequest extends TeaModel {
    @NameInMap("GroupDesc")
    public String groupDesc;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("GroupType")
    public String groupType;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static UpdateDeviceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceGroupRequest self = new UpdateDeviceGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceGroupRequest setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
        return this;
    }
    public String getGroupDesc() {
        return this.groupDesc;
    }

    public UpdateDeviceGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateDeviceGroupRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public UpdateDeviceGroupRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}

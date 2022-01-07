// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateDeviceGroupRequest extends TeaModel {
    @NameInMap("GroupDesc")
    public String groupDesc;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("SuperGroupId")
    public String superGroupId;

    public static CreateDeviceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceGroupRequest self = new CreateDeviceGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeviceGroupRequest setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
        return this;
    }
    public String getGroupDesc() {
        return this.groupDesc;
    }

    public CreateDeviceGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateDeviceGroupRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateDeviceGroupRequest setSuperGroupId(String superGroupId) {
        this.superGroupId = superGroupId;
        return this;
    }
    public String getSuperGroupId() {
        return this.superGroupId;
    }

}

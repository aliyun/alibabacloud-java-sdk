// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteDeviceGroupRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static DeleteDeviceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceGroupRequest self = new DeleteDeviceGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DeleteDeviceGroupRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}

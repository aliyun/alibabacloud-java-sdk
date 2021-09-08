// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateConsumerGroupRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("NewGroupName")
    public String newGroupName;

    @NameInMap("GroupId")
    public String groupId;

    public static UpdateConsumerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConsumerGroupRequest self = new UpdateConsumerGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConsumerGroupRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateConsumerGroupRequest setNewGroupName(String newGroupName) {
        this.newGroupName = newGroupName;
        return this;
    }
    public String getNewGroupName() {
        return this.newGroupName;
    }

    public UpdateConsumerGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}

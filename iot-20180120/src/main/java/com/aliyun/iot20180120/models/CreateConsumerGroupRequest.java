// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateConsumerGroupRequest extends TeaModel {
    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static CreateConsumerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConsumerGroupRequest self = new CreateConsumerGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateConsumerGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateConsumerGroupRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}

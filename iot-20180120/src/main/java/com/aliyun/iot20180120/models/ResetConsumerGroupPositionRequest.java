// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ResetConsumerGroupPositionRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static ResetConsumerGroupPositionRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetConsumerGroupPositionRequest self = new ResetConsumerGroupPositionRequest();
        return TeaModel.build(map, self);
    }

    public ResetConsumerGroupPositionRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ResetConsumerGroupPositionRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}

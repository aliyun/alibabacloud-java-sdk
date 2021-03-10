// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryConsumerGroupStatusRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("GroupId")
    @Validation(required = true)
    public String groupId;

    public static QueryConsumerGroupStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryConsumerGroupStatusRequest self = new QueryConsumerGroupStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryConsumerGroupStatusRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryConsumerGroupStatusRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryConsumerGroupStatusRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static QueryConsumerGroupStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryConsumerGroupStatusRequest self = new QueryConsumerGroupStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryConsumerGroupStatusRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public QueryConsumerGroupStatusRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}

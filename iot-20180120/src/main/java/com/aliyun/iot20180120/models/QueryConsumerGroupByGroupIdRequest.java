// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryConsumerGroupByGroupIdRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static QueryConsumerGroupByGroupIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryConsumerGroupByGroupIdRequest self = new QueryConsumerGroupByGroupIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryConsumerGroupByGroupIdRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public QueryConsumerGroupByGroupIdRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}

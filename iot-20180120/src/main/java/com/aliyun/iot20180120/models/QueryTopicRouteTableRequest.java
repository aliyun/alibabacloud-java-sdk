// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryTopicRouteTableRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("Topic")
    @Validation(required = true)
    public String topic;

    public static QueryTopicRouteTableRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTopicRouteTableRequest self = new QueryTopicRouteTableRequest();
        return TeaModel.build(map, self);
    }

    public QueryTopicRouteTableRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryTopicRouteTableRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}

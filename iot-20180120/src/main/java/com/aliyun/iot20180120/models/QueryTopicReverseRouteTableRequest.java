// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryTopicReverseRouteTableRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Topic")
    @Validation(required = true)
    public String topic;

    public static QueryTopicReverseRouteTableRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTopicReverseRouteTableRequest self = new QueryTopicReverseRouteTableRequest();
        return TeaModel.build(map, self);
    }

    public QueryTopicReverseRouteTableRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryTopicReverseRouteTableRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryTopicReverseRouteTableRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}

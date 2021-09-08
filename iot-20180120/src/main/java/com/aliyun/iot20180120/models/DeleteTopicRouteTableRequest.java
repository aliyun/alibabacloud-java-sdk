// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteTopicRouteTableRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("DstTopic")
    @Validation(required = true)
    public java.util.List<String> dstTopic;

    @NameInMap("SrcTopic")
    @Validation(required = true)
    public String srcTopic;

    public static DeleteTopicRouteTableRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTopicRouteTableRequest self = new DeleteTopicRouteTableRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTopicRouteTableRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public DeleteTopicRouteTableRequest setDstTopic(java.util.List<String> dstTopic) {
        this.dstTopic = dstTopic;
        return this;
    }
    public java.util.List<String> getDstTopic() {
        return this.dstTopic;
    }

    public DeleteTopicRouteTableRequest setSrcTopic(String srcTopic) {
        this.srcTopic = srcTopic;
        return this;
    }
    public String getSrcTopic() {
        return this.srcTopic;
    }

}

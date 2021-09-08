// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateTopicRouteTableRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("DstTopic")
    @Validation(required = true)
    public java.util.List<String> dstTopic;

    @NameInMap("SrcTopic")
    @Validation(required = true)
    public String srcTopic;

    public static CreateTopicRouteTableRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTopicRouteTableRequest self = new CreateTopicRouteTableRequest();
        return TeaModel.build(map, self);
    }

    public CreateTopicRouteTableRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateTopicRouteTableRequest setDstTopic(java.util.List<String> dstTopic) {
        this.dstTopic = dstTopic;
        return this;
    }
    public java.util.List<String> getDstTopic() {
        return this.dstTopic;
    }

    public CreateTopicRouteTableRequest setSrcTopic(String srcTopic) {
        this.srcTopic = srcTopic;
        return this;
    }
    public String getSrcTopic() {
        return this.srcTopic;
    }

}

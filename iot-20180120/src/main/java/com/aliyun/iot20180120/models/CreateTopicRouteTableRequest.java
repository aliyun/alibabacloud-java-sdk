// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateTopicRouteTableRequest extends TeaModel {
    @NameInMap("DstTopic")
    public java.util.List<String> dstTopic;

    /**
     * <p>The ID of the instance. You can view the instance **ID** on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>*   If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</p>
     * <p>>*   If your instance has no **Overview** page or ID, you do not need to set this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The source topic. Example: `SrcTopic=/x7aWKW9 ****** /testDataToDataHub/user/update`.</p>
     */
    @NameInMap("SrcTopic")
    public String srcTopic;

    public static CreateTopicRouteTableRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTopicRouteTableRequest self = new CreateTopicRouteTableRequest();
        return TeaModel.build(map, self);
    }

    public CreateTopicRouteTableRequest setDstTopic(java.util.List<String> dstTopic) {
        this.dstTopic = dstTopic;
        return this;
    }
    public java.util.List<String> getDstTopic() {
        return this.dstTopic;
    }

    public CreateTopicRouteTableRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateTopicRouteTableRequest setSrcTopic(String srcTopic) {
        this.srcTopic = srcTopic;
        return this;
    }
    public String getSrcTopic() {
        return this.srcTopic;
    }

}

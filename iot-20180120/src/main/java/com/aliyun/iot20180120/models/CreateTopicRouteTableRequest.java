// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateTopicRouteTableRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DstTopic")
    public java.util.List<String> dstTopic;

    /**
     * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
     * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-cn-0pp1n8t****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The source topic. Example: <code>SrcTopic=/x7aWKW9 ****** /testDataToDataHub/user/update</code>.</p>
     * <p>This parameter is required.</p>
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

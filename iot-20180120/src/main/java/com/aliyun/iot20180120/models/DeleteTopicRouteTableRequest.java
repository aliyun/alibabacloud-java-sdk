// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteTopicRouteTableRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("DstTopic")
    public java.util.List<String> dstTopic;

    @NameInMap("SrcTopic")
    public String srcTopic;

    public static DeleteTopicRouteTableRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTopicRouteTableRequest self = new DeleteTopicRouteTableRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTopicRouteTableRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public DeleteTopicRouteTableRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
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

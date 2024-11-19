// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryTopicReverseRouteTableRequest extends TeaModel {
    /**
     * <p>The region where your devices reside. The region you specify must match the region that is specified in the console. Example: cn-shanghai.</p>
     * <blockquote>
     * <p> This parameter is no longer used as an operation-specific request parameter. It is included in common request parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>iot-cn-0pp1n8t****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The destination topic that receives messages.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Topic")
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

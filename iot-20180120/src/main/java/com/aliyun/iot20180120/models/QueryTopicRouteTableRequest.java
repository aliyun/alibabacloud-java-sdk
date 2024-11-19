// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryTopicRouteTableRequest extends TeaModel {
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
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The source topic that publishes messages.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/x7aWKW94bb8/testDataToDataHub/user/update</p>
     */
    @NameInMap("Topic")
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

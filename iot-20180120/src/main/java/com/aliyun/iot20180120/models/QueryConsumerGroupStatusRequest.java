// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryConsumerGroupStatusRequest extends TeaModel {
    /**
     * <p>The ID of the consumer group. After you call the [CreateConsumerGroup](~~170388~~) operation to create a consumer group, the consumer group ID is returned. You can call the [QueryConsumerGroupList](~~170419~~) operation to query the consumer group ID by group name. You can also go to the IoT Platform console,and choose **Rules** > **Server-side Subscription** > **Consumer Groups** to view the consumer group ID.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

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

    public static QueryConsumerGroupStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryConsumerGroupStatusRequest self = new QueryConsumerGroupStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryConsumerGroupStatusRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public QueryConsumerGroupStatusRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}

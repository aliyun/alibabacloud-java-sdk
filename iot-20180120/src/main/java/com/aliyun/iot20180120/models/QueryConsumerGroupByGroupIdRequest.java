// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryConsumerGroupByGroupIdRequest extends TeaModel {
    /**
     * <p>The ID of the consumer group. After you call the <a href="https://help.aliyun.com/document_detail/170388.html">CreateConsumerGroup</a> operation to create a consumer group, the consumer group ID is returned. You can call the <a href="https://help.aliyun.com/document_detail/170419.html">QueryConsumerGroupList</a> operation to query the consumer group ID by group name. You can also go to the IoT Platform console,and choose <strong>Rules</strong> &gt; <strong>Server-side Subscription</strong> &gt; <strong>Consumer Groups</strong> to view the consumer group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nJRaJPn5U1JITGf******</p>
     */
    @NameInMap("GroupId")
    public String groupId;

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

    public static QueryConsumerGroupByGroupIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryConsumerGroupByGroupIdRequest self = new QueryConsumerGroupByGroupIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryConsumerGroupByGroupIdRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public QueryConsumerGroupByGroupIdRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}

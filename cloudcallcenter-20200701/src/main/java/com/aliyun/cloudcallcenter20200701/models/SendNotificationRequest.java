// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class SendNotificationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{   &quot;eventType&quot;: &quot;VnRecordingReady&quot;,   &quot;eventTime&quot;: &quot;2025-11-05T01:51:20.974Z&quot;,    &quot;instanceId&quot;: &quot;ccc-test&quot;,                    &quot;scenarioId&quot;: &quot;scenario-xxxx&quot;,               &quot;contactId&quot;: &quot;job-xxxxxx&quot;,                   &quot;duration&quot;: 59,                              &quot;startTime&quot;: &quot;2025-11-05T01:50:04.732Z&quot;,    &quot;endTime&quot;: &quot;2025-11-05T01:51:02.822Z&quot;,      &quot;fileName&quot;: &quot;xxxxxxx.wav&quot;,                   &quot;downloadURL&quot;: &quot;<a href="https://ccc-v2-online.oss-cn-shanghai.aliyuncs.com/ccc-record-mixed/xxxxxxx.wav?Expires=1762393880">https://ccc-v2-online.oss-cn-shanghai.aliyuncs.com/ccc-record-mixed/xxxxxxx.wav?Expires=1762393880</a>&quot; }</p>
     */
    @NameInMap("MessageBody")
    public String messageBody;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CUSTOMER</p>
     */
    @NameInMap("NotificationTarget")
    public String notificationTarget;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VnRecordingReady</p>
     */
    @NameInMap("NotificationType")
    public String notificationType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>job-xxxxxx</p>
     */
    @NameInMap("ShardingKey")
    public String shardingKey;

    public static SendNotificationRequest build(java.util.Map<String, ?> map) throws Exception {
        SendNotificationRequest self = new SendNotificationRequest();
        return TeaModel.build(map, self);
    }

    public SendNotificationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SendNotificationRequest setMessageBody(String messageBody) {
        this.messageBody = messageBody;
        return this;
    }
    public String getMessageBody() {
        return this.messageBody;
    }

    public SendNotificationRequest setNotificationTarget(String notificationTarget) {
        this.notificationTarget = notificationTarget;
        return this;
    }
    public String getNotificationTarget() {
        return this.notificationTarget;
    }

    public SendNotificationRequest setNotificationType(String notificationType) {
        this.notificationType = notificationType;
        return this;
    }
    public String getNotificationType() {
        return this.notificationType;
    }

    public SendNotificationRequest setShardingKey(String shardingKey) {
        this.shardingKey = shardingKey;
        return this;
    }
    public String getShardingKey() {
        return this.shardingKey;
    }

}

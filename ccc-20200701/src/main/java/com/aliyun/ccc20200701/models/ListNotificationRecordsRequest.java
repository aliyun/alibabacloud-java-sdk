// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListNotificationRecordsRequest extends TeaModel {
    /**
     * <p>The ID of the Cloud Contact Center instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>A list of notification keys to query. For example, if you specify a call ID, the API returns all notifications for that call ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;job-468a63a2-<strong><strong>-</strong></strong>-<strong><strong>-b1ecf726d4be&quot;,&quot;job-532a63a2-</strong></strong>-<strong><strong>-</strong></strong>-bcccc26d4cc&quot;]</p>
     */
    @NameInMap("NotificationKeys")
    public String notificationKeys;

    public static ListNotificationRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNotificationRecordsRequest self = new ListNotificationRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ListNotificationRecordsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListNotificationRecordsRequest setNotificationKeys(String notificationKeys) {
        this.notificationKeys = notificationKeys;
        return this;
    }
    public String getNotificationKeys() {
        return this.notificationKeys;
    }

}

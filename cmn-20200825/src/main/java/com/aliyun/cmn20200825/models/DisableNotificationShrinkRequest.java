// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DisableNotificationShrinkRequest extends TeaModel {
    // 到期时间
    @NameInMap("ExpiryTime")
    public String expiryTime;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 关闭通知的对象
    @NameInMap("List")
    public String listShrink;

    // 关闭原因
    @NameInMap("Reason")
    public String reason;

    public static DisableNotificationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableNotificationShrinkRequest self = new DisableNotificationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DisableNotificationShrinkRequest setExpiryTime(String expiryTime) {
        this.expiryTime = expiryTime;
        return this;
    }
    public String getExpiryTime() {
        return this.expiryTime;
    }

    public DisableNotificationShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DisableNotificationShrinkRequest setListShrink(String listShrink) {
        this.listShrink = listShrink;
        return this;
    }
    public String getListShrink() {
        return this.listShrink;
    }

    public DisableNotificationShrinkRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}

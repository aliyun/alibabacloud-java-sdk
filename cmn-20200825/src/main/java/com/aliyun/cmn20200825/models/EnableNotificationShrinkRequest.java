// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class EnableNotificationShrinkRequest extends TeaModel {
    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 通知对象
    @NameInMap("List")
    public String listShrink;

    public static EnableNotificationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableNotificationShrinkRequest self = new EnableNotificationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public EnableNotificationShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public EnableNotificationShrinkRequest setListShrink(String listShrink) {
        this.listShrink = listShrink;
        return this;
    }
    public String getListShrink() {
        return this.listShrink;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class BatchEventMigrateInstanceShrinkRequest extends TeaModel {
    @NameInMap("EventInfos")
    public String eventInfosShrink;

    public static BatchEventMigrateInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchEventMigrateInstanceShrinkRequest self = new BatchEventMigrateInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchEventMigrateInstanceShrinkRequest setEventInfosShrink(String eventInfosShrink) {
        this.eventInfosShrink = eventInfosShrink;
        return this;
    }
    public String getEventInfosShrink() {
        return this.eventInfosShrink;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class BatchEventRebootInstanceShrinkRequest extends TeaModel {
    /**
     * <p>The details of events.</p>
     */
    @NameInMap("EventInfos")
    public String eventInfosShrink;

    public static BatchEventRebootInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchEventRebootInstanceShrinkRequest self = new BatchEventRebootInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchEventRebootInstanceShrinkRequest setEventInfosShrink(String eventInfosShrink) {
        this.eventInfosShrink = eventInfosShrink;
        return this;
    }
    public String getEventInfosShrink() {
        return this.eventInfosShrink;
    }

}

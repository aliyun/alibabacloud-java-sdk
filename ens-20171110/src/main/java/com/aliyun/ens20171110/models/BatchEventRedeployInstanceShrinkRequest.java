// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class BatchEventRedeployInstanceShrinkRequest extends TeaModel {
    /**
     * <p>List of events.</p>
     */
    @NameInMap("EventInfos")
    public String eventInfosShrink;

    public static BatchEventRedeployInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchEventRedeployInstanceShrinkRequest self = new BatchEventRedeployInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchEventRedeployInstanceShrinkRequest setEventInfosShrink(String eventInfosShrink) {
        this.eventInfosShrink = eventInfosShrink;
        return this;
    }
    public String getEventInfosShrink() {
        return this.eventInfosShrink;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class PipelineTriggerEventSpec extends TeaModel {
    @NameInMap("payload")
    public EventPayload payload;

    @NameInMap("triggerName")
    public String triggerName;

    public static PipelineTriggerEventSpec build(java.util.Map<String, ?> map) throws Exception {
        PipelineTriggerEventSpec self = new PipelineTriggerEventSpec();
        return TeaModel.build(map, self);
    }

    public PipelineTriggerEventSpec setPayload(EventPayload payload) {
        this.payload = payload;
        return this;
    }
    public EventPayload getPayload() {
        return this.payload;
    }

    public PipelineTriggerEventSpec setTriggerName(String triggerName) {
        this.triggerName = triggerName;
        return this;
    }
    public String getTriggerName() {
        return this.triggerName;
    }

}

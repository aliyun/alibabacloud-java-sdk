// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAutonomousNotifyEventContentRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The unique identifier of the event. You can call the [GetAutonomousNotifyEventsInRange](https://help.aliyun.com/document_detail/288371.html) operation to query the unique identifier returned by the SpanId response parameter.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SpanId")
    public String spanId;

    /**
     * <p>The reserved parameter.</p>
     */
    @NameInMap("__context")
    public String context;

    public static GetAutonomousNotifyEventContentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAutonomousNotifyEventContentRequest self = new GetAutonomousNotifyEventContentRequest();
        return TeaModel.build(map, self);
    }

    public GetAutonomousNotifyEventContentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAutonomousNotifyEventContentRequest setSpanId(String spanId) {
        this.spanId = spanId;
        return this;
    }
    public String getSpanId() {
        return this.spanId;
    }

    public GetAutonomousNotifyEventContentRequest setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

}

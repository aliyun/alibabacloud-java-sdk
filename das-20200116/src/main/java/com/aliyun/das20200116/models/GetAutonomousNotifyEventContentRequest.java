// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAutonomousNotifyEventContentRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-18ff4a195d****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The unique identifier of the event. You can call the <a href="https://help.aliyun.com/document_detail/288371.html">GetAutonomousNotifyEventsInRange</a> operation to query the unique identifier returned by the SpanId response parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7e7b2774-95b8-4fa3-bd9c-0ab47cb7****</p>
     */
    @NameInMap("SpanId")
    public String spanId;

    /**
     * <p>The reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
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

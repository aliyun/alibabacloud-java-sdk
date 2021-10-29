// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAutonomousNotifyEventDetailRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SpanId")
    public String spanId;

    @NameInMap("__context")
    public String context;

    public static GetAutonomousNotifyEventDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAutonomousNotifyEventDetailRequest self = new GetAutonomousNotifyEventDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetAutonomousNotifyEventDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAutonomousNotifyEventDetailRequest setSpanId(String spanId) {
        this.spanId = spanId;
        return this;
    }
    public String getSpanId() {
        return this.spanId;
    }

    public GetAutonomousNotifyEventDetailRequest setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

}

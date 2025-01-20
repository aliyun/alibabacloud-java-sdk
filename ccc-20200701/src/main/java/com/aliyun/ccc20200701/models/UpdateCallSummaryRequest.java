// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class UpdateCallSummaryRequest extends TeaModel {
    @NameInMap("Context")
    public String context;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f2c6722b-cd13-442d-bf10-22a07c70d6d5</p>
     */
    @NameInMap("TicketId")
    public String ticketId;

    public static UpdateCallSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCallSummaryRequest self = new UpdateCallSummaryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCallSummaryRequest setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

    public UpdateCallSummaryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateCallSummaryRequest setTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public String getTicketId() {
        return this.ticketId;
    }

}

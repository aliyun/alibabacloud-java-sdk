// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class UpdateCallSummaryRequest extends TeaModel {
    /**
     * <p>Content to update.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;summaryTitle&quot;:&quot;标题&quot;,&quot;summaryContent&quot;:&quot;内容&quot;,&quot;keywords&quot;:&quot;关键信息&quot;}</p>
     */
    @NameInMap("Context")
    public String context;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Summary ID.</p>
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

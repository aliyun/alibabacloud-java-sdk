// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class UpdateTicketRequest extends TeaModel {
    @NameInMap("Context")
    public String context;

    /**
     * <strong>example:</strong>
     * <p>51e155ce-<em><strong>-</strong></em>*-b402-13c69597b920</p>
     */
    @NameInMap("CustomerId")
    public String customerId;

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
     * <p>5491d3b4-14ee-4341-b5f1-db2c78beddeb</p>
     */
    @NameInMap("TicketId")
    public String ticketId;

    @NameInMap("Title")
    public String title;

    public static UpdateTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTicketRequest self = new UpdateTicketRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTicketRequest setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

    public UpdateTicketRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public UpdateTicketRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateTicketRequest setTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public String getTicketId() {
        return this.ticketId;
    }

    public UpdateTicketRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}

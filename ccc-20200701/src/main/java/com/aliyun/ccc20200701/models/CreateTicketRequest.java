// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CreateTicketRequest extends TeaModel {
    /**
     * <p>The ID of the call.</p>
     * 
     * <strong>example:</strong>
     * <p>job-38860977107324****</p>
     */
    @NameInMap("ContactId")
    public String contactId;

    /**
     * <p>Ticket field information.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;productName&quot;:&quot;玩具1&quot;}</p>
     */
    @NameInMap("Context")
    public String context;

    /**
     * <p>Customer ID, the customer ID in Cloud Contact Center customer profiles.</p>
     * 
     * <strong>example:</strong>
     * <p>51e155ce-3747-4f21-b402-13c69597b920</p>
     */
    @NameInMap("CustomerId")
    public String customerId;

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
     * <p>Ticket source.</p>
     * 
     * <strong>example:</strong>
     * <p>CHAT</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>Ticket template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>e9e4c76c-948d-4a6e-9ce2-9da0f5967a73</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>Ticket title.</p>
     * 
     * <strong>example:</strong>
     * <p>售后工单。</p>
     */
    @NameInMap("Title")
    public String title;

    public static CreateTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTicketRequest self = new CreateTicketRequest();
        return TeaModel.build(map, self);
    }

    public CreateTicketRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public CreateTicketRequest setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

    public CreateTicketRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public CreateTicketRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateTicketRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateTicketRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateTicketRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CreateCallSummaryRequest extends TeaModel {
    /**
     * <p>The ID of the session.</p>
     * 
     * <strong>example:</strong>
     * <p>job-522327189435260928</p>
     */
    @NameInMap("ContactId")
    public String contactId;

    /**
     * <p>Summary information</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;summaryTitle&quot;:&quot;标题&quot;,&quot;summaryContent&quot;:&quot;内容&quot;,&quot;keywords&quot;:&quot;关键信息&quot;}</p>
     */
    @NameInMap("Context")
    public String context;

    /**
     * <p>Customer ID</p>
     * 
     * <strong>example:</strong>
     * <p>51e155ce-3747-*****-b402-13c69597b920</p>
     */
    @NameInMap("CustomerId")
    public String customerId;

    /**
     * <p>Instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static CreateCallSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCallSummaryRequest self = new CreateCallSummaryRequest();
        return TeaModel.build(map, self);
    }

    public CreateCallSummaryRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public CreateCallSummaryRequest setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

    public CreateCallSummaryRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public CreateCallSummaryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

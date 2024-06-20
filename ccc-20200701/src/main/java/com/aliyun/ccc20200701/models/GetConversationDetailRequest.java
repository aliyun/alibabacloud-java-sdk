// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetConversationDetailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>job-25884193037652****</p>
     */
    @NameInMap("ContactId")
    public String contactId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetConversationDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConversationDetailRequest self = new GetConversationDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetConversationDetailRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public GetConversationDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

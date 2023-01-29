// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class DiscardEditingContactFlowRequest extends TeaModel {
    @NameInMap("ContactFlowId")
    public String contactFlowId;

    @NameInMap("DraftId")
    public String draftId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DiscardEditingContactFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        DiscardEditingContactFlowRequest self = new DiscardEditingContactFlowRequest();
        return TeaModel.build(map, self);
    }

    public DiscardEditingContactFlowRequest setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
        return this;
    }
    public String getContactFlowId() {
        return this.contactFlowId;
    }

    public DiscardEditingContactFlowRequest setDraftId(String draftId) {
        this.draftId = draftId;
        return this;
    }
    public String getDraftId() {
        return this.draftId;
    }

    public DiscardEditingContactFlowRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

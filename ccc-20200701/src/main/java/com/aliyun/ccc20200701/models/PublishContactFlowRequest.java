// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class PublishContactFlowRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ContactFlowId")
    public String contactFlowId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DraftId")
    public String draftId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static PublishContactFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishContactFlowRequest self = new PublishContactFlowRequest();
        return TeaModel.build(map, self);
    }

    public PublishContactFlowRequest setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
        return this;
    }
    public String getContactFlowId() {
        return this.contactFlowId;
    }

    public PublishContactFlowRequest setDraftId(String draftId) {
        this.draftId = draftId;
        return this;
    }
    public String getDraftId() {
        return this.draftId;
    }

    public PublishContactFlowRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetContactFlowRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>274601be-a6d5-4429-bcef-32b51d031c6e</p>
     */
    @NameInMap("ContactFlowId")
    public String contactFlowId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>566399d7-5558-447c-a72f-9be2768b6a82</p>
     */
    @NameInMap("DraftId")
    public String draftId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetContactFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        GetContactFlowRequest self = new GetContactFlowRequest();
        return TeaModel.build(map, self);
    }

    public GetContactFlowRequest setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
        return this;
    }
    public String getContactFlowId() {
        return this.contactFlowId;
    }

    public GetContactFlowRequest setDraftId(String draftId) {
        this.draftId = draftId;
        return this;
    }
    public String getDraftId() {
        return this.draftId;
    }

    public GetContactFlowRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

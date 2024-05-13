// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CommitContactFlowRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ContactFlowId")
    public String contactFlowId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Definition")
    public String definition;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Description")
    public String description;

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

    public static CommitContactFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        CommitContactFlowRequest self = new CommitContactFlowRequest();
        return TeaModel.build(map, self);
    }

    public CommitContactFlowRequest setContactFlowId(String contactFlowId) {
        this.contactFlowId = contactFlowId;
        return this;
    }
    public String getContactFlowId() {
        return this.contactFlowId;
    }

    public CommitContactFlowRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public CommitContactFlowRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CommitContactFlowRequest setDraftId(String draftId) {
        this.draftId = draftId;
        return this;
    }
    public String getDraftId() {
        return this.draftId;
    }

    public CommitContactFlowRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CommitContactFlowVersionModificationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Canvas")
    public String canvas;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ContactFlowVersionId")
    public String contactFlowVersionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static CommitContactFlowVersionModificationRequest build(java.util.Map<String, ?> map) throws Exception {
        CommitContactFlowVersionModificationRequest self = new CommitContactFlowVersionModificationRequest();
        return TeaModel.build(map, self);
    }

    public CommitContactFlowVersionModificationRequest setCanvas(String canvas) {
        this.canvas = canvas;
        return this;
    }
    public String getCanvas() {
        return this.canvas;
    }

    public CommitContactFlowVersionModificationRequest setContactFlowVersionId(String contactFlowVersionId) {
        this.contactFlowVersionId = contactFlowVersionId;
        return this;
    }
    public String getContactFlowVersionId() {
        return this.contactFlowVersionId;
    }

    public CommitContactFlowVersionModificationRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CommitContactFlowVersionModificationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}

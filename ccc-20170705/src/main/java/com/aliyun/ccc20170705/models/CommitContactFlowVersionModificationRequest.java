// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CommitContactFlowVersionModificationRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ContactFlowVersionId")
    public String contactFlowVersionId;

    @NameInMap("Canvas")
    public String canvas;

    @NameInMap("Content")
    public String content;

    public static CommitContactFlowVersionModificationRequest build(java.util.Map<String, ?> map) throws Exception {
        CommitContactFlowVersionModificationRequest self = new CommitContactFlowVersionModificationRequest();
        return TeaModel.build(map, self);
    }

    public CommitContactFlowVersionModificationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CommitContactFlowVersionModificationRequest setContactFlowVersionId(String contactFlowVersionId) {
        this.contactFlowVersionId = contactFlowVersionId;
        return this;
    }
    public String getContactFlowVersionId() {
        return this.contactFlowVersionId;
    }

    public CommitContactFlowVersionModificationRequest setCanvas(String canvas) {
        this.canvas = canvas;
        return this;
    }
    public String getCanvas() {
        return this.canvas;
    }

    public CommitContactFlowVersionModificationRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CreateVoiceAppraiseRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ContactFlowVersionId")
    public String contactFlowVersionId;

    @NameInMap("Content")
    public String content;

    @NameInMap("IsAppraise")
    public Boolean isAppraise;

    public static CreateVoiceAppraiseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVoiceAppraiseRequest self = new CreateVoiceAppraiseRequest();
        return TeaModel.build(map, self);
    }

    public CreateVoiceAppraiseRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateVoiceAppraiseRequest setContactFlowVersionId(String contactFlowVersionId) {
        this.contactFlowVersionId = contactFlowVersionId;
        return this;
    }
    public String getContactFlowVersionId() {
        return this.contactFlowVersionId;
    }

    public CreateVoiceAppraiseRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateVoiceAppraiseRequest setIsAppraise(Boolean isAppraise) {
        this.isAppraise = isAppraise;
        return this;
    }
    public Boolean getIsAppraise() {
        return this.isAppraise;
    }

}

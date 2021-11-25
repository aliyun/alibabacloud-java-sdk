// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class CreateMergeFaceGroupsJobRequest extends TeaModel {
    @NameInMap("CustomMessage")
    public String customMessage;

    @NameInMap("GroupIdFrom")
    public String groupIdFrom;

    @NameInMap("GroupIdTo")
    public String groupIdTo;

    @NameInMap("NotifyEndpoint")
    public String notifyEndpoint;

    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    @NameInMap("Project")
    public String project;

    @NameInMap("SetId")
    public String setId;

    public static CreateMergeFaceGroupsJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMergeFaceGroupsJobRequest self = new CreateMergeFaceGroupsJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateMergeFaceGroupsJobRequest setCustomMessage(String customMessage) {
        this.customMessage = customMessage;
        return this;
    }
    public String getCustomMessage() {
        return this.customMessage;
    }

    public CreateMergeFaceGroupsJobRequest setGroupIdFrom(String groupIdFrom) {
        this.groupIdFrom = groupIdFrom;
        return this;
    }
    public String getGroupIdFrom() {
        return this.groupIdFrom;
    }

    public CreateMergeFaceGroupsJobRequest setGroupIdTo(String groupIdTo) {
        this.groupIdTo = groupIdTo;
        return this;
    }
    public String getGroupIdTo() {
        return this.groupIdTo;
    }

    public CreateMergeFaceGroupsJobRequest setNotifyEndpoint(String notifyEndpoint) {
        this.notifyEndpoint = notifyEndpoint;
        return this;
    }
    public String getNotifyEndpoint() {
        return this.notifyEndpoint;
    }

    public CreateMergeFaceGroupsJobRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public CreateMergeFaceGroupsJobRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public CreateMergeFaceGroupsJobRequest setSetId(String setId) {
        this.setId = setId;
        return this;
    }
    public String getSetId() {
        return this.setId;
    }

}

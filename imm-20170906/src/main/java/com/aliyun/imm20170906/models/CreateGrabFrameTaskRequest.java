// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class CreateGrabFrameTaskRequest extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("VideoUri")
    public String videoUri;

    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    @NameInMap("NotifyEndpoint")
    public String notifyEndpoint;

    @NameInMap("TargetList")
    public String targetList;

    @NameInMap("CustomMessage")
    public String customMessage;

    public static CreateGrabFrameTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGrabFrameTaskRequest self = new CreateGrabFrameTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateGrabFrameTaskRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public CreateGrabFrameTaskRequest setVideoUri(String videoUri) {
        this.videoUri = videoUri;
        return this;
    }
    public String getVideoUri() {
        return this.videoUri;
    }

    public CreateGrabFrameTaskRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public CreateGrabFrameTaskRequest setNotifyEndpoint(String notifyEndpoint) {
        this.notifyEndpoint = notifyEndpoint;
        return this;
    }
    public String getNotifyEndpoint() {
        return this.notifyEndpoint;
    }

    public CreateGrabFrameTaskRequest setTargetList(String targetList) {
        this.targetList = targetList;
        return this;
    }
    public String getTargetList() {
        return this.targetList;
    }

    public CreateGrabFrameTaskRequest setCustomMessage(String customMessage) {
        this.customMessage = customMessage;
        return this;
    }
    public String getCustomMessage() {
        return this.customMessage;
    }

}

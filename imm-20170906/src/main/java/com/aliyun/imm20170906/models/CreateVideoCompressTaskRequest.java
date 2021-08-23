// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class CreateVideoCompressTaskRequest extends TeaModel {
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

    @NameInMap("TargetContainer")
    public String targetContainer;

    @NameInMap("TargetSegment")
    public String targetSegment;

    public static CreateVideoCompressTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoCompressTaskRequest self = new CreateVideoCompressTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateVideoCompressTaskRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public CreateVideoCompressTaskRequest setVideoUri(String videoUri) {
        this.videoUri = videoUri;
        return this;
    }
    public String getVideoUri() {
        return this.videoUri;
    }

    public CreateVideoCompressTaskRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public CreateVideoCompressTaskRequest setNotifyEndpoint(String notifyEndpoint) {
        this.notifyEndpoint = notifyEndpoint;
        return this;
    }
    public String getNotifyEndpoint() {
        return this.notifyEndpoint;
    }

    public CreateVideoCompressTaskRequest setTargetList(String targetList) {
        this.targetList = targetList;
        return this;
    }
    public String getTargetList() {
        return this.targetList;
    }

    public CreateVideoCompressTaskRequest setCustomMessage(String customMessage) {
        this.customMessage = customMessage;
        return this;
    }
    public String getCustomMessage() {
        return this.customMessage;
    }

    public CreateVideoCompressTaskRequest setTargetContainer(String targetContainer) {
        this.targetContainer = targetContainer;
        return this;
    }
    public String getTargetContainer() {
        return this.targetContainer;
    }

    public CreateVideoCompressTaskRequest setTargetSegment(String targetSegment) {
        this.targetSegment = targetSegment;
        return this;
    }
    public String getTargetSegment() {
        return this.targetSegment;
    }

}

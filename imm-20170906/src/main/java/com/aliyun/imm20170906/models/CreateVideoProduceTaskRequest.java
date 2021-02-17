// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class CreateVideoProduceTaskRequest extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("Images")
    public String images;

    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    @NameInMap("NotifyEndpoint")
    public String notifyEndpoint;

    @NameInMap("TargetUri")
    public String targetUri;

    @NameInMap("CustomMessage")
    public String customMessage;

    @NameInMap("Music")
    public String music;

    @NameInMap("Width")
    public Integer width;

    @NameInMap("Height")
    public Integer height;

    @NameInMap("TemplateName")
    public String templateName;

    public static CreateVideoProduceTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoProduceTaskRequest self = new CreateVideoProduceTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateVideoProduceTaskRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public CreateVideoProduceTaskRequest setImages(String images) {
        this.images = images;
        return this;
    }
    public String getImages() {
        return this.images;
    }

    public CreateVideoProduceTaskRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public CreateVideoProduceTaskRequest setNotifyEndpoint(String notifyEndpoint) {
        this.notifyEndpoint = notifyEndpoint;
        return this;
    }
    public String getNotifyEndpoint() {
        return this.notifyEndpoint;
    }

    public CreateVideoProduceTaskRequest setTargetUri(String targetUri) {
        this.targetUri = targetUri;
        return this;
    }
    public String getTargetUri() {
        return this.targetUri;
    }

    public CreateVideoProduceTaskRequest setCustomMessage(String customMessage) {
        this.customMessage = customMessage;
        return this;
    }
    public String getCustomMessage() {
        return this.customMessage;
    }

    public CreateVideoProduceTaskRequest setMusic(String music) {
        this.music = music;
        return this;
    }
    public String getMusic() {
        return this.music;
    }

    public CreateVideoProduceTaskRequest setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

    public CreateVideoProduceTaskRequest setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public CreateVideoProduceTaskRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}

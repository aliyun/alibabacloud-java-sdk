// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class CreateVideoProduceTaskRequest extends TeaModel {
    @NameInMap("CustomMessage")
    public String customMessage;

    @NameInMap("Height")
    public Integer height;

    @NameInMap("Images")
    public String images;

    @NameInMap("Music")
    public String music;

    @NameInMap("NotifyEndpoint")
    public String notifyEndpoint;

    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    @NameInMap("Project")
    public String project;

    @NameInMap("TargetUri")
    public String targetUri;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("Width")
    public Integer width;

    public static CreateVideoProduceTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoProduceTaskRequest self = new CreateVideoProduceTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateVideoProduceTaskRequest setCustomMessage(String customMessage) {
        this.customMessage = customMessage;
        return this;
    }
    public String getCustomMessage() {
        return this.customMessage;
    }

    public CreateVideoProduceTaskRequest setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public CreateVideoProduceTaskRequest setImages(String images) {
        this.images = images;
        return this;
    }
    public String getImages() {
        return this.images;
    }

    public CreateVideoProduceTaskRequest setMusic(String music) {
        this.music = music;
        return this;
    }
    public String getMusic() {
        return this.music;
    }

    public CreateVideoProduceTaskRequest setNotifyEndpoint(String notifyEndpoint) {
        this.notifyEndpoint = notifyEndpoint;
        return this;
    }
    public String getNotifyEndpoint() {
        return this.notifyEndpoint;
    }

    public CreateVideoProduceTaskRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public CreateVideoProduceTaskRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public CreateVideoProduceTaskRequest setTargetUri(String targetUri) {
        this.targetUri = targetUri;
        return this;
    }
    public String getTargetUri() {
        return this.targetUri;
    }

    public CreateVideoProduceTaskRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateVideoProduceTaskRequest setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

}

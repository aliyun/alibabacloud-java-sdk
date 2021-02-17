// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class CreateImageProcessTaskRequest extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("ImageUri")
    public String imageUri;

    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    @NameInMap("NotifyEndpoint")
    public String notifyEndpoint;

    @NameInMap("TargetList")
    public String targetList;

    public static CreateImageProcessTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageProcessTaskRequest self = new CreateImageProcessTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageProcessTaskRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public CreateImageProcessTaskRequest setImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }
    public String getImageUri() {
        return this.imageUri;
    }

    public CreateImageProcessTaskRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public CreateImageProcessTaskRequest setNotifyEndpoint(String notifyEndpoint) {
        this.notifyEndpoint = notifyEndpoint;
        return this;
    }
    public String getNotifyEndpoint() {
        return this.notifyEndpoint;
    }

    public CreateImageProcessTaskRequest setTargetList(String targetList) {
        this.targetList = targetList;
        return this;
    }
    public String getTargetList() {
        return this.targetList;
    }

}

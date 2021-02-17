// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class CreateVideoAbstractTaskRequest extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("VideoUri")
    public String videoUri;

    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    @NameInMap("NotifyEndpoint")
    public String notifyEndpoint;

    @NameInMap("TargetVideoUri")
    public String targetVideoUri;

    @NameInMap("TargetClipsUri")
    public String targetClipsUri;

    @NameInMap("AbstractLength")
    public Integer abstractLength;

    public static CreateVideoAbstractTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoAbstractTaskRequest self = new CreateVideoAbstractTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateVideoAbstractTaskRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public CreateVideoAbstractTaskRequest setVideoUri(String videoUri) {
        this.videoUri = videoUri;
        return this;
    }
    public String getVideoUri() {
        return this.videoUri;
    }

    public CreateVideoAbstractTaskRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public CreateVideoAbstractTaskRequest setNotifyEndpoint(String notifyEndpoint) {
        this.notifyEndpoint = notifyEndpoint;
        return this;
    }
    public String getNotifyEndpoint() {
        return this.notifyEndpoint;
    }

    public CreateVideoAbstractTaskRequest setTargetVideoUri(String targetVideoUri) {
        this.targetVideoUri = targetVideoUri;
        return this;
    }
    public String getTargetVideoUri() {
        return this.targetVideoUri;
    }

    public CreateVideoAbstractTaskRequest setTargetClipsUri(String targetClipsUri) {
        this.targetClipsUri = targetClipsUri;
        return this;
    }
    public String getTargetClipsUri() {
        return this.targetClipsUri;
    }

    public CreateVideoAbstractTaskRequest setAbstractLength(Integer abstractLength) {
        this.abstractLength = abstractLength;
        return this;
    }
    public Integer getAbstractLength() {
        return this.abstractLength;
    }

}

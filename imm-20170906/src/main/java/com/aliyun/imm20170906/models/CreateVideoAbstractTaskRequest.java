// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class CreateVideoAbstractTaskRequest extends TeaModel {
    @NameInMap("AbstractLength")
    public Integer abstractLength;

    @NameInMap("NotifyEndpoint")
    public String notifyEndpoint;

    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    @NameInMap("Project")
    public String project;

    @NameInMap("TargetClipsUri")
    public String targetClipsUri;

    @NameInMap("TargetVideoUri")
    public String targetVideoUri;

    @NameInMap("VideoUri")
    public String videoUri;

    public static CreateVideoAbstractTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoAbstractTaskRequest self = new CreateVideoAbstractTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateVideoAbstractTaskRequest setAbstractLength(Integer abstractLength) {
        this.abstractLength = abstractLength;
        return this;
    }
    public Integer getAbstractLength() {
        return this.abstractLength;
    }

    public CreateVideoAbstractTaskRequest setNotifyEndpoint(String notifyEndpoint) {
        this.notifyEndpoint = notifyEndpoint;
        return this;
    }
    public String getNotifyEndpoint() {
        return this.notifyEndpoint;
    }

    public CreateVideoAbstractTaskRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public CreateVideoAbstractTaskRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public CreateVideoAbstractTaskRequest setTargetClipsUri(String targetClipsUri) {
        this.targetClipsUri = targetClipsUri;
        return this;
    }
    public String getTargetClipsUri() {
        return this.targetClipsUri;
    }

    public CreateVideoAbstractTaskRequest setTargetVideoUri(String targetVideoUri) {
        this.targetVideoUri = targetVideoUri;
        return this;
    }
    public String getTargetVideoUri() {
        return this.targetVideoUri;
    }

    public CreateVideoAbstractTaskRequest setVideoUri(String videoUri) {
        this.videoUri = videoUri;
        return this;
    }
    public String getVideoUri() {
        return this.videoUri;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class CreateVideoAnalyseTaskRequest extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("VideoUri")
    public String videoUri;

    @NameInMap("TgtUri")
    public String tgtUri;

    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    @NameInMap("NotifyEndpoint")
    public String notifyEndpoint;

    public static CreateVideoAnalyseTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoAnalyseTaskRequest self = new CreateVideoAnalyseTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateVideoAnalyseTaskRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public CreateVideoAnalyseTaskRequest setVideoUri(String videoUri) {
        this.videoUri = videoUri;
        return this;
    }
    public String getVideoUri() {
        return this.videoUri;
    }

    public CreateVideoAnalyseTaskRequest setTgtUri(String tgtUri) {
        this.tgtUri = tgtUri;
        return this;
    }
    public String getTgtUri() {
        return this.tgtUri;
    }

    public CreateVideoAnalyseTaskRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public CreateVideoAnalyseTaskRequest setNotifyEndpoint(String notifyEndpoint) {
        this.notifyEndpoint = notifyEndpoint;
        return this;
    }
    public String getNotifyEndpoint() {
        return this.notifyEndpoint;
    }

}

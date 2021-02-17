// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class CreateStreamAnalyseTaskRequest extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("StreamUri")
    public String streamUri;

    @NameInMap("GrabType")
    public String grabType;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("SaveType")
    public Boolean saveType;

    @NameInMap("Interval")
    public String interval;

    @NameInMap("TgtUri")
    public String tgtUri;

    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    @NameInMap("NotifyEndpoint")
    public String notifyEndpoint;

    public static CreateStreamAnalyseTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStreamAnalyseTaskRequest self = new CreateStreamAnalyseTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateStreamAnalyseTaskRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public CreateStreamAnalyseTaskRequest setStreamUri(String streamUri) {
        this.streamUri = streamUri;
        return this;
    }
    public String getStreamUri() {
        return this.streamUri;
    }

    public CreateStreamAnalyseTaskRequest setGrabType(String grabType) {
        this.grabType = grabType;
        return this;
    }
    public String getGrabType() {
        return this.grabType;
    }

    public CreateStreamAnalyseTaskRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateStreamAnalyseTaskRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateStreamAnalyseTaskRequest setSaveType(Boolean saveType) {
        this.saveType = saveType;
        return this;
    }
    public Boolean getSaveType() {
        return this.saveType;
    }

    public CreateStreamAnalyseTaskRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public CreateStreamAnalyseTaskRequest setTgtUri(String tgtUri) {
        this.tgtUri = tgtUri;
        return this;
    }
    public String getTgtUri() {
        return this.tgtUri;
    }

    public CreateStreamAnalyseTaskRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public CreateStreamAnalyseTaskRequest setNotifyEndpoint(String notifyEndpoint) {
        this.notifyEndpoint = notifyEndpoint;
        return this;
    }
    public String getNotifyEndpoint() {
        return this.notifyEndpoint;
    }

}

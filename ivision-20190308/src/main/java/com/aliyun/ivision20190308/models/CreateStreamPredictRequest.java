// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class CreateStreamPredictRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("StreamType")
    public String streamType;

    @NameInMap("StreamId")
    public String streamId;

    @NameInMap("PredictTemplateId")
    public String predictTemplateId;

    @NameInMap("ModelIds")
    public String modelIds;

    @NameInMap("ProbabilityThresholds")
    public String probabilityThresholds;

    @NameInMap("DetectIntervals")
    public String detectIntervals;

    @NameInMap("Output")
    public String output;

    @NameInMap("Notify")
    public String notify;

    @NameInMap("AutoStart")
    public String autoStart;

    @NameInMap("FaceGroupId")
    public String faceGroupId;

    @NameInMap("ModelUserData")
    public String modelUserData;

    public static CreateStreamPredictRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStreamPredictRequest self = new CreateStreamPredictRequest();
        return TeaModel.build(map, self);
    }

    public CreateStreamPredictRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateStreamPredictRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateStreamPredictRequest setStreamType(String streamType) {
        this.streamType = streamType;
        return this;
    }
    public String getStreamType() {
        return this.streamType;
    }

    public CreateStreamPredictRequest setStreamId(String streamId) {
        this.streamId = streamId;
        return this;
    }
    public String getStreamId() {
        return this.streamId;
    }

    public CreateStreamPredictRequest setPredictTemplateId(String predictTemplateId) {
        this.predictTemplateId = predictTemplateId;
        return this;
    }
    public String getPredictTemplateId() {
        return this.predictTemplateId;
    }

    public CreateStreamPredictRequest setModelIds(String modelIds) {
        this.modelIds = modelIds;
        return this;
    }
    public String getModelIds() {
        return this.modelIds;
    }

    public CreateStreamPredictRequest setProbabilityThresholds(String probabilityThresholds) {
        this.probabilityThresholds = probabilityThresholds;
        return this;
    }
    public String getProbabilityThresholds() {
        return this.probabilityThresholds;
    }

    public CreateStreamPredictRequest setDetectIntervals(String detectIntervals) {
        this.detectIntervals = detectIntervals;
        return this;
    }
    public String getDetectIntervals() {
        return this.detectIntervals;
    }

    public CreateStreamPredictRequest setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public CreateStreamPredictRequest setNotify(String notify) {
        this.notify = notify;
        return this;
    }
    public String getNotify() {
        return this.notify;
    }

    public CreateStreamPredictRequest setAutoStart(String autoStart) {
        this.autoStart = autoStart;
        return this;
    }
    public String getAutoStart() {
        return this.autoStart;
    }

    public CreateStreamPredictRequest setFaceGroupId(String faceGroupId) {
        this.faceGroupId = faceGroupId;
        return this;
    }
    public String getFaceGroupId() {
        return this.faceGroupId;
    }

    public CreateStreamPredictRequest setModelUserData(String modelUserData) {
        this.modelUserData = modelUserData;
        return this;
    }
    public String getModelUserData() {
        return this.modelUserData;
    }

}

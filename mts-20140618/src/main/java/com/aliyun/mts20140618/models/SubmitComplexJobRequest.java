// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitComplexJobRequest extends TeaModel {
    @NameInMap("ComplexConfigs")
    public String complexConfigs;

    @NameInMap("Inputs")
    public String inputs;

    @NameInMap("OutputBucket")
    public String outputBucket;

    @NameInMap("OutputLocation")
    public String outputLocation;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TranscodeOutput")
    public String transcodeOutput;

    @NameInMap("UserData")
    public String userData;

    public static SubmitComplexJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitComplexJobRequest self = new SubmitComplexJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitComplexJobRequest setComplexConfigs(String complexConfigs) {
        this.complexConfigs = complexConfigs;
        return this;
    }
    public String getComplexConfigs() {
        return this.complexConfigs;
    }

    public SubmitComplexJobRequest setInputs(String inputs) {
        this.inputs = inputs;
        return this;
    }
    public String getInputs() {
        return this.inputs;
    }

    public SubmitComplexJobRequest setOutputBucket(String outputBucket) {
        this.outputBucket = outputBucket;
        return this;
    }
    public String getOutputBucket() {
        return this.outputBucket;
    }

    public SubmitComplexJobRequest setOutputLocation(String outputLocation) {
        this.outputLocation = outputLocation;
        return this;
    }
    public String getOutputLocation() {
        return this.outputLocation;
    }

    public SubmitComplexJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SubmitComplexJobRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SubmitComplexJobRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public SubmitComplexJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitComplexJobRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitComplexJobRequest setTranscodeOutput(String transcodeOutput) {
        this.transcodeOutput = transcodeOutput;
        return this;
    }
    public String getTranscodeOutput() {
        return this.transcodeOutput;
    }

    public SubmitComplexJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}

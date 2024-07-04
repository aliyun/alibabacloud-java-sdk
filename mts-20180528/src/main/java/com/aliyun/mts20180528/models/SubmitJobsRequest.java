// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class SubmitJobsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public String input;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OutputBucket")
    public String outputBucket;

    @NameInMap("OutputLocation")
    public String outputLocation;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Outputs")
    public String outputs;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static SubmitJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitJobsRequest self = new SubmitJobsRequest();
        return TeaModel.build(map, self);
    }

    public SubmitJobsRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public SubmitJobsRequest setOutputBucket(String outputBucket) {
        this.outputBucket = outputBucket;
        return this;
    }
    public String getOutputBucket() {
        return this.outputBucket;
    }

    public SubmitJobsRequest setOutputLocation(String outputLocation) {
        this.outputLocation = outputLocation;
        return this;
    }
    public String getOutputLocation() {
        return this.outputLocation;
    }

    public SubmitJobsRequest setOutputs(String outputs) {
        this.outputs = outputs;
        return this;
    }
    public String getOutputs() {
        return this.outputs;
    }

    public SubmitJobsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SubmitJobsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SubmitJobsRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public SubmitJobsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitJobsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitEditingJobsRequest extends TeaModel {
    @NameInMap("EditingInputs")
    public String editingInputs;

    @NameInMap("EditingJobOssFileRoleArn")
    public String editingJobOssFileRoleArn;

    @NameInMap("EditingJobOssFileUid")
    public Long editingJobOssFileUid;

    @NameInMap("EditingJobOutputs")
    public String editingJobOutputs;

    @NameInMap("EditingJobURL")
    public String editingJobURL;

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

    public static SubmitEditingJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitEditingJobsRequest self = new SubmitEditingJobsRequest();
        return TeaModel.build(map, self);
    }

    public SubmitEditingJobsRequest setEditingInputs(String editingInputs) {
        this.editingInputs = editingInputs;
        return this;
    }
    public String getEditingInputs() {
        return this.editingInputs;
    }

    public SubmitEditingJobsRequest setEditingJobOssFileRoleArn(String editingJobOssFileRoleArn) {
        this.editingJobOssFileRoleArn = editingJobOssFileRoleArn;
        return this;
    }
    public String getEditingJobOssFileRoleArn() {
        return this.editingJobOssFileRoleArn;
    }

    public SubmitEditingJobsRequest setEditingJobOssFileUid(Long editingJobOssFileUid) {
        this.editingJobOssFileUid = editingJobOssFileUid;
        return this;
    }
    public Long getEditingJobOssFileUid() {
        return this.editingJobOssFileUid;
    }

    public SubmitEditingJobsRequest setEditingJobOutputs(String editingJobOutputs) {
        this.editingJobOutputs = editingJobOutputs;
        return this;
    }
    public String getEditingJobOutputs() {
        return this.editingJobOutputs;
    }

    public SubmitEditingJobsRequest setEditingJobURL(String editingJobURL) {
        this.editingJobURL = editingJobURL;
        return this;
    }
    public String getEditingJobURL() {
        return this.editingJobURL;
    }

    public SubmitEditingJobsRequest setOutputBucket(String outputBucket) {
        this.outputBucket = outputBucket;
        return this;
    }
    public String getOutputBucket() {
        return this.outputBucket;
    }

    public SubmitEditingJobsRequest setOutputLocation(String outputLocation) {
        this.outputLocation = outputLocation;
        return this;
    }
    public String getOutputLocation() {
        return this.outputLocation;
    }

    public SubmitEditingJobsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SubmitEditingJobsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SubmitEditingJobsRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public SubmitEditingJobsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitEditingJobsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitIProductionJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ImageCartoonize</p>
     */
    @NameInMap("FunctionName")
    public String functionName;

    /**
     * <strong>example:</strong>
     * <p>oss://example-****.oss-cn-shanghai.aliyuncs.com/example.mp4</p>
     */
    @NameInMap("Input")
    public String input;

    /**
     * <strong>example:</strong>
     * <p>{&quot;Model&quot;:&quot;gif&quot;}</p>
     */
    @NameInMap("JobParams")
    public String jobParams;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ModelId")
    public String modelId;

    /**
     * <strong>example:</strong>
     * <p>mns://125340688170****.mns.cn-beijing.aliyuncs.com/queues/example-pipeline</p>
     */
    @NameInMap("NotifyUrl")
    public String notifyUrl;

    /**
     * <strong>example:</strong>
     * <p>oss://example-****.oss-cn-shanghai.aliyuncs.com/iproduction/{source}-{timestamp}-{sequenceId}.srt</p>
     */
    @NameInMap("Output")
    public String output;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>39f8e0bc005e4f309379701645f4****</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ScheduleParams")
    public String scheduleParams;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitIProductionJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitIProductionJobRequest self = new SubmitIProductionJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitIProductionJobRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public SubmitIProductionJobRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public SubmitIProductionJobRequest setJobParams(String jobParams) {
        this.jobParams = jobParams;
        return this;
    }
    public String getJobParams() {
        return this.jobParams;
    }

    public SubmitIProductionJobRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public SubmitIProductionJobRequest setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public SubmitIProductionJobRequest setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public SubmitIProductionJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SubmitIProductionJobRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SubmitIProductionJobRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public SubmitIProductionJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitIProductionJobRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitIProductionJobRequest setScheduleParams(String scheduleParams) {
        this.scheduleParams = scheduleParams;
        return this;
    }
    public String getScheduleParams() {
        return this.scheduleParams;
    }

    public SubmitIProductionJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitAnalysisJobRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Input")
    public String input;

    @NameInMap("AnalysisConfig")
    public String analysisConfig;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("Priority")
    public String priority;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static SubmitAnalysisJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAnalysisJobRequest self = new SubmitAnalysisJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAnalysisJobRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SubmitAnalysisJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitAnalysisJobRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitAnalysisJobRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public SubmitAnalysisJobRequest setAnalysisConfig(String analysisConfig) {
        this.analysisConfig = analysisConfig;
        return this;
    }
    public String getAnalysisConfig() {
        return this.analysisConfig;
    }

    public SubmitAnalysisJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public SubmitAnalysisJobRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public SubmitAnalysisJobRequest setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public SubmitAnalysisJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitAnalysisJobRequest extends TeaModel {
    /**
     * <p>The job configuration. Set this parameter as required. [~~29253~~](~~29253~~)</p>
     */
    @NameInMap("AnalysisConfig")
    public String analysisConfig;

    /**
     * <p>The input information about the preset template analysis job to be submitted. The value is a JSON object. You must log on to the Object Storage Service (OSS) console to grant the read permissions on the specified OSS bucket to MPS. [~~29253~~](~~29253~~)</p>
     */
    @NameInMap("Input")
    public String input;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the MPS queue to which the job is added. To view the MPS queue ID, log on to the **MPS console** and choose **Global Settings** > **Pipelines** in the left-side navigation pane. If you want to enable asynchronous notifications, make sure that the queue is bound to a Message Service (MNS) topic.</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    /**
     * <p>The priority of the job in the MPS queue to which the job is added.</p>
     * <br>
     * <p>*   Valid values: **1 to 10**. A value of 10 indicates the highest priority.</p>
     * <p>*   Default value: **6**.</p>
     */
    @NameInMap("Priority")
    public String priority;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The custom data. The custom data can contain letters, digits, and hyphens (-), and can be up to 1,024 bytes in length. It cannot start with a special character.</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitAnalysisJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAnalysisJobRequest self = new SubmitAnalysisJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAnalysisJobRequest setAnalysisConfig(String analysisConfig) {
        this.analysisConfig = analysisConfig;
        return this;
    }
    public String getAnalysisConfig() {
        return this.analysisConfig;
    }

    public SubmitAnalysisJobRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public SubmitAnalysisJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SubmitAnalysisJobRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public SubmitAnalysisJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}

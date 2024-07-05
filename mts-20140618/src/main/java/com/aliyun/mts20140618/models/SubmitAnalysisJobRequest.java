// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitAnalysisJobRequest extends TeaModel {
    /**
     * <p>The job configurations. Set this parameter as required. For more information, see the &quot;AnalysisConfig&quot; section of the <a href="https://help.aliyun.com/document_detail/29253.html">Parameter details</a> topic.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;QualityControl&quot;:{&quot;RateQuality&quot;:25,&quot;MethodStreaming&quot;:&quot;network&quot;}}</p>
     */
    @NameInMap("AnalysisConfig")
    public String analysisConfig;

    /**
     * <p>The input information about the preset template analysis job to be submitted. The value must be a JSON object. You must log on to the Object Storage Service (OSS) console to grant the read permissions on the specified OSS bucket to MPS. For more information, see the &quot;Input&quot; section of the <a href="https://help.aliyun.com/document_detail/29253.html">Parameter details</a> topic.</p>
     * <blockquote>
     * <p>The OSS bucket must reside in the same region as your MPS service.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Bucket&quot;:&quot;example-bucket&quot;,&quot;Location&quot;:&quot;oss-cn-hangzhou&quot;,&quot;Object&quot;:&quot;example.flv&quot;}</p>
     */
    @NameInMap("Input")
    public String input;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the MPS queue to which the job is submitted. To view the ID of the MPS queue, log on to the <strong>MPS console</strong> and choose <strong>Global Settings</strong> &gt; <strong>Pipelines</strong> in the left-side navigation pane. If you want to enable asynchronous notifications, make sure that the MPS queue is bound to a Message Service (MNS) topic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bb558c1cc25b45309aab5be44d19****</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    /**
     * <p>The priority of the job in the MPS queue to which the job is submitted.</p>
     * <ul>
     * <li>Valid values: <strong>1 to 10</strong>. A value of 10 indicates the highest priority.</li>
     * <li>Default value: <strong>6</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Priority")
    public String priority;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The custom data. The custom data can contain letters, digits, and hyphens (-), and can be up to 1,024 bytes in length. The custom data cannot start with a special character.</p>
     * 
     * <strong>example:</strong>
     * <p>testid-001</p>
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

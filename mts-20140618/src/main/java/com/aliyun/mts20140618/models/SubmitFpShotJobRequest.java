// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitFpShotJobRequest extends TeaModel {
    /**
     * <p>The configurations of the media fingerprint analysis job. The value is a JSON object. For more information, see the &quot;FpShotConfig&quot; section of the <a href="https://help.aliyun.com/document_detail/93568.html">Parameter details</a> topic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;PrimaryKey&quot;: &quot;12345****&quot;,
     *       &quot;SaveType&quot;: &quot;save&quot;,
     *       &quot;FpDBId&quot;: &quot;417f2ada5999daf****&quot;
     * }</p>
     */
    @NameInMap("FpShotConfig")
    public String fpShotConfig;

    /**
     * <p>The OSS URL of the job input. The value is a JSON object. You can query the OSS URL in the OSS or MPS console.</p>
     * <blockquote>
     * <p>The OSS bucket must reside in the same region as your MPS service.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Bucket&quot;:&quot;example-bucket-<strong><strong>&quot;,&quot;Location&quot;:&quot;oss-cn-shanghai&quot;,&quot;Object&quot;:&quot;example-</strong></strong>.flv&quot;}</p>
     */
    @NameInMap("Input")
    public String input;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the MPS queue. This ID can be used to associate the job with a notification method. To view the ID of the MPS queue, perform the following steps: Log on to the <strong>MPS console</strong>. In the left-side navigation pane, choose <strong>Global Settings</strong> &gt; <strong>Pipelines</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>88c6ca184c0e47098a5b665e2a12****</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The custom data. The value can be up to 128 bytes in length and cannot start with a special character.</p>
     * 
     * <strong>example:</strong>
     * <p>testid-****</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitFpShotJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitFpShotJobRequest self = new SubmitFpShotJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitFpShotJobRequest setFpShotConfig(String fpShotConfig) {
        this.fpShotConfig = fpShotConfig;
        return this;
    }
    public String getFpShotConfig() {
        return this.fpShotConfig;
    }

    public SubmitFpShotJobRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public SubmitFpShotJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SubmitFpShotJobRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SubmitFpShotJobRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public SubmitFpShotJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitFpShotJobRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitFpShotJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}

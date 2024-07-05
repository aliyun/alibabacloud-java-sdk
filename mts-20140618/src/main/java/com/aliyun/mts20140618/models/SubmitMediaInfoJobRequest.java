// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitMediaInfoJobRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the asynchronous mode for the job. We recommend that you set this parameter to true. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables the asynchronous mode.</li>
     * <li><strong>false</strong>: does not enable the asynchronous mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Async")
    public Boolean async;

    /**
     * <p>The information about the input media file. The value is a JSON string. You must perform the following operations to add the OSS bucket in which the input media file is stored as a media bucket: Log on to the <strong>MPS console</strong>, choose <strong>Workflows</strong> &gt; <strong>Media Buckets</strong> in the left-side navigation pane, and then click <strong>Add Bucket</strong>. After you add the OSS bucket as a media bucket, you must perform URL encoding for the OSS object. For example, <code>{&quot;Bucket&quot;:&quot;example-bucket&quot;,&quot;Location&quot;:&quot;example-location&quot;,&quot;Object&quot;:&quot;example%2Fexample.flv&quot;}</code> indicates the <code>example-bucket.example-location.aliyuncs.com/example/example.flv</code> file.</p>
     * <blockquote>
     * <p>The OSS bucket must reside in the same region as your MPS service.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Bucket&quot;:&quot;example-bucket&quot;,&quot;Location&quot;:&quot;example-location&quot;,&quot;Object&quot;:&quot;example%2Fexample.flv&quot;}</p>
     */
    @NameInMap("Input")
    public String input;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the MPS queue to which the analysis job is submitted. To view the ID of the MPS queue, log on to the <strong>MPS console</strong> and choose <strong>Global Settings</strong> &gt; <strong>Pipelines</strong> in the left-side navigation pane.</p>
     * 
     * <strong>example:</strong>
     * <p>88c6ca184c0e432bbf5b665e2a15****</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

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

    public static SubmitMediaInfoJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaInfoJobRequest self = new SubmitMediaInfoJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitMediaInfoJobRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public SubmitMediaInfoJobRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public SubmitMediaInfoJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SubmitMediaInfoJobRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SubmitMediaInfoJobRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public SubmitMediaInfoJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitMediaInfoJobRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitMediaInfoJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}

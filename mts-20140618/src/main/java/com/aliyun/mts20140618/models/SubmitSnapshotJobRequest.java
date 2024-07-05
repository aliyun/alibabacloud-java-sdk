// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitSnapshotJobRequest extends TeaModel {
    /**
     * <p>The information about the job input. The value must be a JSON object. You must add the Object Storage Service (OSS) bucket that stores the OSS object to be used as the job input as a media bucket in the MPS console. To add an OSS bucket as a media bucket, you can log on to the MPS console, choose Workflows &gt; Media Buckets in the left-side navigation pane, and then click Add Bucket. After the OSS bucket is added as a media bucket, you must perform URL encoding for the OSS object. Example: <code>{&quot;Bucket&quot;:&quot;example-bucket&quot;,&quot;Location&quot;:&quot;example-location&quot;,&quot;Object&quot;:&quot;example%2Ftest.flv&quot;}</code>. This example indicates the <code>&quot;example-bucket.example-location.aliyuncs.com/example/test.flv&quot;</code> object.</p>
     * <blockquote>
     * <p>The OSS bucket must reside in the same region as your MPS service.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Bucket&quot;:&quot;example-bucket&quot;,&quot;Location&quot;:&quot;example-location&quot;,&quot;Object&quot;:&quot;example%2Ftest.flv&quot;}</p>
     */
    @NameInMap("Input")
    public String input;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the MPS queue to which you want to submit the snapshot job. To obtain the ID, you can log on to the <strong>MPS console</strong> and choose <strong>Global Settings</strong> &gt; <strong>Pipelines</strong> in the left-side navigation pane.</p>
     * <blockquote>
     * <p>Make sure that an available Message Service (MNS) topic is bound to the specified MPS queue. Otherwise, the relevant messages may fail to be sent as expected.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dd3dae411e704030b921e52698e5****</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The snapshot configurations. For more information, see the &quot;AliyunSnapshotConfig&quot; section of the <a href="https://help.aliyun.com/document_detail/29253.html">Data types</a> topic.</p>
     * <blockquote>
     * <p>If you set the Interval parameter that is nested under SnapshotConfig, snapshots are captured at the specified intervals. The default value of the Interval parameter is 10, in seconds. If an input video is short but you specify large values for both the Num and Interval parameters, the actual number of snapshots captured may be smaller than the specified number. For example, if you set the Num parameter to 5 and the Interval parameter to 3 for a video of 10 seconds, the number of snapshots captured cannot reach 5.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;OutputFile&quot;:{&quot;Bucket&quot;:&quot;example-001&quot;,&quot;Location&quot;:&quot;example-location&quot;,&quot;Object&quot;:&quot;{Count}.jpg&quot;},&quot;Time&quot;:&quot;5&quot;,&quot;Num&quot;:&quot;10&quot;,&quot;Interval&quot;:&quot;20&quot;}</p>
     */
    @NameInMap("SnapshotConfig")
    public String snapshotConfig;

    /**
     * <p>The custom data. The custom data can contain letters, digits, and hyphens (-) and be up to 1,024 bytes in size. The custom data cannot start with a special character.</p>
     * 
     * <strong>example:</strong>
     * <p>testid-001</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitSnapshotJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSnapshotJobRequest self = new SubmitSnapshotJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSnapshotJobRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public SubmitSnapshotJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SubmitSnapshotJobRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SubmitSnapshotJobRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public SubmitSnapshotJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitSnapshotJobRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitSnapshotJobRequest setSnapshotConfig(String snapshotConfig) {
        this.snapshotConfig = snapshotConfig;
        return this;
    }
    public String getSnapshotConfig() {
        return this.snapshotConfig;
    }

    public SubmitSnapshotJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitMediaInfoJobRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the asynchronous mode for the job. We recommend that you set this parameter to true. Valid values:</p>
     * <br>
     * <p>*   **true**: enables the asynchronous mode.</p>
     * <p>*   **false**: does not enable the asynchronous mode.</p>
     */
    @NameInMap("Async")
    public Boolean async;

    /**
     * <p>The information about the input media file. The value is a JSON string. You must perform the following operations to grant MPS the permissions to access the OSS bucket in which the input media file is stored: Log on to the **MPS console**, choose **Workflows** > **Media Buckets** in the left-side navigation pane, and then click **Add Bucket**. Then, you must URL-encode the object. For example, `{"Bucket":"example-bucket","Location":"example-location","Object":"example%2Fexample.flv"}` indicates the `example-bucket.example-location.aliyuncs.com/example/example.flv` file.</p>
     * <br>
     * <p>>  The OSS bucket must reside in the region in which you use MPS.</p>
     */
    @NameInMap("Input")
    public String input;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the MPS queue to which the analysis job is submitted. To view the ID of the MPS queue, log on to the **MPS console** and choose **Global Settings** > **Pipelines** in the left-side navigation pane.</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The custom data. The custom data can contain letters, digits, and hyphens (-), and can be up to 1,024 bytes in length. It cannot start with a hyphen (-).</p>
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

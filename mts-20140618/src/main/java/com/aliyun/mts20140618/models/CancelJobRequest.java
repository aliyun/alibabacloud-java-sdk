// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class CancelJobRequest extends TeaModel {
    /**
     * <p>The ID of the transcoding job to be canceled. You can log on to the <strong>MPS console</strong> and click <strong>Tasks</strong> in the left-side navigation pane to obtain job IDs. Alternatively, you can obtain job IDs from the response of the <a href="https://help.aliyun.com/document_detail/29226.html">SubmitJobs</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d1ce4d3efcb549419193f50f1fcd****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CancelJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelJobRequest self = new CancelJobRequest();
        return TeaModel.build(map, self);
    }

    public CancelJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CancelJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CancelJobRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CancelJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CancelJobRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

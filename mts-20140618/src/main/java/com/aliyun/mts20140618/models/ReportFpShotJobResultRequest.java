// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ReportFpShotJobResultRequest extends TeaModel {
    /**
     * <p>The details of the job results. You can obtain the details from the response parameters of the [QueryFpShotJobList](~~93557~~) operation.</p>
     */
    @NameInMap("Details")
    public String details;

    /**
     * <p>The ID of the media fingerprint analysis job on which you want to provide feedback. To view the job ID, log on to the **MPS console**, click **Tasks** in the left-side navigation pane, and then click the **Video DNA** tab on the Tasks page.</p>
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

    /**
     * <p>The results of the media fingerprint analysis job. You can obtain the results of the media fingerprint analysis job from the response parameters of the [QueryFpShotJobList](~~93557~~) operation.</p>
     */
    @NameInMap("Result")
    public String result;

    public static ReportFpShotJobResultRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportFpShotJobResultRequest self = new ReportFpShotJobResultRequest();
        return TeaModel.build(map, self);
    }

    public ReportFpShotJobResultRequest setDetails(String details) {
        this.details = details;
        return this;
    }
    public String getDetails() {
        return this.details;
    }

    public ReportFpShotJobResultRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ReportFpShotJobResultRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ReportFpShotJobResultRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ReportFpShotJobResultRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ReportFpShotJobResultRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ReportFpShotJobResultRequest setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}

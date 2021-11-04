// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ReportFacerecogJobResultRequest extends TeaModel {
    @NameInMap("Details")
    public String details;

    @NameInMap("Facerecog")
    public String facerecog;

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

    public static ReportFacerecogJobResultRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportFacerecogJobResultRequest self = new ReportFacerecogJobResultRequest();
        return TeaModel.build(map, self);
    }

    public ReportFacerecogJobResultRequest setDetails(String details) {
        this.details = details;
        return this;
    }
    public String getDetails() {
        return this.details;
    }

    public ReportFacerecogJobResultRequest setFacerecog(String facerecog) {
        this.facerecog = facerecog;
        return this;
    }
    public String getFacerecog() {
        return this.facerecog;
    }

    public ReportFacerecogJobResultRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ReportFacerecogJobResultRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ReportFacerecogJobResultRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ReportFacerecogJobResultRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ReportFacerecogJobResultRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

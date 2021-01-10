// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ReportAnnotationJobResultRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("Annotation")
    public String annotation;

    @NameInMap("Details")
    public String details;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static ReportAnnotationJobResultRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportAnnotationJobResultRequest self = new ReportAnnotationJobResultRequest();
        return TeaModel.build(map, self);
    }

    public ReportAnnotationJobResultRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ReportAnnotationJobResultRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ReportAnnotationJobResultRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ReportAnnotationJobResultRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ReportAnnotationJobResultRequest setAnnotation(String annotation) {
        this.annotation = annotation;
        return this;
    }
    public String getAnnotation() {
        return this.annotation;
    }

    public ReportAnnotationJobResultRequest setDetails(String details) {
        this.details = details;
        return this;
    }
    public String getDetails() {
        return this.details;
    }

    public ReportAnnotationJobResultRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

}

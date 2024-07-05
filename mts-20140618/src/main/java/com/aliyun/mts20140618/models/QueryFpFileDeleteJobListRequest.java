// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryFpFileDeleteJobListRequest extends TeaModel {
    /**
     * <p>The IDs of the jobs of deleting media files from a media fingerprint library. You can obtain the job IDs from the response parameters of the <a href="https://help.aliyun.com/document_detail/209274.html">SubmitFpFileDeleteJob</a> operation. Separate multiple job IDs with commas (,). If you leave this parameter empty, the system returns the latest 20 jobs that are submitted.</p>
     * 
     * <strong>example:</strong>
     * <p>d98459323c024947a104f6a50cbf****,c2dc694696f1441591c5012a73c1****</p>
     */
    @NameInMap("JobIds")
    public String jobIds;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static QueryFpFileDeleteJobListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFpFileDeleteJobListRequest self = new QueryFpFileDeleteJobListRequest();
        return TeaModel.build(map, self);
    }

    public QueryFpFileDeleteJobListRequest setJobIds(String jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public String getJobIds() {
        return this.jobIds;
    }

    public QueryFpFileDeleteJobListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public QueryFpFileDeleteJobListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryFpFileDeleteJobListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryFpFileDeleteJobListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

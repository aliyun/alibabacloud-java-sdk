// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryFpDBDeleteJobListRequest extends TeaModel {
    /**
     * <p>The IDs of the jobs of clearing or deleting a media fingerprint library. You can obtain the job IDs from the response parameters of the [SubmitFpDBDeleteJob](~~209341~~) operation. Separate multiple job IDs with commas (,). If you leave this parameter empty, the system returns the latest 20 jobs that are submitted.</p>
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

    public static QueryFpDBDeleteJobListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFpDBDeleteJobListRequest self = new QueryFpDBDeleteJobListRequest();
        return TeaModel.build(map, self);
    }

    public QueryFpDBDeleteJobListRequest setJobIds(String jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public String getJobIds() {
        return this.jobIds;
    }

    public QueryFpDBDeleteJobListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public QueryFpDBDeleteJobListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryFpDBDeleteJobListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryFpDBDeleteJobListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

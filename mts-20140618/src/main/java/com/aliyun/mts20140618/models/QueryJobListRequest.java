// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryJobListRequest extends TeaModel {
    /**
     * <p>The IDs of transcoding jobs. Separate multiple IDs with commas (,). You can query a maximum of 10 transcoding jobs at a time. You can log on to the [ApsaraVideo Media Processing (MPS) console](https://mps.console.aliyun.com/overview) and click **Tasks** in the left-side navigation pane to obtain job IDs. Alternatively, you can obtain job IDs from the response to the [SubmitJobs](~~29226~~) operation.</p>
     * <br>
     * <p>>  If you do not set the JobIds parameter, the `InvalidParameter` error code is returned.</p>
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

    public static QueryJobListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryJobListRequest self = new QueryJobListRequest();
        return TeaModel.build(map, self);
    }

    public QueryJobListRequest setJobIds(String jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public String getJobIds() {
        return this.jobIds;
    }

    public QueryJobListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public QueryJobListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryJobListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryJobListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

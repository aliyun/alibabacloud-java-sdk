// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryJobListRequest extends TeaModel {
    /**
     * <p>The IDs of transcoding jobs. Separate multiple IDs with commas (,). You can query a maximum of 10 transcoding jobs at a time. You can log on to the <a href="https://mps.console.aliyun.com/overview">ApsaraVideo Media Processing (MPS) console</a> and click <strong>Tasks</strong> in the left-side navigation pane to obtain job IDs. Alternatively, you can obtain job IDs from the response to the <a href="https://help.aliyun.com/document_detail/29226.html">SubmitJobs</a> operation.</p>
     * <blockquote>
     * <p> If you do not set the JobIds parameter, the <code>InvalidParameter</code> error code is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>bb558c1cc25b45309aab5be44d19****,d1ce4d3efcb549419193f50f1fcd****</p>
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

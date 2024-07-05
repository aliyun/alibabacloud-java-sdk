// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QuerySmarttagJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>39f8e0bc005e4f309379701645f4****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;labelResultType&quot;:&quot;auto&quot;}</p>
     */
    @NameInMap("Params")
    public String params;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static QuerySmarttagJobRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySmarttagJobRequest self = new QuerySmarttagJobRequest();
        return TeaModel.build(map, self);
    }

    public QuerySmarttagJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public QuerySmarttagJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public QuerySmarttagJobRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QuerySmarttagJobRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public QuerySmarttagJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QuerySmarttagJobRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

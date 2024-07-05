// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMediaWorkflowExecutionListRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The IDs of the media workflow execution instances. To obtain the instance ID, log on to the <strong>ApsaraVideo Media Processing (MPS) console</strong> and choose <strong>Workflows</strong> &gt; <strong>Execution Instances</strong> in the left-side navigation pane. Separate multiple IDs with commas (,). You can query a maximum of 10 media workflow execution instances at a time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>48e33690ac19445488c706924321****</p>
     */
    @NameInMap("RunIds")
    public String runIds;

    public static QueryMediaWorkflowExecutionListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaWorkflowExecutionListRequest self = new QueryMediaWorkflowExecutionListRequest();
        return TeaModel.build(map, self);
    }

    public QueryMediaWorkflowExecutionListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public QueryMediaWorkflowExecutionListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryMediaWorkflowExecutionListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryMediaWorkflowExecutionListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryMediaWorkflowExecutionListRequest setRunIds(String runIds) {
        this.runIds = runIds;
        return this;
    }
    public String getRunIds() {
        return this.runIds;
    }

}

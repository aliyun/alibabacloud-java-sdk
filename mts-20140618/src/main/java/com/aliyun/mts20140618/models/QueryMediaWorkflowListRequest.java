// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMediaWorkflowListRequest extends TeaModel {
    /**
     * <p>The IDs of the media workflows that you want to query. To obtain the IDs of the media workflows, you can log on to the **ApsaraVideo Media Processing (MPS) console** and choose **Workflows** > **Workflow Settings** in the left-side navigation pane. You can query up to 10 media workflows at a time. Separate multiple IDs of media workflows with commas (,).</p>
     */
    @NameInMap("MediaWorkflowIds")
    public String mediaWorkflowIds;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static QueryMediaWorkflowListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaWorkflowListRequest self = new QueryMediaWorkflowListRequest();
        return TeaModel.build(map, self);
    }

    public QueryMediaWorkflowListRequest setMediaWorkflowIds(String mediaWorkflowIds) {
        this.mediaWorkflowIds = mediaWorkflowIds;
        return this;
    }
    public String getMediaWorkflowIds() {
        return this.mediaWorkflowIds;
    }

    public QueryMediaWorkflowListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public QueryMediaWorkflowListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryMediaWorkflowListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryMediaWorkflowListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}

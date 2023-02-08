// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SearchMediaWorkflowRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>*   A maximum of **100** entries can be returned on each page.</p>
     * <p>*   Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The status of the media workflows that you want to query. You can specify multiple states. Separate multiple states with commas (,). Default value: **Inactive,Active,Deleted**. Valid values:</p>
     * <br>
     * <p>*   **Inactive**: Deactivated media workflows are queried.</p>
     * <p>*   **Active**: Activated media workflows are queried.</p>
     * <p>*   **Deleted**: Deleted media workflows are queried.</p>
     */
    @NameInMap("StateList")
    public String stateList;

    public static SearchMediaWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaWorkflowRequest self = new SearchMediaWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public SearchMediaWorkflowRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SearchMediaWorkflowRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SearchMediaWorkflowRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public SearchMediaWorkflowRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public SearchMediaWorkflowRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SearchMediaWorkflowRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SearchMediaWorkflowRequest setStateList(String stateList) {
        this.stateList = stateList;
        return this;
    }
    public String getStateList() {
        return this.stateList;
    }

}

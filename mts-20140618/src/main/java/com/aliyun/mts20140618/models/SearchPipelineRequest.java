// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SearchPipelineRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <ul>
     * <li>A maximum of <strong>100</strong> entries can be returned on each page.</li>
     * <li>Default value: <strong>10</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The status of the MPS queues that you want to query. If you leave this parameter empty, all MPS queues are queried.</p>
     * <ul>
     * <li><strong>All</strong>: queries all MPS queues.</li>
     * <li><strong>Active</strong>: queries the MPS queues that are active.</li>
     * <li><strong>Paused</strong>: queues the MPS queues that are paused.</li>
     * <li>Default value: <strong>All</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Paused</p>
     */
    @NameInMap("State")
    public String state;

    public static SearchPipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchPipelineRequest self = new SearchPipelineRequest();
        return TeaModel.build(map, self);
    }

    public SearchPipelineRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SearchPipelineRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SearchPipelineRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public SearchPipelineRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public SearchPipelineRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SearchPipelineRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SearchPipelineRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}

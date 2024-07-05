// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SearchTemplateRequest extends TeaModel {
    /**
     * <p>The name prefix based on which you want to search for templates.</p>
     * 
     * <strong>example:</strong>
     * <p>S00000001</p>
     */
    @NameInMap("NamePrefix")
    public String namePrefix;

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
     * <p>The size of each page set during the result paging query.</p>
     * <ul>
     * <li>Upper limit: 100.</li>
     * <li>Default value: 10.</li>
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
     * <p>The status of the custom transcoding templates that you want to query.</p>
     * <ul>
     * <li><strong>All</strong>: All custom transcoding templates are queried.</li>
     * <li><strong>Normal</strong>: Normal custom transcoding templates are queried.</li>
     * <li><strong>Deleted</strong>: Deleted custom transcoding templates are queried.</li>
     * <li>Default value: <strong>All</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("State")
    public String state;

    public static SearchTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchTemplateRequest self = new SearchTemplateRequest();
        return TeaModel.build(map, self);
    }

    public SearchTemplateRequest setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
        return this;
    }
    public String getNamePrefix() {
        return this.namePrefix;
    }

    public SearchTemplateRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SearchTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SearchTemplateRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public SearchTemplateRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public SearchTemplateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SearchTemplateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SearchTemplateRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListWorkspacesRequest extends TeaModel {
    /**
     * <p>Specifies whether the current user has joined the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AlreadyJoined")
    public Boolean alreadyJoined;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region in which the bucket is located.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The search keyword. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>poc_test</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The service account ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("ServiceAccountId")
    public Long serviceAccountId;

    /**
     * <p>The virtual private cloud (VPC) ID.</p>
     * <blockquote>
     * <p>This parameter cannot be used as a filter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp10wnlcmor****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12****</p>
     */
    @NameInMap("WorkspaceId")
    public Long workspaceId;

    public static ListWorkspacesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspacesRequest self = new ListWorkspacesRequest();
        return TeaModel.build(map, self);
    }

    public ListWorkspacesRequest setAlreadyJoined(Boolean alreadyJoined) {
        this.alreadyJoined = alreadyJoined;
        return this;
    }
    public Boolean getAlreadyJoined() {
        return this.alreadyJoined;
    }

    public ListWorkspacesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListWorkspacesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListWorkspacesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListWorkspacesRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListWorkspacesRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public ListWorkspacesRequest setServiceAccountId(Long serviceAccountId) {
        this.serviceAccountId = serviceAccountId;
        return this;
    }
    public Long getServiceAccountId() {
        return this.serviceAccountId;
    }

    public ListWorkspacesRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public ListWorkspacesRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}

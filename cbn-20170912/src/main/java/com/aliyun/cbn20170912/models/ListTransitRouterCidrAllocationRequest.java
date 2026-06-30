// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterCidrAllocationRequest extends TeaModel {
    /**
     * <p>The ID of the network instance connection.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-attach-2nalp6yksc805w****</p>
     */
    @NameInMap("AttachmentId")
    public String attachmentId;

    /**
     * <p>The name of the network instance connection.</p>
     * 
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("AttachmentName")
    public String attachmentName;

    /**
     * <p>The CIDR block of the transit router.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.10.0/24</p>
     */
    @NameInMap("Cidr")
    public String cidr;

    /**
     * <p>The allocated CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.10.0/28</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <p>A client token that is used to ensure the idempotence of the request.</p>
     * <p>Generate a token from your client to make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> is different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The dedicated CIDR block.</p>
     * <p>The only valid value is <strong>VPN</strong>. This value specifies that you want to query the CIDR block that is reserved by the system for creating VPN connections.</p>
     * 
     * <strong>example:</strong>
     * <p>VPN</p>
     */
    @NameInMap("DedicatedOwnerId")
    public String dedicatedOwnerId;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs a dry run. The system checks the required parameters, request format, and service limits. If the request fails the check, an error message is returned. If the request passes the check, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends a normal request. After the request passes the check, the system queries the allocation details of the CIDR block.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The number of entries per page.</p>
     * <ul>
     * <li><p>If you do not specify this parameter, the query is not paginated.</p>
     * </li>
     * <li><p>If you specify this parameter, the query is paginated. Valid values: <strong>1</strong> to <strong>100</strong>. The recommended value is <strong>20</strong>.</p>
     * <p>The value of the returned <strong>MaxResults</strong> parameter indicates the number of list entries in the current query batch.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li><p>You do not need to specify this parameter for the first request.</p>
     * </li>
     * <li><p>If a next page exists, set the value to the <strong>NextToken</strong> value returned from the previous request.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the Transit Router instance is deployed.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the CIDR block of the transit router.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/462772.html">ListTransitRouterCidr</a> operation to query the IDs of the CIDR blocks of the transit router.</p>
     * 
     * <strong>example:</strong>
     * <p>cidr-0zv0q9crqpntzz****</p>
     */
    @NameInMap("TransitRouterCidrId")
    public String transitRouterCidrId;

    /**
     * <p>The ID of the Transit Router instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-p0w3x8c9em72a40nw****</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    public static ListTransitRouterCidrAllocationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterCidrAllocationRequest self = new ListTransitRouterCidrAllocationRequest();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterCidrAllocationRequest setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
        return this;
    }
    public String getAttachmentId() {
        return this.attachmentId;
    }

    public ListTransitRouterCidrAllocationRequest setAttachmentName(String attachmentName) {
        this.attachmentName = attachmentName;
        return this;
    }
    public String getAttachmentName() {
        return this.attachmentName;
    }

    public ListTransitRouterCidrAllocationRequest setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }
    public String getCidr() {
        return this.cidr;
    }

    public ListTransitRouterCidrAllocationRequest setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public ListTransitRouterCidrAllocationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListTransitRouterCidrAllocationRequest setDedicatedOwnerId(String dedicatedOwnerId) {
        this.dedicatedOwnerId = dedicatedOwnerId;
        return this;
    }
    public String getDedicatedOwnerId() {
        return this.dedicatedOwnerId;
    }

    public ListTransitRouterCidrAllocationRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ListTransitRouterCidrAllocationRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTransitRouterCidrAllocationRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTransitRouterCidrAllocationRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListTransitRouterCidrAllocationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListTransitRouterCidrAllocationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTransitRouterCidrAllocationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListTransitRouterCidrAllocationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListTransitRouterCidrAllocationRequest setTransitRouterCidrId(String transitRouterCidrId) {
        this.transitRouterCidrId = transitRouterCidrId;
        return this;
    }
    public String getTransitRouterCidrId() {
        return this.transitRouterCidrId;
    }

    public ListTransitRouterCidrAllocationRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

}

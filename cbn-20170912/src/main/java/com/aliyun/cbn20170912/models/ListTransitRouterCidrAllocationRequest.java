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
     * <p>The transit router CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.10.0/24</p>
     */
    @NameInMap("Cidr")
    public String cidr;

    /**
     * <p>The allocated CIDR block under the transit router CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.10.0/28</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The dedicated CIDR block.</p>
     * <p>Set the value to <strong>VPN</strong>, which specifies that you want to query the CIDR block reserved by the system for creating VPN connections in the backend.</p>
     * 
     * <strong>example:</strong>
     * <p>VPN</p>
     */
    @NameInMap("DedicatedOwnerId")
    public String dedicatedOwnerId;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run. The system checks the required parameters, request syntax, and business restrictions. If the request fails the dry run, the corresponding error is returned. If the request passes the dry run, the error code <code>DryRunOperation</code> is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and sends the request. If the request passes the dry run, the transit router CIDR block allocation details are queried.</li>
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
     * <li><p>If you do not specify a value for <strong>MaxResults</strong>, it indicates that you do not need to query results by page. The value of <strong>MaxResults</strong> in the response indicates the total number of entries.</p>
     * </li>
     * <li><p>If you specify a value for <strong>MaxResults</strong>, it indicates that you need to query results by page. Valid values: <strong>1</strong> to <strong>100</strong>. We recommend that you set <strong>MaxResults</strong> to <strong>20</strong>.      </p>
     * <p>The value of <strong>MaxResults</strong> in the response indicates the number of entries on the current page.</p>
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
     * <li>You do not need to specify this parameter for the first request or if no subsequent request exists.</li>
     * <li>If a subsequent request exists, set the value to the <strong>NextToken</strong> value returned in the previous API call.</li>
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
     * <p>The region ID of the transit router instance.</p>
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
     * <p>The ID of the transit router CIDR block.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/462772.html">ListTransitRouterCidr</a> operation to query the transit router CIDR block ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cidr-0zv0q9crqpntzz****</p>
     */
    @NameInMap("TransitRouterCidrId")
    public String transitRouterCidrId;

    /**
     * <p>The forward router instance ID.</p>
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

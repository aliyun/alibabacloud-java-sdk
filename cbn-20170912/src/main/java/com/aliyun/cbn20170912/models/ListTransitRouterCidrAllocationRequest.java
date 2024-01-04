// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterCidrAllocationRequest extends TeaModel {
    /**
     * <p>The ID of the network instance connection.</p>
     */
    @NameInMap("AttachmentId")
    public String attachmentId;

    /**
     * <p>The name of the network instance connection.</p>
     */
    @NameInMap("AttachmentName")
    public String attachmentName;

    /**
     * <p>The CIDR block of the transit router.</p>
     */
    @NameInMap("Cidr")
    public String cidr;

    /**
     * <p>The CIDR blocks that have IP addresses allocated to network instances.</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, ClientToken is set to the value of RequestId. The value of RequestId for each API request may be different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The CIDR block that is for exclusive use.</p>
     * <br>
     * <p>Set the value to **VPN**, which specifies the CIDR block that is reserved for VPN connections.</p>
     */
    @NameInMap("DedicatedOwnerId")
    public String dedicatedOwnerId;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <br>
     * <p>*   **true**: performs a dry run. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): performs a dry run and sends the request.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>*   If you do not set **MaxResults**, it indicates that you do not need to query results in batches. The value of **MaxResults** indicates the total number of entries.</p>
     * <br>
     * <p>*   If a value is specified for **MaxResults**, it indicates that you need to query results in batches. Valid values: **1** to **100**. We recommend that you set **MaxResults** to **20**.</p>
     * <br>
     * <p>    The value of **MaxResults** in the response indicates the number of entries in the current batch.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the query. Valid values:</p>
     * <br>
     * <p>*   If this is your first query or no subsequent query is to be sent, ignore this parameter.</p>
     * <p>*   If a subsequent query is to be sent, set the value to the value of **NextToken** that is returned from the last call.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the transit router is deployed.</p>
     * <br>
     * <p>You can call the [DescribeChildInstanceRegions](~~132080~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the CIDR block.</p>
     * <br>
     * <p>You can call the [ListTransitRouterCidr](~~462772~~) operation to query the ID of a CIDR block.</p>
     */
    @NameInMap("TransitRouterCidrId")
    public String transitRouterCidrId;

    /**
     * <p>The ID of the transit router.</p>
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

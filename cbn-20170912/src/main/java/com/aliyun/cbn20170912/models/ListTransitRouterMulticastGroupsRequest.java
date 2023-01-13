// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterMulticastGroupsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. ClientToken can contain only ASCII characters.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The IP address of the multicast group.</p>
     * <br>
     * <p>Each multicast group is identified by its IP address.</p>
     */
    @NameInMap("GroupIpAddress")
    public String groupIpAddress;

    /**
     * <p>Whether to query multicast members.</p>
     * <br>
     * <p>- **false**: No.</p>
     * <p>- **true**: Yes.</p>
     * <br>
     * <p>> Used in conjunction with IsGroupMember.</p>
     * <p>> - If neither is configured, the multicast source and members will be queried by default.</p>
     * <p>> - If only one or both are configured, the configuration parameters shall prevail.</p>
     */
    @NameInMap("IsGroupMember")
    public Boolean isGroupMember;

    /**
     * <p>Whether to query the multicast source.</p>
     * <br>
     * <p>- **false**: No.</p>
     * <p>- **true**: Yes.</p>
     * <br>
     * <p>> Used in conjunction with IsGroupMember.</p>
     * <p>> - If neither is configured, the multicast source and members will be queried by default.</p>
     * <p>> - If only one or both are configured, the configuration parameters shall prevail.</p>
     */
    @NameInMap("IsGroupSource")
    public Boolean isGroupSource;

    /**
     * <p>The number of entries to return on each page. Default value: **20**.</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The IDs of the ENIs.</p>
     * <br>
     * <p>You can create only one multicast source in a multicast group.</p>
     * <br>
     * <p>>  This parameter is required.</p>
     */
    @NameInMap("NetworkInterfaceIds")
    public java.util.List<String> networkInterfaceIds;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <br>
     * <p>*   If this is your first query or no next query is to be sent, ignore this parameter.</p>
     * <p>*   If a next query is to be sent, set the parameter to the value of NextToken that is returned from the last call.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The IDs of the inter-region multicast domains.</p>
     * <br>
     * <p>You can specify at most 20 inter-region multicast domain IDs.</p>
     */
    @NameInMap("PeerTransitRouterMulticastDomains")
    public java.util.List<String> peerTransitRouterMulticastDomains;

    /**
     * <p>The ID of the resource associated with the multicast resource.</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The type of the multicast resource. Valid values:</p>
     * <br>
     * <p>*   **VPC**: queries multicast resources by VPC.</p>
     * <p>*   **TR**: queries multicast resources that are also deployed in a different region.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The ID of the network instance connection.</p>
     */
    @NameInMap("TransitRouterAttachmentId")
    public String transitRouterAttachmentId;

    /**
     * <p>The ID of the multicast domain.</p>
     */
    @NameInMap("TransitRouterMulticastDomainId")
    public String transitRouterMulticastDomainId;

    /**
     * <p>The IDs of the vSwitches.</p>
     * <br>
     * <p>You can specify at most 20 IDs.</p>
     */
    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

    public static ListTransitRouterMulticastGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTransitRouterMulticastGroupsRequest self = new ListTransitRouterMulticastGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListTransitRouterMulticastGroupsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListTransitRouterMulticastGroupsRequest setGroupIpAddress(String groupIpAddress) {
        this.groupIpAddress = groupIpAddress;
        return this;
    }
    public String getGroupIpAddress() {
        return this.groupIpAddress;
    }

    public ListTransitRouterMulticastGroupsRequest setIsGroupMember(Boolean isGroupMember) {
        this.isGroupMember = isGroupMember;
        return this;
    }
    public Boolean getIsGroupMember() {
        return this.isGroupMember;
    }

    public ListTransitRouterMulticastGroupsRequest setIsGroupSource(Boolean isGroupSource) {
        this.isGroupSource = isGroupSource;
        return this;
    }
    public Boolean getIsGroupSource() {
        return this.isGroupSource;
    }

    public ListTransitRouterMulticastGroupsRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListTransitRouterMulticastGroupsRequest setNetworkInterfaceIds(java.util.List<String> networkInterfaceIds) {
        this.networkInterfaceIds = networkInterfaceIds;
        return this;
    }
    public java.util.List<String> getNetworkInterfaceIds() {
        return this.networkInterfaceIds;
    }

    public ListTransitRouterMulticastGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTransitRouterMulticastGroupsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ListTransitRouterMulticastGroupsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListTransitRouterMulticastGroupsRequest setPeerTransitRouterMulticastDomains(java.util.List<String> peerTransitRouterMulticastDomains) {
        this.peerTransitRouterMulticastDomains = peerTransitRouterMulticastDomains;
        return this;
    }
    public java.util.List<String> getPeerTransitRouterMulticastDomains() {
        return this.peerTransitRouterMulticastDomains;
    }

    public ListTransitRouterMulticastGroupsRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListTransitRouterMulticastGroupsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListTransitRouterMulticastGroupsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListTransitRouterMulticastGroupsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListTransitRouterMulticastGroupsRequest setTransitRouterAttachmentId(String transitRouterAttachmentId) {
        this.transitRouterAttachmentId = transitRouterAttachmentId;
        return this;
    }
    public String getTransitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

    public ListTransitRouterMulticastGroupsRequest setTransitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
        this.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
        return this;
    }
    public String getTransitRouterMulticastDomainId() {
        return this.transitRouterMulticastDomainId;
    }

    public ListTransitRouterMulticastGroupsRequest setVSwitchIds(java.util.List<String> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

}

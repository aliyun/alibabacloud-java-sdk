// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ListTransitRouterMulticastGroupsRequest extends TeaModel {
    /**
     * <p>A client token to ensure the idempotence of the request.</p>
     * <p>Generate a unique value from your client for each request. The \<code>ClientToken\\</code> parameter can contain only ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The IP address of the multicast group.</p>
     * <p>Each multicast group is identified by a multicast IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>239.XX.XX.2</p>
     */
    @NameInMap("GroupIpAddress")
    public String groupIpAddress;

    /**
     * <p>Specifies whether to query multicast members.</p>
     * <ul>
     * <li><p><strong>false</strong>: No.</p>
     * </li>
     * <li><p><strong>true</strong>: Yes.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter works with \<code>IsGroupSource\\</code>.</p>
     * <ul>
     * <li><p>If you do not specify \<code>IsGroupMember\\</code> or \<code>IsGroupSource\\</code>, the system queries both multicast members and sources.</p>
     * </li>
     * <li><p>If you specify one or both parameters, the system queries resources based on the specified parameters.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsGroupMember")
    public Boolean isGroupMember;

    /**
     * <p>Specifies whether to query multicast sources.</p>
     * <ul>
     * <li><p><strong>false</strong>: No.</p>
     * </li>
     * <li><p><strong>true</strong>: Yes.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter works with \<code>IsGroupMember\\</code>.</p>
     * <ul>
     * <li><p>If you do not specify \<code>IsGroupSource\\</code> or \<code>IsGroupMember\\</code>, the system queries both multicast sources and members.</p>
     * </li>
     * <li><p>If you specify one or both parameters, the system queries resources based on the specified parameters.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsGroupSource")
    public Boolean isGroupSource;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>A list of Elastic Network Interface (ENI) IDs.</p>
     */
    @NameInMap("NetworkInterfaceIds")
    public java.util.List<String> networkInterfaceIds;

    /**
     * <p>The token for the next page of results.</p>
     * <ul>
     * <li><p>If this is your first query or if no next page exists, do not specify this parameter.</p>
     * </li>
     * <li><p>If a next page exists, set this parameter to the \<code>NextToken\\</code> value that is returned from the previous call.</p>
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
     * <p>A list of IDs of cross-region multicast domains.</p>
     */
    @NameInMap("PeerTransitRouterMulticastDomains")
    public java.util.List<String> peerTransitRouterMulticastDomains;

    /**
     * <p>The ID of the resource associated with the multicast resource.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-p0w9alkte4w2htrqe****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The type of the multicast resource.</p>
     * <ul>
     * <li><p><strong>VPC</strong>: queries information about multicast resources in a VPC.</p>
     * </li>
     * <li><p><strong>TR</strong>: queries information about cross-region multicast resources.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The ID of the network instance connection.</p>
     * <p>You must specify \<code>TransitRouterMulticastDomainId\\</code> or \<code>TransitRouterAttachmentId\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-attach-g3kz2k3u76amsk****</p>
     */
    @NameInMap("TransitRouterAttachmentId")
    public String transitRouterAttachmentId;

    /**
     * <p>The ID of the multicast domain.</p>
     * <p>You must specify \<code>TransitRouterMulticastDomainId\\</code> or \<code>TransitRouterAttachmentId\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-mcast-domain-5mjb5gjb6dgu98****</p>
     */
    @NameInMap("TransitRouterMulticastDomainId")
    public String transitRouterMulticastDomainId;

    /**
     * <p>A list of vSwitch IDs.</p>
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

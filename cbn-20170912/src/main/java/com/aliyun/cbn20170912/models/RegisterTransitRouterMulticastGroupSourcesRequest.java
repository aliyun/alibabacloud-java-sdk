// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class RegisterTransitRouterMulticastGroupSourcesRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID is different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run, without sending the actual request. Default values:</p>
     * <br>
     * <p>*   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The IP address of the multicast group to which the multicast source belongs. Valid values: **224.0.0.1** to **239.255.255.254**.</p>
     * <br>
     * <p>If the multicast group does not exist in the multicast domain, the system automatically creates the multicast group in the multicast domain.</p>
     */
    @NameInMap("GroupIpAddress")
    public String groupIpAddress;

    /**
     * <p>The IDs of the ENIs.</p>
     */
    @NameInMap("NetworkInterfaceIds")
    public java.util.List<String> networkInterfaceIds;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the multicast domain to which the multicast source belongs.</p>
     */
    @NameInMap("TransitRouterMulticastDomainId")
    public String transitRouterMulticastDomainId;

    /**
     * <p>The ID of the VPC to which the ENI belongs.</p>
     * <br>
     * <p>*   If the ENI belongs to the current Alibaba Cloud account, ignore this parameter.</p>
     * <p>*   If the ENI belongs to a different Alibaba Cloud account, you must set this parameter.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static RegisterTransitRouterMulticastGroupSourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterTransitRouterMulticastGroupSourcesRequest self = new RegisterTransitRouterMulticastGroupSourcesRequest();
        return TeaModel.build(map, self);
    }

    public RegisterTransitRouterMulticastGroupSourcesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RegisterTransitRouterMulticastGroupSourcesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public RegisterTransitRouterMulticastGroupSourcesRequest setGroupIpAddress(String groupIpAddress) {
        this.groupIpAddress = groupIpAddress;
        return this;
    }
    public String getGroupIpAddress() {
        return this.groupIpAddress;
    }

    public RegisterTransitRouterMulticastGroupSourcesRequest setNetworkInterfaceIds(java.util.List<String> networkInterfaceIds) {
        this.networkInterfaceIds = networkInterfaceIds;
        return this;
    }
    public java.util.List<String> getNetworkInterfaceIds() {
        return this.networkInterfaceIds;
    }

    public RegisterTransitRouterMulticastGroupSourcesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RegisterTransitRouterMulticastGroupSourcesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RegisterTransitRouterMulticastGroupSourcesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RegisterTransitRouterMulticastGroupSourcesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RegisterTransitRouterMulticastGroupSourcesRequest setTransitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
        this.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
        return this;
    }
    public String getTransitRouterMulticastDomainId() {
        return this.transitRouterMulticastDomainId;
    }

    public RegisterTransitRouterMulticastGroupSourcesRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}

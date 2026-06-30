// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyTransitRouterMulticastDomainRequest extends TeaModel {
    /**
     * <p>A client token that ensures the idempotence of the request.</p>
     * <p>Generate a unique token on your client for each request. The token can contain only ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-4266****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Performs a dry run. The system checks the required parameters, request format, and service limits. If the check fails, an error message is returned. If the check passes, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Sends the request. If the request passes the check, the name and description of the multicast domain are modified.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The feature options of the multicast domain.</p>
     */
    @NameInMap("Options")
    public ModifyTransitRouterMulticastDomainRequestOptions options;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The new description of the multicast domain.</p>
     * <p>The description can be empty or 1 to 256 characters long. It cannot start with http\:// or https\://.</p>
     * 
     * <strong>example:</strong>
     * <p>desctest</p>
     */
    @NameInMap("TransitRouterMulticastDomainDescription")
    public String transitRouterMulticastDomainDescription;

    /**
     * <p>The ID of the multicast domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-mcast-domain-40cwj0rgzgdtam****</p>
     */
    @NameInMap("TransitRouterMulticastDomainId")
    public String transitRouterMulticastDomainId;

    /**
     * <p>The new name of the multicast domain.</p>
     * <p>The name can be empty or 1 to 128 characters long. It cannot start with http\:// or https\://.</p>
     * 
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("TransitRouterMulticastDomainName")
    public String transitRouterMulticastDomainName;

    public static ModifyTransitRouterMulticastDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTransitRouterMulticastDomainRequest self = new ModifyTransitRouterMulticastDomainRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTransitRouterMulticastDomainRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyTransitRouterMulticastDomainRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyTransitRouterMulticastDomainRequest setOptions(ModifyTransitRouterMulticastDomainRequestOptions options) {
        this.options = options;
        return this;
    }
    public ModifyTransitRouterMulticastDomainRequestOptions getOptions() {
        return this.options;
    }

    public ModifyTransitRouterMulticastDomainRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyTransitRouterMulticastDomainRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyTransitRouterMulticastDomainRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyTransitRouterMulticastDomainRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyTransitRouterMulticastDomainRequest setTransitRouterMulticastDomainDescription(String transitRouterMulticastDomainDescription) {
        this.transitRouterMulticastDomainDescription = transitRouterMulticastDomainDescription;
        return this;
    }
    public String getTransitRouterMulticastDomainDescription() {
        return this.transitRouterMulticastDomainDescription;
    }

    public ModifyTransitRouterMulticastDomainRequest setTransitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
        this.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
        return this;
    }
    public String getTransitRouterMulticastDomainId() {
        return this.transitRouterMulticastDomainId;
    }

    public ModifyTransitRouterMulticastDomainRequest setTransitRouterMulticastDomainName(String transitRouterMulticastDomainName) {
        this.transitRouterMulticastDomainName = transitRouterMulticastDomainName;
        return this;
    }
    public String getTransitRouterMulticastDomainName() {
        return this.transitRouterMulticastDomainName;
    }

    public static class ModifyTransitRouterMulticastDomainRequestOptions extends TeaModel {
        /**
         * <p>Specifies whether to enable the Internet Group Management Protocol (IGMP) feature for the multicast domain. When this feature is enabled, hosts can use IGMP to dynamically join or leave multicast groups. Set the value to <strong>enable</strong>.</p>
         * <blockquote>
         * <ul>
         * <li><p>The IGMP feature is in public preview. To use this feature, contact your account manager.</p>
         * </li>
         * <li><p>You cannot disable the IGMP feature after it is enabled.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("Igmpv2Support")
        public String igmpv2Support;

        /**
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("StrictSourceControl")
        public String strictSourceControl;

        public static ModifyTransitRouterMulticastDomainRequestOptions build(java.util.Map<String, ?> map) throws Exception {
            ModifyTransitRouterMulticastDomainRequestOptions self = new ModifyTransitRouterMulticastDomainRequestOptions();
            return TeaModel.build(map, self);
        }

        public ModifyTransitRouterMulticastDomainRequestOptions setIgmpv2Support(String igmpv2Support) {
            this.igmpv2Support = igmpv2Support;
            return this;
        }
        public String getIgmpv2Support() {
            return this.igmpv2Support;
        }

        public ModifyTransitRouterMulticastDomainRequestOptions setStrictSourceControl(String strictSourceControl) {
            this.strictSourceControl = strictSourceControl;
            return this;
        }
        public String getStrictSourceControl() {
            return this.strictSourceControl;
        }

    }

}

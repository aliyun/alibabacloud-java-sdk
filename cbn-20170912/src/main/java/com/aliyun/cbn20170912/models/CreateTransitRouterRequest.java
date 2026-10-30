// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterRequest extends TeaModel {
    /**
     * <p>The Cloud Enterprise Network (CEN) instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-j3jzhw1zpau2km****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate the parameter value on your client. Make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run on the creation request. The dry run includes permission and instance status checks. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): sends a normal request and creates the Enterprise Edition transit router instance after the request passes the check.</li>
     * <li><strong>true</strong>: sends a dry run request and performs only the check without creating the Enterprise Edition transit router instance. The system checks whether required parameters are specified and whether the request format is valid. If the request fails the check, the system returns an error. If the request passes the check, the system returns the error code <code>DryRunOperation</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the Enterprise Edition transit router instance.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-zhangjiakou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to enable the multicast feature for the Enterprise Edition transit router. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): disables the feature.</li>
     * <li><strong>true</strong>: enables the feature.</li>
     * </ul>
     * <p>The multicast feature is supported only by Enterprise Edition transit routers in specific regions. You can call the <a href="https://help.aliyun.com/document_detail/261356.html">ListTransitRouterAvailableResource</a> operation to query the regions that support the multicast feature.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SupportMulticast")
    public Boolean supportMulticast;

    /**
     * <p>The tag information.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateTransitRouterRequestTag> tag;

    /**
     * <p>The transit router CIDR blocks.</p>
     */
    @NameInMap("TransitRouterCidrList")
    public java.util.List<CreateTransitRouterRequestTransitRouterCidrList> transitRouterCidrList;

    /**
     * <p>The description of the Enterprise Edition transit router instance.</p>
     * <p>The description can be empty or 1 to 256 characters in length, and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>testdesc</p>
     */
    @NameInMap("TransitRouterDescription")
    public String transitRouterDescription;

    /**
     * <p>The name of the Enterprise Edition transit router instance.</p>
     * <p>The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>testname</p>
     */
    @NameInMap("TransitRouterName")
    public String transitRouterName;

    public static CreateTransitRouterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterRequest self = new CreateTransitRouterRequest();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public CreateTransitRouterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTransitRouterRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateTransitRouterRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateTransitRouterRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateTransitRouterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTransitRouterRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateTransitRouterRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateTransitRouterRequest setSupportMulticast(Boolean supportMulticast) {
        this.supportMulticast = supportMulticast;
        return this;
    }
    public Boolean getSupportMulticast() {
        return this.supportMulticast;
    }

    public CreateTransitRouterRequest setTag(java.util.List<CreateTransitRouterRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateTransitRouterRequestTag> getTag() {
        return this.tag;
    }

    public CreateTransitRouterRequest setTransitRouterCidrList(java.util.List<CreateTransitRouterRequestTransitRouterCidrList> transitRouterCidrList) {
        this.transitRouterCidrList = transitRouterCidrList;
        return this;
    }
    public java.util.List<CreateTransitRouterRequestTransitRouterCidrList> getTransitRouterCidrList() {
        return this.transitRouterCidrList;
    }

    public CreateTransitRouterRequest setTransitRouterDescription(String transitRouterDescription) {
        this.transitRouterDescription = transitRouterDescription;
        return this;
    }
    public String getTransitRouterDescription() {
        return this.transitRouterDescription;
    }

    public CreateTransitRouterRequest setTransitRouterName(String transitRouterName) {
        this.transitRouterName = transitRouterName;
        return this;
    }
    public String getTransitRouterName() {
        return this.transitRouterName;
    }

    public static class CreateTransitRouterRequestTag extends TeaModel {
        /**
         * <p>The tag key of the resource.</p>
         * <p>The tag key cannot be an empty string. The tag key can be up to 64 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>. The tag key cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can specify up to 20 tag keys at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>tagtest</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource.</p>
         * <p>The tag value cannot be empty. The tag value can be up to 128 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>. The tag value cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>Each tag key corresponds to a tag value. You can specify up to 20 tag values at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>TagValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateTransitRouterRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateTransitRouterRequestTag self = new CreateTransitRouterRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateTransitRouterRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateTransitRouterRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateTransitRouterRequestTransitRouterCidrList extends TeaModel {
        /**
         * <p>The transit router CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.10.0/24</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <p>The description of the transit router CIDR block.</p>
         * <p>The description must be 1 to 256 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the transit router CIDR block.</p>
         * <p>The name must be 1 to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Specifies whether to allow the system to automatically add a route for the transit router CIDR block to the transit router route table. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong> (default): allows the system to automatically add the route.</p>
         * <p>   If you select this value, after you create a VPN connection of the private network gateway type and create a route learning correlation for the VPN connection, the system automatically adds a route entry to the transit router route table that has a route learning correlation with the VPN connection:</p>
         * <p>  The destination CIDR block of the route is a blackhole route for the transit router CIDR block. The transit router CIDR block refers to the CIDR block to which a gateway IP address has been assigned for the IPsec connection.</p>
         * <p>   The blackhole route is propagated only to the route table of the Virtual Border Router (VBR) instance under the transit router.</p>
         * </li>
         * <li><p><strong>false</strong>: does not allow the system to automatically add the route.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PublishCidrRoute")
        public Boolean publishCidrRoute;

        public static CreateTransitRouterRequestTransitRouterCidrList build(java.util.Map<String, ?> map) throws Exception {
            CreateTransitRouterRequestTransitRouterCidrList self = new CreateTransitRouterRequestTransitRouterCidrList();
            return TeaModel.build(map, self);
        }

        public CreateTransitRouterRequestTransitRouterCidrList setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public CreateTransitRouterRequestTransitRouterCidrList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateTransitRouterRequestTransitRouterCidrList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateTransitRouterRequestTransitRouterCidrList setPublishCidrRoute(Boolean publishCidrRoute) {
            this.publishCidrRoute = publishCidrRoute;
            return this;
        }
        public Boolean getPublishCidrRoute() {
            return this.publishCidrRoute;
        }

    }

}

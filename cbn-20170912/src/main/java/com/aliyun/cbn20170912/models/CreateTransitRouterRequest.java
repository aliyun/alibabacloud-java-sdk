// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterRequest extends TeaModel {
    /**
     * <p>The ID of the CEN instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-j3jzhw1zpau2km****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>Generate a client token to make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. The dry run checks permissions and whether the required parameters are specified. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong> (default): sends the request and creates the instance after the request passes the check.</p>
     * </li>
     * <li><p><strong>true</strong>: sends a dry run request to check the parameters without creating the instance. The system checks the required parameters, request format, and permissions. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
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
     * <p>The ID of the region where the Enterprise Edition transit router is deployed.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query the most recent region list.</p>
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
     * <li><p><strong>false</strong> (default): disables the multicast feature.</p>
     * </li>
     * <li><p><strong>true</strong>: enables the multicast feature.</p>
     * </li>
     * </ul>
     * <p>The multicast feature is supported only in some regions. You can call the <a href="https://help.aliyun.com/document_detail/261356.html">ListTransitRouterAvailableResource</a> operation to query the regions that support multicast.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SupportMulticast")
    public Boolean supportMulticast;

    /**
     * <p>The tag.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateTransitRouterRequestTag> tag;

    /**
     * <p>The CIDR blocks of the transit router.</p>
     */
    @NameInMap("TransitRouterCidrList")
    public java.util.List<CreateTransitRouterRequestTransitRouterCidrList> transitRouterCidrList;

    /**
     * <p>The description of the Enterprise Edition transit router instance.</p>
     * <p>The description can be empty or 1 to 256 characters in length, and cannot start with http\:// or https\://.</p>
     * 
     * <strong>example:</strong>
     * <p>testdesc</p>
     */
    @NameInMap("TransitRouterDescription")
    public String transitRouterDescription;

    /**
     * <p>The name of the Enterprise Edition transit router instance.</p>
     * <p>The name can be empty or 1 to 128 characters in length, and cannot start with http\:// or https\://.</p>
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
         * <p>The tag key.</p>
         * <p>The tag key cannot be an empty string. The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https:// </code>.</p>
         * <p>You can specify at most 20 tag keys.</p>
         * 
         * <strong>example:</strong>
         * <p>tagtest</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <p>The tag value can be empty or a string of up to 128 characters. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https:// </code>.</p>
         * <p>Each tag key must have a unique tag value. You can specify at most 20 tag values.</p>
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
         * <p>The CIDR block of the transit router.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.10.0/24</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <p>The description of the CIDR block.</p>
         * <p>The description must be 1 to 256 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the CIDR block.</p>
         * <p>The name must be 1 to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Specifies whether to automatically advertise the route of the CIDR block to the route table of the transit router.</p>
         * <ul>
         * <li><p><strong>true</strong> (default): yes.</p>
         * <p>If you select this option, after you create a VPN connection that uses a private gateway and create a route learning correlation for the VPN connection, the system automatically adds the following route to the route table of the transit router with which the VPN connection is associated:</p>
         * <p>A blackhole route whose destination CIDR block is the CIDR block of the transit router. The CIDR block of the transit router refers to the CIDR block from which a gateway IP address is allocated to the IPsec connection.</p>
         * <p>This blackhole route is advertised only to the route tables of virtual border router (VBR) instances that are connected to the transit router.</p>
         * </li>
         * <li><p><strong>false</strong>: no.</p>
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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterRequest extends TeaModel {
    /**
     * <p>The ID of the Cloud Enterprise Network (CEN) instance.</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. ClientToken can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** of each API request may be different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to precheck the request. Check items include permissions and the status of the specified cloud resources. Valid values:</p>
     * <br>
     * <p>*   **false** (default): sends the request. If the request passes the precheck, an Enterprise Edition transit router is created.</p>
     * <p>*   **true**: prechecks the request but does not create the Enterprise Edition transit router. If you use this value, the system checks the required parameters and the request syntax. If the request fails to pass the precheck, an error message is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the Enterprise Edition transit router is deployed.</p>
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
     * <p>Specifies whether to enable the multicast feature for the Enterprise Edition transit router. Valid values:</p>
     * <br>
     * <p>*   **false** (default): no</p>
     * <p>*   **true**: yes</p>
     * <br>
     * <p>The multicast feature is supported only in specific regions. You can call [ListTransitRouterAvailableResource](~~261356~~) to query the regions that support multicast.</p>
     */
    @NameInMap("SupportMulticast")
    public Boolean supportMulticast;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateTransitRouterRequestTag> tag;

    /**
     * <p>The CIDR block list of the transit router.</p>
     */
    @NameInMap("TransitRouterCidrList")
    public java.util.List<CreateTransitRouterRequestTransitRouterCidrList> transitRouterCidrList;

    /**
     * <p>The description of the Enterprise Edition transit router instance.</p>
     * <br>
     * <p>The description must be 2 to 256 characters in length. The description must start with a letter but cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("TransitRouterDescription")
    public String transitRouterDescription;

    /**
     * <p>The name of the Enterprise Edition transit router.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.</p>
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
         * <p>The tag keys of the resources. </p>
         * <br>
         * <p>The tag keys cannot be an empty string. The tag keys can be up to 64 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.  </p>
         * <br>
         * <p>You can specify at most 20 tag keys.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag values of the resources. </p>
         * <br>
         * <p>The tag values can be 0 to 128 characters in length, and cannot start with `aliyun` or `acs:`. It cannot contain `http://` or `https://`.  </p>
         * <br>
         * <p>Each tag key has a unique tag value. You can specify at most 20 tag values in each call.</p>
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
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <p>The description of the CIDR block.</p>
         * <br>
         * <p>The description must be 2 to 256 characters in length. The description must start with a letter but cannot start with `http://` or `https://`.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the CIDR block.</p>
         * <br>
         * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter but cannot start with `http://` or `https://`.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Specifies whether to allow the system to automatically add a route that points to the CIDR block to the route table of the transit router.</p>
         * <br>
         * <p>*   **true** (default): yes</p>
         * <br>
         * <p>    A value of true specifies that after you create a private VPN connection and enable route learning for the connection, the system automatically adds a blackhole route to the route table of the transit router to which the VPN connection is attached. The destination CIDR block of the blackhole route is the CIDR block of the transit router. The CIDR block of the transit router refers to the CIDR block from which gateway IP addresses are allocated to IPsec-VPN connections. The blackhole route is advertised only to the route table of the virtual border router (VBR) that is connected to the transit router.</p>
         * <br>
         * <p>*   **false**: no</p>
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
